 class LL{
        NODE head;
        private int size;
        LL(){
           this.size = 0;
        }
    class NODE{
        String data;
        NODE next;
        NODE(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //ADD 1st
    public void addFirst(String data){
        NODE newNode = new NODE(data);
        if(head == null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }
    //ADD End
    public void addLast(String data){
        NODE newNode = new NODE(data);
        if(head == null){
            head = newNode;
            return;
        }
        NODE currNode = head;
        while(currNode.next!= null){
            currNode = currNode.next;

        }
            currNode.next=newNode;

    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("The List is empty");
        }
        head = head.next;
        size--;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("The List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head=null;
            return;
            
        }
        NODE currNode = head;
            NODE lastNode = head.next;
            while(lastNode.next != null){
                currNode = currNode.next;
                lastNode = lastNode.next;
            }
        currNode.next = null;
    }
    //print
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        NODE currNode = head;
        while(currNode!= null){
            System.out.print(currNode.data +"->");
            currNode=currNode.next;
        }
        //System.out.println("NULL");
    }
     public int getSize(){
        return size;
     }

     public void delFEnd(int n){
        if(head.next == null){
            return ;
        }
        NODE currNode = head;
        while(currNode!=null){
            currNode = currNode.next;
            size ++;
        }
        if(n == size){
            return ;
        }
        NODE prevNode = head;
        int nodetoSearch = size - n;
        int i = 1;
        while(i<=nodetoSearch){
            prevNode = prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;
        //return head;
     }

}

public class Lnklst {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("Rana");
        list.addFirst("I");
        list.addFirst("am");
        list.addLast("THis");
        list.printList();
        
        System.out.println(list.getSize());
        list.delFEnd(3);
        list.printList();

    }
}
