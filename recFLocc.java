public class recFLocc {
    public static int first = -1;
    public static int last = -1;
    public static void occ(String str, int idx, char ch){
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return ;
            
        }
        char curchar = str.charAt(idx);
        if(curchar == ch){
            if (first==-1) {
                first = idx;
                
            }else{
                 last = idx ;
            }
            
        }
        occ(str, idx+1, ch);
    }

public static void main(String[] args) {
    String str = "axdvdxxrxp";
    occ(str, 0, 'x');
    
}
}

