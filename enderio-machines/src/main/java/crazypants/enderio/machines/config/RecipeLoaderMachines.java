package crazypants.enderio.machines.config;

import crazypants.enderio.base.EnderIO;
import crazypants.enderio.base.config.recipes.RecipeFactory;
import crazypants.enderio.base.config.recipes.RecipeLoader;

public class RecipeLoaderMachines {

  private static final String[] RECIPE_FILES = { "machines" };

  private RecipeLoaderMachines() {
  }

  public static void addRecipes() {
    RecipeLoader.addRecipes(new RecipeFactory(ConfigHandler.getConfigDirectory(), EnderIO.DOMAIN), RECIPE_FILES);
  }

}
