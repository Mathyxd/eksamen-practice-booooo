package eksamen9;

import java.util.ArrayList;

public class UserTest {
    public void main() {
        Users users = new Users();
        users.createUser("børge", Role.ADMIN);
        users.createUser("ikke børge", Role.EDITOR);
        users.createUser("børge måske", Role.READER);
        users.createUser("børge2", Role.ADMIN);
        users.createUser("ikke børge2", Role.EDITOR);
        users.createUser("børge måske2", Role.READER);

        for (User u: users.users) {
            System.out.println(u);
        }

        ArrayList<User> Admins = users.getUserByRole(Role.ADMIN);
        for (User u : Admins) {
            System.out.println(u.getUsername());
        }
    }
}
