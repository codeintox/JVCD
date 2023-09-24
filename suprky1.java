class supk{
    int a;
    void disp(){
        System.out.println(a);
    }
}
class supl extends supk {
    int a;
    void disp(){
        a=10;
        super.a = 23;
        System.out.println(a);
        System.out.println(super.a);
    }
 void msg(){
   disp();
   super.disp();
 }


}
public class suprky1 {
    public static void main(String[] args) {
        supl sp = new supl();
        sp.disp();
        sp.msg();
    }
}
