package modules.user.models.request;

import lombok.Data;

@Data
public class ReqLoginModel {
    private String username;
    private String password;


    public ReqLoginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
