class Ccall{
    Ccall(Fun fn){
        System.out.println("What do you do?");
    }
}
class Fun{
    void disp(){
     Ccall cc = new Ccall(this); //"This" keywords can be used to pass as an 
    }                            //argument in the constructor call     
}
public class thisco {
    public static void main(String[] args) {
        Fun fn = new Fun();
        fn.disp();
    }
}
