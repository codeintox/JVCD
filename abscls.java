public class abscls {

    public static void main(String[] args) {
        Hello Hl = new Hello();
        
    }
}
interface A{
   default void show(){

    }
}
interface Demo{
static int  ddd(int a){
return a*a;
}
}
interface B extends A,Demo{
    void disp();
}

class Hello implements B{
    


}
/**
 * Innerabscls
 */
public interface result {
    int max_marks=100;//public,static,final-->JAVAP command
    float percentage();
    void show();

    
}
/**
 * Innerabscls
int noOfSub(); */
public interface Exam {
int noOfSub();
void show();
    
}
class fifthclass implements result,Exam{
    public float percentage(){
       
        int a = max_marks*2;
        return a;
    }
    public int noOfSub(){
        return 1;
    }
    public void show(){

    }
}