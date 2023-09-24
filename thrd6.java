//Usually SUSPEND and RESUME method do not work after JDK 1.1, but in this it is running.
class dgp extends Thread{
    public void run(){
    String s = Thread.currentThread().getName();
    for(int i=0; i<3; i++){
        System.out.println(s);

    }
    }
}
public class thrd6 {
    public static void main(String[] args) {
        dgp gp = new dgp();
        dgp gp1 = new dgp();
        dgp gp2 = new dgp();
        
        gp.setName("Thread1");
        gp1.setName("Thread2");
        gp2.setName("Thread3");

        gp.start();
        gp1.start();
        //gp1.suspend();
        gp2.start();

        //gp1.resume();
        gp2.suspend();
        //gp2.resume();

        String s = Thread.currentThread().getName();
        for(int i=0; i<3; i++){
            System.out.println(s);
    
        }


    }
    
}
