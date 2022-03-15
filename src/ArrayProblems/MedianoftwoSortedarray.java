package ArrayProblems;

import java.util.ArrayList;

public class MedianoftwoSortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]=new int[] {1,4,6,7};
		int arr2[]=new int[] {2,3,5,8,9};
		
		ArrayList<Integer> result=new ArrayList<>();
		int pointA=0;
		int pointB=0;
		
		//for(int i=0;i<arr1.length)
		
		while(true) {
			
			if(arr1[pointA]>arr2[pointB]) {
				result.add(arr2[pointB]);
				pointB++;
			}
			else {
				result.add(arr1[pointA]);
				pointA++;
			}
			
			if(pointA>=arr1.length || pointB>=arr2.length) {
				break;
			}
		}
		
		for(int i=pointA;i<arr1.length;i++) {
			//System.out.println("INSIDE");
			result.add(arr1[i]);
			//pointA++;
		}
		for(int i=pointB;i<arr2.length;i++) {
			result.add(arr2[i]);
			//pointB++;
		}
		
		System.out.println(result);
		
		
		int resultsize=result.size();
		int median=resultsize/2;
		int finalresult=0;
		
		if(resultsize%2==0) {
			finalresult=(result.get(median)+result.get(median-1))/2;
		}
		else {
			finalresult=result.get(median);
		}
		
		System.out.println(finalresult);

	}

}
