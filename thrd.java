 class thrd {
     void show(){
        for(int i=0; i<5; i++){
            System.out.println(i);
        }
    }
}
 class thrd1 {
    
    void show(){
        for(int i=6; i<10; i++){
           System.out.println(i);
        }
    }

    
 }
 class thrr{
public static void main(String[] args) {
    thrd th = new thrd();
    thrd1 th1 = new thrd1();
    th.show();
    th1.show();
}
}