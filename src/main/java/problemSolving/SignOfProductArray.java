package problemSolving;

import java.math.BigInteger;

public class SignOfProductArray {

	public static void main(String[] args) {
		
		int[] a = {12,11,10,9,10,12,-1,10,9,10,12,11,10,9,10,12,11,10,9,10,12,11,10,9,10,12,11,10,9,10};
		System.out.println(arraySign(a));

	}
	
	  public static int arraySign(int[] nums) {
	      int sign;
		  
	       BigInteger  product = new BigInteger("1");
	       
	        for(int i =0;i<nums.length;i++){
	        	BigInteger  b = new BigInteger(String.valueOf(nums[i]));
	        	product = product.multiply(b);
	        }
	        BigInteger  zero = new BigInteger("0");
	        sign = product.compareTo(zero);
//	        if(product<0)
//	            return -1;
//	        else if(product==0)
//	            return 0;
//	        else
//	            return 1;
	        
	        return sign;
	    }

}
