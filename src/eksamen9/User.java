package eksamen9;

public class User {
    private String username;
    private int userid;
    private Role role;

    public User(String username, int userid, Role role) {
        this.username = username;
        this.userid = userid;
        this.role = role;
    }
    public String getUsername() {
        return username;
    }
    public int getUserid() {
        return userid;
    }
    public Role getRole() {
        return role;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return username + " - " + userid + " - " + role;
    }
}
