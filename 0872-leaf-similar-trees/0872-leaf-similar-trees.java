class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        
        // Collect leaves for both trees
        getLeaves(root1, leaves1);
        getLeaves(root2, leaves2);
        
        // Compare the two sequences
        return leaves1.equals(leaves2);
    }
    
    private void getLeaves(TreeNode node, List<Integer> leaves) {
        if (node == null) return;
        
        // If it's a leaf node, add its value
        if (node.left == null && node.right == null) {
            leaves.add(node.val);
            return;
        }
        
        // Continue DFS traversal from left to right
        getLeaves(node.left, leaves);
        getLeaves(node.right, leaves);
    }
}
