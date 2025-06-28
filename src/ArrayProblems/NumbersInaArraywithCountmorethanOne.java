package ArrayProblems;

import java.util.HashMap;
import java.util.Set;

public class NumbersInaArraywithCountmorethanOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				// TODO Auto-generated method stub
				int[] arr = {1,2,3,6,7,2,8,3,1};
				
				HashMap<Integer, Integer> map = new HashMap<>();
				
				for(int i =0;i<arr.length;i++) {
					if(map.containsKey(arr[i])) {
						map.put(arr[i], map.get(arr[i])+1);
					}
					else {
						map.put(arr[i], 1);
					}
				}
				
				Set<Integer> keyset = map.keySet();
				
				for(int i : keyset) {
					if(map.get(i)>1) {
						System.out.println("The count of value "+i+ " is"+map.get(i));
					}
						
				}

	}

}
