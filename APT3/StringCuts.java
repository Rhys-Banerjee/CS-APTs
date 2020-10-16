import java.util.*;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        ArrayList<String> ret = new ArrayList<>();
        int amount = 0;
        for(int i=0; i<list.length;i++){
            if(list[i].length() >= minLength && !ret.contains(list[i])){
                ret.add(list[i]);
                amount += 1;
            }
        }

        String[] hey = new String[amount];
        for(int i=0;i<amount;i++){
            hey[i]=ret.get(i);
        }
        return hey;
    }
    
}