import datastructures.Stack;

public class DataStructureTest {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("test1");
        stack.push("test2");
        stack.push("test3");
        System.out.println(stack.peek());
        stack.show();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.show();
    }
}