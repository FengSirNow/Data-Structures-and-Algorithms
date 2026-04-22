package com.baidu.dataStructure.tree;

/**
 * @author 冯纪元
 * @ClassName Tree
 * @description: TODO
 * @datetime 2026年 04月 22日 16:19
 * @version: 1.0
 */
public class Tree {
    Node root;
    int amout = 0;

    public Tree() {
    }

    public Tree(Node root) {
        this.root = root;
    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root);
        inOrder(root.right);
    }

    public void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root);
    }

    public Node preFind(Node root, int i) {
        if (root == null) {
            return null;
        }
        amout++;
        if (root.number == i) return root;
        Node node = preFind(root.left, i);
        if (node != null) {
            return node;
        }
        return preFind(root.right, i);
    }

    public Node inFind(Node root, int i) {
        if (root == null) {
            return null;
        }
        Node node = inFind(root.left, i);
        if (node != null) {
            return node;
        }
        amout++;
        if (root.number == i) return root;
        return inFind(root.right, i);
    }

    public Node postFind(Node root, int i) {
        if (root == null) {
            return null;
        }

        Node node = postFind(root.left, i);
        if (node != null) {
            return node;
        }
         node = postFind(root.right, i);
        if (node != null) {
            return node;
        }
        amout++;
        if (root.number == i) return root;
        return null;
    }
}
