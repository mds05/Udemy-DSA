public class LL {
    public static int size=0;
    LL(){
        size++;
    }
    class Node{
        String data;
        Node next;
    
    Node(String data){
        this.data=data;
        this.next=null;
        size++;
    }
}
    public Node head;
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head ==null){
            head =newNode;
        }
        else{
        newNode.next=head;
        head=newNode;
        }
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head ==null){
            head =newNode;
        }
        else{
           Node currNode=head; 
           while(currNode.next !=null){
            currNode=currNode.next;
           }
           currNode.next=newNode;
        }
    }
    public void printList(){
        if(head ==null){
            System.out.println("Empty");
            return;
        }
        Node currNode=head; 
           while(currNode !=null){
            System.out.print(currNode.data +"  ");
            currNode=currNode.next;
           }
           System.out.println("Null");
        }
        public void deleteFirst(){
            if(head ==null){
                System.out.println("Empty list");
                return;
            }
            else{
                size--;
                head =head.next;
            }
        }
        public void deleteLast(){
            if(head ==null){
                System.out.println("Empty list");
                return;
            }
            size--;
            if(head.next==null){
                head=null;
                return;
            }
            Node secondLast=head;
            Node lastNode=head.next;
            while(lastNode.next!=null){
                lastNode=lastNode.next;
                secondLast=secondLast.next;
            }
            secondLast.next=null;
        }
    
    public static void main(String[] args){
        LL list=new LL();
        list.addFirst("siuu");
        list.addFirst("smsms");
        list.addLast("dumdum");
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(LL.size);
    }
}
