package eksamen23;

import java.util.ArrayList;

public class RobotTest {
    public static void main(String[] args) {
        ArrayList<Robot> robots = new ArrayList<>();

        Robot r1 = new Robot("hans2",500,20);
        Robot r2 = new Robot("hans3",5,1000);
        Robot r3 = new Robot("hans4",5500,5);
        Robot r4 = new Robot("hans5",30,100);
        Robot r5 = new Robot("hans6",20,500);


        robots.add(r1);
        robots.add(r2);
        robots.add(r3);
        robots.add(r4);
        robots.add(r5);

        r1.boostPower(500);
        System.out.println(r1);

        System.out.println(Robot.findStrongestRobot(robots));
    }
}
