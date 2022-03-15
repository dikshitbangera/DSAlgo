package SearchingSorting;

public class zerosumsubrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {6,-1,-3,4,-2,2,4,6,-12,-7};
		
		int count=0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
			for(int j=0;j<arr.length;j++) {
				
				if(i==j) {
					continue;
				}
				else if(arr[i]-arr[j]==0) {
					count++;
					
				}
				
			}
			
		}
		
		System.out.println(count);

	}

}
