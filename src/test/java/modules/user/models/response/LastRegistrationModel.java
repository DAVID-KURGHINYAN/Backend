package modules.user.models.response;

import lombok.Data;

import java.util.Date;

@Data
public class LastRegistrationModel {
    private int id;
    private String doctorName;
    private String serviceName;
    private int servicePrice;
    private Date startDate;
    private Date endDate;
    private int status;
    private UserDoctorModel user;

    public LastRegistrationModel() {
    }
}
