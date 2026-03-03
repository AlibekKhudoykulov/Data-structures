public class FindTheLengthOfLinkedList {
    public static int length(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        // Replace this placeholder return statement with your code
        return size;
    }
}