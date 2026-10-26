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
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.AXOLOTL, "faded", "faded_axolotl", "entity/axolotl/axolotl_lucy", "faded_axolotl_lucy");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.AXOLOTL, "faded", "faded_axolotl", "entity/axolotl/axolotl_lucy_baby", "faded_axolotl_lucy_baby");

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

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_calico", "faded_cat_calico");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAT, "faded", "faded_cat", "entity/cat/cat_calico_baby", "faded_cat_calico_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.CAVE_SPIDER, "faded", "faded_cave_spider", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CAVE_SPIDER, "faded", "faded_cave_spider", "entity/spider/cave_spider", "faded_cave_spider");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.CHICKEN, "faded", "faded_chicken", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CHICKEN, "faded", "faded_chicken", "entity/chicken/chicken_temperate", "faded_chicken_temperate");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CHICKEN, "faded", "faded_chicken", "entity/chicken/chicken_temperate_baby", "faded_chicken_temperate_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.COD, "faded", "faded_cod", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.COD, "faded", "faded_cod", "entity/fish/cod", "faded_cod");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.COPPER_GOLEM, "faded", "faded_copper_golem", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.COPPER_GOLEM, "faded", "faded_copper_golem", "entity/copper_golem/copper_golem", "faded_copper_golem");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.COW, "faded", "faded_cow", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.COW, "faded", "faded_cow", "entity/cow/cow_temperate", "faded_cow_temperate");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.COW, "faded", "faded_cow", "entity/cow/cow_temperate_baby", "faded_cow_temperate_baby");

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

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FROG, "faded", "faded_frog", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "faded", "faded_frog", "entity/frog/frog_cold", "faded_frog_cold");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.GHAST, "faded", "faded_ghast", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.GHAST, "faded", "faded_ghast", "entity/ghast/ghast", "faded_ghast");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.GHAST, "faded", "faded_ghast", "entity/ghast/ghast_shooting", "faded_ghast_shooting");

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
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HORSE, "faded", "faded_horse", "entity/horse/horse_chestnut", "faded_horse_chestnut");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.HORSE, "faded", "faded_horse", "entity/horse/horse_chestnut_baby", "faded_horse_chestnut_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.IRON_GOLEM, "faded", "faded_iron_golem", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.IRON_GOLEM, "faded", "faded_iron_golem", "entity/iron_golem/iron_golem", "faded_iron_golem");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.LLAMA, "faded", "faded_llama", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.LLAMA, "faded", "faded_llama", "entity/llama/llama_creamy", "faded_llama_creamy");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.LLAMA, "faded", "faded_llama", "entity/llama/llama_creamy_baby", "faded_llama_creamy_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.MOOSHROOM, "faded", "faded_mooshroom", 1);
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

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.PUFFERFISH, "faded", "faded_pufferfish", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.PUFFERFISH, "faded", "faded_pufferfish", "entity/fish/pufferfish", "faded_pufferfish");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.SALMON, "faded", "faded_salmon", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SALMON, "faded", "faded_salmon", "entity/fish/salmon", "faded_salmon");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.SPIDER, "faded", "faded_spider", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.SPIDER, "faded", "faded_spider", "entity/spider/spider", "faded_spider");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.TROPICAL_FISH, "faded", "faded_tropical_fish", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.TROPICAL_FISH, "faded", "faded_tropical_fish", "entity/fish/tropical_a", "faded_tropical_a");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.TROPICAL_FISH, "faded", "faded_tropical_fish", "entity/fish/tropical_b", "faded_tropical_b");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.ZOGLIN, "faded", "faded_zoglin", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOGLIN, "faded", "faded_zoglin", "entity/hoglin/zoglin", "faded_zoglin");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOGLIN, "faded", "faded_zoglin", "entity/hoglin/zoglin_baby", "faded_zoglin_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.ZOMBIE_HORSE, "faded", "faded_zombie_horse", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_HORSE, "faded", "faded_zombie_horse", "entity/horse/horse_zombie", "faded_horse_zombie");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_HORSE, "faded", "faded_zombie_horse", "entity/horse/horse_zombie_baby", "faded_horse_zombie_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.ZOMBIE_NAUTILUS, "faded", "faded_zombie_nautilus", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.ZOMBIE_NAUTILUS, "faded", "faded_zombie_nautilus", "entity/nautilus/zombie_nautilus", "faded_zombie_nautilus");

        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ALLAY);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ARMADILLO);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.AXOLOTL);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.BAT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.BEE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.BLAZE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.BOGGED);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.BREEZE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.CAMEL);
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
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ENDERMAN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ENDERMITE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.EVOKER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.FOX);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.FROG);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.GHAST);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.GOAT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.GUARDIAN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.HAPPY_GHAST);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.HOGLIN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.HORSE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.IRON_GOLEM);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.LLAMA);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.MOOSHROOM);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.MULE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.NAUTILUS);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.OCELOT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.PUFFERFISH);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.SALMON);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.SPIDER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.TROPICAL_FISH);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ZOGLIN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ZOMBIE_HORSE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityTypes.ZOMBIE_NAUTILUS);
    }
}
