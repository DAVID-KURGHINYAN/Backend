package modules.user.models.request;

import lombok.Data;

@Data
public class ReqEditPasswordUser {
    private String currentPassword;
    private String newPassword;

    public ReqEditPasswordUser() {
    }
}
