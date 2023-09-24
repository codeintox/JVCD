public class bitwiseget {
    public static void main(String[] args) {
        int n=5, pos=3, bitm = 1<<pos;
        if((bitm & n) == 0){
            System.out.println("The bit was zero");
        }
                    else{
                        System.out.println("The bit was one");
                    }
    }

}
