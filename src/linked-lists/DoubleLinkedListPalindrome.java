public class DoublyLinkedListPalindrome {

    public static boolean isPalindrome(DoublyLinkedListNode head) {
        DoublyLinkedListNode start = head;
        DoublyLinkedListNode end = getTailNode(head);

        // If list is empty, it is a palindrome
        if (start == null) {
            return true;
        }

        // Otherwise, traverse list from both sides
        while (start != end && start.prev != end) {
            // If data mismatches at any point, list is not a palindrome
            if (start.data != end.data) {
                return false;
            }
            start = start.next;
            end = end.prev;
        }

        // If data didn't mismatch at any point, list is a palindrome
        return true;
    }

    public static DoublyLinkedListNode getTailNode(DoublyLinkedListNode head) {
        DoublyLinkedListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    // Driver code
    public static void main(String[] args) {
        int[][] inputs = {
                {2, 4, 6, 4, 2},
                {0, 3, 5, 5, 0},
                {9, 7, 4, 4, 7, 9},
                {5, 4, 7, 9, 4, 5},
                {5, 9, 8, 3, 8, 9, 5}
        };


        for (int i = 0; i < inputs.length; i++) {
            DoublyLinkedList inputLinkedList = new DoublyLinkedList();
            inputLinkedList.createLinkedList(inputs[i]);
            DoublyLinkedListNode head = inputLinkedList.head;
            System.out.print(i+1 + ".\tDoubly Linked List: ");
            
            PrintList printIt = new PrintList();
            printIt.printListWithForwardArrow(head);
            System.out.println("\n\n\tIs it a palindrome? " + (isPalindrome(head) ? "Yes" : "No"));
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }
}