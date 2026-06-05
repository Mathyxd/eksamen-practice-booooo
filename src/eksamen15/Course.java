package eksamen15;

import java.util.ArrayList;

public class Course {
    private String name;
    ArrayList<Student>  students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudents(Student student) {
       for (Student s: students) {
           if (s.getName().equals(student.getName())) {
               return;
           }
        }
       students.add(student);

    }

    public void calculateAge() {
        int total = 0;
        for (Student s : students) {
            total = total + s.getAge();
        }
        int averageAge = total / students.size();
        System.out.println("Gennemsnit alderen på alle students: " + averageAge);
    }

    @Override
    public String toString() {
        return name + " - " + students;
    }
}
