import java.util.*;
public class Pangram {
    public String[] find(String[] phrases){
        ArrayList<String> retRaw = new ArrayList<>();
        for(String s : phrases){
            if(isPanagram(s)){
                retRaw.add(s);
            }
        }
        Collections.sort(retRaw);
        String[] ret = new String[retRaw.size()];
        for(int i=0;i<retRaw.size();i++){
            ret[i] = retRaw.get(i);
        }
        return ret;
    }

    private boolean isPanagram(String s) {
        s = s.replaceAll("\\s", "");
        ArrayList<String> s_raw = new ArrayList<>();
        ArrayList<String> s_unique = new ArrayList<>();
        ArrayList<String> alpha = new ArrayList<>();
        String[] alphabet = {"a","b","c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for(String c : alphabet){
            alpha.add(c);
        }
        for(int i=0;i<s.length();i++){
            s_raw.add((s.toLowerCase().split(""))[i]);
        }
        for(String k : s_raw){
            if(!s_unique.contains(k)){
                s_unique.add(k);
            }
        }
        Collections.sort(s_unique);
        if(s_unique.equals(alpha)){
            return true;

        }
        return false;
    }
}