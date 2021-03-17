import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        int[] ip = {0,3,4,5,6,7,8,9,11};
        System.out.println(search(ip,9));
    }

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] == target) {
                return midpoint;
            } else if (nums[midpoint] > target) {
                right = midpoint - 1;
            } else {
                left = midpoint + 1;
            }
        }
        return -1;
    }
}
