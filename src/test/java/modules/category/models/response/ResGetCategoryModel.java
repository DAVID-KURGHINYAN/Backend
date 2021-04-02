package modules.category.models.response;

import lombok.Data;

@Data
public class ResGetCategoryModel {
    private int id;
    private String name;
    private int productsCount;
    private String photoPath;
    private boolean hasChildren;

    public ResGetCategoryModel() {
    }
}
