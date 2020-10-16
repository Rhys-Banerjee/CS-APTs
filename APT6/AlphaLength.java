import java.util.*;

public class AlphaLength {
    public ListNode create (String[] words) {
        ArrayList<String> alphalist = new ArrayList<String>();
        for(String s : words){
            if(!alphalist.contains(s)){
                alphalist.add(s);
            }
        }
        Collections.sort(alphalist);
        ArrayList<Integer> count = new ArrayList<>();
        for(int i=0;i<alphalist.size();i++){
            count.add(alphalist.get(i).length());
        }
        ListNode first = new ListNode(count.get(0),null);
        ListNode list = first;

        for(int i=1;i<count.size();i++){
            list.next = new ListNode(count.get(i),null);
            list = list.next;
        }
    return first;
    }
}