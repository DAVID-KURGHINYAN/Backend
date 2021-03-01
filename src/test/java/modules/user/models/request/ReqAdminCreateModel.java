package modules.user.models.request;

import lombok.Data;

@Data
public class ReqAdminCreateModel {
    private String roleId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String username;
    private String password;
    private Integer type;
    private Integer pharmacyBranchId;
}