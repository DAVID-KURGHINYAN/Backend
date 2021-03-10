package modules.user.models.response;

import lombok.Data;

import java.util.List;
@Data
public class ResGetDoctorList {
    private int pageCount;
    private int totalCount;
    private List<GetDoctorListModel> list;

    public ResGetDoctorList() {
    }
}
