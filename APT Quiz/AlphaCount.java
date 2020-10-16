import java.util.*;
public class AlphaCount {
    public int[] sizing(String[] words) {
        ArrayList<String> unique = new ArrayList<String>();
        ArrayList<String> raw = new ArrayList<String>();
        ArrayList<Integer> retRaw = new ArrayList<Integer>();
        for(String z : words){
            raw.add(z);
        }
        for(String s: words){
            if(!unique.contains(s)){
                unique.add(s);
            }
        }
        Collections.sort(unique);
        for(int i=0; i<unique.size();i++){
            retRaw.add(Collections.frequency(raw, unique.get(i)));
        }
        int[] ret = new int[retRaw.size()];
        for(int b=0;b<retRaw.size();b++){
            ret[b] = retRaw.get(b);
        }
        return ret;
    }
}