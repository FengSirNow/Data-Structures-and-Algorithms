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
    public void add(Node root,Node node){
        if (node.number<root.number){
            if (root.left==null){
                root.left = node;
            }else {
                add(root.left,node);
            }
        }else {
            if (root.right==null){
                root.right=node;
            }else {
                add(root.right,node);
            }
        }
    }
}
