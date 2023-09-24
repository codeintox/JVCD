//Interrupt method in threading
class csk extends Thread{
    public void run(){
        String s = currentThread().getName();
        try{
        for(int i=1; i<=5; i++){
            System.out.println(s);
            sleep(3000);
            //interrupt();
        }
    }
    catch(InterruptedException i){
        System.out.println("Thread is terminated");

    }
}
public class thrd10 {
    public static void main(String[] args) {
        csk cs = new csk();
        csk cs1 = new csk();
        
        cs.setName("OM NAMAH SHIVA");
        cs1.setName("JAY MAA DURGA");
        
        cs.start();
        cs1.start();

        cs.interrupt();
    }
}
}