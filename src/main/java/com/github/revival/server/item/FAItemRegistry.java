package com.github.revival.server.item;

import com.github.revival.Revival;
import com.github.revival.server.FARegistry;
import com.github.revival.server.block.FABlockRegistry;
import com.github.revival.server.creativetab.FATabRegistry;
import com.github.revival.server.entity.BehaviorJavelinDispense;
import com.github.revival.server.handler.BucketEvent;
import com.github.revival.server.handler.LocalizationStrings;
import com.github.revival.server.item.forge.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockDispenser;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

import java.lang.reflect.Field;

public class FAItemRegistry extends FARegistry {
    public static Item biofossil;
    public static Item tarfossil;
    public static Item relic;
    public static Item stoneboard;
    public static Item brokenSword;
    public static Item ancientSword;
    public static Item brokenhelmet;
    public static Item ancienthelmet;
    public static Item potteryShards;
    public static Item skullStick;
    public static Item icedMeat;
    public static Item brokenSapling;
    public static Item fossilSeed;
    public static Item fossilSeed_fern;
    public static Item palaeSaplingFossil;
    public static Item seed;
    public static Item fernSeed;
    public static Item dinoPedia;
    public static Item archNotebook;
    public static Item whip;
    public static Item failuresaurusFlesh;
    public static Item tar_bucket;
    public static Item tardrop;
    public static Item emptyShell;
    public static Item sjl;
    public static Item magicConch;
    public static Item livingCoelacanth;
    public static Item rawChickenSoup;
    public static Item cookedChickenSoup;
    public static Item chickenEss;
    public static Item amber;
    public static Item DominicanAmber;
    public static Item gem;
    public static Item gemAxe;
    public static Item gemPickaxe;
    public static Item gemSword;
    public static Item gemHoe;
    public static Item gemShovel;
    public static Item gem_blue;
    public static Item skullHelmet;
    public static Item ribCage;
    public static Item femurs;
    public static Item feet;
    public static Item ancientKey;
    public static Item ancientClock;
    public static Item toothDagger;
    public static Item woodjavelin;
    public static Item stonejavelin;
    public static Item ironjavelin;
    public static Item goldjavelin;
    public static Item diamondjavelin;
    public static Item ancientJavelin;
    public static Item cookedDinoMeat;
    public static Item fossilrecordBones;
    public static Item recordNano_Anu;
    public static Item skull;
    public static Item dinoRibCage;
    public static Item claw;
    public static Item armBone;
    public static Item vertebrae;
    public static Item legBone;
    public static Item foot;
    public static Item dinosaurModels;

