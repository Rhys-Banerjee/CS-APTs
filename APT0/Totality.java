public class Totality {
    public int sum(int[] a, String stype) {
        if(stype.equals("odd")){
            int ret = 0;
            for(int i=1;i<a.length; i = i+2){
                ret += a[i];
            }
            return ret;
        }else if(stype.equals("all")){
            int ret = 0;
            for(int i=0;i<a.length;i++){
                ret += a[i];
            }
            return ret;
        }else{
            int ret = 0;
            for(int i=0;i<a.length; i=i+2){
                ret += a[i];
            }
            return ret;
        }
    }
    
}