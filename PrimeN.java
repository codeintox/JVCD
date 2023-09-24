import java.util.*;
public class PrimeN {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n%2==0 || n%1==0){
        System.out.println("This is prime no");
    }
    else{
        System.out.println("This is not a prime no");
    }
    
}
}