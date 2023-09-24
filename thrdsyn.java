//Multithreading using syschronizing method
class lsg implements Runnable{
    int available = 0, passenger;
    lsg(int passenger){
        this.passenger = passenger;
        

    }
    public  synchronized void run(){
        String s = Thread.currentThread().getName();
        if(available >= passenger){
            //
            System.out.println(s+ "has reserved the seat");
            available -= passenger;
        }
        else{
            System.out.println(s+ "seat is not available for you");
        }
        

    }
}
public class thrdsyn {
    public static void main(String[] args) {
        lsg ls = new lsg(1);
        //lsg ls1 = new lsg();
        //lsg ls2 = new lsg()

        Thread t = new Thread(ls);
        Thread t1 = new Thread(ls);
        Thread t2 = new Thread(ls);

        t.setName("Anuj");
        t1.setName("Dhiraj");
        t2.setName("Niraj");

        t.start();
        t1.start();
        t2.start();


    }
}
