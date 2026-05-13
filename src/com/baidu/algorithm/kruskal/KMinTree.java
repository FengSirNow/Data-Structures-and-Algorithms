package com.baidu.algorithm.kruskal;

import java.util.Arrays;

/**
 * @author 冯纪元
 * @ClassName KMinTree
 * @description: Kruskal算法求最小生成树
 * @datetime 2026年 05月 13日 15:18
 * @version: 1.0
 */
public class KMinTree {
    public void createGraph(KGraph kGraph, char[] vertex, int[][] edge, int amount) {
        for (int i = 0; i < amount; i++) {
            kGraph.vertex[i] = vertex[i];
            for (int i1 = 0; i1 < amount; i1++) {
                kGraph.edge[i][i1] = edge[i][i1];
            }
        }
    }

    public void showGraph(KGraph kGraph) {
        for (int i = 0; i < kGraph.edge.length; i++) {
            System.out.println(Arrays.toString(kGraph.edge[i]));
        }
    }

    public void kruskal(KGraph kGraph) {
        int[] parent = new int[kGraph.amount];
        for (int i = 0; i < kGraph.amount; i++) {
            parent[i] = i;
        }

        int edgeCount = 0;
        System.out.println("最小生成树的边：");

        while (edgeCount < kGraph.amount - 1) {
            int min = Integer.MAX_VALUE;
            int row = -1, column = -1;

            for (int i = 0; i < kGraph.edge.length; i++) {
                for (int j = i + 1; j < kGraph.edge[i].length; j++) {
                    if (kGraph.edge[i][j] != 0 && kGraph.edge[i][j] < min) {
                        int rootI = find(parent, i);
                        int rootJ = find(parent, j);
                        if (rootI != rootJ) {
                            min = kGraph.edge[i][j];
                            row = i;
                            column = j;
                        }
                    }
                }
            }

            if (row == -1) {
                System.out.println("无法构成最小生成树");
                return;
            }

            System.out.println(kGraph.vertex[row] + " -> " + kGraph.vertex[column] + " : " + min);
            union(parent, row, column);
            kGraph.edge[row][column] = Integer.MAX_VALUE;
            kGraph.edge[column][row] = Integer.MAX_VALUE;
            edgeCount++;
        }
    }

    public int find(int[] parent, int i) {
        if (parent[i] == i) {
            return i;
        } else {
            return find(parent, parent[i]);
        }
    }

    public void union(int[] parent, int i, int j) {
        int rootI = find(parent, i);
        int rootJ = find(parent, j);
        if (rootI != rootJ) {
            parent[rootI] = rootJ;
        }
    }
}
