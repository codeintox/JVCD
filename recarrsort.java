public class recarrsort {
    public static boolean arrsort(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] >= arr[idx+1]){
            //array is sorted till now
            return false;
        }
            
            
        else{
            return arrsort(arr, idx+1) ;
        }
        }

    
    public static void main(String[] args) {
        int arr[] = {1, 3, 5};
       System.out.println(arrsort(arr, 0));
    }
}

