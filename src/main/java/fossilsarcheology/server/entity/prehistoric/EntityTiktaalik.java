package fossilsarcheology.server.entity.prehistoric;

import com.google.common.base.Predicate;
import fossilsarcheology.client.sound.FASoundRegistry;
import fossilsarcheology.server.entity.ai.*;
import fossilsarcheology.server.item.FAItemRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAISit;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

public class EntityTiktaalik extends EntityPrehistoricSwimming {
    private static final DataParameter<Boolean> SWIMMING = EntityDataManager.createKey(EntitySarcosuchus.class, DataSerializers.BOOLEAN);
    public float swimProgress;
    private boolean isSwimming;

    public EntityTiktaalik(World world) {
        super(world, PrehistoricEntityType.TIKTAALIK, 1, 4, 5, 30, 0.25, 0.25, 1, 2);
        this.setActualSize(1.45F, 0.5F);
        isAmphibious = true;
        minSize = 0.2F;
        maxSize = 0.9F;
        teenAge = 3;
        this.hasBabyTexture = true;
        this.pediaScale = 31;
    }

    public void applyEntityCollision(Entity entityIn) {
    }

    public AxisAlignedBB getAttackBounds() {
        float size = this.getRenderSizeModifier() * 0.25F;
        return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
    }

    public void initEntityAI() {
        this.tasks.addTask(0, new DinoMeleeAttackAI(this, 1.0D, false));
        this.tasks.addTask(1, new DinoAIFindWaterTarget(this, 10, true));
        this.tasks.addTask(1, new DinoAIGetInWater(this, 1.0D));
        this.tasks.addTask(1, new DinoAILeaveWater(this, 1.0D));
        this.tasks.addTask(2, this.aiSit = new EntityAISit(this));
        this.tasks.addTask(3, new DinoAIWander(this, 1.0D));
        this.tasks.addTask(3, new DinoAIEatFeedersAndBlocks(this));
        this.targetTasks.addTask(0, new DinoAIEatItems(this));
        this.tasks.addTask(4, new DinoAIRiding(this, 1.0F));
        this.tasks.addTask(5, new DinoAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
        this.tasks.addTask(7, new DinoAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new DinoAILookIdle(this));
        this.targetTasks.addTask(1, new DinoAIOwnerHurtByTarget(this));
        this.targetTasks.addTask(2, new DinoAIOwnerHurtTarget(this));
        this.targetTasks.addTask(3, new DinoAIHurtByTarget(this));
        this.targetTasks.addTask(4, new DinoAIHunt(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
    }

    @Override
    public void setSpawnValues() {

    }

    @Override
    public PrehistoricEntityTypeAI.Activity aiActivityType() {
        return PrehistoricEntityTypeAI.Activity.DIURINAL;
    }

    @Override
    public PrehistoricEntityTypeAI.Attacking aiAttackType() {
        return PrehistoricEntityTypeAI.Attacking.BASIC;
    }

    @Override
    public PrehistoricEntityTypeAI.Climbing aiClimbType() {
        return PrehistoricEntityTypeAI.Climbing.NONE;
    }

    @Override
    public PrehistoricEntityTypeAI.Following aiFollowType() {
        return PrehistoricEntityTypeAI.Following.NORMAL;
    }

    @Override
    public PrehistoricEntityTypeAI.Jumping aiJumpType() {
        return PrehistoricEntityTypeAI.Jumping.BASIC;
    }

    @Override
    public PrehistoricEntityTypeAI.Response aiResponseType() {
        return PrehistoricEntityTypeAI.Response.TERITORIAL;
    }

    @Override
    public PrehistoricEntityTypeAI.Stalking aiStalkType() {
        return PrehistoricEntityTypeAI.Stalking.NONE;
    }

    @Override
    public PrehistoricEntityTypeAI.Taming aiTameType() {
        return PrehistoricEntityTypeAI.Taming.FEEDING;
    }

    @Override
    public PrehistoricEntityTypeAI.Untaming aiUntameType() {
        return PrehistoricEntityTypeAI.Untaming.NONE;
    }

    @Override
    public PrehistoricEntityTypeAI.Moving aiMovingType() {
        return PrehistoricEntityTypeAI.Moving.SEMIAQUATIC;
    }

    @Override
    public PrehistoricEntityTypeAI.WaterAbility aiWaterAbilityType() {
        return PrehistoricEntityTypeAI.WaterAbility.ATTACK;
    }

    @Override
    public boolean doesFlock() {
        return false;
    }

    @Override
    public Item getOrderItem() {
        return FAItemRegistry.SHELL;
    }

    @Override
    public int getAdultAge() {
        return 5;
    }

    @Override
    public int getMaxHunger() {
        return 70;
    }

    @Override
    public double swimSpeed() {
        return 0.5D;
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        boolean swimming = this.isSwimming();
        if (swimming && swimProgress < 20.0F) {
            swimProgress += 0.5F;
        } else if (!swimming && swimProgress > 0.0F) {
            swimProgress -= 0.5F;
        }
        if (this.isSwimming() && (this.isSitting() || this.isSleeping())) {
            this.setSitting(false);
            this.setSleeping(false);
        }
        if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 5 && this.getAttackTarget() != null) {
            doAttack();
        }
        if (this.isInWaterMaterial()) {
            this.setSwimming(true);
        } else {
            this.setSwimming(false);
        }
    }

    @Override
    public boolean attackEntityAsMob(Entity entity) {
        if (this.getAnimation() == NO_ANIMATION) {
            this.setAnimation(ATTACK_ANIMATION);
        }
        return false;
    }


    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(SWIMMING, false);
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setBoolean("Swimming", this.isSwimming);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.setSwimming(compound.getBoolean("Swimming"));

    }

    public boolean isSwimming() {
        if (world.isRemote) {
            boolean isSwimming = this.dataManager.get(SWIMMING);
            this.isSwimming = isSwimming;
            return isSwimming;
        }

        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        this.dataManager.set(SWIMMING, swimming);
        if (!world.isRemote) {
            this.isSwimming = swimming;
        }
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return this.isInWater() ? FASoundRegistry.TIKTAALIK_LIVING : FASoundRegistry.HENODUS_LIVING;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return FASoundRegistry.TIKTAALIK_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return FASoundRegistry.TIKTAALIK_DEATH;
    }

    @Override
    public boolean canBeRidden() {
        return false;
    }
}
