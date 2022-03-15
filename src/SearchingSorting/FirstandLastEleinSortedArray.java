package SearchingSorting;

import java.util.ArrayList;

public class FirstandLastEleinSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,3,5,5,5,5,5,6,9,11};
		int n=arr.length-1;
		int x=5;
        int count=1;
        ArrayList<Integer> output=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
             output.add(i);
             break;
            }}
        
            for(int j=output.get(0);j<n;j++){
                    if(arr[j]==arr[j+1]){
                        count++;
                }
                }
            
        int lastindex=output.get(0)+count-1;
        output.add(lastindex);
        
        
        System.out.println(output);
        //return output;
	}

}
