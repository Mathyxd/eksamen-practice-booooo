package eksamen8;

public class DogTest {
    public void main() {
        Dog[] dogs = new Dog[3];

        dogs[0] = new Dog("harald", 3);
        dogs[1] = new Dog("tobias", 5);
        dogs[2] = new Dog("lasbas", 6);

        Dog oldestDog = dogs[0];
        for (Dog d : dogs) {
            if (d.getAge() > oldestDog.getAge()) {
                oldestDog = d;
            }
        }
        System.out.println("Ældste hund er: " + oldestDog);

        System.out.println(dogs[0].getName() + " er " + dogs[0].getAgeToDogYears() + " hundeår gammel ");
    }
}
