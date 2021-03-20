package modules.favorite.services;

import helpers.BaseService;
import helpers.ResponseModel;
import helpers.enums.Roles;
import modules.favorite.apis.FavoriteApi;
import modules.favorite.models.response.ResGetFavoriteModel;
import org.junit.Assert;

import java.util.List;

public class FavoriteService extends BaseService {
    private final FavoriteApi favoriteApi;

    public FavoriteService(){
        favoriteApi=new FavoriteApi();
    }
    public void getFavoriteList(){
        ResponseModel<List<ResGetFavoriteModel>> responseModel = favoriteApi.getFavoriteList(Roles.Admin);
        Assert.assertEquals(responseModel.statusCode,200);
        Assert.assertTrue(responseModel.success);

        List<ResGetFavoriteModel> favoriteList = responseModel.data;
        Assert.assertEquals(favoriteList.size(),0);

    }
}
