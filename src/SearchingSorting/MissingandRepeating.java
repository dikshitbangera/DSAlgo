package SearchingSorting;

import java.util.HashMap;

public class MissingandRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,3,1};
		
		HashMap<Integer,Boolean> map=new HashMap<>();
		
		for(Integer i:arr) {
			
			if(map.get(i)==null) {
				map.put(i,true);
			}
			else {
				System.out.println("The repeating number is "+i);
			}
		}
		
		for(int i=1;i<arr.length;i++) {
			if(map.get(i)==null) {
				System.out.println("The missing number is "+i);
			}
		}

		
		
	}

}
