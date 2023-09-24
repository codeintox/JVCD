import java.util.*;
public class rectP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m and n");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            for(int j=1; j<=m-1; j++){
                System.out.print(" * ");
                
            }
            System.out.println();
        }
        sc.close();
    }
}
