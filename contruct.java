import java.lang.*;

  class Contruct {
    Contruct(){
        this(10);
        System.out.println("Non Parameterized Constructor");

    }
    Contruct(int a){
        //this();
        System.out.println("Parameterized Contructor");

    }
    public static void main(String[] args) {
        Contruct cns = new Contruct();
        
        
    }
}
