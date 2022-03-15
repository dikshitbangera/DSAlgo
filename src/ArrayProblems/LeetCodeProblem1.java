package ArrayProblems;

public class LeetCodeProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = new int[] {7,1,5,3,6,4};
        int profit=0;
        int buy=0;
        int sell=0;
        int temp=0;
        int temp1=0;
        
        //unsolved 
        
        
        
        for(int i=0;i<prices.length;i++){
        	 buy=prices[i];
            for(int j=i;j<prices.length;j++){
               
                
                if(buy<prices[j] && i!=j){
                    temp=prices[j];
                    prices[j]=buy;
                    buy=temp;
                    }
            }
            }
        
        System.out.println(buy);
            
        for(int i=buy;i<prices.length;i++){
            sell=prices[i];
            for(int j=i;j<prices.length;j++){
                
                if(sell>prices[j] && i!=j && prices[i]!=buy){
                    temp1=prices[j];
                    prices[j]=sell;
                    sell=temp1;
                }
            }
        }
        
        System.out.println(sell);
            
            profit =sell-buy;
            System.out.println(sell +"     "+ buy);
            System.out.println(profit);
	}

}
