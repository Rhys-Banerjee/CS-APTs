import java.util.*;
public class LeafCollector {
    List<String> list = new ArrayList<String>();
    public String[] getLeaves(TreeNode tree) {
        if(tree != null){
            while(!isLeaf(tree)) {
                List<String> temp = new ArrayList<String>();
                collectAndReplace(tree, temp);
                list.add(String.join(" ",temp));
            }
            list.add(""+tree.info);
        }
        return list.toArray(new String[0]);
    }

    private void collectAndReplace(TreeNode t, List<String> temp) {
        if (isLeaf(t.left)) {
            temp.add("" + t.left.info);
            t.left = null;
        } else if (t.left != null)
            collectAndReplace(t.left, temp);
        if (isLeaf(t.right)) {
            temp.add("" + t.right.info);
            t.right = null;
        } else if (t.right != null)
            collectAndReplace(t.right, temp);
    }

    private boolean isLeaf(TreeNode t) {
        if(t != null && t.left == null && t.right == null) return true;
        else return false;
    }
}