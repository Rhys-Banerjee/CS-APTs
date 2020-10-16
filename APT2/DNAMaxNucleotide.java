public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
          String ret = "";
          int max = 1;
          for(String s : strands) {
              int nc = count(s,nuc);
              if(nc > max ||
              (nc == max && s.length() > ret.length())){
                  ret = s;
                  max = nc;
              }
          }
          return ret;

    }

	private int count(String s, String nuc) {
        int t = s.length() - s.replace(nuc,"").length();
        return t;
	}
 }