package io.github.maplemods.maplesfadedmobs;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplesfadedmobs.data.Constants;
import net.minecraft.world.entity.EntityTypes;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerCategory(Constants.MOD_ID, "faded", "theme", 10, 1, 11, 13);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.ALLAY, "faded", "faded_allay", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ALLAY, "faded", "faded_allay", "entity/allay/allay", "faded_allay");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.ARMADILLO, "faded", "faded_armadillo", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ARMADILLO, "faded", "faded_armadillo", "entity/armadillo/armadillo", "faded_armadillo");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ARMADILLO, "faded", "faded_armadillo", "entity/armadillo/armadillo_baby", "faded_armadillo_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.AXOLOTL, "faded", "faded_axolotl", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.AXOLOTL, "faded", "faded_axolotl", "entity/axolotl/axolotl_blue", "faded_axolotl_blue");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.AXOLOTL, "faded", "faded_axolotl", "entity/axolotl/axolotl_blue_baby", "faded_axolotl_blue_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.AXOLOTL, "faded", "faded_axolotl", "entity/axolotl/axolotl_cyan", "faded_axolotl_cyan");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.AXOLOTL, "faded", "faded_axolotl", "entity/axolotl/axolotl_cyan_baby", "faded_axolotl_cyan_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.AXOLOTL, "faded", "faded_axolotl", "entity/axolotl/axolotl_gold", "faded_axolotl_gold");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.AXOLOTL, "faded", "faded_axolotl", "entity/axolotl/axolotl_gold_baby", "faded_axolotl_gold_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.AXOLOTL, "faded", "faded_axolotl", "entity/axolotl/axolotl_lucy", "faded_axolotl_lucy");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.AXOLOTL, "faded", "faded_axolotl", "entity/axolotl/axolotl_lucy_baby", "faded_axolotl_lucy_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.AXOLOTL, "faded", "faded_axolotl", "entity/axolotl/axolotl_wild", "faded_axolotl_wild");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.AXOLOTL, "faded", "faded_axolotl", "entity/axolotl/axolotl_wild_baby", "faded_axolotl_wild_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.BAT, "faded", "faded_bat", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.BAT, "faded", "faded_bat", "entity/bat/bat", "faded_bat");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.BEE, "faded", "faded_bee", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.BEE, "faded", "faded_bee", "entity/bee/bee", "faded_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.BEE, "faded", "faded_bee", "entity/bee/bee_angry", "faded_bee_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.BEE, "faded", "faded_bee", "entity/bee/bee_angry_baby", "faded_bee_angry_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.BEE, "faded", "faded_bee", "entity/bee/bee_angry_nectar", "faded_bee_angry_nectar");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.BEE, "faded", "faded_bee", "entity/bee/bee_angry_nectar_baby", "faded_bee_angry_nectar_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.BEE, "faded", "faded_bee", "entity/bee/bee_baby", "faded_bee_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.BEE, "faded", "faded_bee", "entity/bee/bee_nectar", "faded_bee_nectar");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.BEE, "faded", "faded_bee", "entity/bee/bee_nectar_baby", "faded_bee_nectar_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.BLAZE, "faded", "faded_blaze", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.BLAZE, "faded", "faded_blaze", "entity/blaze/blaze", "faded_blaze");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.BOGGED, "faded", "faded_bogged", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.BOGGED, "faded", "faded_bogged", "entity/skeleton/bogged", "faded_bogged");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.BOGGED, "faded", "faded_bogged", "entity/skeleton/bogged_overlay", "faded_bogged_overlay");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.BREEZE, "faded", "faded_breeze", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.BREEZE, "faded", "faded_breeze", "entity/breeze/breeze", "faded_breeze");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.CAMEL, "faded", "faded_camel", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAMEL, "faded", "faded_camel", "entity/camel/camel", "faded_camel");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAMEL, "faded", "faded_camel", "entity/camel/camel_baby", "faded_camel_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.CAMEL_HUSK, "faded", "faded_camel_husk", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAMEL_HUSK, "faded", "faded_camel_husk", "entity/camel/camel_husk", "faded_camel_husk");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_all_black", "faded_cat_all_black");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_all_black_baby", "faded_cat_all_black_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_black", "faded_cat_black");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_black_baby", "faded_cat_black_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_british_shorthair", "faded_cat_british_shorthair");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_british_shorthair_baby", "faded_cat_british_shorthair_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_calico", "faded_cat_calico");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_calico_baby", "faded_cat_calico_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_jellie", "faded_cat_jellie");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_jellie_baby", "faded_cat_jellie_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_persian", "faded_cat_persian");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_persian_baby", "faded_cat_persian_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_ragdoll", "faded_cat_ragdoll");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_ragdoll_baby", "faded_cat_ragdoll_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_red", "faded_cat_red");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_red_baby", "faded_cat_red_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_siamese", "faded_cat_siamese");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_siamese_baby", "faded_cat_siamese_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_tabby", "faded_cat_tabby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_tabby_baby", "faded_cat_tabby_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_white", "faded_cat_white");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_white_baby", "faded_cat_white_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.CAVE_SPIDER, "faded", "faded_cave_spider", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAVE_SPIDER, "faded", "faded_cave_spider", "entity/spider/cave_spider", "faded_cave_spider");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.CHICKEN, "faded", "faded_chicken", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CHICKEN, "faded", "faded_chicken", "entity/chicken/chicken_cold", "faded_chicken_cold");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CHICKEN, "faded", "faded_chicken", "entity/chicken/chicken_cold_baby", "faded_chicken_cold_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CHICKEN, "faded", "faded_chicken", "entity/chicken/chicken_temperate", "faded_chicken_temperate");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CHICKEN, "faded", "faded_chicken", "entity/chicken/chicken_temperate_baby", "faded_chicken_temperate_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CHICKEN, "faded", "faded_chicken", "entity/chicken/chicken_warm", "faded_chicken_warm");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CHICKEN, "faded", "faded_chicken", "entity/chicken/chicken_warm_baby", "faded_chicken_warm_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.COD, "faded", "faded_cod", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.COD, "faded", "faded_cod", "entity/fish/cod", "faded_cod");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.COPPER_GOLEM, "faded", "faded_copper_golem", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.COPPER_GOLEM, "faded", "faded_copper_golem", "entity/copper_golem/copper_golem", "faded_copper_golem");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.COPPER_GOLEM, "faded", "faded_copper_golem", "entity/copper_golem/copper_golem_exposed", "faded_copper_golem_exposed");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.COPPER_GOLEM, "faded", "faded_copper_golem", "entity/copper_golem/copper_golem_oxidized", "faded_copper_golem_oxidized");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.COPPER_GOLEM, "faded", "faded_copper_golem", "entity/copper_golem/copper_golem_weathered", "faded_copper_golem_weathered");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.COW, "faded", "faded_cow", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.COW, "faded", "faded_cow", "entity/cow/cow_cold", "faded_cow_cold");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.COW, "faded", "faded_cow", "entity/cow/cow_cold_baby", "faded_cow_cold_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.COW, "faded", "faded_cow", "entity/cow/cow_temperate", "faded_cow_temperate");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.COW, "faded", "faded_cow", "entity/cow/cow_temperate_baby", "faded_cow_temperate_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.COW, "faded", "faded_cow", "entity/cow/cow_warm", "faded_cow_warm");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.COW, "faded", "faded_cow", "entity/cow/cow_warm_baby", "faded_cow_warm_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.CREAKING, "faded", "faded_creaking", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CREAKING, "faded", "faded_creaking", "entity/creaking/creaking", "faded_creaking");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.CREEPER, "faded", "faded_creeper", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CREEPER, "faded", "faded_creeper", "entity/creeper/creeper", "faded_creeper");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.DOLPHIN, "faded", "faded_dolphin", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.DOLPHIN, "faded", "faded_dolphin", "entity/dolphin/dolphin", "faded_dolphin");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.DOLPHIN, "faded", "faded_dolphin", "entity/dolphin/dolphin_baby", "faded_dolphin_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.DONKEY, "faded", "faded_donkey", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.DONKEY, "faded", "faded_donkey", "entity/horse/donkey", "faded_donkey");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.DONKEY, "faded", "faded_donkey", "entity/horse/donkey_baby", "faded_donkey_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.DROWNED, "faded", "faded_drowned", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.DROWNED, "faded", "faded_drowned", "entity/zombie/drowned", "faded_drowned");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.DROWNED, "faded", "faded_drowned", "entity/zombie/drowned_baby", "faded_drowned_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.DROWNED, "faded", "faded_drowned", "entity/zombie/drowned_outer_layer", "faded_drowned_outer_layer");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.DROWNED, "faded", "faded_drowned", "entity/zombie/drowned_outer_layer_baby", "faded_drowned_outer_layer_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.ELDER_GUARDIAN, "faded", "faded_elder_guardian", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ELDER_GUARDIAN, "faded", "faded_elder_guardian", "entity/guardian/guardian_elder", "faded_guardian_elder");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.ENDERMAN, "faded", "faded_enderman", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ENDERMAN, "faded", "faded_enderman", "entity/enderman/enderman", "faded_enderman");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.ENDERMITE, "faded", "faded_endermite", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ENDERMITE, "faded", "faded_endermite", "entity/endermite/endermite", "faded_endermite");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.EVOKER, "faded", "faded_evoker", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.EVOKER, "faded", "faded_evoker", "entity/illager/evoker", "faded_evoker");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FOX, "faded", "faded_fox", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FOX, "faded", "faded_fox", "entity/fox/fox", "faded_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FOX, "faded", "faded_fox", "entity/fox/fox_baby", "faded_fox_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FOX, "faded", "faded_fox", "entity/fox/fox_sleep", "faded_fox_sleep");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FOX, "faded", "faded_fox", "entity/fox/fox_sleep_baby", "faded_fox_sleep_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FOX, "faded", "faded_fox", "entity/fox/fox_snow", "faded_fox_snow");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FOX, "faded", "faded_fox", "entity/fox/fox_snow_baby", "faded_fox_snow_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FOX, "faded", "faded_fox", "entity/fox/fox_snow_sleep", "faded_fox_snow_sleep");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FOX, "faded", "faded_fox", "entity/fox/fox_snow_sleep_baby", "faded_fox_snow_sleep_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FROG, "faded", "faded_frog", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "faded", "faded_frog", "entity/frog/frog_cold", "faded_frog_cold");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "faded", "faded_frog", "entity/frog/frog_temperate", "faded_frog_temperate");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "faded", "faded_frog", "entity/frog/frog_warm", "faded_frog_warm");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.GHAST, "faded", "faded_ghast", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.GHAST, "faded", "faded_ghast", "entity/ghast/ghast", "faded_ghast");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.GHAST, "faded", "faded_ghast", "entity/ghast/ghast_shooting", "faded_ghast_shooting");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.GIANT, "faded", "faded_giant", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.GIANT, "faded", "faded_giant", "entity/zombie/zombie", "faded_zombie");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.GIANT, "faded", "faded_giant", "entity/zombie/zombie_baby", "faded_zombie_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.GLOW_SQUID, "faded", "faded_glow_squid", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.GLOW_SQUID, "faded", "faded_glow_squid", "entity/squid/glow_squid", "faded_glow_squid");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.GLOW_SQUID, "faded", "faded_glow_squid", "entity/squid/glow_squid_baby", "faded_glow_squid_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.GOAT, "faded", "faded_goat", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.GOAT, "faded", "faded_goat", "entity/goat/goat", "faded_goat");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.GOAT, "faded", "faded_goat", "entity/goat/goat_baby", "faded_goat_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.GUARDIAN, "faded", "faded_guardian", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.GUARDIAN, "faded", "faded_guardian", "entity/guardian/guardian", "faded_guardian");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.HAPPY_GHAST, "faded", "faded_happy_ghast", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HAPPY_GHAST, "faded", "faded_happy_ghast", "entity/ghast/happy_ghast", "faded_happy_ghast");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HAPPY_GHAST, "faded", "faded_happy_ghast", "entity/ghast/happy_ghast_baby", "faded_happy_ghast_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.HOGLIN, "faded", "faded_hoglin", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HOGLIN, "faded", "faded_hoglin", "entity/hoglin/hoglin", "faded_hoglin");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HOGLIN, "faded", "faded_hoglin", "entity/hoglin/hoglin_baby", "faded_hoglin_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.HORSE, "faded", "faded_horse", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HORSE, "faded", "faded_horse", "entity/horse/horse_black", "faded_horse_black");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HORSE, "faded", "faded_horse", "entity/horse/horse_black_baby", "faded_horse_black_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HORSE, "faded", "faded_horse", "entity/horse/horse_brown", "faded_horse_brown");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HORSE, "faded", "faded_horse", "entity/horse/horse_brown_baby", "faded_horse_brown_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HORSE, "faded", "faded_horse", "entity/horse/horse_chestnut", "faded_horse_chestnut");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HORSE, "faded", "faded_horse", "entity/horse/horse_chestnut_baby", "faded_horse_chestnut_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HORSE, "faded", "faded_horse", "entity/horse/horse_creamy", "faded_horse_creamy");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HORSE, "faded", "faded_horse", "entity/horse/horse_creamy_baby", "faded_horse_creamy_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HORSE, "faded", "faded_horse", "entity/horse/horse_darkbrown", "faded_horse_darkbrown");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HORSE, "faded", "faded_horse", "entity/horse/horse_darkbrown_baby", "faded_horse_darkbrown_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HORSE, "faded", "faded_horse", "entity/horse/horse_gray", "faded_horse_gray");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HORSE, "faded", "faded_horse", "entity/horse/horse_gray_baby", "faded_horse_gray_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HORSE, "faded", "faded_horse", "entity/horse/horse_white", "faded_horse_white");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HORSE, "faded", "faded_horse", "entity/horse/horse_white_baby", "faded_horse_white_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.HUSK, "faded", "faded_husk", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HUSK, "faded", "faded_husk", "entity/zombie/husk", "faded_husk");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HUSK, "faded", "faded_husk", "entity/zombie/husk_baby", "faded_husk_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.ILLUSIONER, "faded", "faded_illusioner", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ILLUSIONER, "faded", "faded_illusioner", "entity/illager/illusioner", "faded_illusioner");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.IRON_GOLEM, "faded", "faded_iron_golem", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.IRON_GOLEM, "faded", "faded_iron_golem", "entity/iron_golem/iron_golem", "faded_iron_golem");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.LLAMA, "faded", "faded_llama", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.LLAMA, "faded", "faded_llama", "entity/llama/llama_brown", "faded_llama_brown");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.LLAMA, "faded", "faded_llama", "entity/llama/llama_brown_baby", "faded_llama_brown_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.LLAMA, "faded", "faded_llama", "entity/llama/llama_creamy", "faded_llama_creamy");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.LLAMA, "faded", "faded_llama", "entity/llama/llama_creamy_baby", "faded_llama_creamy_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.LLAMA, "faded", "faded_llama", "entity/llama/llama_gray", "faded_llama_gray");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.LLAMA, "faded", "faded_llama", "entity/llama/llama_gray_baby", "faded_llama_gray_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.LLAMA, "faded", "faded_llama", "entity/llama/llama_white", "faded_llama_white");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.LLAMA, "faded", "faded_llama", "entity/llama/llama_white_baby", "faded_llama_white_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.MAGMA_CUBE, "faded", "faded_magma_cube", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.MAGMA_CUBE, "faded", "faded_magma_cube", "entity/slime/magmacube", "faded_magmacube");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.MOOSHROOM, "faded", "faded_mooshroom", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.MOOSHROOM, "faded", "faded_mooshroom", "entity/cow/mooshroom_brown", "faded_mooshroom_brown");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.MOOSHROOM, "faded", "faded_mooshroom", "entity/cow/mooshroom_brown_baby", "faded_mooshroom_brown_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.MOOSHROOM, "faded", "faded_mooshroom", "entity/cow/mooshroom_red", "faded_mooshroom_red");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.MOOSHROOM, "faded", "faded_mooshroom", "entity/cow/mooshroom_red_baby", "faded_mooshroom_red_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.MULE, "faded", "faded_mule", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.MULE, "faded", "faded_mule", "entity/horse/mule", "faded_mule");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.MULE, "faded", "faded_mule", "entity/horse/mule_baby", "faded_mule_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.NAUTILUS, "faded", "faded_nautilus", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.NAUTILUS, "faded", "faded_nautilus", "entity/nautilus/nautilus", "faded_nautilus");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.NAUTILUS, "faded", "faded_nautilus", "entity/nautilus/nautilus_baby", "faded_nautilus_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.OCELOT, "faded", "faded_ocelot", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.OCELOT, "faded", "faded_ocelot", "entity/cat/ocelot", "faded_ocelot");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.OCELOT, "faded", "faded_ocelot", "entity/cat/ocelot_baby", "faded_ocelot_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PANDA, "faded", "faded_panda", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PANDA, "faded", "faded_panda", "entity/panda/aggressive_panda_baby", "faded_aggressive_panda_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PANDA, "faded", "faded_panda", "entity/panda/brown_panda_baby", "faded_brown_panda_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PANDA, "faded", "faded_panda", "entity/panda/lazy_panda_baby", "faded_lazy_panda_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PANDA, "faded", "faded_panda", "entity/panda/panda", "faded_panda");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PANDA, "faded", "faded_panda", "entity/panda/panda_aggressive", "faded_panda_aggressive");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PANDA, "faded", "faded_panda", "entity/panda/panda_baby", "faded_panda_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PANDA, "faded", "faded_panda", "entity/panda/panda_brown", "faded_panda_brown");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PANDA, "faded", "faded_panda", "entity/panda/panda_lazy", "faded_panda_lazy");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PANDA, "faded", "faded_panda", "entity/panda/panda_playful", "faded_panda_playful");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PANDA, "faded", "faded_panda", "entity/panda/panda_weak", "faded_panda_weak");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PANDA, "faded", "faded_panda", "entity/panda/panda_worried", "faded_panda_worried");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PANDA, "faded", "faded_panda", "entity/panda/playful_panda_baby", "faded_playful_panda_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PANDA, "faded", "faded_panda", "entity/panda/weak_panda_baby", "faded_weak_panda_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PANDA, "faded", "faded_panda", "entity/panda/worried_panda_baby", "faded_worried_panda_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PARROT, "faded", "faded_parrot", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PARROT, "faded", "faded_parrot", "entity/parrot/parrot_blue", "faded_parrot_blue");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PARROT, "faded", "faded_parrot", "entity/parrot/parrot_green", "faded_parrot_green");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PARROT, "faded", "faded_parrot", "entity/parrot/parrot_grey", "faded_parrot_grey");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PARROT, "faded", "faded_parrot", "entity/parrot/parrot_red_blue", "faded_parrot_red_blue");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PARROT, "faded", "faded_parrot", "entity/parrot/parrot_yellow_blue", "faded_parrot_yellow_blue");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PHANTOM, "faded", "faded_phantom", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PHANTOM, "faded", "faded_phantom", "entity/phantom/phantom", "faded_phantom");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIG, "faded", "faded_pig", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "faded", "faded_pig", "entity/pig/pig_cold", "faded_pig_cold");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "faded", "faded_pig", "entity/pig/pig_cold_baby", "faded_pig_cold_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "faded", "faded_pig", "entity/pig/pig_temperate", "faded_pig_temperate");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "faded", "faded_pig", "entity/pig/pig_temperate_baby", "faded_pig_temperate_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "faded", "faded_pig", "entity/pig/pig_warm", "faded_pig_warm");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIG, "faded", "faded_pig", "entity/pig/pig_warm_baby", "faded_pig_warm_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIGLIN, "faded", "faded_piglin", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIGLIN, "faded", "faded_piglin", "entity/piglin/piglin", "faded_piglin");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIGLIN, "faded", "faded_piglin", "entity/piglin/piglin_baby", "faded_piglin_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PIGLIN_BRUTE, "faded", "faded_piglin_brute", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PIGLIN_BRUTE, "faded", "faded_piglin_brute", "entity/piglin/piglin_brute", "faded_piglin_brute");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PILLAGER, "faded", "faded_pillager", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PILLAGER, "faded", "faded_pillager", "entity/illager/pillager", "faded_pillager");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.POLAR_BEAR, "faded", "faded_polar_bear", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.POLAR_BEAR, "faded", "faded_polar_bear", "entity/bear/polarbear", "faded_polarbear");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.POLAR_BEAR, "faded", "faded_polar_bear", "entity/bear/polarbear_baby", "faded_polarbear_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PUFFERFISH, "faded", "faded_pufferfish", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PUFFERFISH, "faded", "faded_pufferfish", "entity/fish/pufferfish", "faded_pufferfish");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.RABBIT, "faded", "faded_rabbit", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.RABBIT, "faded", "faded_rabbit", "entity/rabbit/rabbit_black", "faded_rabbit_black");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.RABBIT, "faded", "faded_rabbit", "entity/rabbit/rabbit_black_baby", "faded_rabbit_black_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.RABBIT, "faded", "faded_rabbit", "entity/rabbit/rabbit_brown", "faded_rabbit_brown");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.RABBIT, "faded", "faded_rabbit", "entity/rabbit/rabbit_brown_baby", "faded_rabbit_brown_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.RABBIT, "faded", "faded_rabbit", "entity/rabbit/rabbit_caerbannog", "faded_rabbit_caerbannog");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.RABBIT, "faded", "faded_rabbit", "entity/rabbit/rabbit_caerbannog_baby", "faded_rabbit_caerbannog_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.RABBIT, "faded", "faded_rabbit", "entity/rabbit/rabbit_gold", "faded_rabbit_gold");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.RABBIT, "faded", "faded_rabbit", "entity/rabbit/rabbit_gold_baby", "faded_rabbit_gold_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.RABBIT, "faded", "faded_rabbit", "entity/rabbit/rabbit_salt", "faded_rabbit_salt");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.RABBIT, "faded", "faded_rabbit", "entity/rabbit/rabbit_salt_baby", "faded_rabbit_salt_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.RABBIT, "faded", "faded_rabbit", "entity/rabbit/rabbit_toast", "faded_rabbit_toast");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.RABBIT, "faded", "faded_rabbit", "entity/rabbit/rabbit_toast_baby", "faded_rabbit_toast_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.RABBIT, "faded", "faded_rabbit", "entity/rabbit/rabbit_white", "faded_rabbit_white");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.RABBIT, "faded", "faded_rabbit", "entity/rabbit/rabbit_white_baby", "faded_rabbit_white_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.RABBIT, "faded", "faded_rabbit", "entity/rabbit/rabbit_white_splotched", "faded_rabbit_white_splotched");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.RABBIT, "faded", "faded_rabbit", "entity/rabbit/rabbit_white_splotched_baby", "faded_rabbit_white_splotched_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.RAVAGER, "faded", "faded_ravager", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.RAVAGER, "faded", "faded_ravager", "entity/illager/ravager", "faded_ravager");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.SALMON, "faded", "faded_salmon", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SALMON, "faded", "faded_salmon", "entity/fish/salmon", "faded_salmon");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.SHEEP, "faded", "faded_sheep", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHEEP, "faded", "faded_sheep", "entity/sheep/sheep", "faded_sheep");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHEEP, "faded", "faded_sheep", "entity/sheep/sheep_baby", "faded_sheep_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.SHULKER, "faded", "faded_shulker", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker", "faded_shulker");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_black", "faded_shulker_black");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_blue", "faded_shulker_blue");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_brown", "faded_shulker_brown");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_cyan", "faded_shulker_cyan");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_gray", "faded_shulker_gray");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_green", "faded_shulker_green");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_light_blue", "faded_shulker_light_blue");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_light_gray", "faded_shulker_light_gray");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_lime", "faded_shulker_lime");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_magenta", "faded_shulker_magenta");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_orange", "faded_shulker_orange");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_pink", "faded_shulker_pink");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_purple", "faded_shulker_purple");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_red", "faded_shulker_red");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_white", "faded_shulker_white");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SHULKER, "faded", "faded_shulker", "entity/shulker/shulker_yellow", "faded_shulker_yellow");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.SILVERFISH, "faded", "faded_silverfish", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SILVERFISH, "faded", "faded_silverfish", "entity/silverfish/silverfish", "faded_silverfish");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.SKELETON, "faded", "faded_skeleton", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SKELETON, "faded", "faded_skeleton", "entity/skeleton/skeleton", "faded_skeleton");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.SKELETON_HORSE, "faded", "faded_skeleton_horse", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SKELETON_HORSE, "faded", "faded_skeleton_horse", "entity/horse/horse_skeleton", "faded_horse_skeleton");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SKELETON_HORSE, "faded", "faded_skeleton_horse", "entity/horse/horse_skeleton_baby", "faded_horse_skeleton_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.SLIME, "faded", "faded_slime", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SLIME, "faded", "faded_slime", "entity/slime/slime", "faded_slime");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.SNIFFER, "faded", "faded_sniffer", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SNIFFER, "faded", "faded_sniffer", "entity/sniffer/sniffer", "faded_sniffer");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SNIFFER, "faded", "faded_sniffer", "entity/sniffer/snifflet", "faded_snifflet");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.SNOW_GOLEM, "faded", "faded_snow_golem", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SNOW_GOLEM, "faded", "faded_snow_golem", "entity/snow_golem/snow_golem", "faded_snow_golem");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.SPIDER, "faded", "faded_spider", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SPIDER, "faded", "faded_spider", "entity/spider/spider", "faded_spider");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.SQUID, "faded", "faded_squid", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SQUID, "faded", "faded_squid", "entity/squid/squid", "faded_squid");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SQUID, "faded", "faded_squid", "entity/squid/squid_baby", "faded_squid_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.STRAY, "faded", "faded_stray", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.STRAY, "faded", "faded_stray", "entity/skeleton/stray", "faded_stray");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.STRAY, "faded", "faded_stray", "entity/skeleton/stray_overlay", "faded_stray_overlay");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.STRIDER, "faded", "faded_strider", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.STRIDER, "faded", "faded_strider", "entity/strider/strider", "faded_strider");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.STRIDER, "faded", "faded_strider", "entity/strider/strider_baby", "faded_strider_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.STRIDER, "faded", "faded_strider", "entity/strider/strider_cold", "faded_strider_cold");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.STRIDER, "faded", "faded_strider", "entity/strider/strider_cold_baby", "faded_strider_cold_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.SULFUR_CUBE, "faded", "faded_sulfur_cube", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SULFUR_CUBE, "faded", "faded_sulfur_cube", "entity/sulfur_cube/sulfur_cube_inner", "faded_sulfur_cube_inner");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SULFUR_CUBE, "faded", "faded_sulfur_cube", "entity/sulfur_cube/sulfur_cube_inner_small", "faded_sulfur_cube_inner_small");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SULFUR_CUBE, "faded", "faded_sulfur_cube", "entity/sulfur_cube/sulfur_cube_outer", "faded_sulfur_cube_outer");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SULFUR_CUBE, "faded", "faded_sulfur_cube", "entity/sulfur_cube/sulfur_cube_outer_small", "faded_sulfur_cube_outer_small");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.TADPOLE, "faded", "faded_tadpole", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.TADPOLE, "faded", "faded_tadpole", "entity/tadpole/tadpole", "faded_tadpole");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.TRADER_LLAMA, "faded", "faded_trader_llama", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.TRADER_LLAMA, "faded", "faded_trader_llama", "entity/llama/llama_brown", "faded_llama_brown");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.TRADER_LLAMA, "faded", "faded_trader_llama", "entity/llama/llama_brown_baby", "faded_llama_brown_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.TRADER_LLAMA, "faded", "faded_trader_llama", "entity/llama/llama_creamy", "faded_llama_creamy");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.TRADER_LLAMA, "faded", "faded_trader_llama", "entity/llama/llama_creamy_baby", "faded_llama_creamy_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.TRADER_LLAMA, "faded", "faded_trader_llama", "entity/llama/llama_gray", "faded_llama_gray");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.TRADER_LLAMA, "faded", "faded_trader_llama", "entity/llama/llama_gray_baby", "faded_llama_gray_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.TRADER_LLAMA, "faded", "faded_trader_llama", "entity/llama/llama_white", "faded_llama_white");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.TRADER_LLAMA, "faded", "faded_trader_llama", "entity/llama/llama_white_baby", "faded_llama_white_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.TRADER_LLAMA, "faded", "faded_trader_llama", "entity/equipment/llama_body/trader_llama", "faded_trader_llama");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.TRADER_LLAMA, "faded", "faded_trader_llama", "entity/equipment/llama_body/trader_llama_baby", "faded_trader_llama_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.TROPICAL_FISH, "faded", "faded_tropical_fish", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.TROPICAL_FISH, "faded", "faded_tropical_fish", "entity/fish/tropical_a", "faded_tropical_a");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.TROPICAL_FISH, "faded", "faded_tropical_fish", "entity/fish/tropical_b", "faded_tropical_b");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.TURTLE, "faded", "faded_turtle", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.TURTLE, "faded", "faded_turtle", "entity/turtle/turtle", "faded_turtle");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.TURTLE, "faded", "faded_turtle", "entity/turtle/turtle_baby", "faded_turtle_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.VEX, "faded", "faded_vex", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VEX, "faded", "faded_vex", "entity/illager/vex", "faded_vex");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VEX, "faded", "faded_vex", "entity/illager/vex_charging", "faded_vex_charging");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/profession/armorer", "faded_armorer");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/profession/butcher", "faded_butcher");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/profession/cartographer", "faded_cartographer");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/profession/cleric", "faded_cleric");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/type/desert", "faded_desert");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/baby/desert", "faded_desert_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/profession/farmer", "faded_farmer");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/profession/fisherman", "faded_fisherman");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/profession/fletcher", "faded_fletcher");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/type/jungle", "faded_jungle");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/baby/jungle", "faded_jungle_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/profession/leatherworker", "faded_leatherworker");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/profession/librarian", "faded_librarian");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/profession/mason", "faded_mason");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/profession/nitwit", "faded_nitwit");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/type/plains", "faded_plains");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/baby/plains", "faded_plains_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/type/savanna", "faded_savanna");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/baby/savanna", "faded_savanna_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/profession/shepherd", "faded_shepherd");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/type/snow", "faded_snow");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/baby/snow", "faded_snow_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/type/swamp", "faded_swamp");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/baby/swamp", "faded_swamp_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/type/taiga", "faded_taiga");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/baby/taiga", "faded_taiga_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/profession/toolsmith", "faded_toolsmith");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/villager", "faded_villager");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/villager_baby", "faded_villager_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VILLAGER, "faded", "faded_villager", "entity/villager/profession/weaponsmith", "faded_weaponsmith");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.VINDICATOR, "faded", "faded_vindicator", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.VINDICATOR, "faded", "faded_vindicator", "entity/illager/vindicator", "faded_vindicator");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.WANDERING_TRADER, "faded", "faded_wandering_trader", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WANDERING_TRADER, "faded", "faded_wandering_trader", "entity/wandering_trader/wandering_trader", "faded_wandering_trader");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.WARDEN, "faded", "faded_warden", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WARDEN, "faded", "faded_warden", "entity/warden/warden", "faded_warden");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.WITCH, "faded", "faded_witch", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WITCH, "faded", "faded_witch", "entity/witch/witch", "faded_witch");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.WITHER, "faded", "faded_wither", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WITHER, "faded", "faded_wither", "entity/wither/wither", "faded_wither");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WITHER, "faded", "faded_wither", "entity/wither/wither_invulnerable", "faded_wither_invulnerable");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.WITHER_SKELETON, "faded", "faded_wither_skeleton", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WITHER_SKELETON, "faded", "faded_wither_skeleton", "entity/skeleton/wither_skeleton", "faded_wither_skeleton");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf", "faded_wolf");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_angry", "faded_wolf_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_angry_baby", "faded_wolf_angry_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_ashen", "faded_wolf_ashen");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_ashen_angry", "faded_wolf_ashen_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_ashen_angry_baby", "faded_wolf_ashen_angry_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_ashen_baby", "faded_wolf_ashen_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_ashen_tame", "faded_wolf_ashen_tame");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_ashen_tame_baby", "faded_wolf_ashen_tame_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_baby", "faded_wolf_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_black", "faded_wolf_black");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_black_angry", "faded_wolf_black_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_black_angry_baby", "faded_wolf_black_angry_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_black_baby", "faded_wolf_black_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_black_tame", "faded_wolf_black_tame");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_black_tame_baby", "faded_wolf_black_tame_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_chestnut", "faded_wolf_chestnut");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_chestnut_angry", "faded_wolf_chestnut_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_chestnut_angry_baby", "faded_wolf_chestnut_angry_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_chestnut_baby", "faded_wolf_chestnut_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_chestnut_tame", "faded_wolf_chestnut_tame");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_chestnut_tame_baby", "faded_wolf_chestnut_tame_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_rusty", "faded_wolf_rusty");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_rusty_angry", "faded_wolf_rusty_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_rusty_angry_baby", "faded_wolf_rusty_angry_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_rusty_baby", "faded_wolf_rusty_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_rusty_tame", "faded_wolf_rusty_tame");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_rusty_tame_baby", "faded_wolf_rusty_tame_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_snowy", "faded_wolf_snowy");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_snowy_angry", "faded_wolf_snowy_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_snowy_angry_baby", "faded_wolf_snowy_angry_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_snowy_baby", "faded_wolf_snowy_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_snowy_tame", "faded_wolf_snowy_tame");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_snowy_tame_baby", "faded_wolf_snowy_tame_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_spotted", "faded_wolf_spotted");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_spotted_angry", "faded_wolf_spotted_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_spotted_angry_baby", "faded_wolf_spotted_angry_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_spotted_baby", "faded_wolf_spotted_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_spotted_tame", "faded_wolf_spotted_tame");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_spotted_tame_baby", "faded_wolf_spotted_tame_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_striped", "faded_wolf_striped");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_striped_angry", "faded_wolf_striped_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_striped_angry_baby", "faded_wolf_striped_angry_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_striped_baby", "faded_wolf_striped_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_striped_tame", "faded_wolf_striped_tame");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_striped_tame_baby", "faded_wolf_striped_tame_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_tame", "faded_wolf_tame");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_tame_baby", "faded_wolf_tame_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_woods", "faded_wolf_woods");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_woods_angry", "faded_wolf_woods_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_woods_angry_baby", "faded_wolf_woods_angry_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_woods_baby", "faded_wolf_woods_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_woods_tame", "faded_wolf_woods_tame");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.WOLF, "faded", "faded_wolf", "entity/wolf/wolf_woods_tame_baby", "faded_wolf_woods_tame_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.ZOGLIN, "faded", "faded_zoglin", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOGLIN, "faded", "faded_zoglin", "entity/hoglin/zoglin", "faded_zoglin");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOGLIN, "faded", "faded_zoglin", "entity/hoglin/zoglin_baby", "faded_zoglin_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.ZOMBIE, "faded", "faded_zombie", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE, "faded", "faded_zombie", "entity/zombie/zombie", "faded_zombie");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE, "faded", "faded_zombie", "entity/zombie/zombie_baby", "faded_zombie_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.ZOMBIE_HORSE, "faded", "faded_zombie_horse", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_HORSE, "faded", "faded_zombie_horse", "entity/horse/horse_zombie", "faded_horse_zombie");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_HORSE, "faded", "faded_zombie_horse", "entity/horse/horse_zombie_baby", "faded_horse_zombie_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.ZOMBIE_NAUTILUS, "faded", "faded_zombie_nautilus", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_NAUTILUS, "faded", "faded_zombie_nautilus", "entity/nautilus/zombie_nautilus", "faded_zombie_nautilus");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_NAUTILUS, "faded", "faded_zombie_nautilus", "entity/nautilus/zombie_nautilus_coral", "faded_zombie_nautilus_coral");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/armorer", "faded_armorer");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/butcher", "faded_butcher");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/cartographer", "faded_cartographer");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/cleric", "faded_cleric");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/type/desert", "faded_desert");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/baby/desert", "faded_desert_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/farmer", "faded_farmer");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/fisherman", "faded_fisherman");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/fletcher", "faded_fletcher");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/type/jungle", "faded_jungle");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/baby/jungle", "faded_jungle_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/leatherworker", "faded_leatherworker");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/librarian", "faded_librarian");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/mason", "faded_mason");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/nitwit", "faded_nitwit");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/type/plains", "faded_plains");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/baby/plains", "faded_plains_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/type/savanna", "faded_savanna");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/baby/savanna", "faded_savanna_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/shepherd", "faded_shepherd");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/type/snow", "faded_snow");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/baby/snow", "faded_snow_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/type/swamp", "faded_swamp");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/baby/swamp", "faded_swamp_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/type/taiga", "faded_taiga");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/baby/taiga", "faded_taiga_baby");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/toolsmith", "faded_toolsmith");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/profession/weaponsmith", "faded_weaponsmith");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/zombie_villager", "faded_zombie_villager");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_VILLAGER, "faded", "faded_zombie_villager", "entity/zombie_villager/zombie_villager_baby", "faded_zombie_villager_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.ZOMBIFIED_PIGLIN, "faded", "faded_zombified_piglin", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIFIED_PIGLIN, "faded", "faded_zombified_piglin", "entity/piglin/zombified_piglin", "faded_zombified_piglin");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIFIED_PIGLIN, "faded", "faded_zombified_piglin", "entity/piglin/zombified_piglin_baby", "faded_zombified_piglin_baby");

        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ALLAY);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ARMADILLO);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.AXOLOTL);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.BAT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.BEE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.BLAZE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.BOGGED);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.BREEZE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.CAMEL);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.CAMEL_HUSK);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.CAT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.CAVE_SPIDER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.CHICKEN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.COD);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.COPPER_GOLEM);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.COW);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.CREAKING);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.CREEPER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.DOLPHIN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.DONKEY);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.DROWNED);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ELDER_GUARDIAN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ENDERMAN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ENDERMITE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.EVOKER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.FOX);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.FROG);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.GHAST);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.GIANT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.GLOW_SQUID);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.GOAT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.GUARDIAN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.HAPPY_GHAST);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.HOGLIN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.HORSE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.HUSK);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ILLUSIONER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.IRON_GOLEM);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.LLAMA);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.MAGMA_CUBE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.MOOSHROOM);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.MULE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.NAUTILUS);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.OCELOT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.PANDA);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.PARROT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.PHANTOM);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.PIG);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.PIGLIN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.PIGLIN_BRUTE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.PILLAGER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.POLAR_BEAR);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.PUFFERFISH);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.RABBIT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.RAVAGER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.SALMON);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.SHEEP);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.SHULKER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.SILVERFISH);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.SKELETON);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.SKELETON_HORSE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.SLIME);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.SNIFFER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.SNOW_GOLEM);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.SPIDER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.SQUID);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.STRAY);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.STRIDER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.SULFUR_CUBE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.TADPOLE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.TRADER_LLAMA);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.TROPICAL_FISH);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.TURTLE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.VEX);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.VILLAGER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.VINDICATOR);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.WANDERING_TRADER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.WARDEN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.WITCH);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.WITHER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.WITHER_SKELETON);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.WOLF);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ZOGLIN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ZOMBIE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ZOMBIE_HORSE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ZOMBIE_NAUTILUS);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ZOMBIE_VILLAGER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ZOMBIFIED_PIGLIN);
    }
}
