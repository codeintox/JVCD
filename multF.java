import java.util.Scanner;

public class multF {
    public static int multF(int a,int b){
        return(a*b);
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter  Two no for multiplication");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = multF(a,b);
            System.out.println(result);
            sc.close();   
        }
    }
    

