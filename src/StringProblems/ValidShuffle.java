package StringProblems;

import java.util.Arrays;

public class ValidShuffle {
	
	//create a method that checks of length of result and combination of first and last are same or not
	static boolean lengthcheck(String first, String second, String arr) {		
		
		if((first.length()+second.length())==arr.length()) {
			return true;
		}
		else {
			return false;
		}
	
		
		}
	
	
	//Method to convert the string to char array and then sort it and convert it back to string
	
	static String sortthestring(String input) {
		
		char[] chararray=input.toCharArray();
		
		Arrays.sort(chararray);
		
		String output=String.valueOf(chararray);
		
		System.out.println(output);
		return output;
		
		
	}
	
	
	static boolean schufflecheck(String first, String second, String arr) {
		String firststring=sortthestring(first);
		String secondstring=sortthestring(second);
		String resultstring=sortthestring(arr);
		int i=0;
		int j=0;
		int k=0;
		
		while(k!=resultstring.length()) {
			
			if(i<first.length() && firststring.charAt(i)==resultstring.charAt(k)) {
				i++;	
			}
			else if(j<secondstring.length() && secondstring.charAt(j)==resultstring.charAt(k)) {
				j++;
			}
			else {
				return false;
			}
			k++;
		}
		return true;
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	String first = "XY";
		    String second = "12";  //combine: XY12
		    String[] results = {"Y21XX", "Y1X2", "1XY2"};
		    
		    for(String arr: results) {		    	
			    if(lengthcheck(first,second,arr) && schufflecheck(first, second, arr)) {
			    	System.out.println(arr+" is schuffle of the "+first+" ,"+second+" strings");
			    	
			    }
			    else {
			    	System.out.println(arr+" is not a shuffle of the "+first+" ,"+second+" strings");
			    }

		    }

	}

}
