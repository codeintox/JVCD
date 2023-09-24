 
 //multithreading SLEEP method
 class ddl extends Thread{
    public void run(){
        String s = Thread.currentThread().getName();
        try{
            
        for(int i= 1; i<=3; i++){
            System.out.println(s);
            Thread.sleep(7000);
        }
        
        }
        catch(InterruptedException i){

        }
    }
}
public class thrd4 {
    public static void main(String[] args) {
        ddl d1 = new ddl();
        ddl d2 = new ddl();
        ddl d3 = new ddl();
        
        d1.setName("SOMENATH");
        d2.setName("RANA");
        d3.setName("AMNTH");

        d1.start();
        d2.start();
        d3.start();
    }
}
