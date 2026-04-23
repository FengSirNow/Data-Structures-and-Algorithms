package com.baidu.dataStructure.tree.heffuman;

import com.baidu.dataStructure.tree.Node;

/**
 * @author 冯纪元
 * @ClassName HeffumanTreeTest
 * @description: TODO
 * @datetime 2026年 04月 23日 9:29
 * @version: 1.0
 */
public class HeffumanTreeTest {
    public static void main(String[] args) {
        int[] arry = {13,7,8,3,29,6,1};
        HeffumanTree heffumanTree = new HeffumanTree();
        Node sort = heffumanTree.sort(arry);
        heffumanTree.preOrder(sort);

    }
}
