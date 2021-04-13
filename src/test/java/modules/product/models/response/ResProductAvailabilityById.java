package modules.product.models.response;

import lombok.Data;
import modules.product.models.BranchModel;

import java.util.List;

@Data
public class ResProductAvailabilityById {
    private List<BranchModel> branches;

    public ResProductAvailabilityById() {
    }
}
