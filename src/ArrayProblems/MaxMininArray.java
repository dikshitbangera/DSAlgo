package ArrayProblems;


public class MaxMininArray {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,11,14};
		//int sizeofarray=6;
		int min,max;
		
		//output Min: 1 Max: 5
		if(arr.length==1) {
			min=arr[0];
			max=arr[0];
		}
		
		if(arr[1]>arr[0]) {
			min=arr[0];
			max=arr[1];
		}
		else {
			min=arr[1];
			max=arr[0];
		}
		
		for(int i=2;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				}
			else if(arr[i]>max){
				max=arr[i];
				
			}
			
		}
		
		System.out.println("The minimum number in array is "+min);
		System.out.println("The maximum number in array is "+max);

	}

}
