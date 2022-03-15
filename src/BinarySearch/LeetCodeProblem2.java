package BinarySearch;

public class LeetCodeProblem2 {

	public static void main(String[] args) {
		
		int[] nums=new int[] {1,3,5,6};
		int target=4;
		
		 int result=0;
		 int result2=0;
	        int temp=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==target){
	                result++;
	                
	            }
	        }
	        //System.out.println(result);
	        
	        if(result==0){
	            for(int i=0;i<nums.length;i++){
	                if(target>nums[i]){
	                	result2++;
	                    continue;
	                   
	                }
	                
	                else {
	                	System.out.println(i);
	                	break;
	                }
	            }
	            //System.out.println(nums);
	        }
	        //System.out.println(result2);
	        
	        if(result2==nums.length) {
	        	System.out.println(nums.length);
	        }
	        
	        
	}
}
