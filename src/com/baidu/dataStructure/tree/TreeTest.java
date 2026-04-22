package com.baidu.dataStructure.tree;

/**
 * @author 冯纪元
 * @ClassName TreeTest
 * @description: TODO
 * @datetime 2026年 04月 22日 16:22
 * @version: 1.0
 */
public class TreeTest {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.left = node2;
        node1.right = node3;
        node3.right = node4;
        node3.left = node5;

//        new Tree().preOrder(node1);
//        new Tree().inOrder(node1);
//        new Tree().postOrder(node1);
        Tree tree = new Tree();
//        Node node = tree.preFind(node1,5);
//        Node node = tree.inFind(node1,5);
        Node node = tree.postFind(node1,5);
        System.out.println(node);
        System.out.println(tree.amout);
    }

}
