package com.baidu.algorithm.kruskal;

/**
 * @author 冯纪元
 * @ClassName KruskalAlgorithm
 * @description: TODO
 * @datetime 2026年 05月 13日 15:23
 * @version: 1.0
 */
public class KruskalAlgorithm {
        private int edgeNum; //边的个数
        private char[] vertexs; //顶点数组 private int[][] matrix; //邻接矩阵
//使用 INF 表示两个顶点不能连通
        private static final int INF = Integer.MAX_VALUE;
    public static void main(String[] args) {
        char[] vertex = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int[][] matrix = new int[][]{
                {0, 12, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 16, 14},
                {12, 0, 10, Integer.MAX_VALUE, Integer.MAX_VALUE, 7, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 10, 0, 3, 5, 6, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 3, 0, 4, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 5, 4, 0, 2, 8},
                {16, 7, 6, Integer.MAX_VALUE, 2, 0, 9},
                {14, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 8, 9, 0}};
        KGraph graph = new KGraph(vertex.length);
        KMinTree kMinTree = new KMinTree();
        kMinTree.createGraph(graph,vertex,matrix,vertex.length);
        kMinTree.showGraph(graph);
    }

}
