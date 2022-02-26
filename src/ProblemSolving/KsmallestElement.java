package ProblemSolving;

import java.util.Arrays;

public class KsmallestElement {
	
	    public static int kthSmallest(int[] arr, int k) 
	    { 
	        
	        int min=0;
	        int max=0;
	        int temp=0;
//	        //Your code here
//	        if(arr[0]<arr[1]){
//	            min=arr[0];
//	            max=arr[1];
//	        }
//	        else{
//	            min=arr[1];
//	            max=arr[0];
//	        }
//	        
//	        for(int i=2;i<arr.length;i++){
//	            if(arr[i]<min){
//	                temp=arr[i];
//	                arr[i]=min;
//	                min=temp;
//	            }
//	            else if(arr[i]>max){
//	                temp=arr[i];
//	                arr[i]=max;
//	                max=temp;
//	            }
//	        }
//	        for(int i=0;i<arr.length;i++) {
//		        System.out.println(arr[i]);
//
//	        }
//	        
	        
	        Arrays.sort(arr);
	        for(int i=0;i<arr.length;i++) {
		        System.out.print(arr[i]+" ");

	        }
	        int output=arr[k];
	        return output;
	       // System.out.print("The Element at "+k+" position is "+arr[k]);
	        
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {4,6,2,9,1};
        int result=kthSmallest(arr, 2);
        System.out.print("The Element at position is "+result);
	}

}
