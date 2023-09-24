//
import javax.sound.midi.Soundbank;

class Som{
    String name;
    int age;
    Som(String name,int age)
    {
        this.name=name;
        this.age= age;
    }
    Som(Som s){
        name = s.name;
        age = s.age;
        System.out.println("NaMe:" +name);
        System.out.println("AgE:" +age);

    }
        void disp()
        {
            System.out.println("NAME:" +name);
            System.out.println("AGE:" +age);
        }
    

}
public class construct {

    construct(int a,int b){
        System.out.println("DISSENT ");
    }
    public static void main(String[] args) {
        Som vn = new Som("aa",23);
        Som vn1 = new Som(vn);
        construct cn = new construct(4,4);
        vn.disp();
        
        
    }
}
