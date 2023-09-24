
/**
 * suprky
 */
class suprk {

    int a;

}
/**
 * Innersuprky
 */
 class suprk1 extends suprk {
    int a = 20;
    void display(){
    super.a = 10;
    
        System.out.println("value of derived class" +a);
        System.out.println("value of base class" +(super.a));

    }


    
}
public class suprky {
    public static void main(String[] args) {
        suprk1 spk = new suprk1();
        spk.display();
        
    }
}
