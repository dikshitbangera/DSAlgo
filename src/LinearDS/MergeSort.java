package LinearDS;

public class MergeSort {
	
	static void sort(int arr[],int start,int end) {
		if(start<end) {
			int mid=(start+end)/2;

			sort(arr,start,mid);
			sort(arr,mid+1,end);
			merge(arr,start,mid,end);
		}
	}
	
	static void merge(int arr[],int start,int mid,int end) {
		int lsize=mid-start+1;
		int rsize=end-mid;
		int l[]=new int[lsize];
		int r[]=new int[rsize];
		
		//To add element in left and right array
		for(int i=0;i<lsize;i++) {
			l[i]=arr[start+i];
		}
		
		for(int j=0;j<rsize;j++) {
			r[j]=arr[mid+1+j];
		}
		
		int i=0;
		int j=0;
		int k=start;
		
		//To compare the left and right array
		
		if(i<lsize && j<rsize) {
			if(l[i]<=r[j]) {
				arr[k]=l[i];
				i++;
			}
			else {
				arr[k]=r[j];
				j++;
			}
			k++;
		}
		
		//if any one array sorting is completed then add the remaining element of the other array in result array
		while(i<lsize) {
			arr[k]=l[i];
			i++;
			k++;
			
		}
		while(j<rsize) {
			arr[k]=r[j];
			j++;
			k++;
		}
		
	}
	
	public static void main(String[] args){
		
		int arr[]=new int[] {3,2,5,1,7,6,8};
		sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	

}
