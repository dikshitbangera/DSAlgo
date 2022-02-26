package ProblemSolving;

public class Solution {
	 public static void reverseString(char[] s) {
		 for(int i=0;i<s.length/2;i++){
             
	            
	            char temp=s[i];
	            s[i]=s[s.length-1-i];
	            s[s.length-1-i]=temp;
	            
	            
	            }
	        
	        
	        for(int j=0;j<s.length-1;j++){            
	        System.out.print(s[j]+" ");
	            
	            }
	            
	        }
	    
    
    public static void main(String[] args){
        
        char input[]=new char[] {'h','e','l','l','o'};
        reverseString(input);
    }
}
