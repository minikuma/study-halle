package me.minikuma.weak4.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by wminikuma@gmail.com on 2020/12/08
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
class MyStackTest {

    @Test
    @DisplayName("싱글 스레드 기능 테스트 (push / pop)")
    public void test_myStack_single_thread() {
        MyStack myStack = new MyStack(10);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        Assertions.assertEquals(4, myStack.pop());
        Assertions.assertEquals(3, myStack.pop());
        Assertions.assertEquals(2, myStack.pop());
        Assertions.assertEquals(1, myStack.pop());
    }

    @Test
    @DisplayName("스레드 동시성 테스트")
    public void test_myStack_currency() throws InterruptedException {
        int numberThreadCount = 100;
        ExecutorService service = Executors.newFixedThreadPool(100);
        CountDownLatch latch = new CountDownLatch(numberThreadCount);

        MyStack myStack = new MyStack(1); // 공유 자원

        for (int i = 0; i < numberThreadCount; i++) {
            service.execute(() -> {
                myStack.push(3);
                myStack.pop();
                myStack.push(55);
                myStack.pop();
                myStack.push(5);
                myStack.pop();
                latch.countDown();
            });
        }
        latch.await();
        Assertions.assertEquals(true, myStack.isEmpty());
    }

    @Test
    @DisplayName("java api stack 의 동시성 테스트")
    public void test_stack_currency() throws InterruptedException {
        int numberThreadCount = 100;
        ExecutorService service = Executors.newFixedThreadPool(100);
        CountDownLatch latch = new CountDownLatch(numberThreadCount);
        Stack stack = new Stack();

        for (int i = 0; i < numberThreadCount; i++) {
            service.execute(() -> {
                stack.push(3);
                stack.pop();
                stack.push(55);
                stack.pop();
                stack.push(5);
                stack.pop();
                latch.countDown();
            });
        }
        latch.await();
        Assertions.assertEquals(0, stack.size());
    }
}