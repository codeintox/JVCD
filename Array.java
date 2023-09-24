import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        
    
    
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE LENGHT");
    int size = sc.nextInt();
    int[] marks = new int[size];
    //marks[0]= 97;
    //marks[1]= 98;
    //marks[2]= 96;
    //for intput from user
    for(int i=0; i<size; i++){
     marks[i]=sc.nextInt();   
    }
    int x = sc.nextInt();
    //for output
    for(int i=0; i<marks.length; i++){
        if(marks[i]== x)
    
        System.out.println("x found at" +i);
    
    }
  sc.close();  
}
}