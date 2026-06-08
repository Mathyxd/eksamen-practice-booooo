package eksamen17;

public class ToyTest {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

       Toy hulk = new Toy("Hulk",5,110);
        toyStore.addToy(hulk);
        System.out.println(hulk.checkAge(8));


        System.out.println(toyStore.getMostPopular());

    }

}
