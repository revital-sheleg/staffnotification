package covid19.staffnotification;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffnotificationAPIController implements IStaffnotificationAPI{

    @Override
    @PostMapping("/staffnotification/covidDailySurvey")
    public ServerResponse reportSurveyAnswer() {
        return new ServerResponse(200, "OK", "Stay Home");
    }

    @Override
    @PostMapping("/staffnotification/contentReport")
    public ServerResponse getContentReport() {
        return new ServerResponse(200, "OK", "View Summary");
    }

    @Override
    public ServerResponse getUserStatus() {
        return null;
    }

    @Override
    public ServerResponse updateHospitalStaff() {
        return null;
    }

    @Override
    public ServerResponse uploadNewContent() {
        return null;
    }
}
