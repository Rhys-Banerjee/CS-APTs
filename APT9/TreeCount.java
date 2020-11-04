public class TreeCount {
    public int count(TreeNode tree) {
        if(tree == null) return 0;
        int c = 1;
        if(tree.left != null) c += (count(tree.left));
        if(tree.right != null) c += (count(tree.right));
        return c;
    }
}

