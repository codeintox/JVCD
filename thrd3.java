//
class dgp extends Thread{
    public void run(){
    String s = Thread.currentThread().getName();
    for(int i=0; i<3; i++){
        System.out.println(s);

    }
    }
}
public class thrd3 {
    public static void main(String[] args) {
        dgp gp = new dgp();
        dgp gp1 = new dgp();
        dgp gp2 = new dgp();
        
        gp.setName("Thread1");
        gp1.setName("Thread2");
        gp2.setName("Thread3");

        gp.start();
        gp1.start();
        gp2.start();

        String s = Thread.currentThread().getName();
        for(int i=0; i<3; i++){
            System.out.println(s);
    
        }


    }
    
}
