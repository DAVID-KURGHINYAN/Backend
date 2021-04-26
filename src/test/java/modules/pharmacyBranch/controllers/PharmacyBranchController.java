package modules.pharmacyBranch.controllers;

import modules.pharmacyBranch.services.PharmacyBranchService;
import org.junit.Test;

public class PharmacyBranchController {
    private final PharmacyBranchService pharmacyBranchService;

    public PharmacyBranchController(){
        pharmacyBranchService=new PharmacyBranchService();
    }
    @Test
    public void getPharmacyBranchListSuccessCase(){
        pharmacyBranchService.getPharmacyBranchList();
    }
}
