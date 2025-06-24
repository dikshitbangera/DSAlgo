package StringProblems;

public class ReverseStringSentenceInSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "This is Dikshit";
		
		String[] strarr = s.split("\\s");
		String reverse = "";

		for(String demo : strarr) {
			for(int i = demo.length()-1; i>=0; i-- ) {
				reverse = reverse + demo.charAt(i);
				
			}
			reverse = reverse + " ";
		}
		
		System.out.println("The reverse sentence in sequence "+reverse);
		
		
	}

}
