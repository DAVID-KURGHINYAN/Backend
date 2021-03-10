package modules.user.models.response;

import lombok.Data;
import modules.product.models.response.Id_Name;
@Data
public class ResGetUserSegmentModel {
    private Id_Name idName;

    public ResGetUserSegmentModel() {
    }
}
