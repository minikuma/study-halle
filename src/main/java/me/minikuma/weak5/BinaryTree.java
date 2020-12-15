package me.minikuma.weak5;

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

    // in-order: left -> root -> right) -> stack / 재귀 가능
    public void dfs(Node node) {
        if (node != null) {
            dfs(node.left);
            System.out.print(node.value);
            dfs(node.right);
        }
    }

    // level-order -> QUEUE 방식 (방문한 노드 체크 필수)
    public void bfs(Node node) {

    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node n4 = bt.makeNode(null, 4, null);
        Node n5 = bt.makeNode(null, 5, null);
        Node n2 = bt.makeNode(n4, 2, n5);
        Node n3 = bt.makeNode(null, 3, null);
        Node n1 = bt.makeNode(n2, 1, n3);
        bt.setRoot(n1);
        bt.dfs(bt.getRoot());
    }
}
