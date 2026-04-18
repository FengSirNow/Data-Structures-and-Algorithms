package com.baidu.dataStructure.linkList;

/**
 * @author 冯纪元
 * @ClassName Node
 * @description: TODO
 * @datetime 2026年 04月 18日 16:40
 * @version: 1.0
 */

public class Node {
    int data;

    public Node() {
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }

    Node next;
    public Node(int data) {
        this.data = data;
    }
}
