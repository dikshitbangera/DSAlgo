package StringProblems;

import java.util.HashMap;
import java.util.Set;

public class DuplicateinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="Dikshitttttt";
		
		
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<name.length();i++) {
			char temp=name.charAt(i);
			if(map.containsKey(temp)) {
				
				map.put(temp, map.get(temp)+1);
			}
			else {
				map.put(temp, 1);
			}
		}
		
		Set<Character> keyset=map.keySet();
		for(Character c:keyset) {
			if(map.get(c)>1) {
				System.out.println(" The Element " +c+ " is repeated "+map.get(c)+ " times");
			}
		}

		int max=0;
		char charmax = 0;
		for(Character demo : keyset) {
			if(map.get(demo)>max) {
				max=map.get(demo);
				charmax = demo;
			}
		}
		
		System.out.println("The character repeated maximum times are "+charmax+" "+max);

		
		
	
	}

}
