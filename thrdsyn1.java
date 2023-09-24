class Table{
    public synchronized void printTable(int a){
        for(int i=1; i<=10; i++){
            System.out.print(a*i +"\t");
        }
    }
}

class Thread1 extends Thread{
    Table t;
    Thread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}

class Thread2 extends Thread{
    Table t;
    Thread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(4);
    }
}



public class thrdsyn1 {
    public static void main(String[] args) {
        Table tb = new Table();
        Thread1 t1 = new Thread1(tb);
        Thread2 t2 = new Thread2(tb);
        t1.start();
        t2.start();
    }
}
