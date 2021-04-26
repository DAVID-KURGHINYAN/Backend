package modules.producer.services;

import helpers.ResponseModel;
import helpers.enums.Roles;
import modules.producer.apis.ProducerApi;
import modules.producer.models.request.ReqProducerList;
import modules.producer.models.response.ResProducerList;
import org.junit.Assert;

public class ProducerService {
    private final ProducerApi producerApi;

    public ProducerService(){
        producerApi = new ProducerApi();
    }

    public void getProducerList(){
        ReqProducerList model = new ReqProducerList();
        model.setPageNumber(1);
        model.setPageSize(10);

        ResponseModel<ResProducerList> responseModel = producerApi.getProducerList(model, Roles.Admin);
        Assert.assertTrue(responseModel.success);
        System.out.println(responseModel.data.getList());
        System.out.println("OK");
    }
}
