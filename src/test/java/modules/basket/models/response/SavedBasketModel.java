package modules.basket.models.response;

import lombok.Data;

import java.util.Date;

@Data
public class SavedBasketModel {
        private int id;
        private Date createdDate;
        private int itemsCount;

    public SavedBasketModel() {
    }
}
