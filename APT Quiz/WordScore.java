import java.util.ArrayList;

public class WordScore {
    public int[] score(String[] words, String want, String avoid) {
        int[] ret = new int[words.length];
        ArrayList<String> want_list = new ArrayList<String>();
        ArrayList<String> avoid_list = new ArrayList<String>();
        for(int i=0; i<want.length(); i++) {
            want_list.add((want.split("")[i]));
        }
        for(int k=0; k<want.length(); k++) {
            avoid_list.add((avoid.split("")[k]));
        }
        for(int x=0; x<words.length; x++){
            String[] w = words[x].split("");
            int bruhcumulator = 0;
            for(String s:w){
                if (want_list.contains(s)){
                    bruhcumulator += 1;
                }
                if(avoid_list.contains(s)){
                    bruhcumulator -= 1;
                }
            }
            ret[x] = bruhcumulator;
        }
        return ret;
    }
}