public class recsubseq {
    public static void subseq(String ostr, int idx, String nstr) {
        if (idx==ostr.length()) {
            System.out.println(nstr);
            return;
            
        }
        char curchar = ostr.charAt(idx);
        //to be
        subseq(ostr, idx+1, nstr+curchar);
        //or not to be
        subseq(ostr, idx+1, nstr);
        
    }
    public static void main(String[] args) {
        String ostr = "abx";
        subseq(ostr, 0, "");
    }
}
