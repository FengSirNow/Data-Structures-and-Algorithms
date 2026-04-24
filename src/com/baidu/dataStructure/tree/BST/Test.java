package com.baidu.dataStructure.tree.BST;

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
        int[] arr = {7, 3, 10, 12, 5, 1, 2,9,11};
        BSTTree bstTree = new BSTTree();
        for (int i = 0; i < arr.length; i++) {
            Node node = new Node(arr[i]);
            bstTree.add(node);
        }
        bstTree.delete(new Node(2));
        bstTree.preOrder(bstTree.root);
    }
}
