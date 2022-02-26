package LinearDS;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> data=new HashMap<>();
		data.put("Dikshit", 7);
		data.put("Andu", 8);
		data.put("Pamya", 9);
		
		Set<String> keys=data.keySet();
		
		for(String i:keys) {
			System.out.println(data.get(i));
			System.out.println(data.hashCode());
		}
		
		//Entryset to fetch both Key and value
		
		Set<Map.Entry<String, Integer>> entryset=data.entrySet();
		
		for(Map.Entry<String, Integer> i: entryset) {
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
		
		

	}

}
