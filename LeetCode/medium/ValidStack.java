package medium;

import java.util.Stack;

public class ValidStack {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int k = 0;
        Stack<Integer> pushedStack = new Stack<>();

        for (int i = 0; i < popped.length; i++) {
            pushedStack.push(pushed[i]);

            while (!pushedStack.isEmpty() && pushedStack.peek() == popped[k]) {
                pushedStack.pop();
                k++;
            }
        }
        return pushedStack.isEmpty();
    }

    public static void main(String[] args) {
        ValidStack validStack = new ValidStack();
        int[] pushed = {1, 0};//{1,2,3,4,5};
        int[] popped = {1, 0}; //{4,3,5,1,2};
        System.out.println(validStack.validateStackSequences(pushed, popped));
    }
}
