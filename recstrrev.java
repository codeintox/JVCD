import java.util.*;
public class recstrrev {
    public static void strrev(String str, int idx) {
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        strrev(str, idx-1);
        
    }
    public static void main(String[] args) {
    String str = "rana";
    strrev(str, str.length()-1);        
    }
}
