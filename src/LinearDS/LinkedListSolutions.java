package LinearDS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListSolutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(11);
		l1.add(18);
		l1.add(5);
		l1.add(3);
		
		l1.remove(1);
		l1.remove(0);
		boolean b1=l1.contains(3);
		System.out.println(b1);
		Iterator it=l1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		Stack<String> s1=new Stack<String>();
		s1.push("Dikshit");
		s1.push("Bangera");
		LinkedList<String> l2=new LinkedList<>();
		l2.addAll(s1);
		Iterator it1=l2.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next()+" ");
		}
		
		
	}

}
