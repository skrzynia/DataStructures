
import java.util.Queue;

class TreeNode {
	int key;
	TreeNode left,right;
	
	public TreeNode(int key) {
		this.key = key;
		left = right = null;
	}
}




public class TreesTest {

	
	static void inOrderTreeTraversal(TreeNode node) {
		
		if(node == null)
			return;
		
			
		
		inOrderTreeTraversal(node.left);
		
		System.out.print(node.key + " ");
		
		inOrderTreeTraversal(node.right);
		
		
		
	}
	
	
	static void preOrderTreeTraversal(TreeNode node) {
		
		if(node == null)
			return;
		
		System.out.print(node.key + " ");
		preOrderTreeTraversal(node.left);
		preOrderTreeTraversal(node.right);
	}
	
	static void postOrderTreeTraversal(TreeNode node) {
		
		if(node == null)
			return;
		
		postOrderTreeTraversal(node.left);
		postOrderTreeTraversal(node.right);
		System.out.print(node.key + " ");
	}
	
	static void levelOrderTraversal(TreeNode node) {
		
		Queue<TreeNode> q = new java.util.LinkedList<TreeNode>();
		
		q.add(node);
		
		
		
		while(!q.isEmpty()) {
			
			TreeNode temporary = q.poll();
			System.out.print(temporary.key + " ");
			
			
			if(temporary.left != null)
				q.add(temporary.left);
			
			if(temporary.right != null)
				q.add(temporary.right);
			
			
			
		}
		
		
	}
	
	static int height(TreeNode node) {
		
		if(node == null)
		return 0;
		else
		return 1 + Math.max(height(node.left), height(node.right));
	}
	
	
	public static void main(String[] args) {
		
		
		TreeNode tree = new TreeNode(1);
		
		tree.left = new TreeNode(2);
		tree.left.left = new TreeNode(4);
		tree.left.right = new TreeNode(5);
		
		tree.right = new TreeNode(3);
		tree.left.left.right = new TreeNode(6);
		
		System.out.print("InOrder: ");
		inOrderTreeTraversal(tree);
		System.out.println();
		System.out.print("PreOrder: ");
		preOrderTreeTraversal(tree);
		System.out.println();
		System.out.print("PostOrder: ");
		postOrderTreeTraversal(tree);
		System.out.println();
		System.out.print("Level Order Traversal: ");
		levelOrderTraversal(tree);
		System.out.println();
		System.out.println("Height: " + height(tree));

	}

}
