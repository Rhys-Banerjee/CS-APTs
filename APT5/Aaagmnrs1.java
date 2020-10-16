import java.util.*;
public class Aaagmnrs1 {
    
    public String[] anagrams(String[] phrases) {
        ArrayList<String> ret = new ArrayList<String>();
        for(int  i=0;i<phrases.length;i++){
            if(! isAnagram(phrases[i],ret)){
                ret.add(phrases[i]);
            }
        }
        Collections.sort(ret);
        String res[] = ret.toArray(new String[ret.size()]);
        return res;
    }
    private String sortString(String str) { 
        char []arr = str.toCharArray(); 
        Arrays.sort(arr); 
        return ((String.valueOf(arr)).replaceAll("\\s", "")); 
    }
    private boolean isAnagram(String string, ArrayList<String> ret) {
        ArrayList<String> blah = new ArrayList<String>();
        String sring = string.toLowerCase();
        string = sring.replaceAll("\\s", "");
        for(int i=0;i<ret.size();i++){
            String hey = sortString(ret.get(i));
            String bruv = hey.replaceAll("\\s", "");
            blah.add(bruv.toLowerCase());
        }
        for(String s : blah){
            if(sortString(string).equals(s)){
                return true;
            }
        }
        return false;
    }
 }