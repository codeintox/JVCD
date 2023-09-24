import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
       int r; 
       double area;
        Scanner cr = new Scanner(System.in);
        System.out.print("Enter the radius of the circle");
        r = cr.nextInt(); 
        area = r * r * Math.PI;
        System.out.print("The area of the circle is" +area);
        cr.close();

        
    }
    
}
