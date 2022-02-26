package LinearDS;

public class QuickSort {
	
	static int partition(int arr[],int first, int last) {
		
		int pivot=arr[last];
		int pindex=first-1;
		//int swap;
		for(int i=first;i<last;i++) {			//First iteration		//Second					//Third					//fourth	 Fifth
			if(arr[i]<=pivot) {	
				pindex++; 								//3<=7					//1<=7					//5<=7  			//9<=7		2<=7
				int swap=arr[pindex];    			//swap=arr[0]=3				//swap=arr[1]=1			swap=arr[2]=5		Not true	swap=arr[3]=9
				arr[pindex]=arr[i];				//arr[0]=3    			//arr[1]=1						arr[2]=5						arr[3]=2
				arr[i]=swap;					//arr[0]=3				//arr[1]=1						arr[2]=5						arr[4]=9
												//arr[]={3,1,5,9,2,7}																{3,1,5,2,9,7}
			}
		}
		
		int swap=arr[pindex+1];				//swap=arr[3+1]=9
		arr[pindex+1]=arr[last];			//arr[3+1]=7
		arr[last]=swap;						//arr[5]=9
											//{3,1,5,2,7,9}
		return pindex+1;

	}
	
	static void Quicksort(int arr[],int first,int last) {
		if(first<last) {
			int midpivotindex=partition(arr,first,last);
			Quicksort(arr,first,midpivotindex-1);
			Quicksort(arr,midpivotindex+1,last);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {3,1,5,2,9,7};
		
		Quicksort(arr,0,arr.length-1);
		
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		

	}

}
