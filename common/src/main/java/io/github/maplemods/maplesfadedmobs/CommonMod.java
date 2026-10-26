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

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.ARMADILLO, "faded", "faded_armadillo", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ARMADILLO, "faded", "faded_armadillo", "entity/armadillo", "faded_armadillo");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.AXOLOTL, "faded", "faded_axolotl", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.AXOLOTL, "faded", "faded_axolotl", "entity/axolotl/axolotl_lucy", "faded_axolotl_lucy");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BAT, "faded", "faded_bat", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BAT, "faded", "faded_bat", "entity/bat", "faded_bat");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "faded", "faded_bee", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "faded", "faded_bee", "entity/bee/bee", "faded_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "faded", "faded_bee", "entity/bee/bee_angry", "faded_bee_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "faded", "faded_bee", "entity/bee/bee_angry_nectar", "faded_bee_angry_nectar");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "faded", "faded_bee", "entity/bee/bee_nectar", "faded_bee_nectar");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BLAZE, "faded", "faded_blaze", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BLAZE, "faded", "faded_blaze", "entity/blaze", "faded_blaze");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BOGGED, "faded", "faded_bogged", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BOGGED, "faded", "faded_bogged", "entity/skeleton/bogged", "faded_bogged");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BOGGED, "faded", "faded_bogged", "entity/skeleton/bogged_overlay", "faded_bogged_overlay");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BREEZE, "faded", "faded_breeze", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BREEZE, "faded", "faded_breeze", "entity/breeze/breeze", "faded_breeze");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CAMEL, "faded", "faded_camel", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CAMEL, "faded", "faded_camel", "entity/camel/camel", "faded_camel");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CAT, "faded", "faded_cat", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CAT, "faded", "faded_cat", "entity/cat/calico", "faded_cat_calico");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CAVE_SPIDER, "faded", "faded_cave_spider", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CAVE_SPIDER, "faded", "faded_cave_spider", "entity/spider/cave_spider", "faded_cave_spider");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CHICKEN, "faded", "faded_chicken", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CHICKEN, "faded", "faded_chicken", "entity/chicken/temperate_chicken", "faded_chicken_temperate");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.COD, "faded", "faded_cod", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.COD, "faded", "faded_cod", "entity/fish/cod", "faded_cod");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.COPPER_GOLEM, "faded", "faded_copper_golem", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.COPPER_GOLEM, "faded", "faded_copper_golem", "entity/copper_golem/copper_golem", "faded_copper_golem");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.COW, "faded", "faded_cow", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.COW, "faded", "faded_cow", "entity/cow/temperate_cow", "faded_cow_temperate");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CREAKING, "faded", "faded_creaking", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CREAKING, "faded", "faded_creaking", "entity/creaking/creaking", "faded_creaking");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CREEPER, "faded", "faded_creeper", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.CREEPER, "faded", "faded_creeper", "entity/creeper/creeper", "faded_creeper");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.DOLPHIN, "faded", "faded_dolphin", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.DOLPHIN, "faded", "faded_dolphin", "entity/dolphin", "faded_dolphin");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.DONKEY, "faded", "faded_donkey", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.DONKEY, "faded", "faded_donkey", "entity/horse/donkey", "faded_donkey");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.ENDERMAN, "faded", "faded_enderman", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ENDERMAN, "faded", "faded_enderman", "entity/enderman/enderman", "faded_enderman");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.ENDERMITE, "faded", "faded_endermite", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ENDERMITE, "faded", "faded_endermite", "entity/endermite", "faded_endermite");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.EVOKER, "faded", "faded_evoker", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.EVOKER, "faded", "faded_evoker", "entity/illager/evoker", "faded_evoker");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FOX, "faded", "faded_fox", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "faded", "faded_fox", "entity/fox/fox", "faded_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "faded", "faded_fox", "entity/fox/fox_sleep", "faded_fox_sleep");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FROG, "faded", "faded_frog", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FROG, "faded", "faded_frog", "entity/frog/cold_frog", "faded_frog_cold");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.GHAST, "faded", "faded_ghast", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.GHAST, "faded", "faded_ghast", "entity/ghast/ghast", "faded_ghast");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.GHAST, "faded", "faded_ghast", "entity/ghast/ghast_shooting", "faded_ghast_shooting");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.GOAT, "faded", "faded_goat", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.GOAT, "faded", "faded_goat", "entity/goat/goat", "faded_goat");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.GUARDIAN, "faded", "faded_guardian", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.GUARDIAN, "faded", "faded_guardian", "entity/guardian", "faded_guardian");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.HAPPY_GHAST, "faded", "faded_happy_ghast", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.HAPPY_GHAST, "faded", "faded_happy_ghast", "entity/ghast/happy_ghast", "faded_happy_ghast");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.HAPPY_GHAST, "faded", "faded_happy_ghast", "entity/ghast/happy_ghast_baby", "faded_happy_ghast_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.HOGLIN, "faded", "faded_hoglin", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.HOGLIN, "faded", "faded_hoglin", "entity/hoglin/hoglin", "faded_hoglin");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.IRON_GOLEM, "faded", "faded_iron_golem", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.IRON_GOLEM, "faded", "faded_iron_golem", "entity/iron_golem/iron_golem", "faded_iron_golem");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.LLAMA, "faded", "faded_llama", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.LLAMA, "faded", "faded_llama", "entity/llama/creamy", "faded_llama_creamy");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.MOOSHROOM, "faded", "faded_mooshroom", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.MOOSHROOM, "faded", "faded_mooshroom", "entity/cow/red_mooshroom", "faded_mooshroom_red");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.MULE, "faded", "faded_mule", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.MULE, "faded", "faded_mule", "entity/horse/mule", "faded_mule");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.NAUTILUS, "faded", "faded_nautilus", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.NAUTILUS, "faded", "faded_nautilus", "entity/nautilus/nautilus", "faded_nautilus");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.NAUTILUS, "faded", "faded_nautilus", "entity/nautilus/nautilus_baby", "faded_nautilus_baby");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.OCELOT, "faded", "faded_ocelot", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.OCELOT, "faded", "faded_ocelot", "entity/cat/ocelot", "faded_ocelot");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PUFFERFISH, "faded", "faded_pufferfish", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PUFFERFISH, "faded", "faded_pufferfish", "entity/fish/pufferfish", "faded_pufferfish");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.SALMON, "faded", "faded_salmon", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SALMON, "faded", "faded_salmon", "entity/fish/salmon", "faded_salmon");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.SPIDER, "faded", "faded_spider", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.SPIDER, "faded", "faded_spider", "entity/spider/spider", "faded_spider");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.TROPICAL_FISH, "faded", "faded_tropical_fish", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.TROPICAL_FISH, "faded", "faded_tropical_fish", "entity/fish/tropical_a", "faded_tropical_a");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.TROPICAL_FISH, "faded", "faded_tropical_fish", "entity/fish/tropical_b", "faded_tropical_b");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.ZOGLIN, "faded", "faded_zoglin", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOGLIN, "faded", "faded_zoglin", "entity/hoglin/zoglin", "faded_zoglin");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.ZOMBIE_HORSE, "faded", "faded_zombie_horse", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_HORSE, "faded", "faded_zombie_horse", "entity/horse/horse_zombie", "faded_horse_zombie");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.ZOMBIE_NAUTILUS, "faded", "faded_zombie_nautilus", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.ZOMBIE_NAUTILUS, "faded", "faded_zombie_nautilus", "entity/nautilus/zombie_nautilus", "faded_zombie_nautilus");

        RegisterFunctions.hideVanillaTextureByDefault(EntityType.ALLAY);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.ARMADILLO);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.AXOLOTL);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.BAT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.BEE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.BLAZE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.BOGGED);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.BREEZE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.CAMEL);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.CAT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.CAVE_SPIDER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.CHICKEN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.COD);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.COPPER_GOLEM);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.COW);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.CREAKING);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.CREEPER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.DOLPHIN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.DONKEY);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.ENDERMAN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.ENDERMITE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.EVOKER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.FOX);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.FROG);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.GHAST);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.GOAT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.GUARDIAN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.HAPPY_GHAST);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.HOGLIN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.IRON_GOLEM);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.LLAMA);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.MOOSHROOM);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.MULE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.NAUTILUS);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.OCELOT);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.PUFFERFISH);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.SALMON);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.SPIDER);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.TROPICAL_FISH);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.ZOGLIN);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.ZOMBIE_HORSE);
        RegisterFunctions.hideVanillaTextureByDefault(EntityType.ZOMBIE_NAUTILUS);
    }
}
