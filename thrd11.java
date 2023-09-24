class srh extends Thread{
    public void run(){
        for(int i=1; i<=3; i++){
        System.out.println(currentThread().getName());
        System.out.println(getPriority());
    }
}
public class thrd11 {
  public static void main(String[] args) {
    srh sr = new srh();
    srh sr1 = new srh();
    srh sr2 = new srh();

    sr.setName("Somenath");
    sr1.setName("Durgapur");
    sr2.setName("Burdwan");

    sr.start();
    sr1.start();
    sr2.start();

    sr.setPriority(9);
    sr1.setPriority(6);
    sr2.setPriority(2);
  }  
}
}