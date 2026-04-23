package com.baidu.dataStructure.tree.heffuman;

import com.baidu.dataStructure.tree.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 冯纪元
 * @ClassName HeffumanTree
 * @description: TODO
 * @datetime 2026年 04月 23日 9:08
 * @version: 1.0
 */
public class HeffumanTree {
    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root);
        preOrder(root.left);
        preOrder(root.right);
    }
    public Node sort(int[] arry){
       List<Node> nodeList = new ArrayList<>();
        for (int i : arry) {
            Node node = new Node(i);
            nodeList.add(node);
        }
        while (nodeList.size()>=2){
            getSum(nodeList);
        }
        return nodeList.get(0);
    }
    public void getSum(List<Node> nodeList){
        Collections.sort(nodeList, (n1, n2) -> Integer.compare(n1.number, n2.number));
        Node remove = nodeList.remove(0);
        Node remove1 = nodeList.remove(0);
        Node node = new Node(remove.number + remove1.number);
        node.left = remove;
        node.right = remove1;
        nodeList.add(node);
    }

}
