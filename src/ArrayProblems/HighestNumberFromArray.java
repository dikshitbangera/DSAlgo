package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class HighestNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] numbers = {12, 9, 20, 7, 3};
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(7);
		list.add(9);
		list.add(11);
		list.add(3);
		
		System.out.println(list);
		//973211100
		

		String[] strnumbers = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
		
		Arrays.sort(strnumbers, new Comparator<String>() {
			
			public int compare(String a, String b) {
				return(b+a).compareTo(a+b);
		}}
			);
		
		  // If the highest number is "0", return "0"
        if (strnumbers[0].equals("0")) {
            System.out.println("0");
            return;
        }
		
		StringBuilder result = new StringBuilder();
		for(String str : strnumbers) {
			result.append(str);
		
	}
		
		System.out.println(result);
		
		
		

	}

}
