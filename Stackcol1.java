import java.util.*;
public class Stackcol1 {
    public static void insrtBtm(Stack<Integer> ls,int m){
        if(ls.isEmpty()){
            ls.push(m);
            return;
        }
        int top = ls.pop();
        insrtBtm(ls,m);
        ls.push(top);
    }
    public static void reverse(Stack<Integer> ls){
        if(ls.isEmpty()){
            return;
        }
        int top = ls.pop();
        reverse(ls);
        insrtBtm(ls, top);
    }
     

    public static void main(String[] args) {
        Stack<Integer> ls = new Stack<>();
        ls.push(7);
        ls.push(6);
        ls.push(4);
        insrtBtm(ls,3);
        reverse(ls);
        while(!ls.isEmpty()){
            System.out.println(ls.peek());
            ls.pop();
            
        }
        
    }
}

