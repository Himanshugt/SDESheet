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
    static int min=-1;
    public static int floorInBST(TreeNode<Integer> root, int X) {
        floor(root,X);
        return min;
    }
    
    static void floor(TreeNode<Integer> root,int key){
        if(root==null){
            return ;
        }
        if(key==root.data){
            min=root.data;
            return ;
        }
        else if(key>root.data){
            min=root.data;
            floor(root.right,key);
        }
        else{
            floor(root.left,key);
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}