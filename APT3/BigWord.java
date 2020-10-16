import java.util.*;

public class BigWord {
    public String most(String[] sentences) {
        ArrayList<String> raw = new ArrayList<>();
        for(int i=0;i<sentences.length;i++){
            String[] str_lst = sentences[i].split(" ");
            for(int k=0;k<str_lst.length;k++){
                raw.add(str_lst[k].toLowerCase());
            }
        }
        ArrayList<Integer> count = new ArrayList<>();
        int max = 0;
        int freq = 0;
        Set<String> unique = new HashSet<String>(raw);
        String max_val = null;
        for(String key : unique){
            freq = Collections.frequency(raw, key);
            if(max < freq){
                max = freq;
                max_val = key;
            }
        }

        return max_val;
    }
}