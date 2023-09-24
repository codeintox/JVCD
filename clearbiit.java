public class clearbiit {
    public static void main(String[] args) {
        int n = 5, pos = 2, bitm = 1<<pos, notbitm = ~(bitm);
        int clearbit = n & notbitm;
        System.out.println(clearbit);
    }
}
