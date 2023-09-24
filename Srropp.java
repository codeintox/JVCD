import java.util.*;
public class Srropp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("liver");
        
        for(int i=0; i<sb.length()/2; i++){
        int front = i;
        int back = sb.length() - i - 1;
        
        Char frontChar = sb.charAt(front), backChar = sb.charAt(back);
         
        
        sb.setCharAt(front, backchar);
        sb.setCharAt(back, frontchar);
        
    }
    System.out.println(sb);
}
}