import java.util.*;

public class TxTsg {
    private boolean isVowel(char c) {
        if (c=='a' || c=='e' || c =='i' || c=='o' || c=='u') {
            return true;
        }
        return false;
    }

    
    public String getMessage(String original) {
        
        String[] original0 = original.split(" ");
        ArrayList<String> original1=new ArrayList<String>();
        for(int i=0; i<original0.length; i++){
            original1.add(original0[i]);
        }
        
        ArrayList<String> ret= new ArrayList<String>();
        ArrayList<String> VowelorNot=new ArrayList<String>();
        for(int i=0;i<original.length();i++){
          if(isVowel(original.charAt(i))){
              VowelorNot.add("VOWEL");
            }
          
          }

          if(Collections.frequency(VowelorNot,"VOWEL")==original.length()){
            return original;
          }
          for(int i=0;i<original1.size();i++){
            if(allVowels(original1.get(i))){
                ret.add(original1.get(i));
            }
            else{
                //String fin = new String();
                //ArrayList<String> fin= new ArrayList<String>();
                for(int k=1;k<((original1.get(i)).length()-1);k++){
                    ArrayList<String> word = new ArrayList<String>();
                    if(! isVowel(original1.get(i).charAt(0))){
                        word.add(original1.get(i).charAt(0), original1.get(i)); // problem line
                    }
                    if(! isVowel(original1.get(i).charAt(k)) && isVowel(original1.get(i).charAt(k-1))){
                        word.add(original1.get(i).charAt(k), original1.get(i)); //problem line
                    }
                    StringBuilder sb = new StringBuilder();
                    for (String s : word){
                        sb.append(s);
                    }
                    String finword = sb.toString(); 
                    ret.add(finword);
                }

                
            }
          }
          StringBuilder ret_val = new StringBuilder();
                for (String s : ret){
                    ret_val.append(s);
                    ret_val.append("\t");
                }
        return ret_val.toString();
    }

    private boolean allVowels(String string) {
        ArrayList<String> VowelorNot=new ArrayList<String>();
        for(int i=0;i<string.length();i++){
            if(isVowel(string.charAt(i))){
                VowelorNot.add("VOWEL");
            }
        }
        if(VowelorNot.size()==string.length()){
            return true;
        }
        return false;
    }
      
}
 