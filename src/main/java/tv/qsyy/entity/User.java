package tv.qsyy.entity;

/**
 * Created by Easy on 2016/6/2.
 */
public class User {
    private String username;
    private String password;
    private Integer status;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
