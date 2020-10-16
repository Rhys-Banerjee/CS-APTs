import java.util.*;

public class DM3 {
    public String maxKey(HashMap<String,ArrayList<String>> map) {
        int max = 0;
        String ret = null;
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if(map.get(value).size()>max){
                max = map.get(value).size();
                ret = key;
            }
        }

        return ret;
    }
    public static HashMap<Integer,HashSet<String>> getWords(Scanner s) {
        HashMap<Integer,HashSet<String>> map = new HashMap<>();
        while (s.hasNext()) {
            String word = s.next();
            int len = word.length();
            if(! map.containsKey(len)){
                map.put(len, null);
                map.get(len).add(word);
            }
        }
        return map;
    }

}
