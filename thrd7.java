//YIELD method in multithreading
class asn extends Thread{
    public void run(){
        String s = Thread.currentThread().getName();
        for(int i=1; i<=7; i++){
            System.out.println("nn");
            Thread.yield();
        }
    }
}
class asn1 extends Thread{
    public void run(){
        String s = Thread.currentThread().getName();
        for(int i=1; i<=7; i++){
            System.out.println("nm");
        }

    }
}
public class thrd7 {
    public static void main(String[] args) {
        asn sn = new asn();
        asn1 sn1 = new asn1();
        
        sn.start();
        sn1.start();
    }
}
