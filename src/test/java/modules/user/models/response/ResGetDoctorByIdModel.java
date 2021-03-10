package modules.user.models.response;

import helpers.Translations;
import helpers.TranslationsDoctor;
import lombok.Data;

import java.util.List;

@Data
public class ResGetDoctorByIdModel {
    private int id;
    private String fullName;
    private int professionId;
    private String professionName;
    private String photoPath;
    private int pendingRegistrations;
    private int finishedRegistrations;
    private List<WorkingPlanModel> workingPlan;
    private List<ServicesListModel> services;
    private List<LastRegistrationModel> lastRegistrations;
    private List<TranslationsDoctor> translations;

    public ResGetDoctorByIdModel() {
    }
}
