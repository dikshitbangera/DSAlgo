package LinearDS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysFunctions {
	
	public static int valuecheck(int arr[],int key){
		for(int i=0;i<arr.length;i++) {
		if(key==arr[i]) {
			return i;
		}
	}
		return -1;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[8];
		int brr[][]=new int[3][4];
		int count=1;
		int increment=1;
		
		//1D array
		for(int i=0;i<arr.length;i++) {
			arr[i]=count;
			count++;
		}
		for(int j=0;j<arr.length;j++) {
		System.out.print(arr[j]+" ");
		}
		
		System.out.println(" ");
		
		//2D array
		
		for(int k=0;k<brr.length;k++) {
			for(int l=0;l<brr[k].length;l++) {
				brr[k][l]=increment;
				increment++;
			}
		}
		
		for(int k=0;k<brr.length;k++) {
			for(int l=0;l<brr[k].length;l++) {
				System.out.print(brr[k][l]+" ");
			}
			System.out.println(" ");
		}
		
		//Array sort
		
		int crr[]=new int[] {3,5,1,7,6,9,8};
		
		for(int m=0;m<crr.length;m++) {
			System.out.print(crr[m]);
		}
		System.out.println();
		Arrays.sort(crr);
		
		for(int n=0;n<crr.length;n++) {
			System.out.print(crr[n]);
		}
		
		int indexvaluecheck=valuecheck(crr,9);
		
	
		if(indexvaluecheck==-1) {
			System.out.println("The element is not present in the array");
		}
		else {
			System.out.println(" The element is present at "+indexvaluecheck+ " indexes" );
		}
	
		
	}

}
