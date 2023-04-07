import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer> list = new ArrayList<>();

        list.add(99);
        list.add(44);
        list.add(6);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(63);
        list.add(87);
        list.add(283);
        list.add(4);
        list.add(0);

        bubbleSort(list);
    }

    static void bubbleSort(ArrayList<Integer> toSort) {
        boolean cont = true;
        int settledSpots = 0;
        while (cont) {
            cont = false;
            for (int i = 0; i < toSort.size() - 1 - settledSpots; i++) {
                if (toSort.get(i) > toSort.get(i + 1)) {
                    cont = true;
                    int temp = toSort.get(i + 1);
                    toSort.set(i + 1, toSort.get(i));
                    toSort.set(i, temp);
                }
            }
            settledSpots++;
        }
    }
}