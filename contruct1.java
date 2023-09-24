 class Contruct1 {
    void a(Contruct1 ct){
        System.out.println("The Indian Culture");

    }
    void b(){
        a(this);  //"This" keywords can be pass as an argument to the function call
    }
    public static void main(String[] args) {
        Contruct1 ct = new Contruct1();
        ct.b();
    }
}
