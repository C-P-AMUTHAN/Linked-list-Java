public class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;
        
    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode newnode = new SinglyLinkedListNode(nodeData);

        if(this.head == null){
            this.head = newnode;
        }
        else{
            this.tail.next = newnode;
        }
        this.tail = newnode;
    }
}
