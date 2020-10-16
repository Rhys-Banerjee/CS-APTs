public class ListCount {
    public int count (ListNode list) {
        int bruhcumulator = 0;
        while(list != null){
            bruhcumulator += 1;
            list = list.next;
        }
    return bruhcumulator;
    }
}