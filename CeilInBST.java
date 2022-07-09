/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T>
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

public class Solution {
    static int max=-1;
    public  static int findCeil(TreeNode<Integer> node, int x) {
        max=-1;
        ceil(node,x);
        return max;

    }
    
    static void ceil(TreeNode<Integer> node,int key){
        if(node==null){
            return ;
        }
        
        if(node.data==key)
            max=node.data;
        else if(node.data<key)
            ceil(node.right,key);
        else {
           max=node.data;
           ceil(node.left,key);
        }
    }
}
