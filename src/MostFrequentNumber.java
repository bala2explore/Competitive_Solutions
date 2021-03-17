import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MostFrequentNumber {
    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};

        int val = mostFreqent(array2);

        System.out.println("****"+val);

    }

    // Implement your solution below.
    public static int mostFreqent(int[] givenArray) {
        Integer maxItem = 0;
        Integer maxCount = -1;
//        int i;

        HashMap<Integer, Integer> all = new HashMap<Integer, Integer>();
//        if (givenArray.length == 0) {
//            return null;
//        }

        for (int i : givenArray) {
//
            int k = 0;
//            System.out.println(""+k);
            if (all.containsKey(i)) {
                Integer newVal = all.get(i) + 1;
                all.put(i, newVal);
            }
            else{
                all.put(i,1);
            }

            if(all.get(i)>maxCount){
                maxCount = all.get(i);
                maxItem = i;
            }

        }

        return maxItem;
    }
}