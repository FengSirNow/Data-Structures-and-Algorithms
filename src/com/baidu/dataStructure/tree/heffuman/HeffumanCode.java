package com.baidu.dataStructure.tree.heffuman;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 冯纪元
 * @ClassName HeffumanTree
 * @description: TODO
 * @datetime 2026年 04月 23日 9:08
 * @version: 1.0
 */
public class HeffumanCode {
    Map<Character,StringBuilder> builderMap = new HashMap<>();

    public void getTar(HeffumanNode root,String str,StringBuilder stringBuilder){
        StringBuilder stringBuilder1 = new StringBuilder(stringBuilder);
        stringBuilder1.append(str);
        if (root==null){
            return;
        }
        if (root.data==null){
            getTar(root.left,"0",stringBuilder1);
            getTar(root.right,"1",stringBuilder1);
        }else {
            builderMap.put(root.data,stringBuilder1);
        }
    }
    public void preOrder(HeffumanNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root);
        preOrder(root.left);
        preOrder(root.right);
    }
    public HeffumanNode sort(String str){
        Map<Character, Long> map = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        List<HeffumanNode> nodeList = new ArrayList<>();
        for (Character character : map.keySet()) {
            HeffumanNode heffumanNode = new HeffumanNode(character,map.get(character));
            nodeList.add(heffumanNode);
        }

        while (nodeList.size()>=2){
            getSum(nodeList);
        }
        return nodeList.get(0);
    }
    public void getSum(List<HeffumanNode> nodeList){
        Collections.sort(nodeList, (n1, n2) -> Long.compare(n1.weight, n2.weight));
        HeffumanNode remove = nodeList.remove(0);
        HeffumanNode remove1 = nodeList.remove(0);
        HeffumanNode node = new HeffumanNode(null,remove.weight + remove1.weight);
        node.left = remove;
        node.right = remove1;
        nodeList.add(node);
    }

    public class HeffumanNode{
        Character data;
        Long weight;
        HeffumanNode left;
        HeffumanNode right;

        public HeffumanNode() {
        }

        public HeffumanNode(Character data, Long weight) {
            this.data = data;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "HeffumanNode{" +
                    "data=" + data +
                    ", weight=" + weight +
                    '}';
        }
    }

}
