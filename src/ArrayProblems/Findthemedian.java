package ArrayProblems;

import java.util.Arrays;

public class Findthemedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[]=new int[] {90 ,100 ,78 ,89 ,67};
		
		Arrays.sort(v); //[67,78,89,90,100]
        int size=v.length;
        int result=0;
        int median =size/2;
        
        for(int i=0;i<size;i++){
            
            if(size%2==0){
                result = (v[median]+v[median-1])/2;
            }
            else{
                result=v[median];
            }
        }
        System.out.println(result);

	}

}
