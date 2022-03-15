package ArrayProblems;

public class Palindromearray {
	
	static int palin(int arr[]) {
		

		
		int rem;
		int rev=0;;
		
		for(int i=0;i<arr.length;i++) {
			int num = arr[i];
			
			while(num>0) {
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			
			if(rev!=arr[i]) {
				//System.out.println("Not a palindrome");
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int arr[]=new int[] {121,131,20};
		
		int result=palin(arr);
		System.out.println(result);
		
		
		
	}

}
