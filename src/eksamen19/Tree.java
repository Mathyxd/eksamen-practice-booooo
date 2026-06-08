package eksamen19;

public class Tree {
    private double height;
    private int age;

    public Tree(double height, int age) {
        this.height = height;
        this.age = age;
    }

    public double getHeight() {
        return  height;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double calculateGrowth() {
        return height / age;
    }

    @Override
    public String toString() {
        return height + " - " + age;
    }

}
