import java.util.ArrayList;

//2D array using arraylist
 class ArrayListMatrix {

    public static void main(String args[]){

        ArrayList<ArrayList<Integer>> a = new ArrayList<>();

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        ArrayList<Integer> a4 = new ArrayList<Integer>();


        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(15);

        a2.add(4);
        a2.add(5);
        a2.add(6);
        a2.add(16);

        a3.add(7);
        a3.add(8);
        a3.add(9);
        a3.add(17);

        
        
        a4.add(10);
        a4.add(11);
        a4.add(12);
        a4.add(18);
        
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);


        for(ArrayList obj:a){

            ArrayList<Integer> temp = obj;

            for(Integer job : temp){
                System.out.print(job+" ");
            }
            System.out.println();
        }
    }
}