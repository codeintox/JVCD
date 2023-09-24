public class recrmalph {
    public static boolean map = new boolean[26];
    public static void rmalph(String ostr, int idx, String nstr) {
        char curchar = ostr.charAt(idx);
        if(idx == ostr.length()){
            System.out.println(nstr);
            return;
        }
        if(map[curchar - 'a']){
            rmalph(ostr, idx+1, nstr);
        }
        else{
            nstr += curchar;
            map[curchar - 'a'] = true;
            rmalph(ostr, idx+1, nstr);
        }
        
    }
       public static void main(String[] args) {
        String ostr = "ajajsers";
        rmalph(ostr, 0, "");
       }
    }