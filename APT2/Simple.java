import java.util.*;
public class Simple {
    public static String[] combineB(String[] a, String[] b){
        String[] ret = new String[a.length + b.length];
        int index = 0;
        for(String s : a) {
            ret[index] = s;
            index += 1;
        }
        for(String s : b) {
            ret[index] = s;
            index += 1;
        }
        return ret;
    }
    public static void main(String[] args) {
        String[] a = {"ant", "cat", "dog"};
        String[] b = {"elf", "fig", "gum", "hog"};
        String[] c2 = combineB(a,b);
        System.out.println(Arrays.toString(c2));
    }
}