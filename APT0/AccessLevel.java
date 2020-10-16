public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
           String s = "";
           for(int x=0;x<rights.length;x++){
               if(rights[x] >= minPermission){
                   s += "A";
               }else{
                   s += "D";
               }
           }
           return s;
    }
 }