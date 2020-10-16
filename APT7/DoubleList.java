public class DoubleList {
    public ListNode bigify(ListNode list) {
        if(list == null) return null;
        ListNode afterMe = bigify(list.next);
        list.next = new ListNode(list.info,afterMe);
        return list;
    }
}