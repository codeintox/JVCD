public class recur {
    public static void recur1(int i,int n,int fact) {
        if(i==n){
            fact *= i;
            System.out.println(fact);
            return;
        }
        fact = fact * i;
        recur1(i+1, n, fact);
        
    }
    public static void main(String[] args) {
        int n = 1;
        recur1(1, 5, 1);
    }

}
