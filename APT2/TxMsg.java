import java.util.*;

public class TxMsg {
    private boolean isVowel(char c) {
        if (c=='a' || c=='e' || c =='i' || c=='o' || c=='u') {
            return true;
        }
        return false;
    }
    public String getMessage(String original) {
        ArrayList<String> VowelorNot=new ArrayList<String>();
        String[] original0 = original.split(" ");

        for(int i=0;i<original.length();i++){
          if(isVowel(original.charAt(i))){
              VowelorNot.add("VOWEL");
            }
          
          }

        if(Collections.frequency(VowelorNot,"VOWEL")==original.length()){
            return original;
        }

        StringBuilder ret_val = new StringBuilder();
        for(int i=0;i<original0.length; i++){
            int count=0;
            for(int k=0;k<original0[i].length(); k++) {
                if(isVowel(original0[i].charAt(k))){
                    count += 1;
                }
                if(original0[i].length()==count){
                    ret_val.append(original0[i]);
                }else{
                    StringBuilder temp = new StringBuilder();
                    if(k == 0 && !isVowel(original0[i].charAt(0))){
                        temp.append(original0[i].charAt(0));
                    }else if(k > 0 && !isVowel(original0[i].charAt(k)) && isVowel(original0[i].charAt(k-1))){
                        temp.append(original0[i].charAt(k));
                    }
                    ret_val.append(temp.toString());

                }
                
            }
            ret_val.append(" ");
        }
        ret_val.setLength(ret_val.length() - 1);
        return ret_val.toString();
    }
 }