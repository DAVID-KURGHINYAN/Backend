package modules.user.models.response;

import lombok.Data;

@Data
public class UserDoctorModel {
    private int id;
    private String photoPath;
    private String phoneNumber;
    private String fullName;

    public UserDoctorModel() {
    }
}
