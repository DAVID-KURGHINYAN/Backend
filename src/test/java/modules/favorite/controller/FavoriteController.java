package modules.favorite.controller;

import modules.favorite.services.FavoriteService;
import org.junit.Test;

public class FavoriteController {
    private final FavoriteService favoriteService;

    public FavoriteController (){
        favoriteService = new FavoriteService();
    }
    @Test
    public void getFavoriteSuccessCase(){
        favoriteService.getFavoriteList();
    }
}
