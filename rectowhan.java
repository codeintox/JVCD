public class rectowhan {
    public static void towhan(int n, String src, String hlp, String dst){
        if(n == 1){
            System.out.println("Transfer of disk"+ n +" from "+src+"to" +dst);
            return;
        }
        towhan(n-1,src,dst,hlp);

        System.out.println("Transfer of disk"+ n +" from "+src+"to" +dst);
        towhan(n-1,hlp,src,dst);

    }
    public static void main(String[] args) {
        int n=3;
        towhan(n,"s","h","d");
    }
}
