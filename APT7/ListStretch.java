public class ListStretch {
    ListNode myLast;
    public ListNode stretch (ListNode list, int amount){
        if (list == null) return null;
        ListNode first = nlist(list.info, amount);
        ListNode last = myLast;
        last.next = stretch(list.next, amount);
        return first;
    }

    private ListNode nlist(int val, int n) {
        ListNode first = new ListNode(val);
        ListNode last = first;
        for(int i=0;i<n-1;i++){
            last.next = new ListNode(val);
            last = last.next;
        }
        myLast = last;
        return first;
    }
}