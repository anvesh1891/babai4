package Practise;
//TC:O(n)
public class LeftViewBinaryTree {
	static class Node{
		int data;
		Node left,right;
		Node(int d)
		{
			data=d;
			left=right=null;
		}
	}
	Node root;
	int max_level=0;
	void findLeftViewUtil(Node root,int level)
	{
		if(root==null)
			return;
		if(max_level<level)
		{
			System.out.print(" "+root.data);
			max_level=level;
		}
		findLeftViewUtil(root.left,level+1);
		findLeftViewUtil(root.right,level+1);
	}
	void findLeftView()
	{
		findLeftViewUtil(root,1);
	}
	public static void main(String[] args)
	{
		LeftViewBinaryTree tree=new LeftViewBinaryTree();
		tree.root=new Node(1);
		tree.root.left=new Node(10);
		tree.root.right=new Node(30);
		tree.root.right.left=new Node(25);
		tree.root.right.right=new Node(40);
		tree.findLeftView();
	}

}
