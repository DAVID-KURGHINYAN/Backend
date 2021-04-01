package modules.user.models;

import lombok.Data;

@Data
public class PersonDetails {
 private String firstName;
 private String lastName;
 private String phoneNumber;

    public PersonDetails() {
    }
}
