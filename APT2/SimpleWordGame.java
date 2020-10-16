import java.util.ArrayList;

public class SimpleWordGame {
    public int points(String[] player, 
                      String[] dictionary) {
        ArrayList<String> player_list=new ArrayList<String>();
        ArrayList<String> dictList=new ArrayList<String>();
        for(int i=0; i<player.length; i++){
            if(! player_list.contains(player[i])) {
                player_list.add(player[i]);
            }
        }
        for(int i=0; i<dictionary.length; i++){
            if(! dictList.contains(dictionary[i])) {
                dictList.add(dictionary[i]);
            }
        }
        player_list.retainAll(dictList);
        
        if(player_list.size() > 0){
            int ret = 0;
            for(int i=0; i<player_list.size();i++){
                int res = player_list.get(i).length()*player_list.get(i).length();
                ret = ret + res;
            }
            return ret;
        }
        return 0;

    }
}