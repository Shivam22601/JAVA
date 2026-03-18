public class invertTree{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);   
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        invertTree solution = new invertTree();
        TreeNode invertedRoot = solution.invertTree(root);
        System.out.println(invertedRoot.val); // Output: 4
        System.out.println(invertedRoot.left.val); // Output: 7
        System.out.println(invertedRoot.right.val); // Output: 2
        System.out.println(invertedRoot.left.left.val); // Output: 9
        System.out.println(invertedRoot.left.right.val); // Output: 6   
        System.out.println(invertedRoot.right.left.val); // Output: 3
        System.out.println(invertedRoot.right.right.val); // Output: 1
        
    }


    public TreeNode invertTree(TreeNode root){
        if(root == null) return null;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}