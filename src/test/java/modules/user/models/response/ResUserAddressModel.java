package modules.user.models.response;

import lombok.Data;

import java.util.List;

@Data
public class ResUserAddressModel {
    List<ResGetUserAddressModel> addressModel;

    public ResUserAddressModel() {
    }
}
