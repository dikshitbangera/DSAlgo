package SearchingSorting;

import java.util.ArrayList;

public class Findallfoursum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr=new int[] {10,2,3,4,5,7,8};
	     int pointA=0;
	        int pointB=0;
	        int pointC=0;
	        int pointD=0;
	        int k=23;
	        int size=arr.length;
	        ArrayList<Integer> result=new ArrayList<>();
	        int temp=0;
	        
	        for(int i=0;i<size;i++){
	            for(int j=i+1;j<size;j++){
	            pointB=pointB+j;	
	            pointC=pointB+1;
	            pointD=pointC+1;
	            temp=arr[i]+arr[pointB]+arr[pointC]+arr[pointD];
	            if(temp==k){
	                result.add(arr[i]);
	                result.add(arr[pointB]);
	                result.add(arr[pointC]);
	                result.add(arr[pointD]);
	            }
	            else{
	                pointB++;
	            }
	            
	            if(pointB-3<=size) {
	            	break;
	            }
	            }
	        }
	        
	        System.out.println(result);
		
	}

}
