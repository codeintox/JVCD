//Stop method in multithreading
class kkr extends Thread{
public void run(){
    String s = Thread.currentThread().getName();
    for(int i= 1; i <= 4; i++ ){
        System.out.println(s);
    }

}
}
public class thrd8 {
    public static void main(String[] args) {
        kkr kr = new kkr();
        kkr kr1 = new kkr();
        kkr kr2 = new kkr();

        kr.setName("BIRAT");
        kr1.setName("SURYA");
        kr2.setName("JASPRIT");
        
        
        
        kr.start();
        kr1.start();
        kr2.start();

        kr1.stop();



    }
}
