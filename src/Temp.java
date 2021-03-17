import java.util.Scanner;

public class Temp {


    public static void main(String[] ar) {

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        scan.close();

        for (int i = 0; i < input; i++) {

            for (int j = 1; j <= input; j++) {
                int val = input - i;
                System.out.print(j <= input - i ? "#" : " ");
            }

            System.out.println(".");
        }


    }

}
