import java.util.*;
public class LeafCollector1 {
    public String[] getLeaves(TreeNode tree) {
        ArrayList<String> raw = new ArrayList<>();
        if(tree == null){
            String[] ret = new String[0];
            return ret;
        }
        addAndReplace(tree, raw);
        if(tree.left != null) getLeaves(tree.left);
        if(tree.right != null) getLeaves(tree.right);

        String[] ret = new String[raw.size()];
        for(int i=0;i<raw.size();i++){
            ret[i] = raw.get(i);
        }
        return ret;
    }

    private void addAndReplace(TreeNode tree, ArrayList<String> raw){
        if ( tree.left == null && tree.right == null){
            raw.add(""+tree.info);
            tree = null;
        }
        if(isLeaf(tree.left)){
            raw.add(""+tree.left.info);
            tree.left = null;
        }
        if(isLeaf(tree.right)){
            raw.add(""+tree.right.info);
            tree.right = null;
        }
    }

    private boolean isLeaf(TreeNode root) {
        if(root == null) return false;
        if (root.left == null && root.right == null) return true;
        isLeaf(root.left);
        isLeaf(root.right);
        return false;
    }

}
