package eksamen4;

public class UserTest {
    public static void main() {
        Users users = new Users();
        User u1 = new User("lars rasmussen", "");
        User u2 = new User("christian rasmussen", "");
        User u3 = new User("tobias rasmussen", "");
        User u4 = new User("julian rasmussen", "");

        u1.createUserID();
        System.out.println(u1.getFullName() + u1.getUserID());
    }
}
