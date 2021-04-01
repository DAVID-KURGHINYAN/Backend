package modules.user.models;

import lombok.Data;

@Data
public class UserModel {
    private String id;
    private String photoPath;
    private String phoneNumber;
    private String fullName;

    public UserModel() {
    }
}
