public class TotalLetterCount {
    public int total(String[] words, String letter) {
        int accumulator = 0;
        for(int k=0; k<words.length; k ++){
            for(int i=0;i<words[k].length();i++){
                if(words[k].charAt(i) == letter.charAt(0)){
                    accumulator += (k);
                }
            }
        }
        return accumulator;
    }
}