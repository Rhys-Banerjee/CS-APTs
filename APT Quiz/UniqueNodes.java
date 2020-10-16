import java.util.*;
public class UniqueNodes {
    public int sum(ListNode list) {
        ListNode first = list;
        ListNode last = first;
        ArrayList<Integer> raw = new ArrayList<Integer>();
        while(last != null){
            if(!raw.contains(last.info)){
                raw.add(last.info);
            }
            last = last.next;
        }
        int bruhcumulator = 0;
        for(int i=0;i<raw.size();i++){
            bruhcumulator += raw.get(i);
        }
    return bruhcumulator;
    }
}