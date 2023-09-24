 class LL{
    NODE head;
    public class NODE{
        Sting data;
        NODE next;
        public NODE(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data){
        NODE newNode = new NODE(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        NODE newNode = new NODE(data);
        if (head == null){
            head = newNode;
            return;
        }
        NODE currNode = head;
        while(currNode.next!= null){
            currNode = currNode.next;
        }
          currNode.next = newNode;
    }
    public void printLst(){
        if(head == null){
            System.out.println("The list is empty");
        }
        NODE currNode = head;
        while(currNode!= null){
            System.out.println(currNode.data + "->");
            currNode = currNode.next;
        }
       
    }
    
}
public class Lnklst3 {
    public static void main(String[] args) {
        
    
    LL list = new LL();
    list.addFirst("ad");
    list.addFirst("Add");
    list.printLst();
    }
}
