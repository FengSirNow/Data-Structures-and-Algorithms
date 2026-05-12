package com.baidu.algorithm.prim;

/**
 * @author 冯纪元
 * @ClassName MGraph
 * @description: TODO
 * @datetime 2026年 05月 12日 14:54
 * @version: 1.0
 */
public class MGraph {
    int verxs; //表示图的节点个数 char[] data;//存放结点数据
    int[][] weight; //存放边，就是我们的邻接矩阵
    char[] data;//存放结点数据

    public MGraph(int verxs) {
        this.verxs = verxs;
        data = new char[verxs];
        weight = new int[verxs][verxs];
    }
}
