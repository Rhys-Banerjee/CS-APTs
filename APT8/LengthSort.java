import java.util.*;

public class LengthSort {
    public String[] rearrange(String[] values){
        Arrays.sort(values);
        Arrays.sort(values, new java.util.Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();// comparision
            }
        });
        return values;
    }
}