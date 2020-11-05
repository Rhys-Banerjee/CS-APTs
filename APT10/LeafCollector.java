import java.util.*;
public class LeafCollector {
    ArrayList<String> raw = new ArrayList<>();
    public String[] getLeaves(TreeNode tree) {
        
        collectAndReplace(tree, raw);
        if (tree.left != null) getLeaves(tree.left);
        if (tree.right != null) getLeaves(tree.right);
        String[] ret = new String[raw.size()];
        for(int i=0;i<raw.size();i++){
            ret[i] = raw.get(i);
        }
        return ret;
    }

    private void collectAndReplace(TreeNode t, ArrayList<String> raw) {
        
        if(isBranch(t)){
            raw.add(""+t.info);
            t = null;
        }
    }

    private boolean isBranch(TreeNode t) {
        if (t == null) return false;
        if (t.left == null && t.right == null) return true;
        isBranch(t.left);
        isBranch(t.right);
        return false;
    }
}