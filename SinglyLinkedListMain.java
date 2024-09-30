import java.util.*;
public class SinglyLinkedListMain {

    // Printing all the elements of the linkedlist
    public static void printAll(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter elements: ");
        for(int i=0; i<n; i++){
            list.insertNode(sc.nextInt());
        }
        printAll(list.head);
        sc.close();
    }
}