package modules.user.controllers;

import modules.user.services.UserService;
import org.junit.Test;


public class UserController {
    private final UserService userService;

    public UserController() {
        userService = new UserService();
    }

    @Test
    public void GetAdminsSuccessCase() {

        userService.GetAdminsList();
    }

    @Test
    public void CreateAdminSuccessCase() {

        userService.CreateAdmin();
    }

    @Test
    public void EditAdminSuccessCase() {
        userService.EditAdmin();
    }
}
