//Multithreding by runnable interface
class dgr implements Runnable{
    public void run()
    {
        for(int i=1; i<=4; i++){
            System.out.println("ATH");
        }
    }
}
public class thrd2 {
    public static void main(String[] args) {
        dgr dr = new dgr();
        Thread t = new Thread(dr);
        t.start();
        for(int i=1; i<=4; i++){
            System.out.println("SOMENATH");
        }
    }
}
