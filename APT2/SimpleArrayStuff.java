import java.util.*;
public class SimpleArrayStuff {
        public static void main(String[] args){
            String[] a = {"ant", "bat", "cat", "dog"};
            String[] b = {"elf", "fig", "gym", "hat"};
            ArrayList<String> list = new ArrayList<>();
            for(int k=0; k<a.length; k++){
                list.add(a[k]);
                list.add(b[k]);
            }
            System.out.println(list);
        }
    }
