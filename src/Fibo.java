public class Fibo {

    public static void main(String[] args) {

        System.out.println("---------------");
        System.out.println(fibo(10));
        System.out.println("---------------");
    }

    public static int fibo(int n){
        if(n<=0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }

}
