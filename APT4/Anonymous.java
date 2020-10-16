public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        String all = "";
        for (String s : headlines){
            all += s.toLowerCase();
        }
        int count = 0;
        for(String message : messages){
            if(make(message.toLowerCase(),all)){
                count += 1;
            }
        }
        return count;

    }
    private boolean make(String message, String headline){
        for(char ch = 'a'; ch <= 'z'; ch+=1){
            int messageCount = count(message,ch);
            int headlineCount = count(headline,ch);
            if(messageCount > headlineCount){
                return false;
            }
        }
        return true;
    }

    private int count(String headline, char ch) {
        int count = 0;
        for (char c : headline.toCharArray()){
            if (c==ch){
                count += 1;
            }
        }
        return count;
    }

 }