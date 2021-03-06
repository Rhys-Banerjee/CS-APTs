import java.util.*;
public class LeafCollector2 {
    ArrayList<String> raw = new ArrayList<>();
    public String[] getLeaves(TreeNode tree) {
        collectAndReplace(tree, raw);
        
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
        }else{
            raw.add("");
        }
        if(t.left != null) collectAndReplace(t.left, raw);
        if(t.right != null) collectAndReplace(t.right, raw);
    }

    private boolean isBranch(TreeNode t) {
        if (t == null) return false;
        if (t.left == null && t.right == null) return true;
        isBranch(t.left);
        isBranch(t.right);
        return false;
    }
}
