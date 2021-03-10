package modules.user.models.response;

import lombok.Data;

import java.util.List;

@Data
public class ResUserAddressModel {
    List<AddressModel> addressModel;

    public ResUserAddressModel() {
    }
}
