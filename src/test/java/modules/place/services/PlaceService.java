package modules.place.services;

import helpers.ResponseModel;
import helpers.enums.Roles;
import modules.place.apis.PlaceApi;
import modules.place.models.response.ResPlaceCityById;
import org.junit.Assert;

public class PlaceService {
    private final PlaceApi placeApi;

    public PlaceService(){
        placeApi = new PlaceApi();
    }
    public void getPlaceCityById(){
        ResponseModel<ResPlaceCityById> responseModel = placeApi.getPlaceCityById(Roles.Admin);
        Assert.assertEquals(responseModel.statusCode,200);
        ResPlaceCityById resPlaceCityById = responseModel.data;
        System.out.println(resPlaceCityById.getId());
        System.out.println("OK");
    }
}
