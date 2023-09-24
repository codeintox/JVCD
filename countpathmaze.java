public class countpathmaze {
    public static int pmaze(int i, int j, int m, int n) {

        if (i==m-1 || j==n-1) {
            return 1;
            
        }
    return pmaze(i+1, j, m, n) + pmaze(i, j+1, m, n);
        
    }
    public static void main(String[] args) {
        int m=4, n=5;
        System.out.println(pmaze(0, 0, m, n));
    }
}
