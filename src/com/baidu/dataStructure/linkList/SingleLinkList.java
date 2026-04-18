package com.baidu.dataStructure.linkList;

/**
 * @author 冯纪元
 * @ClassName SingleLinkList
 * @description: TODO
 * @datetime 2026年 04月 18日 16:41
 * @version: 1.0
 */
public class SingleLinkList {
    Node head;

    public SingleLinkList() {

    }

    public SingleLinkList(Node head) {
        this.head = head;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;

        }
        current.next = newNode;
    }

    public int getSize() {
        if (head == null) {
            return 0;
        }
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    public Node getCountdown(int count) {
        if (head == null) {
            return null;
        }
        int size = getSize();
        if (size < count) {
            return null;
        }
        Node pre = head;
        for (int i = 0; i < count; i++) {
            pre = pre.next;
        }
        Node tail = head;
        while (pre != null) {
            pre = pre.next;
            tail = tail.next;
        }
        return tail;
    }

    public Node reserve() {
        if (head == null) {
            return null;
        }
        Node newNode = null;
        Node temp = head;
        while (temp != null) {
            Node node = temp.next;
            temp.next = newNode;
            newNode = temp;
            temp = node;
        }
        return newNode;
    }
}
