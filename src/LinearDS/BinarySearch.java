package LinearDS;

public class BinarySearch {
	
	static int IterativeBS(int arr[],int item,int beg,int last) {
		
		if(beg<=last) {
			int total= beg+ last;
			int midindex=total/2;
			if(arr[midindex]==item) {
				//System.out.println("The element is present at index "+midindex);
				return midindex;
			}
			else if(arr[midindex]>item) {
				return IterativeBS(arr,item,beg,midindex-1);
			}
			else {
				return IterativeBS(arr,item,midindex+1,last);
			}
			
			
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {1,2,3,4,5};
		
		int key=IterativeBS(arr,4,0,arr.length);
		
		if(key==-1) {
			System.out.println("The element is not present");
			
		}
		
		else {
			System.out.println("The element is present at index "+key);
		}

	}

}
