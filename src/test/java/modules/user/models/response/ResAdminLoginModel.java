package modules.user.models.response;

import lombok.Data;

import java.util.Date;

@Data
public class ResAdminLoginModel {
    private String accessToken;
    private Date expireDate;
    private boolean isVerified;

    public ResAdminLoginModel() {
    }
}
