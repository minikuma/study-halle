package me.minikuma.weak5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by wminikuma@gmail.com on 2020/12/14
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class BinaryTree {
    // Node 클래스
    static class Node {
        private int value;
        private Node left;
        private Node right;

        public void setValue(int value) {
            this.value = value;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public Node makeNode(Node left, int value, Node right) {
        Node node = new Node();
        node.setValue(value);
        node.setLeft(left);
        node.setRight(right);
        return node;
    }

    ArrayList<Integer> values = new ArrayList<>();

    // in-order: left -> root -> right) -> stack / 재귀 가능
    public void dfs(Node node) {
        if (node != null) {
            dfs(node.left);
            values.add(node.value);
            dfs(node.right);
        }
    }

    public List<Integer> getDfsValues() {
        return values;
    }

    // level-order -> QUEUE 방식
    public List<Integer> bfs(Node node) {
        Queue<Node> stack = new LinkedList<>();
        List<Integer> result = new ArrayList<>(); // 최종 결과

        Node startNode = node;
        stack.add(startNode);

        while (!stack.isEmpty()) {
            Node currentNode = stack.poll();
            result.add(currentNode.value);

            if (currentNode.left != null) {
                stack.add(currentNode.left);
            }
            if (currentNode.right != null) {
                stack.add(currentNode.right);
            }
        }
        return result;
    }
}
