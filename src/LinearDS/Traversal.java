package LinearDS;

class Node {
	char key;
	Node left,right;
	Node(char key){
		this.key=key;
	}
	
}

class Treetraversal{
	Node root;
	void preordertraversal(Node n) {
		if(n!=null) {
			System.out.print(n.key+" ");
			preordertraversal(n.left);
			preordertraversal(n.right);
		}
	}
	
	void inordertraversal(Node n) {
		if(n!=null) {
			inordertraversal(n.left);
			System.out.print(n.key+" ");
			inordertraversal(n.right);
		}
	}
	
	void postordertraversal(Node n) {
		if(n!=null) {
			postordertraversal(n.left);
			postordertraversal(n.right);
			System.out.print(n.key+" ");
		}
	}
	
}

public class Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Treetraversal t1=new Treetraversal();
		t1.root=new Node('A');
		t1.root.left=new Node('B');
		t1.root.right=new Node('C');
		t1.root.left.left=new Node('D');
		t1.root.left.right=new Node('E');
		t1.preordertraversal(t1.root);
		System.out.println();
		t1.inordertraversal(t1.root);
		System.out.println();
		t1.postordertraversal(t1.root);
		
	}

}
