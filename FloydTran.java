import java.util.Scanner;

public class FloydTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of row");
        int n = sc.nextInt();
        int inp=1;
        for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                 
                 System.out.print(inp+ " ");
                 inp ++;
                }
                System.out.println();
        }
    sc.close();    
    }
}
