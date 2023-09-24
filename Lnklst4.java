//
import org.w3c.dom.Node;

//import LL.NODE;

class LS{
    NODE head;
    int size;
    LS(){
    size = 0;
}
    public class NODE{
        int data;
        NODE next;
        NODE(int data){
            this.data = data;
            this.next = null;
            size ++;
        }
    }
    //INSERT FROM START
    public void addFirst(int data){
        NODE newNode = new NODE(data);
        newNode.next = head;
        head = newNode;
    }
    //INSERT FROM END
    public void addLast(int data){
        NODE newNode = new NODE(data);
        if(head == null){
            head = newNode;
            return;
        }
        NODE currNode = head;
        while(currNode.next != null){
            currNode= currNode.next ;
        }
        currNode.next = newNode;
    }
    //DELETE FROM START 
    public void delFst(){
        if(head == null){
            System.out.println("The List is Empty");
            return;
        }
        head = head.next;
        size --;
    }
    //DELETE FROM END
    public void delLst(){
        if(head == null){
            System.out.println("The List is Empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        NODE currNode = head;
        NODE lstNOd = head.next;
        while(lstNOd.next != null){
            currNode = currNode.next;
            lstNOd = lstNOd.next;
        }
        currNode.next = null;
    }
    //GETTING SIZE OF THE LINKLIST
    public int getSz(){
        return size;
    }
    public void printList(){
        NODE currNode = head;
        if(head == null){
            System.out.println("The List is empty");
        }
        
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
       
    }
    //INSERT ELEMENT IN THE MIDDLE OF THE LINKED LIST OR PARTICULAR INDEX   
    public void inSrt(int index, int data){
        if (index > size || index <0){
            System.out.println("This is Invalid");
            return;
        }
        size++;
        NODE newNode = new NODE(data);
        if(head == null && index == 0){
            newNode.next = head;
            head = newNode;
        }
        NODE currNode = head;
        for(int i=0; i<size; i++){
            if(i==index){
                NODE nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;

            }
            currNode = currNode.next;
            
        }
    }
    //GET INDEX OF THE DESIRED ELEMENT 
        public void getInd(int data){
            int i = 1;
            boolean flag = false;
            NODE currNode = head;
            if(head == null){
                System.out.println("The list is empty");
            }
            else{
                while(currNode.next != null){
                    if(currNode.data == data){
                        flag = true;
                        break;
                    }
                    i++;
                    currNode = currNode.next;
                }
            }
            if(flag)  
            System.out.println("Element is present in the list at the position : " + i);  
       else  
            System.out.println("Element is not present in the list");  
    

        }
        //Reverse a Linklist iterativley
        public void revList(){
            if(head == null || head.next == null){
                return;
            }
            NODE prevNode = head;
            NODE currNode = head.next;
            while(currNode != null){
                NODE newNode = currNode.next;
                currNode.next = prevNode;
                prevNode = currNode;
                currNode = newNode;
                
        }
        head.next = null;
        head = prevNode;
    }
    //Reverse a Linklist recursively
    
    public NODE revList1(NODE head){
        if(head == null || head.next == null){
        return head;
        }
        NODE newNode = revList1(head.next);
        head.next.next = head;
        head.next = null;
     
        return newNode; 

    }
    //REMOVE  N th NODE FROM THE END
    public void delFEnd(int n){
        if(head.next == null){
            return;
        }
        //NODE currNode = head;
        //while(currNode!=null){
            //currNode = currNode.next;
            //size ++;
        //}
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
    //Method for Find The MIDDLE of the list
    public NODE findMid(NODE head){
        NODE Turtle = head;
        NODE Rabbit = head;
        while(Turtle.next != null && Rabbit.next.next != null){
            Turtle = Turtle.next;
            Rabbit = Rabbit.next.next;
        }
        return Turtle;
    }

    //Reverse function
    public NODE revlist2(NODE head){
        if(head == null || head.next == null){
            return head;
        }
        NODE prevN = null;
        NODE currN = head;
        while(currN.next != null){
            NODE nextN = currN;
            currN = prevN;
            prevN = currN;
            currN = nextN;
        }
        return prevN;
    }
    //CHECK IF THE LIST IS PALINDROME OR NOT 
    public boolean isPalin(){
    if(head == null || head.next == null){
        return true;
    }
    NODE endofFirst = findMid(head);
    NODE secondhalfStart = revlist2(endofFirst.next);
    NODE firsthalfStart = head;
    while(secondhalfStart.next != null){
        if(firsthalfStart.data != secondhalfStart.data){
            return false;
        }
        firsthalfStart = firsthalfStart.next;
        secondhalfStart = secondhalfStart.next;
    }
    return true;
}
    //Checking cycle in the loop
    public boolean isCycle(){
        NODE Turtle = head;
        NODE Rabbit = head;
        while(Turtle == null && Turtle.next == null){
            Turtle = Turtle.next;
            Rabbit = Rabbit.next.next;
            if(Rabbit == Turtle){
                return true;
            }
        }
        
        return false;

    }
}

public class Lnklst4 {
  public static void main(String[] args) {
    LS list = new LS();
    list.addFirst(3);
    list.addFirst(2);
    list.addFirst(8);
    list.addFirst(3);
    list.addFirst(7);
    list.addFirst(5);
    list.addLast(1); 
    //list.delLst();
  
    //list.inSrt(6,0);
    //list.printList();
    //list.getInd(7);
    //list.revList1();

    list.printList();
    list.revList1();
    list.printList();
    //list.head = list.revList1(list.head);
    //list.printList();
   //System.out.println("SIZE OF THE LIST IS:" +list.getSz()); 
  
   // list.delFst();;
   System.out.println(list.isCycle());
    }
}
