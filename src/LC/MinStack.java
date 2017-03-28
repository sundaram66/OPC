package LC;

import java.util.Stack;

public class MinStack {

    Stack<Integer> st;
    Stack<Integer> minStack;


    /**
     * initialize your data structure here.
     */
    public MinStack() {
        st = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int x) {
        if (!st.isEmpty()) {
            st.push(x);
            int curr = minStack.peek();

            if (x <= curr) {
                minStack.push(x);
            }
            else
                minStack.push(curr);
        }
        else {
            st.push(x);
            minStack.push(x);
        }

    }


    public void pop() {
        st.pop();
        minStack.pop();


    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

/*    public static void main(String[] args) {
        LC.MinStack minStack = new LC.MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        //minStack.push();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        //minStack.pop();
        System.out.println(minStack.getMin());


    }*/
}
