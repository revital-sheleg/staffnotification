package covid19.staffnotification;

public interface IStaffnotificationAPI {

    /**
     * Post request to send survey answer
     */
    public ServerResponse reportSurveyAnswer();

    /**
     * Get content report
     */
    public ServerResponse getContentReport();

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
