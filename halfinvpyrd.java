import java.util.Scanner;

public class halfinvpyrd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of row");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=n-i; j>=1; j--){ //scope of the variable limited within 
                                        //the function
                System.out.print(" ");
        }
            
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
        }    
    }

