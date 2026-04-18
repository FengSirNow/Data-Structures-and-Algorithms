package com.baidu.dataStructure.linkList;

/**
 * @author 冯纪元
 * @ClassName Josephu
 * @description: TODO
 * @datetime 2026年 04月 18日 18:40
 * @version: 1.0
 */
public class Josephu {
    public SingleLinkList list;
    public Node pre;
    public Node tail;
    public Josephu(int size) {
        list = new SingleLinkList();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        pre = list.head;
        tail = pre;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = pre;
    }
    public void seacher(int k,int m){
        if(pre.next == pre){
            System.out.println(pre);
            return;
        }
        for (int i = 0; i < k; i++) {
            pre = pre.next;
            tail = tail.next;
        }
        while(pre.next != pre){
            for (int i = 1; i < m; i++) {
                pre = pre.next;
                tail = tail.next;
            }
            System.out.println(pre);
            pre=pre.next;
            tail.next=pre;
        }
        System.out.println(pre);
    }
}
