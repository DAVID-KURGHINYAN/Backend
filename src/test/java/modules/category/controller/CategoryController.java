package modules.category.controller;

import modules.category.services.CategoryService;
import org.junit.Test;

public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(){ categoryService = new CategoryService();
    }
    @Test
    public void getCategorySuccessCase(){
        categoryService.getCategory();
    }
}
