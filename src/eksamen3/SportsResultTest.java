package eksamen3;

public class SportsResultTest {
    public static void main(String[] args) {
        SportsResultManager sportsResultManager = new SportsResultManager();
        SportsResult kamp1 = new SportsResult("hund", "katte","");
        SportsResult kamp2 = new SportsResult("hund2", "katte2","");
        SportsResult kamp3 = new SportsResult("hund3", "katte3","");

        kamp1.generateRandomResult();
        System.out.println(kamp1.getTeam1() + "vs" + kamp1.getTeam2() + "-" + kamp1.getResult());
        sportsResultManager.addResult(kamp1);
        sportsResultManager.save();

        kamp2.generateRandomResult();
        System.out.println(kamp2.getTeam1() + "vs" + kamp2.getTeam2() + "-" + kamp2.getResult());
        sportsResultManager.addResult(kamp2);
        sportsResultManager.save();


        kamp3.generateRandomResult();
        System.out.println(kamp3.getTeam1() + "vs" + kamp3.getTeam2() + "-" + kamp3.getResult());
        sportsResultManager.addResult(kamp3);
        sportsResultManager.save();
    }
}
