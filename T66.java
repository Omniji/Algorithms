public class Solution {
    /*
     * @param root: A Tree
     * @return: Preorder in ArrayList which contains node values.
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        helper(result,root);
        return result;
    }
    
    private void helper (List<Integer> result, TreeNode current) {
        if (current != null) {
            result.add(current.val);
        } 
        
        if (current.left!= null) {
            helper(result,current.left);
        }
        if (current.right!= null) {
            helper(result,current.right);
        }
    }
        
}
