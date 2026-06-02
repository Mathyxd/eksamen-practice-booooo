package eksamen6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HogwartsStudentTEst {


    public void main() {
        ArrayList<HogwartsStudent> students = new ArrayList<>();
        students.add(new HogwartsStudent("henry", "potter","gryf"));
        students.add(new HogwartsStudent("henry", "cotter","raven"));
        students.add(new HogwartsStudent("henry", "botter","huffle"));
        students.add(new HogwartsStudent("henry", "aotter","slyth"));

        Collections.sort(students);
        System.out.println("elever sorteret");

        for (HogwartsStudent s : students) {
            System.out.println(s);
        }
    }


    }

