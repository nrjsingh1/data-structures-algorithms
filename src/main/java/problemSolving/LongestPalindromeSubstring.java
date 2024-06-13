package problemSolving;


/*Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.

--brute force approach
for each char - i , j  - check palindrome i to j
save max i to j length.
*/

public class LongestPalindromeSubstring {
	
//	 public static String longestPalindrome(String s) {
//		 for(int i =0;i<s.length();i++) {
//			 for(int j=i+1;j<length();j++) {
//				 
//			 }
//		 }
//	 }
	
	
	public static boolean checkPalindrome(String s) {
		StringBuilder temp = new StringBuilder();
		temp.append(s);
		temp.reverse();
		String ss = temp.toString();
		if(s.equals(ss))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String[] palindromes = new String[5];
		palindromes[0]="abcddcba";
		palindromes[1]="abcdcba";
		palindromes[2]="abcdrdcba";
		palindromes[3]="abcddfdcba";
		palindromes[4]="abcddcbad";
		for(String s : palindromes) {
			System.out.println(checkPalindrome(s));
		}
		
	}

}
