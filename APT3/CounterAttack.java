import java.util.ArrayList;

public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        String[] str_lst = str.split(" ");
        ArrayList<Integer> ret = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int acc = 0;
            for(int k=0;k<str_lst.length;k++){
                if(words[i].equals(str_lst[k])){
                    acc += 1;
                }
            }
            ret.add(acc);
        }
        
        int[] hey = new int[ret.size()];
        for(int i=0;i<ret.size();i++){
            hey[i]=ret.get(i);
        }
        return hey;
    }
}