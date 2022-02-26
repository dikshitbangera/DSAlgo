package ProblemSolving;

public class ReverseanArray {

	static void reverseanarray(int arr[],int start,int end) {
		int temp;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,2,3,11,5,6};
		reverseanarray(arr,0,5);
	}

}
