public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
       long ret = 0;
       for(int i=0;i<sizes.length;i++){
            if(sizes[i]>clusterSize){
                if(sizes[i]%clusterSize == 0){
                    ret += clusterSize*(sizes[i]/clusterSize);
                }else{
                    ret += ((sizes[i]/clusterSize)+1)*clusterSize;
                }
            }
            else{
                if(sizes[i] == 0){
                    ret += 0;
                }
                else{
                ret += clusterSize;
                }
            }
       }
       return ret;
    }
 }