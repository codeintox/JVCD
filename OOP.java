 import user.*;
 class Shape{
public void display() {
    System.out.println("display area");
}
 }
class Triangle extends Shape{
    public void area(int h, int l) {
        System.out.println(1/2*h*l);
        
    }

}
class EqltTrangle extends Triangle{
    public void area(int h, int l) {
        System.out.println(1/2*h*l);
        
    }
}

public class OOP {
public static void main(String[] args) {
    Bank bk = new Bank();
    //bk.name = "SMNTH";
    //bk.accnum = TX34;
    System.out.println(bk.name);
    
}
    
}