package io.github.maplemods.maplesfadedmobs;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplesfadedmobs.data.Constants;
import net.minecraft.world.entity.EntityType;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerCategory(Constants.MOD_ID, "faded", "theme", 10, 1, 11, 13);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.ALLAY, "faded", "faded_allay", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ALLAY, "faded", "faded_allay", "entity/allay/allay", "faded_allay");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.AXOLOTL, "faded", "faded_axolotl", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.AXOLOTL, "faded", "faded_axolotl", "entity/axolotl/axolotl_blue", "faded_axolotl_blue");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.AXOLOTL, "faded", "faded_axolotl", "entity/axolotl/axolotl_cyan", "faded_axolotl_cyan");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.AXOLOTL, "faded", "faded_axolotl", "entity/axolotl/axolotl_gold", "faded_axolotl_gold");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.AXOLOTL, "faded", "faded_axolotl", "entity/axolotl/axolotl_lucy", "faded_axolotl_lucy");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.AXOLOTL, "faded", "faded_axolotl", "entity/axolotl/axolotl_wild", "faded_axolotl_wild");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "faded", "faded_bee", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "faded", "faded_bee", "entity/bee/bee", "faded_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "faded", "faded_bee", "entity/bee/bee_angry", "faded_bee_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "faded", "faded_bee", "entity/bee/bee_angry_nectar", "faded_bee_angry_nectar");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "faded", "faded_bee", "entity/bee/bee_nectar", "faded_bee_nectar");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BLAZE, "faded", "faded_blaze", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BLAZE, "faded", "faded_blaze", "entity/blaze", "faded_blaze");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CAT, "faded", "faded_cat", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CAT, "faded", "faded_cat", "entity/cat/all_black", "faded_cat_all_black");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CAT, "faded", "faded_cat", "entity/cat/black", "faded_cat_black");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CAT, "faded", "faded_cat", "entity/cat/british_shorthair", "faded_cat_british_shorthair");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CAT, "faded", "faded_cat", "entity/cat/calico", "faded_cat_calico");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CAT, "faded", "faded_cat", "entity/cat/jellie", "faded_cat_jellie");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CAT, "faded", "faded_cat", "entity/cat/persian", "faded_cat_persian");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CAT, "faded", "faded_cat", "entity/cat/ragdoll", "faded_cat_ragdoll");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CAT, "faded", "faded_cat", "entity/cat/red", "faded_cat_red");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CAT, "faded", "faded_cat", "entity/cat/siamese", "faded_cat_siamese");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CAT, "faded", "faded_cat", "entity/cat/tabby", "faded_cat_tabby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CAT, "faded", "faded_cat", "entity/cat/white", "faded_cat_white");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CAVE_SPIDER, "faded", "faded_cave_spider", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CAVE_SPIDER, "faded", "faded_cave_spider", "entity/spider/cave_spider", "faded_cave_spider");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CHICKEN, "faded", "faded_chicken", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CHICKEN, "faded", "faded_chicken", "entity/chicken", "faded_chicken_temperate");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.COD, "faded", "faded_cod", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.COD, "faded", "faded_cod", "entity/fish/cod", "faded_cod");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CREEPER, "faded", "faded_creeper", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CREEPER, "faded", "faded_creeper", "entity/creeper/creeper", "faded_creeper");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.DOLPHIN, "faded", "faded_dolphin", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.DOLPHIN, "faded", "faded_dolphin", "entity/dolphin", "faded_dolphin");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.DROWNED, "faded", "faded_drowned", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.DROWNED, "faded", "faded_drowned", "entity/zombie/drowned", "faded_drowned");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.DROWNED, "faded", "faded_drowned", "entity/zombie/drowned_outer_layer", "faded_drowned_outer_layer");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.ELDER_GUARDIAN, "faded", "faded_elder_guardian", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ELDER_GUARDIAN, "faded", "faded_elder_guardian", "entity/guardian_elder", "faded_guardian_elder");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.ENDERMAN, "faded", "faded_enderman", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ENDERMAN, "faded", "faded_enderman", "entity/enderman/enderman", "faded_enderman");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.ENDERMITE, "faded", "faded_endermite", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ENDERMITE, "faded", "faded_endermite", "entity/endermite", "faded_endermite");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.EVOKER, "faded", "faded_evoker", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.EVOKER, "faded", "faded_evoker", "entity/illager/evoker", "faded_evoker");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FOX, "faded", "faded_fox", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "faded", "faded_fox", "entity/fox/fox", "faded_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "faded", "faded_fox", "entity/fox/fox_sleep", "faded_fox_sleep");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "faded", "faded_fox", "entity/fox/snow_fox", "faded_fox_snow");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FROG, "faded", "faded_frog", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FROG, "faded", "faded_frog", "entity/frog/cold_frog", "faded_frog_cold");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FROG, "faded", "faded_frog", "entity/frog/temperate_frog", "faded_frog_temperate");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FROG, "faded", "faded_frog", "entity/frog/warm_frog", "faded_frog_warm");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.GIANT, "faded", "faded_giant", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.GIANT, "faded", "faded_giant", "entity/zombie/zombie", "faded_zombie");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.GLOW_SQUID, "faded", "faded_glow_squid", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.GLOW_SQUID, "faded", "faded_glow_squid", "entity/squid/glow_squid", "faded_glow_squid");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.GOAT, "faded", "faded_goat", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.GOAT, "faded", "faded_goat", "entity/goat/goat", "faded_goat");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.GUARDIAN, "faded", "faded_guardian", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.GUARDIAN, "faded", "faded_guardian", "entity/guardian", "faded_guardian");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.HOGLIN, "faded", "faded_hoglin", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.HOGLIN, "faded", "faded_hoglin", "entity/hoglin/hoglin", "faded_hoglin");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.HUSK, "faded", "faded_husk", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.HUSK, "faded", "faded_husk", "entity/zombie/husk", "faded_husk");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.ILLUSIONER, "faded", "faded_illusioner", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ILLUSIONER, "faded", "faded_illusioner", "entity/illager/illusioner", "faded_illusioner");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.IRON_GOLEM, "faded", "faded_iron_golem", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.IRON_GOLEM, "faded", "faded_iron_golem", "entity/iron_golem/iron_golem", "faded_iron_golem");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.LLAMA, "faded", "faded_llama", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.LLAMA, "faded", "faded_llama", "entity/llama/brown", "faded_llama_brown");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.LLAMA, "faded", "faded_llama", "entity/llama/creamy", "faded_llama_creamy");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.LLAMA, "faded", "faded_llama", "entity/llama/gray", "faded_llama_gray");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.LLAMA, "faded", "faded_llama", "entity/llama/white", "faded_llama_white");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.OCELOT, "faded", "faded_ocelot", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.OCELOT, "faded", "faded_ocelot", "entity/cat/ocelot", "faded_ocelot");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PANDA, "faded", "faded_panda", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PANDA, "faded", "faded_panda", "entity/panda/panda", "faded_panda");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PANDA, "faded", "faded_panda", "entity/panda/aggressive_panda", "faded_panda_aggressive");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PANDA, "faded", "faded_panda", "entity/panda/brown_panda", "faded_panda_brown");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PANDA, "faded", "faded_panda", "entity/panda/lazy_panda", "faded_panda_lazy");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PANDA, "faded", "faded_panda", "entity/panda/playful_panda", "faded_panda_playful");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PANDA, "faded", "faded_panda", "entity/panda/weak_panda", "faded_panda_weak");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PANDA, "faded", "faded_panda", "entity/panda/worried_panda", "faded_panda_worried");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PARROT, "faded", "faded_parrot", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "faded", "faded_parrot", "entity/parrot/parrot_blue", "faded_parrot_blue");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "faded", "faded_parrot", "entity/parrot/parrot_green", "faded_parrot_green");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "faded", "faded_parrot", "entity/parrot/parrot_grey", "faded_parrot_grey");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "faded", "faded_parrot", "entity/parrot/parrot_red_blue", "faded_parrot_red_blue");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "faded", "faded_parrot", "entity/parrot/parrot_yellow_blue", "faded_parrot_yellow_blue");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PHANTOM, "faded", "faded_phantom", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PHANTOM, "faded", "faded_phantom", "entity/phantom", "faded_phantom");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PIGLIN, "faded", "faded_piglin", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PIGLIN, "faded", "faded_piglin", "entity/piglin/piglin", "faded_piglin");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PIGLIN_BRUTE, "faded", "faded_piglin_brute", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PIGLIN_BRUTE, "faded", "faded_piglin_brute", "entity/piglin/piglin_brute", "faded_piglin_brute");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PILLAGER, "faded", "faded_pillager", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PILLAGER, "faded", "faded_pillager", "entity/illager/pillager", "faded_pillager");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PUFFERFISH, "faded", "faded_pufferfish", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PUFFERFISH, "faded", "faded_pufferfish", "entity/fish/pufferfish", "faded_pufferfish");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.RAVAGER, "faded", "faded_ravager", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.RAVAGER, "faded", "faded_ravager", "entity/illager/ravager", "faded_ravager");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.SALMON, "faded", "faded_salmon", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SALMON, "faded", "faded_salmon", "entity/fish/salmon", "faded_salmon");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.SHULKER, "faded", "faded_shulker", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker", "faded_shulker");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_black", "faded_shulker_black");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_blue", "faded_shulker_blue");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_brown", "faded_shulker_brown");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_cyan", "faded_shulker_cyan");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_gray", "faded_shulker_gray");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_green", "faded_shulker_green");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_light_blue", "faded_shulker_light_blue");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_light_gray", "faded_shulker_light_gray");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_lime", "faded_shulker_lime");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_magenta", "faded_shulker_magenta");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_orange", "faded_shulker_orange");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_pink", "faded_shulker_pink");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_purple", "faded_shulker_purple");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_red", "faded_shulker_red");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_white", "faded_shulker_white");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_yellow", "faded_shulker_yellow");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.SILVERFISH, "faded", "faded_silverfish", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SILVERFISH, "faded", "faded_silverfish", "entity/silverfish", "faded_silverfish");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.SKELETON, "faded", "faded_skeleton", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SKELETON, "faded", "faded_skeleton", "entity/skeleton/skeleton", "faded_skeleton");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.SLIME, "faded", "faded_slime", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SLIME, "faded", "faded_slime", "entity/slime/slime", "faded_slime");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.SNOW_GOLEM, "faded", "faded_snow_golem", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SNOW_GOLEM, "faded", "faded_snow_golem", "entity/snow_golem", "faded_snow_golem");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.SPIDER, "faded", "faded_spider", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SPIDER, "faded", "faded_spider", "entity/spider/spider", "faded_spider");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.SQUID, "faded", "faded_squid", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SQUID, "faded", "faded_squid", "entity/squid/squid", "faded_squid");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.STRAY, "faded", "faded_stray", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.STRAY, "faded", "faded_stray", "entity/skeleton/stray", "faded_stray");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.STRAY, "faded", "faded_stray", "entity/skeleton/stray_overlay", "faded_stray_overlay");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.STRIDER, "faded", "faded_strider", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.STRIDER, "faded", "faded_strider", "entity/strider/strider", "faded_strider");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.STRIDER, "faded", "faded_strider", "entity/strider/strider_cold", "faded_strider_cold");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.TADPOLE, "faded", "faded_tadpole", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.TADPOLE, "faded", "faded_tadpole", "entity/tadpole/tadpole", "faded_tadpole");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.TRADER_LLAMA, "faded", "faded_trader_llama", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.TRADER_LLAMA, "faded", "faded_trader_llama", "entity/llama/brown", "faded_llama_brown");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.TRADER_LLAMA, "faded", "faded_trader_llama", "entity/llama/creamy", "faded_llama_creamy");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.TRADER_LLAMA, "faded", "faded_trader_llama", "entity/llama/gray", "faded_llama_gray");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.TRADER_LLAMA, "faded", "faded_trader_llama", "entity/llama/white", "faded_llama_white");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.TRADER_LLAMA, "faded", "faded_trader_llama", "entity/llama/decor/trader_llama", "faded_trader_llama");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.VEX, "faded", "faded_vex", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VEX, "faded", "faded_vex", "entity/illager/vex", "faded_vex");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VEX, "faded", "faded_vex", "entity/illager/vex_charging", "faded_vex_charging");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/profession/armorer", "faded_armorer");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/profession/butcher", "faded_butcher");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/profession/cartographer", "faded_cartographer");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/profession/cleric", "faded_cleric");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/type/desert", "faded_desert");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/profession/farmer", "faded_farmer");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/profession/fisherman", "faded_fisherman");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/profession/fletcher", "faded_fletcher");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/type/jungle", "faded_jungle");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/profession/leatherworker", "faded_leatherworker");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/profession/librarian", "faded_librarian");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/profession/mason", "faded_mason");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/profession/nitwit", "faded_nitwit");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/type/plains", "faded_plains");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/type/savanna", "faded_savanna");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/profession/shepherd", "faded_shepherd");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/type/snow", "faded_snow");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/type/swamp", "faded_swamp");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/type/taiga", "faded_taiga");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/profession/toolsmith", "faded_toolsmith");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/villager", "faded_villager");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VILLAGER, "faded", "faded_villager", "entity/villager/profession/weaponsmith", "faded_weaponsmith");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.VINDICATOR, "faded", "faded_vindicator", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.VINDICATOR, "faded", "faded_vindicator", "entity/illager/vindicator", "faded_vindicator");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.WANDERING_TRADER, "faded", "faded_wandering_trader", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.WANDERING_TRADER, "faded", "faded_wandering_trader", "entity/wandering_trader", "faded_wandering_trader");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.WARDEN, "faded", "faded_warden", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.WARDEN, "faded", "faded_warden", "entity/warden/warden", "faded_warden");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.WITCH, "faded", "faded_witch", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.WITCH, "faded", "faded_witch", "entity/witch", "faded_witch");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.WITHER, "faded", "faded_wither", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.WITHER, "faded", "faded_wither", "entity/wither/wither", "faded_wither");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.WITHER, "faded", "faded_wither", "entity/wither/wither_invulnerable", "faded_wither_invulnerable");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.WITHER_SKELETON, "faded", "faded_wither_skeleton", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.WITHER_SKELETON, "faded", "faded_wither_skeleton", "entity/skeleton/wither_skeleton", "faded_wither_skeleton");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.ZOGLIN, "faded", "faded_zoglin", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOGLIN, "faded", "faded_zoglin", "entity/hoglin/zoglin", "faded_zoglin");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.ZOMBIE, "faded", "faded_zombie", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE, "faded", "faded_zombie", "entity/zombie/zombie", "faded_zombie");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/armorer", "faded_armorer");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/butcher", "faded_butcher");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/cartographer", "faded_cartographer");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/cleric", "faded_cleric");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/type/desert", "faded_desert");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/farmer", "faded_farmer");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/fisherman", "faded_fisherman");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/fletcher", "faded_fletcher");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/type/jungle", "faded_jungle");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/leatherworker", "faded_leatherworker");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/librarian", "faded_librarian");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/mason", "faded_mason");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/nitwit", "faded_nitwit");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/type/plains", "faded_plains");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/type/savanna", "faded_savanna");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/shepherd", "faded_shepherd");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/type/snow", "faded_snow");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/type/swamp", "faded_swamp");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/type/taiga", "faded_taiga");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/toolsmith", "faded_toolsmith");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/weaponsmith", "faded_weaponsmith");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/zombie_villager", "faded_zombie_villager");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.ZOMBIFIED_PIGLIN, "faded", "faded_zombified_piglin", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIFIED_PIGLIN, "faded", "faded_zombified_piglin", "entity/piglin/zombified_piglin", "faded_zombified_piglin");

        RegisterFunctions.hideVanillaTextureByDefault(EntityType.ALLAY);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.AXOLOTL);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.BEE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.BLAZE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.CAT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.CAVE_SPIDER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.CHICKEN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.COD);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.CREEPER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.DOLPHIN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.DROWNED);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.ELDER_GUARDIAN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.ENDERMAN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.ENDERMITE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.EVOKER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.FOX);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.FROG);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.GIANT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.GLOW_SQUID);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.GOAT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.GUARDIAN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.HOGLIN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.HUSK);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.ILLUSIONER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.IRON_GOLEM);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.LLAMA);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.OCELOT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.PANDA);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.PARROT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.PHANTOM);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.PIGLIN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.PIGLIN_BRUTE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.PILLAGER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.PUFFERFISH);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.RAVAGER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.SALMON);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.SHULKER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.SILVERFISH);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.SKELETON);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.SLIME);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.SNOW_GOLEM);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.SPIDER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.SQUID);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.STRAY);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.STRIDER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.TADPOLE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.TRADER_LLAMA);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.VEX);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.VILLAGER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.VINDICATOR);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.WANDERING_TRADER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.WARDEN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.WITCH);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.WITHER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.WITHER_SKELETON);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.ZOGLIN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.ZOMBIE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.ZOMBIE_VILLAGER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.ZOMBIFIED_PIGLIN);
    }
}
