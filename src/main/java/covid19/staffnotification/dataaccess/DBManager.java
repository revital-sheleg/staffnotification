package covid19.staffnotification.dataaccess;

import org.springframework.jdbc.core.JdbcTemplate;

public abstract class DBManager {

    private JdbcTemplate jdbcTemplate;

    public DBManager(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public abstract void updateEmployee(String id, String phone, String chatId, String botId, String name, int isActive);

    public abstract void addEmployee(String id, String phone, String chatId, String botId, String name, int isActive);

}
