import java.util.ArrayList;

public class Arrlst2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(9);
        System.out.println("This is the Array to be sum");
        System.out.println(list);
        System.out.println("The sum is");
        int sum = 0;
        for( int num:list){
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
