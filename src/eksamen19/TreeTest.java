package eksamen19;

import java.util.ArrayList;

public class TreeTest {
    public static void main(String[] args) {
        ArrayList<Tree> trees = new ArrayList<>();

        trees.add(new Tree(5.3,5));
        trees.add(new Tree(7.1,9));
        trees.add(new Tree(8.3,2));
        trees.add(new Tree(1.1,93));

        Tree highestTree = trees.get(0);
        for (Tree t : trees) {
            if (t.getHeight() > highestTree.getHeight()) {
                highestTree = t;
            }
        }
        System.out.println("højeste træ er så høj her: " + highestTree);

        System.out.println(highestTree.calculateGrowth());
    }


}
