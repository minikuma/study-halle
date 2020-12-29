package me.minikuma.week4.likedlist;

import java.rmi.AccessException;
import java.util.ArrayList;

/**
 * Created by wminikuma@gmail.com on 2020/12/09
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class ListNode {

    static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node h;
    private int curr = -1;

    public Node indexOf(int pos) throws Exception {
        if (pos < 0) throw new Exception("Out of index range");
        Node x = h;
        for (int i = 0; i < pos; i++) {
            x = x.next;
        }
        return x;
    }


    public Node add(Node head, Node addNode, int position) throws Exception {
        // empty
        if (head == null) {
            this.h = addNode;
            curr++;
            return h;
        } else {
            Node temp1 = indexOf(position - 1);
            Node temp2 = temp1.next;
            temp1.next = addNode;
            addNode.next = temp2;
            curr++;
            return addNode;
        }
    }

    public Node remove(Node head, int positionToRemove) throws Exception {
        if (positionToRemove == 0 || curr == 0) {
            throw new AccessException("Head 로 지정된 값은 변경할 수 없습니다.");
        } else {
            Node prev = indexOf(positionToRemove - 1);
            Node next = indexOf(positionToRemove + 1);
            Node origin = indexOf(positionToRemove);
            prev.next = next;
            origin.next = null;
            curr--;
            return next;
        }
    }

    public Boolean contains(Node head, Node nodeToCheck) {
        Node findNode = head;
        for (int i = 0; i <= curr; i++) {
            if (findNode == nodeToCheck) {
                return true;
            }
            findNode = findNode.next;
        }
        return false;
    }

    public ArrayList<Object> getValues() {
        Node curr = h;
        ArrayList<Object> values = new ArrayList<>();
        while (curr != null) {
            values.add(curr.data);
            curr = curr.next;
        }
        return values;
    }
}
