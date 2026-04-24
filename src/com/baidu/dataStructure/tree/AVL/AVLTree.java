package com.baidu.dataStructure.tree.AVL;

import com.baidu.dataStructure.tree.Node;

/**
 * @author 冯纪元
 * @ClassName AVLTree
 * @description: TODO
 * @datetime 2026年 04月 24日 15:47
 * @version: 1.0
 */
public class AVLTree {
    Node root;
    public Node leftSpan(){
            Node temp = new Node(root.number);
            temp.left = root.left;
            temp.right=root.right.left;
            root.right.left=temp;
            return root.right;
    }
    public void add(Node node){
        if (root==null){
            root = node;
            return;
        }
        this.root.add(node);
    }
    public Node rightSpan(){
        Node temp = new Node(root.number);
        temp.left = root.right;
        temp.right=root.left.right;
        root.left.right=temp;
        return root.left;
    }
    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root);
        preOrder(root.left);
        preOrder(root.right);
    }
}
