import java.util.Arrays;

public class test9Sep {
    public static void main(String[] args) {
//        String s1 = "hello";
//        String s2 = new String("hello");
//        String s3 = s1.intern();
//        String s4 = "hello";
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
//        System.out.println(s1.equals(s2));
//        System.out.println(Objects.hashCode(s1));
//        System.out.println(Objects.hashCode(s2));
//        System.out.println(Objects.hashCode(s3));
//        System.out.println(s1.substring(0,3));
//        System.out.println(s1.subSequence(0,3));
//        System.out.println(s1==s4);
//
//
//        int x = 10;
//        int y = 20;
//        //int z = x++ + ++y;
//        int z=0;
//        z += x;
//        System.out.println(z);
//        System.out.println(~0);


        int[] nums = new int[]{0,3,7,2,5,8,4,6,0,1};
        Arrays.sort(nums);
        int maxCount =0;
        int tempCount=0;

        for(int i =1 ;i<nums.length; i++){
            if(nums[i]-nums[i-1]==1){
                tempCount++;
                continue;
            }
            maxCount=Math.max(maxCount, tempCount+1);
            System.out.printf("%d %n",maxCount);
            tempCount=0;
        }
        maxCount=Math.max(maxCount, tempCount+1);
        System.out.println(maxCount);


    }
}
