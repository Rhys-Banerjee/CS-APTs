import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;





public class SortByFreqs {
    public String[] sort(String[] data) {
        
        TreeMap<String, Integer> map = new TreeMap<String,Integer>();
        for(String s : data){
           if (map.containsKey(s)) {
               map.put(s,map.get(s) + 1);
           }
           else {
               map.put(s,1);
           }
        }
      
        ArrayList<WordPair> list = new ArrayList<WordPair>();
        for(String s : map.keySet()) {
            list.add(new WordPair(s,map.get(s)));
        }
        Collections.sort(list);
        String[] ret = new String[list.size()];
        for(int k = 0; k < list.size(); k += 1){
            ret[k] = list.get(k).myWord;
        }
        return ret;
    }
    
    private class WordPair implements Comparable<WordPair> {
        String myWord;
        int myCount;
        public WordPair(String s, int c){
            myWord = s;
            myCount = c;
        }
        public int compareTo(WordPair wp) {
            // TODO Auto-generated method stub
            int diff = myCount - wp.myCount;
            if (diff == 0){
                return myWord.compareTo(wp.myWord);
            }
            return -diff;
        }
       
        
    }
}