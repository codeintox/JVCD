//Implementation of Queue Using Array
public class QueArr {
    public static class QOP{
        static int []arr; 
        static int n;
         static int rear = -1 ;
        QOP(int n){
            this.n = n;
            arr = new int[n];
            //rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static boolean isFull(){
            return rear == n-1;
            
        }
        //Enque
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
            }
            arr[++rear] = data;
            System.out.println(data);
        }
        //Dequeu
        public static int rem(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0] ;
            for(int i= 0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear --;//rear --; statement should be added 
            //as we shifted all elements to previous place 
            //so now our rear should aslo shift to its previous place
            return front;
        }
        //Peek
        public static int peek(){
            if(isEmpty()){
            System.out.println("Empty queue");
            return -1;        
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        QOP q = new QOP(5);
        q.add(7);
        q.add(5);
        q.add(3);

        System.out.println(q.rem());
        System.out.println(q.peek());
        
    }
    
}
