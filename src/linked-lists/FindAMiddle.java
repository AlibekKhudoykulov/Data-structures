class FindAMiddle{
     public static LinkedListNode<Integer> findMiddle(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        
        current = head;
        for(int i = 0; i < (count / 2) ; i++){
            current = current.next;
        }

        // Replace this placeholder return statement with your code
        return current;
    }
}