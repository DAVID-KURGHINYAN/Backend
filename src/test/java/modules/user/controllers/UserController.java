package modules.user.controllers;

import modules.user.services.AddressService;
import modules.user.services.UserService;
import org.junit.Test;


public class UserController {
    private final UserService userService;
    private final AddressService addressService;

    public UserController() {
        userService = new UserService();
        addressService = new AddressService();
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
    public void GetBranchAdminTokenSuccessCase(){
        userService.TakeAdminToken();
    }

    @Test
    public void EditAdminSuccessCase() {
        userService.EditAdmin();
    }

    @Test
    public void GetUserAddressSuccessCase(){
        addressService.getUserAddress();
    }
}
