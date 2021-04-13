package modules.product.models;

import lombok.Data;
import modules.user.models.response.WorkingPlanModel;

import java.util.List;

@Data
public class BranchModel {
    private int id;
    private String storeId;
    private String uniqueId;
    private String name;
    private int balance;
    private String photoPath;
    private String contactPhoneNumber;
    private String addressText;
    private double addressLat;
    private double addressLng;
    private boolean isOpen;
    private List<WorkingPlanModel> workingPlan;

    public BranchModel() {
    }
}
