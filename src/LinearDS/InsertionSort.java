package LinearDS;

public class InsertionSort {
	
	static void insertionsorting(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int j=i-1;
			int b=arr[i];
			
			while(j>=0 && arr[j]>=b) {
				arr[j+1]=arr[j];
				j--;
				
			}
			
			arr[j+1]=b;
		
		
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1=new int[]{0,3,7,2,9,11};
		insertionsorting(arr1);

	}

}
