public class PathSum {
    public int hasPath(int target, TreeNode tree){
        if(tree == null) return 0;
        int new_val = target - tree.info;
        if(new_val == 0 && tree.left == null && tree.right == null) return 1;
        int left = hasPath(new_val, tree.left);
        int right = hasPath(new_val, tree.right);
        if(left == 1 || right == 1) return 1;
        return 0;
    }
}