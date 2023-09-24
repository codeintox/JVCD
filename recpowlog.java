public class recpowlog {
    public static int recpowlog(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n%2==0){
            return recpowlog(x, n/2) * recpowlog(x, n/2);  
        }
        else{
            return recpowlog(x, n/2) * recpowlog(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x=2, n=5;
        int ans = recpowlog(x, n);
        System.out.println(ans);
    }
}
