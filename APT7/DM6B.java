public class DM6B {
    public static ListNode reverseAppend(ListNode list){
        ListNode ret = list;
        ListNode last = list;
        while(last.next != null){
            last = last.next;
        }
        while(list != last.next){
            last.next = new ListNode(last.info, new ListNode(ret.next.info));
            System.out.println("list is " + list.info);
            list = list.next;
        }
        return ret;
    }

    public static ListNode insert(ListNode list, ListNode add, int n){
        ListNode ret = list;
        int count = 0;
        while(count < n) {
            list = list.next;
            count += 1;
        }
        ListNode temp = add;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = list.next;
        list.next = add;
        return ret;
    }

    public static void main(String[] args){
        ListNode list = new ListNode(2, new ListNode(3));
        ListNode twothree = new ListNode(2, new ListNode(5));
        //int test = sum(example);
        ListNode ex = reverseAppend(new ListNode(1, new ListNode(2, new ListNode(3))));
        //ListNode ex = reverseAppend(list);
        //ListNode two = something(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        
        while(ex != null){
            System.out.println(ex.info);
            ex = ex.next;
        }
        //System.out.println(ex);
    }
}
