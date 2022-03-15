package SearchingSorting;

import java.util.Arrays;

public class Findpairgivendiffernce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {5, 20, 3, 2, 5, 80};
		int l=55;
		int size= arr.length;
		
		Arrays.sort(arr);
		
		for(int i=size-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[i]-arr[j]==l) {
					System.out.println("1 "+arr[i]+" and "+arr[j]);
				}
				else {
					continue;
				}
			}
		}
		
		
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}

	}

}
