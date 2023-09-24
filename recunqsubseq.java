import java.util.HashSet;

public class recunqsubseq {
    public static void unqsubseq(String ostr, int idx, String nsrt,HashSet<String> allsubseq){
        if(idx==ostr.length()){
            if(allsubseq.contains(nsrt)){
                return ;
            }
            else{
                System.out.println(nsrt);
                allsubseq.add(nsrt);
                return ;
            }

        }
        //choose
        unqsubseq(ostr, idx+1, nsrt+ostr.charAt(idx), allsubseq);
        //don't choose
        unqsubseq(ostr, idx+1, nsrt, allsubseq);
    }
        
    
    public static void main(String[] args) {
        String ostr = "sss";
        HashSet<String> allsubseq = new HashSet<>();
        unqsubseq(ostr, 0, " ", allsubseq);
    }
}
