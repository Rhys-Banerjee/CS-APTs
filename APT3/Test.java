import java.util.*;
class Test {
    public static void main(String[] args){
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        String[] list = {"A","A","A"};
        
        for(String c : list){
            map.putIfAbsent(c, new ArrayList<>());
            map.get(c).add("foo");   
        }
        System.out.println(list.toString());
    }
}
