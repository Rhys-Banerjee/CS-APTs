import java.util.*;
public class LeafCollector2 {
    ArrayList<String> huh = new ArrayList<>();
    private int height(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public String[] getLeaves(TreeNode tree) {
        int height = (height(tree)); 
        StringBuilder str = new StringBuilder();
        if(tree == null){
            String[] ret = new String[0];
            return ret;
        }
        if(tree.left == null && tree.right == null){
            String[] ret = new String[1];
            ret[1] = String.valueOf(tree.info);
            return ret;
       }
       if(tree.left != null && tree.right == null){
           tree = (addAndReplace(tree.left, height, str));
           huh.add(str.toString());
           getLeaves(tree.left);
           getLeaves(tree.right);
           String[] ret = new String[huh.size()];
           for(int i=0; i<huh.size(); i++){
               ret[i] = huh.get(i);
           }
           return ret;
       }
       if(tree.right != null && tree.left == null){
        tree = (addAndReplace(tree.right, height, str));
        huh.add(str.toString());
        getLeaves(tree.left);
        getLeaves(tree.right);
        String[] ret = new String[huh.size()];
        for(int i=0; i<huh.size(); i++){
            ret[i] = huh.get(i);
        }
        return ret;
    }
        
       tree = (addAndReplace(tree.left, height, str));
       tree = (addAndReplace(tree.right,height, str));
       huh.add(str.toString());
       getLeaves(tree.left);
       getLeaves(tree.right);
       String[] ret = new String[huh.size()];
       for(int i=0; i<huh.size(); i++){
           ret[i] = huh.get(i);
       }
       return ret;
    }

    private TreeNode addAndReplace(TreeNode t, int height, StringBuilder str){
        if(t == null) return null;
        if(isLast(t)){
            str.append(t.info);
            
            t = null;
        }

        return t;
    }

    private boolean isLast(TreeNode t) {
            if(t.left == null && t.right == null) return true;
            return false;
        }
    }
