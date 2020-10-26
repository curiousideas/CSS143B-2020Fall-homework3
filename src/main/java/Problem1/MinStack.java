package Problem1;

public class MinStack extends ArrayStack<Integer> {

    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack
    ArrayStack<Integer> stack;
    ArrayStack<Integer> minVal;

    public MinStack(int size) {
        super(size);
        this.stack = new ArrayStack<Integer>(size);
        this.minVal = new ArrayStack<Integer>(size);
    }

    @Override
    public boolean push(Integer val) {
        if(minVal.size() == 0 || val <= minVal.peek()) {
            minVal.push(val);
        }
        stack.push(val);
        return true;
    }

    @Override
    public Integer pop() {
        if(stack.peek() == minVal.peek()) {
            minVal.pop();
        }
        return stack.pop();
    }

    public Integer getMin() {
        return minVal.peek();
    }
}

