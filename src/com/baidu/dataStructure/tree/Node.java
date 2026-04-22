package com.baidu.dataStructure.tree;

/**
 * @author 冯纪元
 * @ClassName Node
 * @description: TODO
 * @datetime 2026年 04月 22日 16:17
 * @version: 1.0
 */
public class Node {
    int number;
    Node left;
    Node right;

    public Node() {
    }

    public Node(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Node{" +
                "number=" + number +
                '}';
    }
}
