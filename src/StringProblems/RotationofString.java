package StringProblems;

public class RotationofString {
	
	static int rotationstr(String s1,String s2) {
		String temp=s1+s1;
		if((s1.length()==s2.length()) && ((temp).indexOf(s2)!=-1)) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ABCD";
		String s2="CDAB";
		
		int result=rotationstr(s1,s2);

		if(result==1) {
			System.out.println("The 2 strings are rotation of itself");
		}
		else {
			System.out.println("They are not");
		}
		
	}

}
