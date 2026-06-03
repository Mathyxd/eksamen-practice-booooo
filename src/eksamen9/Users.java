package eksamen9;

import java.util.ArrayList;

public class Users {
    ArrayList<User> users = new ArrayList<>();

    public void createUser(String username, Role role) {
        int userid = users.size() + 1;
        User user = new User(username, userid, role);
        users.add(user);
    }

    public ArrayList<User> getUserByRole(Role role) {
        ArrayList<User> specific = new ArrayList<>();
        for (User u : users) {
            if (u.getRole() == role) {
                specific.add(u);
            }
        }
        return specific;
    }
}
