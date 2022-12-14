package com.brecht.fac.item;

import com.brecht.fac.MysticalRoots;
import com.brecht.fac.block.ModBlocks;
import com.brecht.fac.block.custom.FireWoodItem;
import com.brecht.fac.entity.ModEntityTypes;
import com.brecht.fac.item.custom.*;
//import com.brecht.fac.item.custom.ManMemeCoinItem;

import com.brecht.fac.sound.ModSounds;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MysticalRoots.MOD_ID);

    //ITEMS
    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));
    public static final RegistryObject<Item> NUT = ITEMS.register("nut",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));

    public static final RegistryObject<Item> GHOST_DUST = ITEMS.register("ghost_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));

    public static final RegistryObject<Item> GHOST_INGOT = ITEMS.register("ghost_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));

    public static final RegistryObject<Item> GFH_MUSIC_DISC = ITEMS.register("gfh_music_disc",
            () -> new RecordItem(4, ModSounds.GUNS_FOR_HIRE, new Item.Properties().tab(ModCreativeModeTab.MR_TAB).stacksTo(1), 5300));
    public static final RegistryObject<Item> FOREST_ESSENCE = ITEMS.register("forest_essence",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));
    public static final RegistryObject<Item> CRUCIFIX = ITEMS.register("crucifix",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MR_TAB).stacksTo(16)));


    //TOOLS

    public static final RegistryObject<Item> GHOST_PICKAXE = ITEMS.register("ghost_pickaxe", () -> new PickaxeItem(ModTiers.GHOST, -2, 0f,
            new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));
    public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer", () -> new HammerItem(Tiers.DIAMOND, 0, -2.8f,
            new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));

    public static final RegistryObject<Item> GHOST_SHOVEL = ITEMS.register("ghost_shovel", () -> new ShovelItem(ModTiers.GHOST, -2, 0f,
            new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));

    public static final RegistryObject<Item> GHOST_AXE = ITEMS.register("ghost_axe", () -> new ShovelItem(ModTiers.GHOST, -2, 0f,
            new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));



    //FOOD
    public static final RegistryObject<Item> BREAD_SLICE = ITEMS.register("bread_slice",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MR_TAB).food(ModFoods.BREAD_SLICE)));

    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MR_TAB).food(ModFoods.BANANA)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MR_TAB).food(ModFoods.TOMATO)));
    public static final RegistryObject<Item> GRAPES = ITEMS.register("grapes",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MR_TAB).food(ModFoods.GRAPES)));
    public static final RegistryObject<Item> WINE = ITEMS.register("wine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MR_TAB).food(ModFoods.WINE)));

    //MAGIC
    public static final RegistryObject<Item> LIGHTNING_TOME = ITEMS.register("lightning_tome",
            () -> new LightningTomeItem(new Item.Properties().tab(ModCreativeModeTab.MR_TAB).stacksTo(1).durability(250)));

    public static final RegistryObject<Item> ECTOPLASM = ITEMS.register("ectoplasm",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));


    //ALTARS
    public static final RegistryObject<Item> DRUID_ALTAR_ITEM = ITEMS.register("druid_altar",
            () -> new DruidAltarItem(ModBlocks.DRUID_ALTAR.get(),
                    new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));

    //MISC
    public static final RegistryObject<Item> MYRTHIAN_CRYSTAL = ITEMS.register("myrthian_crystal", () ->
            new MyrthianCrystalItem(new Item.Properties().tab(ModCreativeModeTab.MR_TAB).stacksTo(1)));

    //SEEDS
    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TOMATO_PLANT.get(), new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));

    public static final RegistryObject<Item> GRAPES_SEEDS = ITEMS.register("grapes_seeds",
            () -> new ItemNameBlockItem(ModBlocks.GRAPES_PLANT.get(), new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));


    //PROJECTILES
    public static final RegistryObject<Item> EXPLOSIVE_ARROW = ITEMS.register("explosive_arrow",
            () -> new ExplosiveArrowItem(new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));



    //SPAWNEGG
    public static final RegistryObject<Item> GHOST_SPAWN_EGG = ITEMS.register("ghost_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.GHOST,0x948e8d,0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));




    //FUEL
    public static final RegistryObject<Item> FIREWOOD = ITEMS.register("firewood",
            () -> new FireWoodItem(new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));







    //WEAPONS
    public static final RegistryObject<Item> CHOPPER = ITEMS.register("chopper",
            () -> new ChopperItem(Tiers.STONE, 5, -2.9f, new Item.Properties().tab(ModCreativeModeTab.MR_TAB).durability(400)
    ));
    public static final RegistryObject<Item> SABER = ITEMS.register("saber",
            () -> new SaberItem(Tiers.IRON, 3, 0f, new Item.Properties().tab(ModCreativeModeTab.MR_TAB).durability(500)));
    public static final RegistryObject<Item> GHOST_BOW = ITEMS.register("ghost_bow",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.MR_TAB).durability(500)));

    public static final RegistryObject<Item> SLASHING_JACK = ITEMS.register("slashing_jack",
            () -> new SwordItem(Tiers.DIAMOND, 4, -2.2f, new Item.Properties().tab(ModCreativeModeTab.MR_TAB).durability(1200)));
    public static final RegistryObject<Item> FIRE_SWORD = ITEMS.register("fire_sword",
            () -> new SwordItem(Tiers.IRON, 4, -2.2f, new Item.Properties().tab(ModCreativeModeTab.MR_TAB).durability(700)));

    public static final RegistryObject<Item> BO_STAFF = ITEMS.register("bo_staff",
            () -> new SwordItem(Tiers.WOOD, 4, -2.8f, new Item.Properties().tab(ModCreativeModeTab.MR_TAB).durability(700)));

    public static final RegistryObject<Item> MAGMA_SWORD = ITEMS.register("magma_sword",
            () -> new MagmaSwordItem(Tiers.NETHERITE, 5, -2.8f, new Item.Properties().tab(ModCreativeModeTab.MR_TAB).durability(2500)));



    //ARMOR
    public static final RegistryObject<Item> SQUIRREL_HELMET = ITEMS.register("squirrel_helmet", () -> new ModArmorItem(ModArmorMaterials.SQUIRREL, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));
    public static final RegistryObject<Item> SQUIRREL_CHESTPLATE = ITEMS.register("squirrel_chestplate", () -> new ArmorItem(ModArmorMaterials.SQUIRREL, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));
    public static final RegistryObject<Item> SQUIRREL_LEGGINGS = ITEMS.register("squirrel_leggings", () -> new ArmorItem(ModArmorMaterials.SQUIRREL, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));
    public static final RegistryObject<Item> SQUIRREL_BOOTS = ITEMS.register("squirrel_boots", () -> new ArmorItem(ModArmorMaterials.SQUIRREL, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));
    //public static final RegistryObject<Item> MAN_MEME_COIN = ITEMS.register("man_meme_coin", () -> new ManMemeCoinItem(new Item.Properties().tab(ModCreativeModeTab.FAC_TAB)));
    public static final RegistryObject<Item> FOREST_HELMET = ITEMS.register("forest_helmet", () -> new ModArmorItem(ModArmorMaterials.FOREST, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));
    public static final RegistryObject<Item> FOREST_CHESTPLATE = ITEMS.register("forest_chestplate", () -> new ArmorItem(ModArmorMaterials.FOREST, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));
    public static final RegistryObject<Item> FOREST_LEGGINGS = ITEMS.register("forest_leggings", () -> new ArmorItem(ModArmorMaterials.FOREST, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));
    public static final RegistryObject<Item> FOREST_BOOTS = ITEMS.register("forest_boots", () -> new ArmorItem(ModArmorMaterials.FOREST, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.MR_TAB)));
    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
