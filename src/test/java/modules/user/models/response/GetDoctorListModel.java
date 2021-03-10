package modules.user.models.response;

import java.util.List;

public class GetDoctorListModel {
   private int id;
    private String fullName;
   private int professionId;
    private String professionName;
    private String photoPath;
    private List<ServicesListModel> services;

}
