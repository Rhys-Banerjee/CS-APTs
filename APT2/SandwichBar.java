import java.util.HashSet;
import java.util.ArrayList;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
       for(int k=0; k<orders.length;k++){
           if(canMake(orders[k],available)){
               return k;
           }
       }
       return -1; 
    }

    private boolean canMake(String string, String[] available) {
        String[] want_list = string.split(" ");
        ArrayList<String> want_list2=new ArrayList<String>();
        ArrayList<String> available_list=new ArrayList<String>();
        for(int i=0; i<want_list.length; i++){
            if(! want_list2.contains(want_list[i])) {
                want_list2.add(want_list[i]);
            }
        }
        for(int i=0; i<available.length; i++){
            if(!available_list.contains(available[i])) {
                available_list.add(available[i]);
            }
        }
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < want_list2.size(); i++)
		{
			for (int j = 0; j < available_list.size(); j++)
			{
				if(want_list2.get(i).equals(available_list.get(j)))
				{
					set.add(want_list2.get(i));
				}
            }
        }
        if(set.size() == want_list2.size()){
            return true;
        }
        return false;
    }
 }