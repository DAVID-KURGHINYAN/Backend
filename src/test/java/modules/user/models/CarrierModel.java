package modules.user.models;

import lombok.Data;

@Data
public class CarrierModel {
   private int id;
   private String firstName;
   private String lastName;
   private String email;
   private String phoneNumber;

    public CarrierModel() {
    }
}
