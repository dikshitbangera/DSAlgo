package StringProblems;

import java.util.HashMap;
import java.util.Set;

public class NumberofWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Hello my name is Dikshit";
		String[] num = s.split("\\s");
		System.out.println(num.length);	
		
		String word = s.toLowerCase().replaceAll("\\s","");
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<word.length();i++) {
			if(map.containsKey(word.charAt(i))) {
				map.put(word.charAt(i), map.get(word.charAt(i))+1);
			}
			else {
				map.put(word.charAt(i), 1);
			}
		}
		
		Set<Character> key = map.keySet();
		
		for(char c: key) {
			if(map.get(c)>1) {
				System.out.println("The Character " + c + " is repeated" + map.get(c)+" times");
			}
		}
		
	}

}
