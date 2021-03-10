package modules.user.models.request;

import helpers.TranslationsDoctor;
import lombok.Data;

import java.util.List;

@Data
public class ReqCreateDoctorModel {
    private int professionId;
    private List<Integer> serviceIds;
    private List<TranslationsDoctor> translations;

    public ReqCreateDoctorModel() {
    }
}
