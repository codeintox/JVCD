class rcb extends Thread{
    public void run(){
        System.out.println("dd");
    }
}
public class thrd9 {
    public static void main(String[] args) {
        rcb cb = new rcb();
        rcb cb1 = new rcb();
        
        System.out.println(cb.isAlive());
        cb.start();
        System.out.println(cb1.isAlive());
        cb1.start();


    }
}
