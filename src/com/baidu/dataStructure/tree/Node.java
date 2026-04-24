package com.baidu.dataStructure.tree;

import java.io.Serializable;

/**
 * @author 冯纪元
 * @ClassName Node
 * @description: TODO
 * @datetime 2026年 04月 22日 16:17
 * @version: 1.0
 */
public class Node implements Serializable {
   public int number;
  public   Node left;
   public Node right;

    public Node() {
    }

    public Node(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Node{" +
                "number=" + number +
                '}';
    }

    public void add(Node node){
        if (node.number<this.number){
            if (this.left==null){
                this.left = node;
            }else {
                this.left.add(node);
            }
        }else {
            if (this.right==null){
                this.right=node;
            }else {
                this.right.add(node);
            }
        }
    }

    public Node getNode(Node node){
        if (this.number==node.number){
            return this;
        }else if (node.number<this.number&&this.left!=null){
            return this.left.getNode(node);
        }else if (node.number>this.number&&this.right!=null){
            return this.right.getNode(node);
        }else {
            return null;
        }
    }
    public Node getParent(Node node){
        if ((this.left!=null&&this.left.number==node.number)||(this.right!=null&&this.right.number==node.number)){
            return this;
        }else if (node.number<this.number&&this.left!=null){
            return this.left.getParent(node);
        }else if (node.number>this.number&&this.right!=null){
            return this.right.getParent(node);
        }else {
            return null;
        }
    }
}
