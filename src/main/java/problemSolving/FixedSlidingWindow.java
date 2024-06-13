package problemSolving;

/*
KConsequtiveSum
Fixed size slding window
eg maximum sum for k consequtive elements in an array

O(n^2) approach
for i = 0 to n-1+k
*/

public class FixedSlidingWindow {




    public static int findMaxSumKConsequtive(int[] array, int k){
        if(k<=array.length){
            int answer = 0;
            for(int i =0;i<=array.length-k;i++){
                int sum=0;
                for(int j =i;j<=i+k-1;j++){
                    sum = sum+array[j];
                }
                if(sum>answer)
                    answer = sum;
            }
            return answer;
        }
        else
            throw new IllegalArgumentException("Wrong Argument");
    }

    public static int findMaxSumKConsequtiveSlidingWindow(int[] array, int k){
        if(k<=array.length){
            int answer = 0;
            int sum=0;
            for(int i =0;i<k;i++){
                sum = sum + array[i];
            }
            answer = sum;
            for(int j =k; j<array.length;j++){
                sum = sum + array[j]-array[j-k];
                if(sum>answer)
                    answer=sum;
            }
            return answer;
        }
        throw new IllegalArgumentException("Wrong Window size");
    }


    public static void main(String args[]){
        int[] array = {2, 3, 4, 6, 12, 7};
        int k = 3;
        int maxSum  = findMaxSumKConsequtiveSlidingWindow(array, k);
        System.out.println(maxSum);
    }
}
