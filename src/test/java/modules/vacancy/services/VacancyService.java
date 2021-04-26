package modules.vacancy.services;

import helpers.ResponseModel;
import helpers.enums.Roles;
import modules.vacancy.apis.VacancyApi;
import modules.vacancy.models.response.ResVacancyById;
import org.junit.Assert;

public class VacancyService {
    private final VacancyApi vacancyApi;

    public VacancyService(){
        vacancyApi = new VacancyApi();
    }
    public void getVacancyById(){
        ResponseModel<ResVacancyById> responseModel= vacancyApi.getVacancyById(Roles.Admin);
        Assert.assertTrue(responseModel.success);
        Assert.assertEquals(responseModel.data.getId(),4);
        System.out.println("OK");
    }
}
