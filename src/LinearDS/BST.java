package LinearDS;

class NewNode{
	char key;
	NewNode left, right;
	
	NewNode(char key){
		this.key=key;
	}
}

class Binarysearchtree{
	NewNode root;
	void insertKey(char key) {
		root=insertinTree(root,key);
	}
	NewNode insertinTree(NewNode root,char key) {
		if(root==null) {
			root=new NewNode(key);
			return root;
		}
		else if(key<root.key) {
			root.left=insertinTree(root.left,key);	
		}
		else if(key>root.key) {
			root.right=insertinTree(root.right,key);
		}
		return root;
		
	}
	
	void inordertraversal(NewNode root) {
		if(root!=null) {
			inordertraversal(root.left);
			System.out.print(root.key+" ");
			inordertraversal(root.right);
			
		}
	}
	
}

public class BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binarysearchtree t1=new Binarysearchtree();
		t1.insertKey('A');
		t1.insertKey('B');
		t1.insertKey('E');
		t1.insertKey('M');
		t1.insertKey('X');
		t1.insertKey('F');
		
		t1.inordertraversal(t1.root);

	}

}
