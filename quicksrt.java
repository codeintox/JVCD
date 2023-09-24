public class quicksrt {
    public static int partition(int arr[], int low,int high) {
      int pivot = arr[high];
      int i = low - 1;  
        for(int j=low; j<high; j++){
            if (arr[j]<pivot) {
            i++;
            //swap
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
                
            }
             
        }
        //swap with pivot
        i++;
        int temp = arr[i];
        arr[i]= pivot;
        arr[high]=temp;
        return i;
        
    }
    public static void qck(int arr[],int low, int high) {
        int pivx = partition(arr,low,high);
        qck(arr, low, pivx-1);
        qck(arr, pivx+1, high);
        
        
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        qck(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ "");
        }
        System.out.println();
    }
}
