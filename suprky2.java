class suky{
    int a = 200;
    suky(int a){
        this.a = a;
    }
}
class suky1 extends suky{
    int a=400;
    suky1(int d,int e){
        super(d);
        a=e;
    }
       void msg(){
            System.out.println(+a);
            System.out.println(+super.a);
        }
    }



public class suprky2 {
    public static void main(String[] args) {
        suky1 sk = new suky1(12,21 );
        sk.msg();
        
    }
}
