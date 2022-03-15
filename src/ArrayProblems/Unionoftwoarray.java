package ArrayProblems;

import java.util.HashSet;
import java.util.Set;

public class Unionoftwoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[] {1,2,4,5,8};
		int n=a.length;
		int b[]=new int[] {2,4,11};
		int m=b.length;
		
		  Set<Integer> union=new HashSet<>();
	        
	        for(int i=0;i<n;i++){
	            union.add(a[i]);
	        }
	        for(int j=0;j<m;j++){
	            union.add(b[j]);
	        }
	        
	        System.out.println(union);
	        int size=union.size();
	        System.out.println(size);

	}

}
