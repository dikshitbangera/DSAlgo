package SearchingSorting;

public class Middleofthree {
	
	static int middle(int A, int B, int C){
        //code here
        
        if(A>B && A>C){
            if(B>C){
                return B;
            }
            else{
                return C;
            }
        }
        
         if(B>A && B>C){
            if(A>C){
                return A;
            }
            else{
                return C;
            }
        }
        
         if(C>A && C>B){
            if(A>B){
                return A;
            }
            else{
                return B;
            }
        }
        
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=middle(300,150,100);
		System.out.println(result);
	}

}
