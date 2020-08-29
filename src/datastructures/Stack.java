package datastructures;

public class Stack {

    private int top;
    private String[] stack;

    public Stack() {
        top = -1;
    }

    public void push(String item) {
        String[] newStack = null;
        if (isEmpty()) {
            newStack = new String[1];
        } else {
            newStack = new String[stack.length + 1];
            for (int i = 0; i < stack.length; i ++) {
                newStack[i] = stack[i];
            }
        }
        top++;
        newStack[top] = item;
        stack = newStack;
    }

    public String pop() {
        if (isEmpty()) {
            return "Stack is empty";
        }
        String poppedItem = stack[top];
        String[] newStack = new String[stack.length - 1];
        for (int i = 0; i < stack.length - 1; i ++) {
            newStack[i] = stack[i];
        }
        top--;
        stack = newStack;
        return poppedItem;
    }

    public String peek() {
        if (isEmpty()) {
            return "Stack is empty";
        }
        return stack[top];
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        for (String item : stack) {
            System.out.println(item);
        }
    }

    private boolean isEmpty() {
        return top == -1;
    }
}
