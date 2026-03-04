class SortStack{
      public static Stack < Integer > sortStack(Stack < Integer > stack) {

        Stack<Integer> result = new Stack<>(stack.getMaxSize());

        while (!stack.isEmpty()) {
            int current = stack.pop();

            while (!result.isEmpty() && result.top() < current) {
                stack.push(result.pop());
            }

            result.push(current);
        }

        return result;
    }
}