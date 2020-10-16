import java.util.ArrayList;

public class Encryption {
    public String encrypt(String message){
        String empty = "";
        String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int acc = 0;
        ArrayList<Character> mess = new ArrayList<>();
        ArrayList<Character> ugh = new ArrayList<>();

        for(int i=0;i<message.toCharArray().length;i++){
            char[] bruh = message.toCharArray();
            if(!mess.contains(bruh[i])){
                empty += abc[acc];
                acc += 1;
            }else{
                char ok = bruh[i]; //a
                int right = mess.indexOf(ok); //
                empty += empty.charAt(right);
            }
            mess.add(bruh[i]);
            ugh.add(empty.charAt(i));
        }
        return empty;
    }

}