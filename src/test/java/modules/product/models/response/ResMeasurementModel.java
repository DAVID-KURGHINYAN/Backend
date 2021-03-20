package modules.product.models.response;

import helpers.Id_Name;
import lombok.Data;

import java.util.List;

@Data
public class ResMeasurementModel {
    private List<Id_Name> list;

    public ResMeasurementModel() {
    }
}
