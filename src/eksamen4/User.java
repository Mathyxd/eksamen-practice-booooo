package eksamen4;

import java.util.Random;

public class User {
    private String fullName;
    private String userID;
    private Random random;

    public User(String fullName, String userID) {
        this.fullName = fullName;
        this.userID= userID;
        this.random = new Random();
    }

    public String getFullName(){
        return fullName;
    }
    public String getUserID() {
        return userID;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void createUserID() {
        String[] parts = fullName.split(" ");
        String fornavn = parts[0];
        String efternavn = parts[1];
        String id = fornavn.substring(0,2) + efternavn.substring(0,2);
        int tal1 = random.nextInt(10);
        int tal2 = random.nextInt(10);
        int tal3 = random.nextInt(10);
        int tal4 = random.nextInt(10);

        this.userID = id + tal1 + tal2 + tal3 + tal4;
    }

}
