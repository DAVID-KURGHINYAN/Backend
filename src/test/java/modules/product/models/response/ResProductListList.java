package modules.product.models.response;

import lombok.Data;

import java.util.Date;

@Data
public class ResProductListList {
    private int id;
    private String uniqueId;
    private String title;
    private String imagePath;
    private String categoryName;
    private int producerId;
    private String producerName;
    private String unitName;
    private int minCount;
    private int stepCount;
    private boolean stockQuantity;
    private String unitQuantity;
    private String price;
    private Promotion promotion;
    private boolean isFavorite;
    private Date createdDate;

    public ResProductListList() {
    }
}
