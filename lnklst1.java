 class LL{
        NODE head;
    public class NODE{
        int data;
        NODE next;
        NODE(int data){
            this.data = data;
            this.next = null;
        }

    }
    public void addFirst(int data){
        NODE newNode = new NODE(data);
        if(head == null){
            head = newNode;
            return;
        }
       
        newNode.next = head;
        head = newNode;

    }
    public void addLast(int data){
        NODE newNode = new NODE(data);
        if(head == null){
            head = newNode;
            return;
        }
        NODE currNode = head;
        while(currNode.next != null){
          currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void printList(){
        NODE currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }

    }
    public void revlinkl(){
        if(head == null || head.next == null){
            return;
        }
        NODE prevNode = head;
        NODE currNode = head.next;
        while(currNode != null){
            NODE nodeNext = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;

            currNode = nodeNext;
           

        }
        head.next = null;
        head = prevNode;
        
    }
   
}
 public class lnklst1 {
    public static void main(String[] args) {
        LL fun = new LL();
       fun.addFirst(5);
        //fun.addFirst(2);
        fun.addFirst(8);
        //fun.addFirst(3);
        //fun.addFirst(7);
        fun.addFirst(5);
        //fun.addFirst(1);
        fun.addLast(8);
       
        fun.printList();
        //fun.searchElement(7);
        fun.revlinkl();
        fun.printList();

    }
    
}
