public class recpow {
    public static int recpow(int x, int n){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        int powxm1 = recpow(x,n-1);
        //System.out.println(powxm1);
        int powx = n * powxm1;
        System.out.println(n);
        return powx;
        
    }
    public static void main(String[] args) {
        int x=2, n=5;
        int ans = recpow(2,5);
        System.out.println(ans);
    }
    
}
