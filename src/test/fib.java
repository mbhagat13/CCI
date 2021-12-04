package test;

public class fib {

    public static int fib(int n){

        if(n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else{
            return fib(n-2)+ fib(n-1);
        }

    }



    public static int fib (int n, int[] memo){
        if(n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else if (memo[n] != 0){
            return memo[n];
        }else{
            memo[n] =fib(n-2)+ fib(n-1);
            return memo[n];
        }
    }




    public static void main (String [] args){

        int n = 10;
        System.out.println(fib(n));

        int [] m = new int [n + 1];

        System.out.println(fib(n,m));



    }

}
