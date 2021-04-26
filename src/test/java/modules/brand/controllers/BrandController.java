package modules.brand.controllers;

import modules.brand.services.BrandService;
import org.junit.Test;

public class BrandController {
    private final BrandService brandService;

    public BrandController(){
        brandService = new BrandService();
    }

    @Test
    public void getBrandListSuccessCase(){
        brandService.getBrandList();
    }
}
