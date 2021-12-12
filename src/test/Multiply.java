package test;

public class Multiply {

    public static int mult (int a, int b){

        if(a<b){
            return multHelp(a ,b);
        }else{
            return multHelp(b,a);
        }

    }

    public static int multHelp(int smaller, int bigger){
        System.out.print(smaller + " " + bigger + " ");

        if(bigger<smaller) {
            int temp = bigger;
            bigger = smaller;
            smaller = temp;
        }


        if(smaller == 0){
            return 0;
        }
        if(smaller == 1){
            return bigger;
        }

        int half = multHelp(smaller>>1,bigger);
        System.out.println(half);


        if(smaller%2 == 1){
            return half + half + bigger;
        }else{
            return half + half;
        }


    }


    public static void main (String [] args){
        System.out.println(multHelp(50,23));
    }
}
