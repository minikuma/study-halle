package me.minikuma.weak5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static me.minikuma.weak5.BinaryTree.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wminikuma@gmail.com on 2020/12/15
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
class BinaryTreeTest {

    @Test
    @DisplayName("이진 트리의 노드 인스턴스 생성 확인")
    void binary_tree_instance_create() {
        BinaryTree bt = new BinaryTree();
        Node n1 = bt.makeNode(null, 3, null);
        System.out.println("n1 instance = " + n1);
        assertNotNull(n1);
    }
}