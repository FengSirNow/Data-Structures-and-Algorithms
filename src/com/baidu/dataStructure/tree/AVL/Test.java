package com.baidu.dataStructure.tree.AVL;

import com.baidu.dataStructure.tree.Node;

/**
 * @author 冯纪元
 * @ClassName Test
 * @description: TODO
 * @datetime 2026年 04月 23日 16:08
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {4, 3, 10, 8, 7, 9, 6,12};
        AVLTree bstTree = new AVLTree();
        for (int i = 0; i < arr.length; i++) {
            Node node = new Node(arr[i]);
            bstTree.add(node);
        }
        Node node = bstTree.leftSpan();
        bstTree.preOrder(node);
    }
}
