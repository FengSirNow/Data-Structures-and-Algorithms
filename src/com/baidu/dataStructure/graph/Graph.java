package com.baidu.dataStructure.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * @author 冯纪元
 * @ClassName Graph
 * @description: TODO
 * @datetime 2026年 05月 06日 10:12
 * @version: 1.0
 */
public class Graph {
    private ArrayList<String> vertexList;
    private int[][] edges;
    private int numOfEdges;
    private boolean[] isVisited;

    public static void main(String[] args) {
        String[] vertexs = {"1", "2", "3", "4", "5", "6", "7", "8"};
        Graph graph = new Graph(8);
        for (String vertex : vertexs) {
            graph.insertVertex(vertex);
        }
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 2);
        graph.insertEdge(1, 3);
        graph.insertEdge(1, 4);
        graph.insertEdge(3, 7);
        graph.insertEdge(4, 7);
        graph.insertEdge(2, 5);
        graph.insertEdge(2, 6);
        graph.insertEdge(5, 6);
//        for (String vertex : vertexs) {
//            graph.dfs(graph.isVisited, vertex);
//        }
        for (String vertex : vertexs) {
            if (!graph.isVisited[graph.vertexList.indexOf(vertex)]){
                graph.bfs(vertex);
            }
        }
    }

    public Graph(int n) {
        edges = new int[n][n];
        vertexList = new ArrayList<String>(n);
        isVisited = new boolean[n];
        numOfEdges = 0;
    }

    public int getFirstNeighbor(int index) {
        for (int i = 0; i < vertexList.size(); i++) {
            if (edges[index][i] > 0) {
                return i;
            }
        }
        return -1;
    }

    public void insertVertex(String vertex) {
        vertexList.add(vertex);
    }

    public void insertEdge(int v1, int v2) {
        edges[v1][v2] = 1;
        edges[v2][v1] = 1;
    }

    public int getNextNeighbor(int v1, int v2) {
        for (int i = v2 + 1; i < vertexList.size(); i++) {
            if (edges[v1][i] > 0) {
                return i;
            }
        }
        return -1;
    }

    public void dfs(boolean[] isVisited, String n) {
        int i = vertexList.indexOf(n);
        if (isVisited[i]) return;
        System.out.print(n+"--->");
        isVisited[i] = true;
        int firstNeighbor = getFirstNeighbor(i);
        while (firstNeighbor!=-1) {
            if (!isVisited[firstNeighbor]) {
                dfs(isVisited, vertexList.get(firstNeighbor));
            }
            firstNeighbor=getNextNeighbor(i,firstNeighbor);
        }
    }
    public void bfs(String n){
        Queue<String> queue = new ArrayDeque<>();
        queue.add(n);
        System.out.print(n+"--->");
        int i = vertexList.indexOf(n);
        isVisited[i]=true;
        while (!queue.isEmpty()){
            String poll = queue.poll();
            int s = vertexList.indexOf(poll);
            int firstNeighbor = getFirstNeighbor(s);
            while (firstNeighbor!=-1){
                if (!isVisited[firstNeighbor]){
                    System.out.print(vertexList.get(firstNeighbor)+"--->");
                    queue.add(vertexList.get(firstNeighbor));
                    isVisited[firstNeighbor]=true;
                }
                firstNeighbor = getNextNeighbor(s,firstNeighbor);
            }
        }
    }
}
