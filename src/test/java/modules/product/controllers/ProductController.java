package modules.product.controllers;

import modules.product.services.ProductService;
import org.junit.Test;

public class ProductController {
    private final ProductService productService;

    public ProductController(){
        productService=new ProductService();
    }

    @Test
    public void getProductsSuccessCase(){
        productService.getProductList();
    }
}
