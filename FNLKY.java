public class FNLKY {
    //
     final int a;
    FNLKY(){
      a=45;
    }
    void add(final int d){
        final int b = 20;
        int c = a+12+d;
        System.out.println(c);
    }
    public static void main(String[] args) {
        FNLKY f = new FNLKY();
        f.add(70);
        //System.out.println(a);
    }
}
