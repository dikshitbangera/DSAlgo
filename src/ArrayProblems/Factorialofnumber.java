package ArrayProblems;

import java.util.ArrayList;

public class Factorialofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=20;
		int result=1;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=N;i>0;i--){
            result=result*i;
            
        }
        
        System.out.println(result);

	}

}
