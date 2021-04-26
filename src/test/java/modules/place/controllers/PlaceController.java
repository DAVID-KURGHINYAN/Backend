package modules.place.controllers;

import modules.place.services.PlaceService;
import org.junit.Test;

public class PlaceController {
    private final PlaceService placeService;

    public PlaceController(){
        placeService = new PlaceService();
    }
    @Test
    public void getPlaceCityByIdSuccessCase(){
        placeService.getPlaceCityById();
    }
}
