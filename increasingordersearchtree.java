class Solution {
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        inorder(root,arr);
        
        for (int i=0;i<arr.size()-1;i++)
        {
            arr.get(i).left = null;
            arr.get(i).right = arr.get(i+1);
        }
        arr.get(arr.size()-1).left = null;
        arr.get(arr.size()-1).right = null;
        return arr.get(0);
    }
    public void inorder(TreeNode root, ArrayList<TreeNode> arr)
    {
        if (root==null) return;
        inorder(root.left,arr);
        arr.add(root);
        inorder(root.right,arr);
    }
}