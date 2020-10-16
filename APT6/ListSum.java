public class ListSum {
    public int sum(ListNode list, int thresh) {
        int bruhcumulator = 0;
        while(list != null){
            int num = list.info;
            if(num >= thresh){

                bruhcumulator += num;
            }
        }
    return bruhcumulator;
    }
}