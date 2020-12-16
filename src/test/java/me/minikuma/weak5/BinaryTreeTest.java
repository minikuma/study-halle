package me.minikuma.weak5;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static me.minikuma.weak5.BinaryTree.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wminikuma@gmail.com on 2020/12/15
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
class BinaryTreeTest {

    private static BinaryTree bt;
    private static Node n1;
    private static Node n2;
    private static Node n3;
    private static Node n4;
    private static Node n5;
    private static List<Integer> expectedDfsValues = Arrays.asList(4, 2, 5, 1, 3);
    private static List<Integer> expectedBfsValues = Arrays.asList(1, 2, 3, 4, 5);

    @BeforeAll
    static void init() {
        bt = new BinaryTree();
        n4 = bt.makeNode(null, 4, null);
        n5 = bt.makeNode(null, 5, null);
        n2 = bt.makeNode(n4, 2, n5);
        n3 = bt.makeNode(null, 3, null);
        n1 = bt.makeNode(n2, 1, n3);
        bt.setRoot(n1);
    }

    @Test
    @DisplayName("이진 트리의 인스턴스 생성 확인")
    void binary_tree_instance_create() {
        assertNotNull(bt);
        assertNotNull(n1);
        assertNotNull(n2);
        assertNotNull(n3);
        assertNotNull(n4);
        assertNotNull(n5);
    }

    @Test
    @DisplayName("이진 트리 생성된 값 확인")
    void create_value_check() {
        assertEquals(1, n1.getValue());
        assertEquals(2, n2.getValue());
        assertEquals(3, n3.getValue());
        assertEquals(4, n4.getValue());
        assertEquals(5, n5.getValue());
    }

    @Test
    @DisplayName("DFS 값 확인")
    void dfs_values_check() {
        // 예상 값: 4,2,5,1,3
        bt.dfs(bt.getRoot());
        List<Integer> values = bt.getDfsValues();
        for (int i = 0; i < values.size(); i++) {
            assertEquals(values.get(i), expectedDfsValues.get(i));
        }
    }

    @Test
    @DisplayName("BFS 값 확인")
    void bfs_values_check() {
        // 예상 값: 1, 2, 3, 4, 5
        List<Integer> values = bt.bfs(bt.getRoot());
        for (int i = 0; i < values.size(); i++) {
            assertEquals(values.get(i), expectedBfsValues.get(i));
        }
    }
}