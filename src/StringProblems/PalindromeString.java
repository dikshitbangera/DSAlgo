package StringProblems;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="Cogni";
		 String reverse="";
		 
//	        for(int i=0;i<S.length();i++){
//	            char c=S.charAt(i);
//	            reverse=c+reverse;
//	        }
	        
	        //or
	        
	        for(int j=S.length()-1;j>=0;j--) {
	        	char k=S.charAt(j);
	        	reverse=reverse+k;
	        	System.out.println(reverse);
	        }
	        
	      System.out.println(reverse);  
	      
	            if(S.equalsIgnoreCase(reverse)){
	                System.out.println("The string is a palindrome");
	            }
	            else{
	                System.out.println("The string is not a palindrome");
	            }
		 
	        
	    
	}

}
