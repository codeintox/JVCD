import java.util.*;
public class updatebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt  ();
        int n = 5, pos = 2, bitm = 1<<pos, newno;
                if(opt == 0){
                    int notbitm = ~ bitm;
                    newno = notbitm & n;
                    System.out.println(newno);
                }
                else{
                    newno = bitm | n;
                    System.out.println(newno);
                }
            sc.close();
    }
}
