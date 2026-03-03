class RemoveDuplicates{
        public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        LinkedListNode<Integer> current = head;

        while (current != null) {
            LinkedListNode<Integer> temp = current;
            while (temp.next != null) {
                if (current.data.equals(temp.next.data)) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            current = current.next;
        }
        return head;
    }
        public static void main(String[] args) {
        Integer[][] inputs = {
            {30, 20, 30, 10, 50},
            {-7, -7, -22, -1, -5, -5},
            {1, 1, 1},
            {9, -9, 9},
            {1, -2, -2},
        };


    for (int i = 0; i < inputs.length; i++) {
        LinkedList<Integer> inputLinkedList = new LinkedList<Integer>();
        inputLinkedList.createLinkedList(inputs[i]);
        System.out.print((i + 1) + ".\tInput linked list: ");
        PrintList<Integer> printLinkedList = new PrintList<Integer>();
        printLinkedList.printListWithForwardArrow(inputLinkedList.head);
        System.out.print("\n\tLinked list without duplicates: ");
        printLinkedList.printListWithForwardArrow(removeDuplicates(inputLinkedList.head));
        System.out.println();
        System.out.println(new String(new char[75]).replace('\0', '-'));
    }    
    }

}