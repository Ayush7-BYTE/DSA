public class Solution {
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode <Integer> head) {

        if (head == null || head.next == null) return head;

        LinkedListNode past = null;
        LinkedListNode present = head;
        LinkedListNode future = head.next;

        while (present != null) {
            present.next = past;
            past = present;
            present = future;

            if (future != null) {
                future = future.next;
            }
        }
        head = past;
        return head;
    }
}