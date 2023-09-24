//JOIN method example
class ddr extends Thread{
    public void run(){
        String s = Thread.currentThread().getName();
        for(int i=1; i<=7; i++){
            System.out.println(s);
        }
        
    }
}
public class thrd5 {
    public static void main(String[] args) {
        ddr dr1 = new ddr();
        ddr dr2 = new ddr();
        ddr dr3 = new ddr();

        dr1.setName("IDIOT");
        dr2.setName("NONSENSE");
        dr3.setName("RSKL");
        
        dr2.start();
        try {
            dr2.join(7000);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }

        dr1.start();
        
        dr3.start();

        String s = Thread.currentThread().getName();
        for(int i=1; i<=7; i++){
            System.out.println(s);
        }

    }
}
