class QueueWithStack {
    private MyStack<Integer> firstStack;
    private int maxSize; 
    public QueueWithStack(int maxSize) {
        this.maxSize = maxSize;
        this.firstStack = new MyStack<>(maxSize);
    }

    public void enqueue(int value) {
        if(firstStack.isEmpty()){
            this.firstStack.push(value);
        }else{
            MyStack<Integer> temp = new MyStack<>(maxSize);
            while(!firstStack.isEmpty()){
                temp.push(firstStack.pop());
            }
            firstStack.push(value);
            while(!temp.isEmpty()){
                firstStack.push(temp.pop());
            }
        }
    }
    public int dequeue() {
        if(firstStack.isEmpty()) return 0;
        return this.firstStack.pop();
    }
}