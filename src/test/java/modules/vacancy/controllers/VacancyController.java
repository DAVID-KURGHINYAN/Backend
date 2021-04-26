package modules.vacancy.controllers;

import modules.vacancy.services.VacancyService;
import org.junit.Test;

public class VacancyController {
    private final VacancyService vacancyService;

    public VacancyController() {
        vacancyService = new VacancyService();
    }
    @Test
    public void getVacancyByIdSuccessCase(){
        vacancyService.getVacancyById();
    }
}
