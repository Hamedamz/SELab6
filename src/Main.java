import java.util.ArrayList;
import java.util.Random;

public class Main {
    static final int LENGTH = 100000;

    static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> unsortedList = randomListGenerator();
        for (int i = 0; i < 10; i++){
            System.out.println(unsortedList.get(i));
        }

        Sorter sorter = new Sorter(unsortedList);
        ArrayList<Integer> sortedList = sorter.getSortedArray();
        for (int i = 0; i < 10; i++){
            System.out.println(sortedList.get(i));
        }
    }

    public static ArrayList<Integer> randomListGenerator() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < LENGTH; i++) {
            list.add(random.nextInt());
        }
        return list;
    }
}
