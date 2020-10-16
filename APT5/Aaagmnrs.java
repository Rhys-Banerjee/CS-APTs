import java.util.*;
public class Aaagmnrs {
    public class Ana implements Comparable<Ana>{
        public String word;
        public String sortedWord;
        public Ana(String s){
            word = s;
            char[] chars = s.toLowerCase().toCharArray();
            Arrays.sort(chars);
            sortedWord = new String(chars).trim();
        }
        public int compareTo(Ana o) {
            return sortedWord.compareTo(o.sortedWord);
        }
        public boolean equals(Object o){
            Ana other = (Ana) o;
            return word.equals(other.word);
        }
        public int hashCode(){
            return sortedWord.hashCode();
        }
    }
    public String[] anagrams(String[] phrases) {
        ArrayList<String> unique = new ArrayList<String>();
        Set<Ana> set = new TreeSet<Ana>();
        for(String s : phrases){
            Ana a = new Ana(s);
            if (! set.contains(a)) {
                set.add(a);
                unique.add(s);
            }
        }
        return unique.toArray(new String[0]);
    }
 }