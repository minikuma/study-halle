package me.minikuma.week4.stack;

import java.util.NoSuchElementException;

/**
 * Created by wminikuma@gmail.com on 2020/12/08
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class MyStack {

    private int top = -1;
    private Integer[] myStack;
    private int myStackSize;

    public MyStack(int capacity) {
        this.myStackSize = capacity;
        myStack = new Integer[this.myStackSize];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == (myStackSize-1);
    }

    public int size() {
        return myStack.length;
    }

    public synchronized void push(int data) {
        if (isFull()) {
            throw new ArrayStoreException("No store Data");
        }
        top++;
        myStack[top] = data;
    }

    public synchronized int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("No data");
        }
        Integer result = myStack[top];
        myStack[top] = null;
        top--;
        return result;
    }
}
