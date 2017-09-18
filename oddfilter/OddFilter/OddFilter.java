import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class OddFilter {
    public static void main(String[] args) {
        // Create a function that takes a list as a parameter,
        // and returns a new list with every odd element from the orignal list

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 66, 67, 98));
        System.out.println(oddFilter(numbers));
    }

    public static ArrayList<Integer> oddFilter(ArrayList<Integer> list) {
        ArrayList<Integer> filteredList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                filteredList.add(list.get(i));
            }
        }
        return filteredList;
    }
}
