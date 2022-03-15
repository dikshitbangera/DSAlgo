package ArrayProblems;

public class Sorting {
	
	    static void sorting(int a[], int n){
	    	int count=0;
	        int count1=0;
	        int count2=0;
	        
	        for(int i=0;i<n;i++){
	            if(a[i]==0){
	                count++;
	            }
	        }
	        //count: 2
	        
	        for(int m=0;m<count;m++){
	            a[m]=0;
	        }
	        
	        //a[0]=0,a[1]=0;
	        //int count1=n-count;
	        
	        for(int j=count;j<n;j++){
//	            if(a[j]==1){
//	                 count1++;
//	            }
//	            else{
//	                count2++;
//	            }
	        	a[j]=1;
	           
	        }
//	        
//	        if(count1>count2){
//	        for(int p=count;p<(count1-count2);p++){
//	            a[p]=1;
//	            
//	        }
//	        }
//	        else{
//	            for(int q=count1;q<(count2-count1);q++){
//	                a[q]=2;
//	            }
//	        }
	    
	            
	            for(int k=0;k<a.length;k++){
	                System.out.print(a[k]);
	            }
	        }
	    	
	    

	    public static void main(String[] args)
	    {
	        // code here
	        int arr[]={0,1,1,0,0};
	        sorting(arr,5);
	        
	    }
	}


