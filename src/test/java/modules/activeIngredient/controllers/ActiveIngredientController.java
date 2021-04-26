package modules.activeIngredient.controllers;

import modules.activeIngredient.services.ActiveIngredientService;
import org.junit.Test;

public class ActiveIngredientController {
    private final ActiveIngredientService activeIngredientService;

    public ActiveIngredientController(){
        activeIngredientService = new ActiveIngredientService();
    }
    @Test
    public void getActiveIngredientSuccessCase(){
        activeIngredientService.getActiveIngredient();
    }
}
