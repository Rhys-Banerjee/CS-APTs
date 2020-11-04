public class HeightLabel {
    private int height(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public TreeNode rewire(TreeNode t) {
        if(t == null) return null;
        if(t.left == null && t.right == null) return new TreeNode(1,null,null);
        TreeNode ret = new TreeNode(height(t),rewire(t.left),rewire(t.right));
        return ret;
    }
}