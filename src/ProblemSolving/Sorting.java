package ProblemSolving;

public class Sorting {
	
	    static void sorting(int arr[]){
	        
	    	
	        int temp[]={};
	        int i;
	        for(i=0;i<arr.length;i++){
	            for(int j=1;j<arr.length;j++){
	                 if(arr[i]==arr[j]){
	                     temp[i]=arr[i];
	                     temp[j]=arr[j];
	            
	        }
	        else if(arr[i]>arr[j]){
	            temp[i]=arr[i];
	        }
	        else{
	            temp[j]=arr[j];
	        }
	                
	            }
	        }
	        
	        for(int k=0;k<arr.length;k++){
	            System.out.println(temp[k]);
	        }
	    
	       
	    }    

	    public static void main(String[] args)
	    {
	        // code here
	        int arr[]={0,2,1,2,0};
	        sorting(arr);
	        
	    }
	}


