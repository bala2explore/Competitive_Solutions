public class FindElementWithMidValue {

    public static void main(String[] args) {

        int[] param = {10, 20, 30, 40, 50, 60,70,80,90,100};
        int result = findUsingMidValue(param, 0, param.length - 1, 60);
        System.out.println(result);
    }

    public static int findUsingMidValue(int[] arr, int start, int end, int x) {
        int midValue = start + (end - start) / 2;
        if (x == arr[midValue]) {
            return midValue;
        } else if (arr[midValue] > x) {
            return findUsingMidValue(arr, start, midValue - 1, x);
        } else {
            return findUsingMidValue(arr, midValue + 1, end, x);
        }

    }
}
