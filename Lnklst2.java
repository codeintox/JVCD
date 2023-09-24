import java.util.Collections;
import java.util.LinkedList;

class Lnklst2{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("THIS");
        list.add("IS");
        list.add("ME");
        list.add(2,"THE");
        list.addLast("DURGAPUR");
        list.addFirst("HI");
        System.out.println(list);
        System.err.println(list.get(5));
        Collections.reverse(list);
        System.out.println(list);
        
    }
}