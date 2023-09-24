import java.util.Scanner;

class rtnthis{
    String name;
    int age;
    public rtnthis setvalues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Student");
        String name = sc.nextLine();
        System.out.println("Enter the age");
        int age = sc.nextInt();
        this.name= name;
        this.age= age;
        return this;
    }
    void displ(){
        System.out.println("name: "+name);
        System.out.println(("age: "+age));
    }

    public static void main(String[] args) {
        rtnthis rt = new rtnthis();
        rt = rt.setvalues();
        rt.displ();

    }
}
