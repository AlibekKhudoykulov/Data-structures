class FindNthLastNode{
        public static LinkedListNode<Integer> findNth(LinkedListNode<Integer> head, int n) {
        LinkedListNode<Integer> current = head;
        int size = 0;
        while(current!=null){
            size++;
            current = current.next;
        }
        
        int position =  size - n;
        current = head;
        while( 0 < position){
            current = current.next;
            position--;
        }
        // Replace this placeholder return statement with your code
        return current;
    }
        
        public static void main(String[] args) {

        Integer[][] input = {
            {7, 10, 14, 21, 22},
            {3, 6, 9, 12},
            {23, 19, 15, 22, 34, 76, 12},
            {5},
            {1, 3, 5, 7, 9, 11,6},
        };

        int sizes[] = {5, 4, 7, 1, 7};
        int n[] = {4, 2, 6, 1, 3};

        for (int i = 0; i < input.length; i++) {
			LinkedList<Integer> inputLinkedList = new LinkedList<Integer>();
            inputLinkedList.createLinkedList(input[i]);
            System.out.print((i + 1) + ".\tInput linked list: ");
            PrintList<Integer> printLinkedList = new PrintList<Integer>();
            printLinkedList.printListWithForwardArrow(inputLinkedList.head);
            System.out.println("\n\tn: " + n[i]);
            System.out.print("\n\tNth Node: " + findNth(inputLinkedList.head, n[i]).data);

            System.out.println();
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }
}