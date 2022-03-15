package ArrayProblems;

import java.util.ArrayList;

public class Moveallnegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[] {-12,11,3,-10,7,2,-3,-6};
		ArrayList<Integer> abc=new ArrayList<>();
		
		//output= -12,-10,-3,-6,11,3,7,2
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				abc.add(arr[i]);
			}
		}
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>0) {
				abc.add(arr[j]);
			}
		}
		System.out.println(abc);
		
	}

}
