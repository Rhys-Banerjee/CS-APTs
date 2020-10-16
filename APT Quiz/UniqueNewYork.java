import java.util.*;
public class UniqueNewYork {
    public int seen(String[] records) {
        int bruhcumulate = 0;
        ArrayList<String> raw = new ArrayList<>();
        for(int i=0;i<records.length;i++){
            String[] val = records[i].split(",");
            for(String s : val){
                if(!raw.contains(s)){
                    raw.add(s);
                }
            }
            
        }
        for(int k=0;k<raw.size();k++){
            bruhcumulate += 1;
        }
        return bruhcumulate;
    }
}