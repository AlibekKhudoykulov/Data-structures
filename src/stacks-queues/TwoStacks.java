class TwoStacks<V> {
    private int arraySize;
    private int top1, top2; // Store top value indices of Stack 1 and Stack 2
    private V[] array;

    @SuppressWarnings("unchecked")
    public TwoStacks(int arraySize) {
        this.arraySize = arraySize;
        this.top1 = -1;
        this.top2 = arraySize;
        array = (V[]) new Object[arraySize]; // type casting Object[] to V[]
    }

    public void push1(V value) {
        // Increment top pointer and add element to stack 1 if space is available
        if (top1 < top2 - 1) {
            array[++top1] = value;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    // Decrement top pointer and add element to stack 2 if space is available
    public void push2(V value) {
        if (top1 < top2 - 1) {
            array[--top2] = value;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    // Return and remove top element from stack 1 if not empty
    public V pop1() {
        if (top1 > -1) {
            return array[top1--];
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
            return null; // This line won't be reached, but added to satisfy compiler
        }
    }

    // Return and remove top element from stack 2 if not empty
    public V pop2() {
        if (top2 < arraySize) {
            return array[top2++];
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
            return null; // This line won't be reached, but added to satisfy compiler
        }
    }
}