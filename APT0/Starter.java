import java.util.Collections;
import java.util.*;
public class Starter {
    public int begins(String[] words, String first) {
        int ret = 0;
        ArrayList<String> list=new ArrayList<String>();
        for(int v=0;v<words.length;v++){
            if(! list.contains(words[v])){
                list.add(words[v]);
            }
        }

        for(int i=0;i<list.size();i++){
            String word = list.get(i);
            if(word.substring(0,1).equals(first)){
                ret +=1;
            }
        } 
        return ret;
    }
}