package StackQueue;

import StackQueue.CustomStack.StackException;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);

        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(89);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        DynamicStack s1 = new DynamicStack(10);
        s1.push(5);
        s1.push(10);
        s1.push(12);
        s1.push(24);
        s1.push(36);
        s1.push(45);
        s1.push(54);
        s1.push(63);
        s1.push(72);
        s1.push(80);

        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}
