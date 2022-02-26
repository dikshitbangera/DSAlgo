package LinearDS;

public class CircularLLSolutions {
	
	
	//Quite confusing
	Node head, tail;
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	void enterElement(int ele) {
		Node nd=new Node(ele);
		if(head==null) {
			head=nd;
			tail=nd;
			tail.next=nd;
		}
		else {
			tail.next=nd;
			tail=nd;
			tail.next=head;
		}
	}
	void displayElement() {
		Node n1=head;
		if(tail==null) {
			System.out.println("The List is empty nothing to dispaly");
		}
		else {
			do
			{
				System.out.println(n1.data);
				n1=n1.next;
			}
			while(n1!=head);
		}
	}
	void deleteElement() {
		
		if(tail!=head) {
			head=head.next;
			tail.next=head;
		}
		else {
			tail=head=null;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLLSolutions clist=new CircularLLSolutions();
		clist.enterElement(5);
		clist.enterElement(4);
		clist.enterElement(10);
		clist.displayElement();
		clist.deleteElement();
		clist.displayElement();
	}

}
