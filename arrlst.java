import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class arrlst {
    public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<Integer>();
        //add
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //get
        int elemnt = list.get(2);
        System.out.println(elemnt);
        //add in particular position
        list.add(1,1);
        System.out.println(list);
        //set element
        list.set(0, 6);
        System.out.println(list);
        //remove
        list.remove(2);
         System.out.println(list);
         //size   
         int sz = list.size();
          System.out.println(sz);
          for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
          }
          System.out.println();
          //
          Collections.sort(list);
          System.out.println(list);
    }
}
