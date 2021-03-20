package modules.user.controllers;

import modules.user.services.DoctorService;
import org.junit.Test;

public class DoctorController {
    private final DoctorService doctorService;

    public DoctorController(){
        doctorService = new DoctorService();
    }
    @Test
    public void GetDoctorsSuccessCase(){
        doctorService.GetDoctorList();
    }
}
