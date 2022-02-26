package LinearDS;

public class Selectionsort {

	static void selectionsorting(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int k=i;
			
			//this for loop is used to find the value of k which is index of minmum value
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[k]) {
					k=j;
				}
			}
			
			int swap=arr[i];
			arr[i]=arr[k];
			arr[k]=swap;
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[]{3,5,1,9,2};
		selectionsorting(arr);
	}

}
