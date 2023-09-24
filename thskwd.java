class thsk{
    int a, b, c;
    thsk(int a, int b){
        this.a = a;
        this.b =b;
    }
    thsk(int a, int b, int c){
        this(a, b);
        this.c = c;
    }

    void show(){
        System.out.println(+a);
        System.out.println(+b);
    }
    void show1(){
        System.out.println(+a);
        System.out.println(+b);
        System.out.println(+c);
    }
}
public class thskwd {
    public static void main(String[] args) {
        thsk th = new thsk(10,25,43);
       //th.abs();
        th.show();
        th.show1();
    }
}
