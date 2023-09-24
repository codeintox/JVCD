import java.util.Scanner;

public class bubbles {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Array before Sorting");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<=arr.length -i -1; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                System.out.println(arr);
            }
            System.out.println();
        }

    } 
}
}
