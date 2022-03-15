package ArrayProblems;

import java.util.ArrayList;

public class RotateanArraybyone {
	
	static void rotate(int arr[], int n) {
		int temp=arr[n-1];
		
		for(int i=n-1;i>0;i--) {
			arr[i]=arr[i-1];
		}

		arr[0]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,2,3,4,5};
		int n=5;
		
		rotate(arr,n);
		
		for(int j=0;j<n;j++) {
			System.out.print(arr[j]);
		}
		
//		  int temp=arr[n-1];
//	      ArrayList<Integer> array=new ArrayList<>();
//	      array.add(temp);
//	        
//	        for(int i=0;i<=n-2;i++){
//	        	array.add(arr[i]);
//	            
//	        	
//	        }
//	        System.out.print(array);
	        
	}

}
