package modules.product.models.response;

import lombok.Data;

@Data
public class TopSalesModel {
        private int id;
        private String title;
        private String imagePath;
        private int price;
        private int totalSale;
        private int totalProfit;

        public TopSalesModel() {
        }
}
