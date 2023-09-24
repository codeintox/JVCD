//Stack using Collection Framework
import java.util.Stack;
public class Stackcol {
    public static void main(String[] args) {
        
    
    Stack<Integer> list = new Stack<>();
    list.push(4);
    list.push(6);
    list.push(8);
    list.push(0);
    while(!list.isEmpty()){
        System.out.println(list.peek());
        list.pop();
    }
    
    
}
}
