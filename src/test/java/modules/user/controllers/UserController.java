package modules.user.controllers;

import modules.user.services.UserService;
import org.junit.Test;

public class UserController {
    private final UserService userService;
    public UserController(){
        userService = new UserService();
    }

    @Test
    public void Test() throws Exception {
        userService.GetAdminsList();
    }
}
