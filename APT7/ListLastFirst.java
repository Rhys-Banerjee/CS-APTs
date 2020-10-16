public class ListLastFirst {
    public ListNode move(ListNode list) {
        if(list.next == null || list == null) return list;
        ListNode first = list;
        ListNode minus = list;
        list = list.next;
        while(list.next != null){
            minus = list;
            list = list.next;
        }
        minus.next = null;
        list.next = first;
        return list;

    }
}