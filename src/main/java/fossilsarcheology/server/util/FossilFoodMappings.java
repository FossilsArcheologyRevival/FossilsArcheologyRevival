package fossilsarcheology.server.util;

import fossilsarcheology.server.entity.mob.*;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import fossilsarcheology.api.EnumDiet;
import fossilsarcheology.api.FoodMappings;
import fossilsarcheology.server.block.FABlockRegistry;
import fossilsarcheology.server.enums.EnumMobType;
import fossilsarcheology.server.enums.EnumPrehistoric;
import fossilsarcheology.server.enums.EnumTimePeriod;
import fossilsarcheology.server.item.FAItemRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class FossilFoodMappings {

    public static void init() {
        FoodMappings.INSTANCE.addPlant(new ItemStack(Items.reeds), 15);
        FoodMappings.INSTANCE.addPlant(new ItemStack(Items.wheat), 13);
        FoodMappings.INSTANCE.addPlant(new ItemStack(Items.melon), 10);
        FoodMappings.INSTANCE.addPlant(new ItemStack(Items.apple), 20);
        FoodMappings.INSTANCE.addPlant(new ItemStack(Items.potato), 35);
        FoodMappings.INSTANCE.addPlant(new ItemStack(Items.baked_potato), 35);
        FoodMappings.INSTANCE.addPlant(new ItemStack(Items.cake), 50);
        FoodMappings.INSTANCE.addPlant(new ItemStack(Items.carrot), 15);
        FoodMappings.INSTANCE.addPlant(new ItemStack(Items.cookie), 10);
        FoodMappings.INSTANCE.addPlant(new ItemStack(Items.pumpkin_pie), 25);
        FoodMappings.INSTANCE.addPlant(new ItemStack(Items.sugar), 7);
        FoodMappings.INSTANCE.addPlant(new ItemStack(Items.bread), 25);
        FoodMappings.INSTANCE.addPlant(new ItemStack(Items.wheat_seeds), 5);
        FoodMappings.INSTANCE.addPlant(new ItemStack(Items.melon_seeds), 5);
        FoodMappings.INSTANCE.addPlant(new ItemStack(Items.pumpkin_seeds), 5);
        FoodMappings.INSTANCE.addPlant(Blocks.cake, 35);
        FoodMappings.INSTANCE.addPlant(Blocks.carrots, 20);
        FoodMappings.INSTANCE.addPlant(Blocks.wheat, 10);
        FoodMappings.INSTANCE.addPlant(Blocks.leaves, 20);
        FoodMappings.INSTANCE.addPlant(Blocks.melon_block, 65);
        FoodMappings.INSTANCE.addPlant(Blocks.brown_mushroom, 15);
        FoodMappings.INSTANCE.addPlant(Blocks.red_mushroom, 15);
        FoodMappings.INSTANCE.addPlant(Blocks.red_flower, 5);
        FoodMappings.INSTANCE.addPlant(Blocks.yellow_flower, 5);
        FoodMappings.INSTANCE.addPlant(Blocks.potatoes, 25);
        FoodMappings.INSTANCE.addPlant(Blocks.pumpkin, 30);
        FoodMappings.INSTANCE.addPlant(Blocks.reeds, 15);
        FoodMappings.INSTANCE.addPlant(Blocks.sapling, 15);
        FoodMappings.INSTANCE.addPlant(Blocks.tallgrass, 5);
        FoodMappings.INSTANCE.addPlant(Blocks.waterlily, 15);
        FoodMappings.INSTANCE.addPlant(FABlockRegistry.INSTANCE.ferns, 55);
        FoodMappings.INSTANCE.addPlant(FABlockRegistry.INSTANCE.palmLeaves, 40);
        
        FoodMappings.INSTANCE.addFish(new ItemStack(Items.fish), 30);
        FoodMappings.INSTANCE.addFish(new ItemStack(Items.fish, 1, 1), 30);
        FoodMappings.INSTANCE.addFish(new ItemStack(Items.fish, 1, 2), 30);
        FoodMappings.INSTANCE.addFish(new ItemStack(Items.fish, 1, 3), 30);
        FoodMappings.INSTANCE.addFish(new ItemStack(Items.cooked_fished), 45);
        FoodMappings.INSTANCE.addFish(new ItemStack(Items.cooked_fished, 1, 1), 45);
        FoodMappings.INSTANCE.addFish(new ItemStack(FAItemRegistry.INSTANCE.sjl), 65);
        
        FoodMappings.INSTANCE.addMeat(new ItemStack(Items.cooked_beef), 60);
        FoodMappings.INSTANCE.addMeat(new ItemStack(Items.beef), 40);
        FoodMappings.INSTANCE.addMeat(new ItemStack(Items.cooked_chicken), 15);
        FoodMappings.INSTANCE.addMeat(new ItemStack(Items.chicken), 10);
        FoodMappings.INSTANCE.addMeat(new ItemStack(Items.porkchop), 35);
        FoodMappings.INSTANCE.addMeat(new ItemStack(Items.cooked_porkchop), 55);
        FoodMappings.INSTANCE.addMeat(new ItemStack(FAItemRegistry.INSTANCE.failuresaurusFlesh), 15);

        FoodMappings.INSTANCE.addEgg(new ItemStack(Items.egg), 7);

        for (int i = 0; i < EnumPrehistoric.values().length; i++) {
            if (EnumPrehistoric.values()[i].timeperiod != EnumTimePeriod.CURRENT) {
                if (EnumPrehistoric.values()[i].type != EnumMobType.FISH) {
                    FoodMappings.INSTANCE.addMeat(new ItemStack(EnumPrehistoric.values()[i].foodItem), 35);
                    FoodMappings.INSTANCE.addMeat(new ItemStack(EnumPrehistoric.values()[i].cookedFoodItem), 7);
                } else {
                    FoodMappings.INSTANCE.addFish(new ItemStack(EnumPrehistoric.values()[i].eggItem), 35);
                    FoodMappings.INSTANCE.addFish(new ItemStack(EnumPrehistoric.values()[i].fishItem), 35);
                    FoodMappings.INSTANCE.addFish(new ItemStack(EnumPrehistoric.values()[i].cookedFoodItem), 75);
                }
            }
            if (EnumPrehistoric.values()[i].type == EnumMobType.BIRD || EnumPrehistoric.values()[i].type == EnumMobType.CHICKEN) {
                FoodMappings.INSTANCE.addEgg(new ItemStack(EnumPrehistoric.values()[i].bestBirdEggItem), 15);
                if (EnumPrehistoric.values()[i].type != EnumMobType.CHICKEN) {
                    FoodMappings.INSTANCE.addEgg(new ItemStack(EnumPrehistoric.values()[i].birdEggItem), 10);
                }
            }
        }

        FoodMappings.INSTANCE.addMeat(EntityPlayer.class, 27);
        FoodMappings.INSTANCE.addMeat(EntityPlayerMP.class, 27);
        FoodMappings.INSTANCE.addMeat(EntityVillager.class, 27);
        FoodMappings.INSTANCE.addMeat(EntityZombie.class, 23);
        FoodMappings.INSTANCE.addMeat(EntityChicken.class, 5);
        FoodMappings.INSTANCE.addMeat(EntityCow.class, 40);
        FoodMappings.INSTANCE.addMeat(EntityHorse.class, 55);
        FoodMappings.INSTANCE.addMeat(EntityPig.class, 20);
        FoodMappings.INSTANCE.addMeat(EntitySheep.class, 35);
        FoodMappings.INSTANCE.addMeat(EntitySquid.class, 30);
        FoodMappings.INSTANCE.addMeat(EntityNautilus.class, 100);
        FoodMappings.INSTANCE.addMeat(EntityTriceratops.class, 120);
        FoodMappings.INSTANCE.addMeat(EntityVelociraptor.class, 20);
        FoodMappings.INSTANCE.addMeat(EntityTyrannosaurus.class, 120);
        FoodMappings.INSTANCE.addMeat(EntityPterosaur.class, 35);
        FoodMappings.INSTANCE.addMeat(EntityMosasaurus.class, 50);
        FoodMappings.INSTANCE.addMeat(EntitySarcosuchus.class, 50);
        FoodMappings.INSTANCE.addMeat(EntityLiopleurodon.class, 50);
        FoodMappings.INSTANCE.addMeat(EntityStegosaurus.class, 50);
        FoodMappings.INSTANCE.addMeat(EntityDilophosaurus.class, 25);
        FoodMappings.INSTANCE.addMeat(EntityBrachiosaurus.class, 90);
        FoodMappings.INSTANCE.addMeat(EntitySpinosaurus.class, 70);
        FoodMappings.INSTANCE.addMeat(EntityCompsognathus.class, 10);
        FoodMappings.INSTANCE.addMeat(EntityAnkylosaurus.class, 50);
        FoodMappings.INSTANCE.addMeat(EntityPachycephalosaurus.class, 50);
        FoodMappings.INSTANCE.addMeat(EntityDeinonychus.class, 35);
        FoodMappings.INSTANCE.addMeat(EntityGallimimus.class, 40);
        FoodMappings.INSTANCE.addMeat(EntityAllosaurus.class, 25);
        FoodMappings.INSTANCE.addMeat(EntityDodo.class, 20);
        FoodMappings.INSTANCE.addMeat(EntityQuagga.class, 50);
        FoodMappings.INSTANCE.addMeat(EntityTitanis.class, 40);
        FoodMappings.INSTANCE.addMeat(EntityPhorusrhacos.class, 40);
        FoodMappings.INSTANCE.addMeat(EntityKelenken.class, 40);
        FoodMappings.INSTANCE.addMeat(EntityTitanis.class, 40);
        FoodMappings.INSTANCE.addMeat(EntityMammoth.class, 100);
        FoodMappings.INSTANCE.addMeat(EntityElasmotherium.class, 80);
        FoodMappings.INSTANCE.addMeat(EntityConfuciusornis.class, 15);
        FoodMappings.INSTANCE.addMeat(EntityCeratosaurus.class, 50);
        FoodMappings.INSTANCE.addMeat(EntityDryosaurus.class, 25);
        FoodMappings.INSTANCE.addMeat(EntityTherizinosaurus.class, 125);
        FoodMappings.INSTANCE.addMeat(EntityParasaurolophus.class, 150);
        FoodMappings.INSTANCE.addFish(EntityCoelacanth.class, 20);
        FoodMappings.INSTANCE.addFish(EntitySturgeon.class, 20);
        FoodMappings.INSTANCE.addFish(EntityAlligatorGar.class, 20);
        FoodMappings.INSTANCE.removeItemMapping(new ItemStack(EnumPrehistoric.Horse.embryoItem), EnumDiet.CARNIVORE_EGG);

        FoodMappings.INSTANCE.addFish("listAllfishraw", 5);
        FoodMappings.INSTANCE.addFish("foodOctopuscooked", 30);
        FoodMappings.INSTANCE.addFish("listAllfishcooked", 45);
        FoodMappings.INSTANCE.addFish("foodCalamariraw", 30);
        FoodMappings.INSTANCE.addFish("foodCalamaricooked", 45);
        FoodMappings.INSTANCE.addFish("foodClamraw", 15);
        FoodMappings.INSTANCE.addFish("foodCrabraw", 10);
        FoodMappings.INSTANCE.addFish("foodCrabcooked", 15);
        FoodMappings.INSTANCE.addFish("foodShrimpcooked", 13);
        FoodMappings.INSTANCE.addFish("foodSnailcooked", 10);
        FoodMappings.INSTANCE.addFish("foodClamcooked", 22);
        FoodMappings.INSTANCE.addFish("foodCookedClam", 22);
        FoodMappings.INSTANCE.addFish("cookingClam", 15);
        FoodMappings.INSTANCE.addPlant("cropYuzu", 20);
        FoodMappings.INSTANCE.addPlant("listAllfruit", 20);
        FoodMappings.INSTANCE.addPlant("listAllveggie", 15);
        FoodMappings.INSTANCE.addPlant("listAllrootveggie", 15);
        FoodMappings.INSTANCE.addPlant("cropWildcarrots", 15);
        FoodMappings.INSTANCE.addPlant("foodMushroompowder", 5);
        FoodMappings.INSTANCE.addPlant("listAllgreenveggie", 15);
        FoodMappings.INSTANCE.addPlant("listAllmushroom", 15);
        FoodMappings.INSTANCE.addPlant("listAllberry", 7);
        FoodMappings.INSTANCE.addPlant("cropStrawberry", 7);
        FoodMappings.INSTANCE.addPlant("cropCamellia", 5);
        FoodMappings.INSTANCE.addPlant("cropCassis", 7);
        FoodMappings.INSTANCE.addPlant("treeLeaves", 20);
        FoodMappings.INSTANCE.addPlant("treeSapling", 15);
        FoodMappings.INSTANCE.addPlant("sapling", 15);
        FoodMappings.INSTANCE.addPlant("saplingPalm", 15);   
        FoodMappings.INSTANCE.addPlant("leaves", 20);
        FoodMappings.INSTANCE.addPlant("leavesPalm", 20);
        FoodMappings.INSTANCE.addPlant("listAllgrain", 10);
        FoodMappings.INSTANCE.addPlant("cropRice", 10);
        FoodMappings.INSTANCE.addPlant("cropCorn", 10);
        FoodMappings.INSTANCE.addPlant("reedTypha", 15);
        FoodMappings.INSTANCE.addPlant("listAllnut", 15);
        FoodMappings.INSTANCE.addPlant("listAllseed", 5);
        FoodMappings.INSTANCE.addPlant("cropCoconut", 20);
        FoodMappings.INSTANCE.addPlant("listAllherb", 10);
        FoodMappings.INSTANCE.addPlant("listAllspice", 10);
        FoodMappings.INSTANCE.addPlant("cropEdibleroot", 7);
        FoodMappings.INSTANCE.addPlant("cropSesame", 5);
        FoodMappings.INSTANCE.addPlant("listAllpepper", 5);
        FoodMappings.INSTANCE.addPlant("cropAvocado", 20);
        FoodMappings.INSTANCE.addPlant("cropApple", 20);
        FoodMappings.INSTANCE.addPlant("cropCherry", 5);
        FoodMappings.INSTANCE.addPlant("cropWalnut", 7);
        FoodMappings.INSTANCE.addPlant("cropChestnut", 7);
        FoodMappings.INSTANCE.addPlant("cropLemon", 10);
        FoodMappings.INSTANCE.addPlant("cropPlum", 10);
        FoodMappings.INSTANCE.addPlant("cropDate", 5);
        FoodMappings.INSTANCE.addPlant("cropDate", 10);
        FoodMappings.INSTANCE.addPlant("cropOrange", 10);
        FoodMappings.INSTANCE.addPlant("cropKumquat", 7);
        FoodMappings.INSTANCE.addPlant("cropLime", 10);
        FoodMappings.INSTANCE.addPlant("cropBlackthorn", 7);
        FoodMappings.INSTANCE.addPlant("cropAlmond", 7);
        FoodMappings.INSTANCE.addPlant("cropApricot", 10);
        FoodMappings.INSTANCE.addPlant("cropGrapefruit", 15);
        FoodMappings.INSTANCE.addPlant("cropPeach", 10);
        FoodMappings.INSTANCE.addPlant("cropCitron", 20);
        FoodMappings.INSTANCE.addPlant("cropPomelo", 25);
        FoodMappings.INSTANCE.addPlant("cropPear", 20);
        FoodMappings.INSTANCE.addPlant("cropSandPear", 20);
        FoodMappings.INSTANCE.addPlant("cropHazelnut", 10);
        FoodMappings.INSTANCE.addPlant("cropBeechnut", 10);
        FoodMappings.INSTANCE.addPlant("cropPecan", 10);
        FoodMappings.INSTANCE.addPlant("cropBanana", 15);
        FoodMappings.INSTANCE.addPlant("cropPlantain", 15);
        FoodMappings.INSTANCE.addPlant("cropBrazilNut", 10);
        FoodMappings.INSTANCE.addPlant("cropFig", 12);
        FoodMappings.INSTANCE.addPlant("cropAcorn", 5);
        FoodMappings.INSTANCE.addPlant("cropElderberry", 7);
        FoodMappings.INSTANCE.addPlant("cropOlive", 7);
        FoodMappings.INSTANCE.addPlant("cropGinkgoNut", 7);
        FoodMappings.INSTANCE.addPlant("cropOsangeOrange", 30);
        FoodMappings.INSTANCE.addPlant("cropClove", 7);
        FoodMappings.INSTANCE.addPlant("cropDurian", 25);
        FoodMappings.INSTANCE.addPlant("cropTea", 10);
        FoodMappings.INSTANCE.addPlant("cropSpiceleaf", 10);
        FoodMappings.INSTANCE.addPlant("cropCurryleaf", 10);
        FoodMappings.INSTANCE.addPlant("cropCoffee", 5);
        FoodMappings.INSTANCE.addPlant("cropNutmeg", 7);
        FoodMappings.INSTANCE.addPlant("cropCoffee", 5);
        FoodMappings.INSTANCE.addPlant("cropCinnamon", 5);
        FoodMappings.INSTANCE.addPlant("cropVanillabean", 5);
        FoodMappings.INSTANCE.addPlant("cropMaplesyrup", 5);
        FoodMappings.INSTANCE.addPlant("dropHoney", 7);
        FoodMappings.INSTANCE.addPlant("foodSugar", 7);
        FoodMappings.INSTANCE.addPlant("bamboo", 8);
        FoodMappings.INSTANCE.addMeat("listAllmeatcooked", 60);
        FoodMappings.INSTANCE.addMeat("listAllmeatraw", 40);
        FoodMappings.INSTANCE.addMeat("foodOffal", 10);
        FoodMappings.INSTANCE.addMeat("listAllchickenraw", 10);
        FoodMappings.INSTANCE.addMeat("listAllchickencooked", 15);
        FoodMappings.INSTANCE.addMeat("listAllmuttonraw", 20);
        FoodMappings.INSTANCE.addMeat("listAllmuttoncooked", 30);
        FoodMappings.INSTANCE.addMeat("listAllporkraw", 30);
        FoodMappings.INSTANCE.addMeat("listAllporkcooked", 55);
        FoodMappings.INSTANCE.addMeat("listAllvenisonraw", 30);
        FoodMappings.INSTANCE.addMeat("listAllvenisoncooked", 55);
        FoodMappings.INSTANCE.addMeat("listAllbeefraw", 40);
        FoodMappings.INSTANCE.addMeat("listAllbeefcooked", 60);
        FoodMappings.INSTANCE.addMeat("foodRabbitraw", 10);
        FoodMappings.INSTANCE.addMeat("foodRabbitcooked", 15);
        FoodMappings.INSTANCE.addMeat("listAllturkeyraw", 15);
        FoodMappings.INSTANCE.addMeat("listAllturkeycooked", 20);
        FoodMappings.INSTANCE.addMeat("foodTurtleraw", 25);
        FoodMappings.INSTANCE.addMeat("foodTurtlecooked", 40);
        FoodMappings.INSTANCE.addMeat("foodFrograw", 15);
        FoodMappings.INSTANCE.addMeat("foodFrogcooked", 25);
        FoodMappings.INSTANCE.addEgg("listAllegg", 7);
    }
}
