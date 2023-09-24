//Token delimiter,String Tokenizer
//StringTokennizer class is used to split a string into different Tokens/Parts by defined delimiter.
//Space is the default delimiter.
//Stringtokenizer is a Legacy Class.
//StringTokenizer returns one token at a time.
import java.util.*;
public class tkndel {
 public static void main(String[] args) {
    String str = "This is ,Java Programming, Language";
    StringTokenizer st = new StringTokenizer(str, " ",true);
    //String ss = st.nextToken();
    System.out.println(st.countTokens());
    while(st.hasMoreTokens()){
        System.out.println(st.nextToken(","));
       
    }
 }   
}
