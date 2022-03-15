package ArrayProblems;

import java.util.ArrayList;

public class TwoSum {

	  public static int[] twoSumlogic(int[] nums, int target) {
		  
		  
		  //	ArrayList<Integer> result=new ArrayList<>();
		  
	        for(int i=0;i<nums.length;i++){
	            for(int k=1;k<=nums.length-1;k++) {
	            if(k!=i) {		
	            	if(nums[i]+nums[k]==target) {
	            		int[] toreturn= {i,k};
	            		return toreturn;
	            		//break;
	            }
	          }
	           
	        }
	      }
	        
	        return null;
	        
	        
	        //System.out.println(result);
	        
	        
		  
		  
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {1,7,5,9};
		int target=6;
		
		int[] result=twoSumlogic(nums,target);
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	
		
		
	

	}

}
