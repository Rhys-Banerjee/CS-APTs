import java.util.*;

public class UniqueTreeValues {
        public int[] unique(TreeNode root) {
            TreeSet<Integer> raw = new TreeSet<>();
            inOrder(root, raw);
            int[] ret = new int[raw.size()];
            int acc = 0;
            for(Integer s : raw){
               ret[acc] = s;
               acc ++; 
            }
            return ret;
        }

        private void inOrder(TreeNode root, TreeSet<Integer> raw) {
            if(root!=null){
                raw.add(root.info);
                inOrder(root.left, raw);
                inOrder(root.right, raw);
            }
        }
    }