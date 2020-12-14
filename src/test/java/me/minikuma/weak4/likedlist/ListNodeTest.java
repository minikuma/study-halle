package me.minikuma.weak4.likedlist;

import org.junit.jupiter.api.*;

import static me.minikuma.weak4.likedlist.ListNode.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wminikuma@gmail.com on 2020/12/09
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
class ListNodeTest {

    @Test
    @DisplayName("노드를 추가하고 제거한다.")
    public void node_add() throws Exception {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        ListNode l = new ListNode();

        l.add(null, head, 0);
        l.add(head, n2, 1);
        l.add(head, n3, 2);
        l.add(head, n4, 1);

        assertEquals(1, l.getValues().get(0));
        assertEquals(4, l.getValues().get(1));
        assertEquals(2, l.getValues().get(2));
        assertEquals(3, l.getValues().get(3));

        l.remove(head, 3);
        l.remove(head, 1);
        l.remove(head, 1);
    }

    @Test
    @DisplayName("찾고자 하는 노드가 노드 리스트에 존재하는 지 확인한다.")
    public void find_node_check() throws Exception {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node findNode = new Node(6);

        ListNode l = new ListNode();
        l.add(null, head, 0);
        l.add(head, n1, 1);
        l.add(head, n2, 2);
        l.add(head, n3, 3);

        assertEquals(false, l.contains(head, findNode));
    }
}