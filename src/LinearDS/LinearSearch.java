package LinearDS;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]=new int[] {1,4,2,5,7};
		int count=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		int key=s1.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("The element is present at index "+i);
				count++;
			}
		}
		if(count==0) {
			System.out.println("The element is not present");
		}
		
		
		
		
	}

}
