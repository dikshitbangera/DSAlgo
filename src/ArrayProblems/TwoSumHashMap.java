package ArrayProblems;

import java.util.HashMap;

public class TwoSumHashMap {
	
	 public static int[] twoSum(int[] numbers, int target) {
	
	 HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
     for(int i = 0; i < numbers.length; i++){

         Integer diff = (Integer)(target - numbers[i]);
         if(hash.containsKey(diff)){
             int toReturn[] = {hash.get(diff), i};
             return toReturn;
         }

         hash.put(numbers[i], i);
     }
     return null;
     
	 }
     
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {1,3,5,7};
		int target=10;
		
		int[] result=twoSum(nums, target);
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]);
		}
	}

}
