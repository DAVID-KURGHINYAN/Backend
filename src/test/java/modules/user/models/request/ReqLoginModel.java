package modules.user.models.request;

public class ReqLoginModel {
    public String username;
    public String password;

    public ReqLoginModel(){
    }

    public ReqLoginModel(String username, String password){
        this.username = username;
        this.password = password;
    }
}
