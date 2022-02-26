package LinearDS;

import java.util.Iterator;
import java.util.Stack;

public class StackSolutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1=new Stack<>();
		//To add the data
		s1.push(4);
		s1.push(11);
		s1.push(3);
		s1.push(2);
		
		System.out.println(s1);
		//To delete the Top most data
		s1.pop();
		System.out.println(s1);
		//To look/peek into the data
		System.out.println(s1.peek());
		//To sort the data
		s1.sort(null);
		System.out.println(s1);
		//Iterator
		Iterator it=s1.iterator();
		while(it.hasNext()) {
			Object s2=it.next();
			System.out.print(s2+" ");
		}
		System.out.println();
		//To check if empty
		boolean data=s1.isEmpty();
		System.out.println(data);
		
	}

}
