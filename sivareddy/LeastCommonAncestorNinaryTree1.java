package BST;
//TC:O(n).Single traversal.No extra space needed.
public class LeastCommonAncestorNinaryTree1 {
	Node root;
	static boolean v1=false;
	static boolean v2=false;
	static class Node{
		int data;
		Node left,right;
		Node(int d)
		{
			data=d;
			left=null;
			right=null;
		}
	}
	Node findLCAInternal(Node root,int n1,int n2)
	{
		if(root==null)
			return null;
		if(root.data==n1)
		{
			v1=true;
			return root;
		}
		if(root.data==n2)
		{
			v2=true;
			return root;
		}
		Node left_lca=findLCAInternal(root.left,n1,n2);
		Node right_lca=findLCAInternal(root.right,n1,n2);
		if(left_lca!=null && right_lca!=null)
			return root;
		return (left_lca!=null)?left_lca:right_lca;
	}
	boolean find(Node root,int n)
	{
		if(root==null)
			return false;
		if(root.data==n||find(root.left,n)||find(root.right,n))
			return true;
		return false;	
	}
	Node findLCA(int n1,int n2)
	{
		Node lca=findLCAInternal(root,n1,n2);
		if(v1&&v2||v1&&find(lca,n2)||v2&&find(lca,n1))
			return lca;
		return null;
	}
	public static void main(String[] args)
	{
		LeastCommonAncestorNinaryTree1 tree=new LeastCommonAncestorNinaryTree1();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		Node lca=tree.findLCA(4,7);
		if(lca!=null)
			System.out.println("Element is present: "+lca.data);
		else
			System.out.println("Element not found");
	}

}
