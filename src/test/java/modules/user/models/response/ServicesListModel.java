package modules.user.models.response;

import lombok.Data;

@Data
public class ServicesListModel {
    private int id;
    private String name;
    private int price;
    private int duration;

    public ServicesListModel() {
    }
}