    public void init() {
        biofossil = new BioFossilItem();
        DominicanAmber = new DominicanAmberItem();
        gem_blue = new AquaticScarabGemItem().setUnlocalizedName("AquaticScarabGem");
        relic = new ForgeItemItem("Relic_Scrap").setUnlocalizedName(LocalizationStrings.RELIC_NAME).setCreativeTab(FATabRegistry.tabFItems);
        stoneboard = new StoneBoardItem();
        ancientSword = new AncientSwordItem().setUnlocalizedName(LocalizationStrings.ANCIENT_SWORD_NAME).setCreativeTab(FATabRegistry.tabFItems);
        brokenSword = new ForgeItemItem("Broken_Ancient_Sword").setMaxStackSize(1).setUnlocalizedName(LocalizationStrings.BROKEN_SWORD_NAME).setCreativeTab(FATabRegistry.tabFItems);
        fernSeed = new FernSeedItem(FABlockRegistry.ferns);
        ancienthelmet = new AncientHelmetItem(ItemArmor.ArmorMaterial.IRON, 3, 0).setUnlocalizedName(LocalizationStrings.ANCIENT_HELMET_NAME).setCreativeTab(FATabRegistry.tabFItems);
        brokenhelmet = new ForgeItemItem("Broken_Ancient_Helm").setMaxStackSize(1).setUnlocalizedName(LocalizationStrings.BROKEN_HELMET_NAME).setCreativeTab(FATabRegistry.tabFItems);
        skullStick = new ForgeItemItem("Skull_Stick").setUnlocalizedName(LocalizationStrings.SKULL_STICK_NAME).setCreativeTab(FATabRegistry.tabFItems);
        gem = new ForgeItemItem("Scarab_Gem").setUnlocalizedName(LocalizationStrings.SCARAB_GEM_NAME).setCreativeTab(FATabRegistry.tabFItems);
        gemAxe = new ForgeAxeItem(Revival.scarab, "Gem_Axe").setUnlocalizedName(LocalizationStrings.SCARAB_AXE_NAME).setCreativeTab(FATabRegistry.tabFItems);
        gemPickaxe = new ForgePickaxeItem(Revival.scarab, "Gem_Pickaxe").setUnlocalizedName(LocalizationStrings.SCARAB_PICKAXE_NAME).setCreativeTab(FATabRegistry.tabFItems);
        gemSword = new ForgeSwordItem(Revival.scarab, "Gem_Sword").setUnlocalizedName(LocalizationStrings.SCARAB_SWORD_NAME).setCreativeTab(FATabRegistry.tabFItems);
        gemHoe = new ForgeHoeItem(Revival.scarab, "Gem_Hoe").setUnlocalizedName(LocalizationStrings.SCARAB_HOE_NAME).setCreativeTab(FATabRegistry.tabFItems);
        gemShovel = new ForgeShovelItem(Revival.scarab, "Gem_Shovel").setUnlocalizedName(LocalizationStrings.SCARAB_SHOVEL_NAME).setCreativeTab(FATabRegistry.tabFItems);
        dinoPedia = new ForgeItemItem("Dinopedia").setUnlocalizedName(LocalizationStrings.DINOPEDIA_NAME).setCreativeTab(FATabRegistry.tabFItems);
        emptyShell = new ForgeItemItem("Empty_Shell").setUnlocalizedName(LocalizationStrings.EMPTY_SHELL_NAME).setCreativeTab(FATabRegistry.tabFItems);
        magicConch = new MagicConchItem().setUnlocalizedName(LocalizationStrings.MAGIC_CONCH_NAME).setCreativeTab(FATabRegistry.tabFItems);
        icedMeat = new IcedMeatItem(Item.ToolMaterial.EMERALD).setUnlocalizedName(LocalizationStrings.ICED_MEAT_NAME).setCreativeTab(FATabRegistry.tabFItems);
        amber = new AmberItem().setUnlocalizedName(LocalizationStrings.AMBER_NAME).setCreativeTab(FATabRegistry.tabFItems);
        woodjavelin = new JavelinItem(Item.ToolMaterial.WOOD, "Wooden_Javelin").setUnlocalizedName(LocalizationStrings.WOOD_JAVELIN_NAME).setCreativeTab(FATabRegistry.tabFItems);
        stonejavelin = new JavelinItem(Item.ToolMaterial.STONE, "Stone_Javelin").setUnlocalizedName(LocalizationStrings.STONE_JAVELIN_NAME).setCreativeTab(FATabRegistry.tabFItems);
        ironjavelin = new JavelinItem(Item.ToolMaterial.IRON, "Iron_Javelin").setUnlocalizedName(LocalizationStrings.IRON_JAVELIN_NAME).setCreativeTab(FATabRegistry.tabFItems);
        goldjavelin = new JavelinItem(Item.ToolMaterial.GOLD, "Gold_Javelin").setUnlocalizedName(LocalizationStrings.GOLD_JAVELIN_NAME).setCreativeTab(FATabRegistry.tabFItems);
        diamondjavelin = new JavelinItem(Item.ToolMaterial.EMERALD, "Diamond_Javelin").setUnlocalizedName(LocalizationStrings.DIAMOND_JAVELIN_NAME).setCreativeTab(FATabRegistry.tabFItems);
        ancientJavelin = new JavelinItem(Revival.scarab, "Ancient_Javelin").setUnlocalizedName(LocalizationStrings.ANCIENT_JAVELIN_NAME).setCreativeTab(FATabRegistry.tabFItems);
        toothDagger = new ToothDaggerItem(Revival.toothDaggerMaterial).setTextureName("fossil:toothDagger").setUnlocalizedName("toothDagger").setCreativeTab(FATabRegistry.tabFItems);
        whip = new WhipItem().setUnlocalizedName(LocalizationStrings.WHIP_NAME).setCreativeTab(FATabRegistry.tabFItems);
        legBone = new DinosaurBoneItem("legBone").setUnlocalizedName(LocalizationStrings.LEGBONE_NAME);
        claw = new DinosaurBoneItem("uniqueItem").setUnlocalizedName(LocalizationStrings.CLAW_NAME);
        foot = new DinosaurBoneItem("foot").setUnlocalizedName(LocalizationStrings.FOOT_NAME);
        skull = new DinosaurBoneItem("skull").setUnlocalizedName(LocalizationStrings.SKULL_NAME);
        armBone = new DinosaurBoneItem("armBone").setUnlocalizedName(LocalizationStrings.ARM_BONE_NAME);
        dinoRibCage = new DinosaurBoneItem("dinoRibCage").setUnlocalizedName(LocalizationStrings.DINO_RIB_CAGE_NAME);
        vertebrae = new DinosaurBoneItem("vertebrae").setUnlocalizedName(LocalizationStrings.VERTEBRAE_NAME);
        brokenSapling = new ForgeItemItem("fossilPlant").setUnlocalizedName(LocalizationStrings.BROKEN_SAPLING_NAME).setCreativeTab(FATabRegistry.tabFItems);
        failuresaurusFlesh = new ForgeItemItem("flesh").setUnlocalizedName(LocalizationStrings.FAILURESAURUS_FLESH_NAME).setCreativeTab(FATabRegistry.tabFItems);
        // cultivatedChickenEgg = new BirdEggItem(4).setUnlocalizedName("eggCultivatedChicken").setTextureName("fossil:Egg_Cultivated_Chicken");
        //dodoEgg = new BirdEggItem(0).setUnlocalizedName(LocalizationStrings.DODO_EGG_NAME).setTextureName("fossil:Egg_Dodo");
        // cultivatedDodoEgg = new BirdEggItem(1).setUnlocalizedName(LocalizationStrings.CULTIVATED_DODO_EGG_NAME).setTextureName("fossil:Egg_Cultivated_Dodo");
        // confuciusornisEgg = new BirdEggItem(2).setUnlocalizedName("eggConfuciusornis").setTextureName("fossil:Egg_Confuciusornis");
        // cultivatedConfuciusornisEgg = new BirdEggItem(3).setUnlocalizedName("eggCultivatedConfuciusornis").setTextureName("fossil:Egg_Cultivated_Confuciusornis");
        potteryShards = new ForgeItemItem("PotteryShard").setUnlocalizedName(LocalizationStrings.POTTERY_SHARDS).setCreativeTab(FATabRegistry.tabFItems);
        livingCoelacanth = new LivingCoelacanthItem(1).setUnlocalizedName(LocalizationStrings.LIVING_COELACANTH_NAME).setCreativeTab(FATabRegistry.tabFItems);
        // terrorBirdEgg = new TerrorBirdEggItem(false).setUnlocalizedName(LocalizationStrings.TERROR_BIRD_EGG_NAME);
        // cultivatedTerrorBirdEgg = new TerrorBirdEggItem(true).setUnlocalizedName(LocalizationStrings.CULTIVATED_TERROR_BIRD_EGG_NAME);
        skullHelmet = new SkullHelmetItem(Revival.bone, 3, 0).setUnlocalizedName(LocalizationStrings.SKULL_HELMET_NAME).setCreativeTab(FATabRegistry.tabFItems);
        ribCage = new RibCageItem(Revival.bone, 3, 1).setUnlocalizedName(LocalizationStrings.RIBCAGE_NAME).setCreativeTab(FATabRegistry.tabFItems);
        femurs = new FemursItem(Revival.bone, 3, 2).setUnlocalizedName(LocalizationStrings.FEMURS_NAME).setCreativeTab(FATabRegistry.tabFItems);
        feet = new FeetItem(Revival.bone, 3, 3).setUnlocalizedName(LocalizationStrings.FEET_NAME).setCreativeTab(FATabRegistry.tabFItems);
        cookedDinoMeat = new ForgeFoodItem(8, 0.8F, true, "Dino_Steak").setUnlocalizedName(LocalizationStrings.DINO_STEAK_NAME).setCreativeTab(FATabRegistry.tabFItems);
        cookedChickenSoup = new ForgeItemItem("Cooked_Chicken_Soup").setUnlocalizedName(LocalizationStrings.COOKED_CHICKEN_SOUP_NAME).setMaxStackSize(1).setContainerItem(Items.bucket).setCreativeTab(FATabRegistry.tabFItems);
        rawChickenSoup = new ForgeItemItem("Raw_Chicken_Soup").setUnlocalizedName(LocalizationStrings.RAW_CHICKEN_SOUP_NAME).setMaxStackSize(1).setContainerItem(Items.bucket).setCreativeTab(FATabRegistry.tabFItems);
        chickenEss = new ChickenEssItem(10, 0.0F, false, "Essence_Of_Chicken").setUnlocalizedName(LocalizationStrings.EOC_NAME).setContainerItem(Items.glass_bottle).setCreativeTab(FATabRegistry.tabFItems);
        sjl = new ForgeFoodItem(8, 2.0F, false, "Sio_Chiu_Le").setUnlocalizedName(LocalizationStrings.SJL_NAME).setCreativeTab(FATabRegistry.tabFItems);
        //dodoWing = new ForgeFoodItem(3, 0.3F, false, "Raw_Dodo_Wing").setPotionEffect(Potion.hunger.id, 30, 0, 0.3F).setUnlocalizedName(LocalizationStrings.DODO_WING_NAME).setCreativeTab(FATabRegistry.tabFItems);
        //dodoWingCooked = new ForgeFoodItem(8, 0.8F, false, "Cooked_Dodo_Wing").setUnlocalizedName(LocalizationStrings.DODO_WING_COOKED_NAME).setCreativeTab(FATabRegistry.tabFItems);
        //confuciornisRaw = new ForgeFoodItem(2, 0.3F, false, "RawConfuciornis").setUnlocalizedName("rawConfuciornis").setCreativeTab(FATabRegistry.tabFItems);
        //confuciornisCooked = new ForgeFoodItem(5, 0.8F, false, "CookedConfuciornis").setUnlocalizedName("cookedConfuciornis").setCreativeTab(FATabRegistry.tabFItems);
        //  terrorBirdMeat = new ForgeFoodItem(2, 0.8F, false, "TerrorBird/TerrorBird_Meat").setPotionEffect(Potion.hunger.id, 30, 0, 0.3F).setUnlocalizedName(LocalizationStrings.TERROR_BIRD_MEAT).setCreativeTab(FATabRegistry.tabFItems);
        //  terrorBirdMeatCooked = new ForgeFoodItem(4, 0.8F, false, "TerrorBird/TerrorBird_Meat_Cooked").setUnlocalizedName(LocalizationStrings.TERROR_BIRD_MEAT_COOKED).setCreativeTab(FATabRegistry.tabFItems);
        // quaggaMeat = new ForgeFoodItem(2, 0.8F, false, "Quagga_Meat").setPotionEffect(Potion.hunger.id, 30, 0, 0.3F).setUnlocalizedName(LocalizationStrings.QUAGGA_MEAT).setCreativeTab(FATabRegistry.tabFItems);
        // quaggaMeatCooked = new ForgeFoodItem(7, 1F, false, "Quagga_Meat_Cooked").setUnlocalizedName(LocalizationStrings.QUAGGA_MEAT_COOKED).setCreativeTab(FATabRegistry.tabFItems);
        fossilrecordBones = new FossilRecordItem(LocalizationStrings.RECORD_BONES_NAME, "fossil:record_bones").setUnlocalizedName(LocalizationStrings.FOSSIL_RECORD_NAME);
        recordNano_Anu = new FossilRecordItem(LocalizationStrings.FOSSIL_RECORD_NANO_ANU, "fossil:record_anu").setUnlocalizedName(LocalizationStrings.RECORD_BONES_NAME);
        fossilSeed_fern = new ForgeItemItem("plants/fossilSeed_fern").setUnlocalizedName("fossilSeed_fern").setCreativeTab(FATabRegistry.tabFItems);
        fossilSeed = new FossilSeedsItem(true).setUnlocalizedName("fossilSeed").setCreativeTab(FATabRegistry.tabFItems);
        seed = new FossilSeedsItem(false).setUnlocalizedName("seed").setCreativeTab(FATabRegistry.tabFItems);
        palaeSaplingFossil = new ForgeItemItem("Palae_Fossil").setUnlocalizedName("fossilSapling_palae").setCreativeTab(FATabRegistry.tabFItems);
        tardrop = new ForgeItemItem("tardrop").setUnlocalizedName("tardrop").setCreativeTab(FATabRegistry.tabFItems);
        tarfossil = new ForgeItemItem("tar_fossil").setUnlocalizedName("tarfossil").setCreativeTab(FATabRegistry.tabFItems);
        tar_bucket = new ItemBucket(FABlockRegistry.tar).setUnlocalizedName("tar_bucket").setTextureName("fossil:bucket_tar").setContainerItem(Items.bucket).setCreativeTab(FATabRegistry.tabFItems);
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("tar", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(tar_bucket), new ItemStack(Items.bucket));
        BucketEvent.INSTANCE.buckets.put(FABlockRegistry.tar, tar_bucket);
        MinecraftForge.EVENT_BUS.register(BucketEvent.INSTANCE);
        BlockDispenser.dispenseBehaviorRegistry.putObject(ancientJavelin, new BehaviorJavelinDispense(MinecraftServer.getServer(), -1));
        BlockDispenser.dispenseBehaviorRegistry.putObject(woodjavelin, new BehaviorJavelinDispense(MinecraftServer.getServer(), 0));
        BlockDispenser.dispenseBehaviorRegistry.putObject(stonejavelin, new BehaviorJavelinDispense(MinecraftServer.getServer(), 1));
        BlockDispenser.dispenseBehaviorRegistry.putObject(ironjavelin, new BehaviorJavelinDispense(MinecraftServer.getServer(), 2));
        BlockDispenser.dispenseBehaviorRegistry.putObject(diamondjavelin, new BehaviorJavelinDispense(MinecraftServer.getServer(), 3));
        BlockDispenser.dispenseBehaviorRegistry.putObject(goldjavelin, new BehaviorJavelinDispense(MinecraftServer.getServer(), 4));
        //  BlockDispenser.dispenseBehaviorRegistry.putObject(dodoEgg, new BehaviorDodoEggDispense(MinecraftServer.getServer(), 5));
        // BlockDispenser.dispenseBehaviorRegistry.putObject(confuciusornisEgg, new BehaviorConfuciusornisEggDispense(MinecraftServer.getServer(), 6));
    }

    public void initCreativeTabs() {

    }

    public void gameRegistry() throws Exception {
        initCreativeTabs();
        try {
            for (Field f : getClass().getDeclaredFields()) {
                Object obj = f.get(null);
                if (obj instanceof Item) {
                    registerItem((Item) obj);
                } else if (obj instanceof Item[]) {
                    for (Item item : (Item[]) obj) {
                        registerItem(item);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public void registerItem(Item item) {
        String name = item.getUnlocalizedName();
        String[] strings = name.split("\\.");
        name = strings[strings.length - 1];

        GameRegistry.registerItem(item, name);
    }
}