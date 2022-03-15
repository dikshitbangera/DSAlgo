package StringProblems;

public class LongestPalindromeinastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="aaabbaa";
		 String reverse="";
	        
	        for(int i=0;i<S.length();i++){
	            char temp=S.charAt(i);
	            reverse=temp+reverse;
	        }
	        
	        if(reverse.equals(S)){
	            //return S;
	        }
	        else{
	            for(int i=1;i<S.length();i++){
	                char temp=S.charAt(i);
	                reverse=temp+reverse;
	        }
	       // String.valueOf
	            
	            
	        }
	        
	}

}
