public class PairDown {
    public int[] fold(int[] list) {
        int[] ret = new int[((list.length+1)/2)];
        int acc = 0;
        for(int i=0;i<list.length;i=i+2){
            if(i+1 >= list.length){
                ret[acc] = list[list.length-1];
            }else{
                ret[acc] = list[i] + list[i+1];
                acc += 1;
            }
        }
        return ret;
    }
}