//Multithreading Using Thread Class
class dem extends Thread{
    //@Override
    public void fun(){
        try{
        for(int i=1; i<=4; i++)
        {
            System.out.println("Rana");
           Thread.sleep(5000);
        }
        }
        catch(InterruptedException i){
            
        }
    }
}
 public class thrd1{
    public static void main(String[] args)throws InterruptedException {
        dem ob = new dem();
        ob.fun();
        for(int i=1; i<=4; i++){
            System.out.println("Som");
            Thread.sleep(1000);
        }
        
    }
}