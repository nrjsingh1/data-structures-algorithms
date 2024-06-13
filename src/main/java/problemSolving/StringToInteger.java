package problemSolving;

public class StringToInteger {
	
	public static void main(String args[]) {
		String s ="  -42";
		int res = myAtoi(s);
		System.out.println(res);
	}
	
	
	public static int myAtoi(String s) {
		String ss = s.trim();//white spaces
		//if first char is -/+
		//char c = ss.charAt(0);
		int flag=0;
		int limit =0;
		String res="";
//		if(c=='-')
//			flag =1;
//		else if(c=='+')
//			flag =0;
//		else if(c>='a' && c<='z' || c>='A' && c<='Z' || c=='.')
//			return 0;
//		else {		//numbers
//			for(int i=0;i<ss.length();i++) {
//				
//			}
//		}
		
		if(ss!="" && ss!=null) {
			
			char c = ss.charAt(0);
			if(c=='-' || c=='+') {
				if(c=='-')
					flag =1;
				else if(c=='+')
					flag =0;
				for(int i =1;i<ss.length();i++) {
					if(ss.charAt(i)>='0' && ss.charAt(i)<='9')
						res =res + ss.charAt(i);
				}
				
				
			}else {
				if(c>='a' && c<='z' || c>='A' && c<='Z' || c=='.')
					return 0;
				else {
					for(int i =0;i<ss.length();i++) {
						if(ss.charAt(i)>='0' && ss.charAt(i)<='9')
							res =res + ss.charAt(i);
					}
				}
				
				
			}
				
		}
		System.out.println(ss);
		System.out.println(flag);

		System.out.println(res);
		System.out.println(Integer.MIN_VALUE);
		long resL = Long.parseLong(res);
		System.out.println(resL);
		if(resL>Integer.MAX_VALUE)
			limit =1;
		int resI;
		if(flag==1 ) {
			if(limit ==1)
				resI=Integer.MIN_VALUE;
			else
				resI = (int) resL*-1;
		}
		else {
			if(limit ==1)
				resI=Integer.MAX_VALUE;
			else
				resI = (int) resL;
		}
		return resI;
	}

}
