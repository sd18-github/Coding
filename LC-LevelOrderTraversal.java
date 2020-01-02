/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        q.offer(root);
        int l = 0, count = 0;
        if (root == null) return result;
        while(!(q.size() == 0)) {
            List<Integer> levelList = new ArrayList<>(); 
            int size = q.size();
            TreeNode p = null;
            for(int i = 0; i < size; i++) {
                p = q.poll();
                if ( p != null ) {
                    levelList.add(p.val);
                    q.offer(p.left);
                    q.offer(p.right);

                }            
            }
            if(levelList.size() != 0) result.add(levelList);
            
            
        }
        return result;
    }
    
    
}
