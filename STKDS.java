public class STKDS {
    private static class node{
        int data;
        node next;
        node (int data){
            this.data = data;
            next = null;
        }
    }
         static class Stk{
            public static node head = null;
            public  void push(int data){
                node newNode = new node(data);
                if(head == null){
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
            }

        
        public static boolean isEmpty(){
            return head == null;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
        if(isEmpty()){
            return -1;
        }
        
        return head.data;
    }
    
    }
    public static void main(String[] args) {
        Stk s = new Stk();
        s.push(2);
        s.push(8);
        s.push(6);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }

}

