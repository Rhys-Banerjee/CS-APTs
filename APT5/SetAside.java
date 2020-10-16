import java.util.*;
public class SetAside {
    public String common(String[] list) {
        TreeSet<String> common = new TreeSet<>(Arrays.asList(list[0].split(" ")));
        for(String s : list) {
            if(!s.equals(list[0])) {
                TreeSet<String> compare = new TreeSet<>(Arrays.asList(s.split(" ")));
                common.retainAll(compare);
            }
        }
        String ret = String.join(" ", common);
        return ret;
    }
}