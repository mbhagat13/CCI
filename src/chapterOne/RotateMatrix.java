package chapterOne;

public class RotateMatrix {

    public static void main (String [] args){


        int N =3;
        int [][] twodArray = new int[N][N];
        int [][] outputTwodArray = new int[N][N];
        int counter = 0;


        for (int i =0; i < N; i++){
            for(int j = 0; j < N; j++){
                twodArray[i][j] = counter;
                counter++;
                System.out.print(twodArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int j =0; j < N; j++){
            for(int i = 0; i < N; i++){
                outputTwodArray[i][N-1-j] = twodArray[j][i];
            }
        }

        for (int i =0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.print(outputTwodArray[i][j] + " ");
            }
            System.out.println();
        }

        int [] temp = new int [N];
        int [] top = new int [N];
        int [] right = new int [N];
        int [] bottom = new int [N];
        int [] left = new int [N];

        int numOflayers = Math.floorDiv(N,2);


        // if N is odd, then need to copy the center

        System.out.println();

        for (int i = 0; i<N; i++){
            for (int j = 0; j< N; j++){
                //temp[j] = twodArray[i][j];
                //twodArray[i][j] = twodArray[N-1-j][i];
                //twodArray[N-1-j][i] =twodArray
                System.out.print(twodArray[N-1-j][i] + " ");

            }
            System.out.println();

        }


        System.out.println();

/*
        for (int i = 0; i<N; i++){
            for (int j = 0; j< N; j++){

                System.out.print(twodArray[i][j] + " ");


            }

            System.out.println();

        }

*/


    }


}
