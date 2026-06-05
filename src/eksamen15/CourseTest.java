package eksamen15;



public class CourseTest {
    public void main() {
        Course course = new Course("klasse lokale 1");

        course.addStudents(new Student("henry chao", 14));
        course.addStudents(new Student("henry ghao", 18));
        course.addStudents(new Student("henry bhao", 20));
        course.addStudents(new Student("henry ahao", 14));

        course.calculateAge();
        System.out.println(course);
    }
}

