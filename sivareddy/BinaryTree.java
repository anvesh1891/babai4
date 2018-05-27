package Sample;

class Node {
	int data;
	Node left,right;
	
	Node(int d){
		data=d;
		left=right=null;
	}
	
}

public class BinaryTree {
	
	static Node root;
	
	public static void print(Node node,int k1,int k2)
	{
		if(node==null)
		{
			return;
		}
		if(k1<node.data)
			print(node.left,k1,k2);
		if(k1<=node.data && k2>=node.data)
			System.out.println(node.data);
		if(k2>node.data)
			print(node.right,k1,k2);
		
	}

	public static void main(String[] args)
	{
		BinaryTree bt=new BinaryTree();
		int k1=10,k2=25;
		bt.root=new Node(20);
		bt.root.left=new Node(8);
		bt.root.left.left=new Node(4);
		bt.root.left.right=new Node(12);
		bt.root.right=new Node(22);
		print(root,k1,k2);			
	}

}
