import java.util.Scanner;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();   // to get number of elements to be stored in Singly Linked List
        ListNode head = new ListNode(sc.nextInt());   //first Input is assigned AS head
        ListNode current=head;                        //a node name current is created for traversing
        for(int i=1;i<n;i++){
            current.next=new ListNode(sc.nextInt()); // getting other input nodes
            current=current.next;
        }
        Solution solution =new Solution();     // Instance is created to call function from outside class
        head=solution.deleteDuplicates(head);    //calling deleteDuplicate Method to remove duplicate
        printList(head);                //call printList method to print the output

    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) { // Constructor corrected
        this.val = val;
        this.next = null;
    }
}class Solution{
    public  ListNode deleteDuplicates(ListNode head) {
        if (head==null) return null;   //checks for is it an empty List or not
        ListNode current = head;
        while (current.next != null) {
            if (current.val != current.next.val) {
                current = current.next;
            } else {
                current.next = current.next.next;
            }
        }
        return head;
    }
}
