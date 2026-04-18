package com.baidu.dataStructure.linkList;

/**
 * @author 冯纪元
 * @ClassName Test
 * @description: TODO
 * @datetime 2026年 04月 18日 16:44
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        SingleLinkList list = new SingleLinkList();
        list.head = head;
        System.out.println("链表的长度为："+list.getSize());
        Node countdown = list.getCountdown(2);
        System.out.println("倒数第k个结点为："+countdown);
        System.out.println(list.reserve());
    }
}
