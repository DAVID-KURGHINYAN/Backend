package modules.user.models.response;

import lombok.Data;

import java.util.Date;

@Data
public class ResRegisterUser {
    private ResLoginModel accessToken;
    private Date expireDate;
    private boolean isVerified;

    public ResRegisterUser() {
    }
}
