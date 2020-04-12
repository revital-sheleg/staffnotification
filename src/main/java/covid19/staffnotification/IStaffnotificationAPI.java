package covid19.staffnotification;

import covid19.staffnotification.entities.ContentRequest;
import covid19.staffnotification.entities.EmployeeRequest;
import covid19.staffnotification.entities.SurveyRequest;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public interface IStaffnotificationAPI {


    /**
     * Get user status
     * @return
     */
    public ServerResponse addEmployee(@RequestBody EmployeeRequest employeeRequest);

    /**
     * Get user status
     * @return
     */
    public ServerResponse updateEmployee(@RequestBody EmployeeRequest employeeRequest);

    /**
     * Get content report
     */
    public ServerResponse getContentReport(@Valid @RequestBody ContentRequest contentRequest);

    /**
     * Get user status
     * @return
     */
    public ServerResponse getUserStatus();

    /**
     * Post request to update staff table
     */
    public ServerResponse updateHospitalStaff();

    /**
     * Post upload new content
     */
    public ServerResponse uploadNewContent();


}
