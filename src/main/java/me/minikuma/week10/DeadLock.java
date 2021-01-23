package me.minikuma.week10;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wminikuma@gmail.com on 2021/01/22
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class DeadLock {

    static class Friend {

        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        protected static final Object STATIC_LOCK = new Object();

        public void bow(Friend bower) {
            synchronized (STATIC_LOCK) {
                System.out.format("[%s] %s: %s" + " has bowed to me!%n", Thread.currentThread().getName(), this.name, bower.getName());
                bower.bowBack(this);
            }
        }

        public void bowBack(Friend bower) {
            synchronized (STATIC_LOCK) {
                System.out.format("[%s] %s: %s" + " has bowed back to me!%n", Thread.currentThread().getName(), this.name, bower.getName());
            }
        }
    }

    public static void main(String[] args) {
        final Friend alphonse = new Friend("Alphonse");
        final Friend gaston = new Friend("Gaston");
        new Thread(() -> alphonse.bow(gaston)).start();
        new Thread(() -> gaston.bow(alphonse)).start();
    }
}





