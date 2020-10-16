import java.util.*;

public class Closet {
    public String anywhere(String[] list) {
        ArrayList<String> wow = new ArrayList<>();
        for(int i=0;i<list.length;i++){
            String[] elements = list[i].split(" ");
            for(int k=0;k<elements.length;k++) {
                if(! wow.contains(elements[k])){
                    wow.add(elements[k]);
                }
            }
        }
        Collections.sort(wow);
        String ret = "";
        for(String s : wow){
            ret += s + " ";
        }
        ret = ret.trim();
        return ret;
    }
}
