class PostFix{
    public static int evaluatePostFix(String expression) {
        MyStack<Integer> stack = new MyStack<Integer>();

        for(char c : expression.toCharArray()){
            if(Character.isDigit(c)){
                stack.push(Character.getNumericValue(c));
            }else{
                int right = stack.pop();
                int left = stack.pop();
                int result = applyOperator(c, left, right);
                stack.push(result);
            }
        }
        return stack.pop();
    }
    public static int applyOperator(char op, int num1, int num2){
        int result = 0;
        if(op == '+'){
            result = num1 + num2;
        }else if(op == '-'){
            result = num1 - num2;
        }else if(op == '*'){
            result = num1 * num2;
        }else if(op == '/'){
            result = num1 / num2;
        }
        return result;
    }
}