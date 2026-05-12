package com.baidu.algorithm.prim;

/**
 * @author 冯纪元
 * @ClassName PrimAlgorithm
 * @description: TODO
 * @datetime 2026年 05月 12日 14:49
 * @version: 1.0
 */
public class PrimAlgorithm {
    public static void main(String[] args) {
        char[] data = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int verxs = data.length;
        int[][] weight = new int[][]{
                {10000, 5, 7, 10000, 10000, 10000, 2},
                {5, 10000, 10000, 9, 10000, 10000, 3},
                {7, 10000, 10000, 10000, 8, 10000, 10000},
                {10000, 9, 10000, 10000, 10000, 4, 10000},
                {10000, 10000, 8, 10000, 10000, 5, 4},
                {10000, 10000, 10000, 4, 5, 10000, 6},
                {2, 3, 10000, 10000, 4, 6, 10000},};


//创建 MGraph 对象
        MGraph graph = new MGraph(verxs);
//创建一个 MinTree 对象
        MinTree minTree = new MinTree();
        minTree.createGraph(graph, verxs, data, weight);
//输出
        minTree.showGraph(graph);
        minTree.prim(graph,0);
    }
}
