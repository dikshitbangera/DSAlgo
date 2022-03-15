package SearchingSorting;

public class Countsquare {
	
	 static int countSquares(int N) {
	        // code here
	        int count =0;
	        
	        for(int i=1;i<N;i++){
	            if((i*i)<N){
	                count++;
	            }
	            
	        }
	        
	        return count;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result=countSquares(20);
		System.out.println(result);

	}

}
