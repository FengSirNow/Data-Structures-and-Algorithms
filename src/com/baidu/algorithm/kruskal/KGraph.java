package com.baidu.algorithm.kruskal;

/**
 * @author 冯纪元
 * @ClassName KGraph
 * @description: TODO
 * @datetime 2026年 05月 13日 15:12
 * @version: 1.0
 */
public class KGraph {
    char[] vertex;
    int[][] edge;
    int amount;

    public KGraph(int amount) {
        this.vertex = new char[amount];
        this.edge = new int[amount][amount];
        this.amount = amount;
    }
}
