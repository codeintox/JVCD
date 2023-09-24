import java.util.*;
public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            int marks = sc.nextInt();
            if(marks==100 && marks<=90){
                System.out.println("The Best Student");
                }
                else if(marks>=60 && marks<=89){
                    System.out.println("The good student");
                }
                else if(marks>=1 && marks<=59){
                    System.out.println("The goos student as well");
                }
                else{
                    System.out.println("Invalid");
                }
                System.out.println("Want to continue ? Yes(1) or No(0)");
                input = sc.nextInt();
        }while(input == 1);
        sc.close();
    }
}
