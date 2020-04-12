package covid19.staffnotification;

import covid19.staffnotification.entities.ContentRequest;
import covid19.staffnotification.entities.EmployeeRequest;
import covid19.staffnotification.entities.SurveyRequest;
import covid19.staffnotification.handlers.StaffnotificationHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class StaffnotificationAPIController implements IStaffnotificationAPI{

    StaffnotificationHandler staffnotificationHandler = new StaffnotificationHandler();

    @Override
    @PostMapping("/staffnotification/addEmployee")
    public ServerResponse addEmployee(EmployeeRequest employeeRequest) {
        return null;
    }

    @Override
    @PostMapping("/staffnotification/updateEmployee")
    public ServerResponse updateEmployee(EmployeeRequest employeeRequest) {
        return null;
    }

    @Override
    @PostMapping("/staffnotification/contentReport")
    public ServerResponse getContentReport(@Valid @RequestBody ContentRequest contentRequest) {
        String name = contentRequest.name;
       // jdbcTemplate.execute("SELECT * FROM staffnotification.employee_tbl ");
        return new ServerResponse(200, "OK", name);
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
