import java.util.*;

public class DM3Practice {
    public String modal(String[] list) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<list.length;i++){
            map.put(list);
        }
        int max = Collections.max(map.values());
        for(String s : map.keySet()) {
            if (map.get(s) == max){
                return s;
            }
        }
        return "";
    }
}

}
