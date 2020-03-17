class BTreeNode {
		
		int key;
		BTreeNode right;
		BTreeNode left;
		
		BTreeNode(int key){
			this.key = key;
			right = left = null;
		}
}
public class BinarySearchTree {
	
	BTreeNode root;
	
	
	public void insert(int key) {
		 root = insertRoot(root, key);
	}
	

    public BTreeNode insertRoot(BTreeNode root, int key) {
		// TODO Auto-generated method stub
		if(root == null) {
			root = new BTreeNode(key);
			return root;
		}
			
		if(root.key > key) 
			root.left = insertRoot(root.left, key);
		else if (root.key < key) 
			root.right = insertRoot(root.right, key);
		
		return root;
	}


        public TreeNode searchBinaryTree(TreeNode root, int key) {
		
		if(root == null || root.key == key)
			return root;
		
		if(root.key > key)
			return searchBinaryTree(root.left , key);
		
		return searchBinaryTree(root.right, key);
	}
        
        void inorder() {
        	inorderShow(root);
        }
	
        private void inorderShow(BTreeNode root) {
        	
        	if(root != null) {
        		inorderShow(root.left);
        		System.out.println(root.key);
        		inorderShow(root.right);
        	}
        }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree b = new BinarySearchTree();
		b.insert(50);
		System.out.println("*****************");
		System.out.println("->" +b.root.key);
		b.insert(20);
		System.out.println("*****************");
		System.out.println("-->" +b.root.key);
		System.out.println("-->" +b.root.left.key);
		b.insert(10);
		System.out.println("*****************");
		System.out.println("--->" +b.root.key);
		System.out.println("--->" +b.root.left.key);
		System.out.println("--->" +b.root.left.left.key);
		b.insert(40);
		System.out.println("*****************");
		System.out.println("---->" +b.root.key);
		System.out.println("---->" +b.root.left.key);
		System.out.println("---->" +b.root.left.left.key);
		System.out.println("---->" +b.root.left.right.key);
		b.insert(80);
		System.out.println("******************");
		System.out.println("----->" +b.root.key);
		System.out.println("----->" +b.root.left.key);
		System.out.println("----->" +b.root.left.left.key);
		System.out.println("----->" +b.root.left.right.key);
		System.out.println("----->" +b.root.right.key);
		
		b.inorder();
		
		
		
		
		
	}

}
