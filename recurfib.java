public class recurfib {
    public static void recfib(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        recfib(b,c,n-1);
    }
    public static void main(String[] args) {
        int a = 0, b = 1, n = 7;
        recfib(a, b, n-2);
    }
    
}
