package Interviews;

public class Test11Aug2021 {
    public static void main(String[] args) {
//        hashmap - sorted complexity

       //   0  1   3   4   5   6
        //
        /*
        * 0
        * 1
        * 2
        * 3
        * 4
        * 5
        *
        *
        *
        *
        * */
        //
//        int ceo=1;
//        int nceo=1;
//        for(int i =1;i<10;i++){
//            if(knows( i,nceo ) && knows(nceo, i))
//                nceo++;
//            else
//
//        }
        int [] pp = {0,1,2,3,4};


    }

    static boolean knows(int a, int b){

        int [][] mat = {{0, 0, 1, 0},
                        {0, 0, 1, 0},
                        {0, 0, 0, 0},
                        {0, 0, 1, 0}};

        return mat[a][b]==1;
    }
}
