// import java.util.TreeNode;
public class ArrayToBST {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, left, mid - 1);
        node.right = helper(nums, mid + 1, right);
        return node;
    }

    public static void main(String[] args) {
        ArrayToBST solution = new ArrayToBST();
        int[] nums = {-10, -3, 0, 5, 9};
        System.out.println("Input array: " + java.util.Arrays.toString(nums));
        TreeNode root = solution.sortedArrayToBST(nums);
        // You can add code here to print the tree or verify the structure
        System.err.println("Root value: " + root.val);

    }
}