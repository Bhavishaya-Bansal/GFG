import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int arr[][]= {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<List<Integer>> list= new ArrayList<>();

        for (int[] row : arr) {
            List<Integer> rowList = new ArrayList<>();
            for (int element : row) {
                rowList.add(element);
            }
            list.add(rowList);
        }

        for (List<Integer> row : list) {
            System.out.println(row);
        }
    }
}
