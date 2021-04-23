package modules.user.models;

import lombok.Data;

@Data
public class UserListModel {
    private String id;
    private String username;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String photoPath;
    private int ordersDone;
    private int ordersAmount;
    private double ordersAverageAmount;
    private int status;
    private String lastVisitDate;

    public UserListModel() {
    }
}
