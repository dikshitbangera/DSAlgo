package SearchingSorting;

import java.util.ArrayList;

public class ValurequaltoIndex {
	
	 static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
	        // code here
	        
	        ArrayList<Integer> arraylist=new ArrayList<>();
	        
	        for(int i=1;i<=n;i++){
	            if(i==arr[i-1]){
	                arraylist.add(i);
	            }
	        }
	        
	        return arraylist;
	        
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[] {15, 2, 45, 4, 7};
		
		
		ArrayList<Integer> result=new ArrayList<>();
		result=valueEqualToIndex(arr, 5);
		System.out.println(result);

	}

}
