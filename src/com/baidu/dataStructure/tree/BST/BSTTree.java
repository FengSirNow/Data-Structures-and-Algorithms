package com.baidu.dataStructure.tree.BST;

import com.baidu.dataStructure.tree.Node;

/**
 * @author 冯纪元
 * @ClassName BSTTree
 * @description: TODO
 * @datetime 2026年 04月 23日 16:03
 * @version: 1.0
 */
public class BSTTree {
    Node root;

    public BSTTree(Node root) {
        this.root = root;
    }

    public BSTTree() {
    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root);
        preOrder(root.left);
        preOrder(root.right);
    }
    public void add(Node node){
        if (root==null){
            root = node;
            return;
        }
        this.root.add(node);
    }


    public int getMax(Node node){
        Node target = node.right;
        while (target.left!=null){
            target = target.left;
        }
        delete(target);
        return target.number;
    }

    public void delete(Node node){
        Node node1 = root.getNode(node);
        if (node1.left==null&&node1.right==null){
            Node parent = root.getParent(node);
            if (parent.left==node1){
                parent.left=null;
            }else {
                parent.right=null;
            }
        }else if(node1.left!=null&&node1.right==null){
            Node parent = root.getParent(node);
            if (parent.left==node1){
                parent.left=node1.left;
            }else {
                parent.right=node1.left;
            }
        }else if(node1.left==null&&node1.right!=null){
            Node parent = root.getParent(node);
            if (parent.left==node1){
                parent.left=node1.right;
            }else {
                parent.right=node1.right;
            }
        }else {
            int max = getMax(node1);
            node1.number = max;
        }
    }
}
