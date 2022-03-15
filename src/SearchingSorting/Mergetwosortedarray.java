package SearchingSorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Mergetwosortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Set<Integer> result =new HashSet<>();
//		int temp=1;
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//				if(arr1[i]>arr2[j]) {
//					result.add(arr2[j]);
//					temp++;
//				}
//				else {
//					result.add(arr1[i]);
//				}
//			}
//		}
//		System.out.println(temp);
//		
//		for(int i=temp;i<arr2.length;i++) {
//			result.add(arr2[i]);
//		}
		
		int arr1[] = {1, 3, 5, 7};
		int arr2[] = {0, 2, 6, 8, 9};
		
		
		int sizeA=arr1.length;
		int sizeB=arr2.length;
		
		int pointA=0;
		int pointB=0;
		
		ArrayList<Integer> result =new ArrayList<>();
		
		while(true) {
			if(arr1[pointA]>arr2[pointB]) {
				result.add(arr2[pointB]);
				pointB++;
			}
			else {
				result.add(arr1[pointA]);
				pointA++;
			}
			if(pointA>=sizeA || pointB>=sizeB) {
				break;
			}
		}
		
		for(int i=pointA;i<sizeA;i++) {
			result.add(arr1[i]);
		}
		
		for(int i=pointB;i<sizeB;i++) {
			result.add(arr2[i]);
		}
		
		
		System.out.println(result);
	}

}
