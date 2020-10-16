
public class SoccerLeagues {
    public int[] points(String[] matches) {
        int[] ret = new int[matches.length];
        for(int i=0;i<matches.length;i++){
            int acc = 0;
            String[] matchesArray = matches[i].split("");
            for(String results : matchesArray){
                if (results.equals("W")){
                    acc += 3;
                }
                if (results.equals("D")){
                    acc += 1;
                } 
            }
            for(String away:matches){
                String[] awayArray = away.split("");
                if(awayArray[i].equals("L")){
                    acc += 3;
                }
                if(awayArray[i].equals("D")){
                    acc += 1;
                }
            }
            ret[i] = acc;
        }
        
        return ret;
    }
}