class NODE{
    int size = 0;
public NODE delFEnd(NODE head, int n){
    if(head.next == null){
        return null;
    }
    NODE currNode = head;
    while(currNode!=null){
        currNode = currNode.next;
        size ++;
    }
    if(n == size){
        return head.next;
    }
    NODE prevNode = head;
    int nodetoSearch = size - n;
    int i = 1;
    while(i<nodetoSearch){
        prevNode = prevNode.next;
    }
    prevNode.next = prevNode.next.next;
    return head;
}}
public class lnklst5 {
    NODE nd = new NODE();
    
}
