import java.util.Scanner;

public class insort {
    public static void sort(int arr[])
    {
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
                
            }
            return;
            
        }
        public static void main(String[] args) {
           
            int arr[] = {3, 1, 6, 12, 4};
            System.out.println("Array before sort");
            for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i] + " ");
            }
            
            sort(arr);
            System.out.println("Array after sort");
            for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i] + " ");
            }

        }
    }


