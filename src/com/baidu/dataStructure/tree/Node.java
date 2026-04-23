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
}
