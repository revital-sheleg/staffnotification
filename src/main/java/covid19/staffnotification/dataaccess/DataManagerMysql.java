package covid19.staffnotification.dataaccess;

import org.springframework.jdbc.core.JdbcTemplate;

public class DataManagerMysql extends DBManager {


    public DataManagerMysql(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public void updateEmployee(String id, String phone, String chatId, String botId, String name, int isActive) {


    }

    @Override
    public void addEmployee(String id, String phone, String chatId, String botId, String name, int isActive) {
        String insertSql = "INSERT INTO `staffnotification`.`employee_tbl`\n" +
                "(`employee_id`,`phone_number`,`telegram_user_id`,`telegram_chat_id`,`name`)\n" +
                "VALUES\n" +
                "('%s','%s','%s','%s', '%s');";

    }
}
