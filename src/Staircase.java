import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {

//#
//##
//###
//####
//#####
        /* Save input */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        /* Print staircase */
        for (int i = 0; i<n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

//#####.
//#### .
//###  .
//##   .
//#    .
//
//
//        Scanner scan = new Scanner(System.in);
//
//        int input = scan.nextInt();
//
//        scan.close();
//
//        for (int i = 0; i < input; i++) {
//
//            for (int j = 1; j <= input; j++) {
//                int val = input - i;
//                System.out.print(j <= input - i ? "#" : " ");
//            }
//
//            System.out.println(".");
//        }
    }
}
