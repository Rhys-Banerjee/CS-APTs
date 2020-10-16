import java.util.*;
public class RemoveMin {
    public ListNode remove (ListNode list) {
        if(list.next == null || list == null) return null;
        ArrayList<Integer> raw = new ArrayList<>();
        ArrayList<Integer> sorted = new ArrayList<>();
        ArrayList<Integer> wom = new ArrayList<>();
        while(list != null){
            raw.add(list.info);
            sorted.add(list.info);
            list = list.next;
        }
        Collections.sort(sorted);
        for(int k=0; k<sorted.size();k++){
            if(raw.get(k) != sorted.get(0)){
                wom.add(raw.get(k));
            }
        }
        ListNode first = new ListNode(wom.get(0),null);
        ListNode last = first;
        for(int b=1;b<wom.size();b++){
            last.next = new ListNode(wom.get(b),null);
            last = last.next;
        }
    return first;
    }
}