package Interviews;

import java.util.ArrayList;
import java.util.List;

public class Test16Aug2021 {
    public static void main(String[] args) {
        //infinite array - sorted

        //1 2 4 5 6 12 .15. 18 22 ....
        //forest - diff tree types - in one line - 2 basket collect fruits - one fruit each- max fruit-
        //5 types
        //a b a a c d e d
//        freq -a-3, b-1, c-1, d-2, e-1
//        //count1[n]
//        //count2[n]
        //maxCount
        //list- buckets -2

        char arr1[] = {'A', 'B', 'C', 'B', 'B', 'C'};
        char arr2[] = {'a' ,'b' ,'b', 'b', 'd', 'd'};

        System.out.println("first - "+ maxFruit(arr1, 2));
        System.out.println("Second - "+ maxFruit(arr2, 2));
    }

    public static int maxFruit(char [] arr, int bucket){
        int max =0;
        for(int j=0;j<arr.length;j++){
            int maxCount=0;
            List<Character> list = new ArrayList<>();
            for(int i =j;i<arr.length;i++){
                if(list.contains(arr[i])){
                    maxCount++;
                }else if(!list.contains(arr[i]) && list.size() <= bucket){
                    list.add(arr[i]);
                    maxCount++;
                }
                else if(!list.contains(arr[i]) && list.size()==bucket){
                    max=Math.max(max, maxCount);
                    break;
                }
            }
        }
        return max;
    }
}
