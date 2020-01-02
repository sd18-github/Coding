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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        
        TreeNode cursor = root;             //set cursor to root of binary tree
        boolean done = false;

       while (!done)
       {
          if(cursor != null)
          {
             s.push(cursor);          //place pointer to node on the stack
                                      //before traversing the node's left subtree
             cursor = cursor.left;    //traverse the left subtree
          }
          else                        //backtrack from the empty subtree and
                                      //visit the node at the top of the stack;
                                      //however, if the stack is empty, you are
                                      //done
          {
             if (!s.empty())
             {
                 cursor = s.pop();
                 values.add(cursor.val);
                 cursor = cursor.right;
             }
             else
                 done = true;
          }
       }
        return values;
    }
}
