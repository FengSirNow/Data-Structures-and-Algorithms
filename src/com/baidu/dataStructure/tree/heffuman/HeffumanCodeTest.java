package com.baidu.dataStructure.tree.heffuman;

/**
 * @author 冯纪元
 * @ClassName HeffumanTreeTest
 * @description: TODO
 * @datetime 2026年 04月 23日 9:29
 * @version: 1.0
 */
public class HeffumanCodeTest {
    public static void main(String[] args) {
        String str = "i like like like java do you like a java";
        HeffumanCode heffumanTree = new HeffumanCode();
        HeffumanCode.HeffumanNode sort = heffumanTree.sort(str);
        heffumanTree.preOrder(sort);
        heffumanTree.getTar(sort,"",new StringBuilder());
        System.out.println(heffumanTree.builderMap);
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : str.toCharArray()) {
            StringBuilder stringBuilder1 = heffumanTree.builderMap.get(c);
            stringBuilder.append(stringBuilder1);
        }
        System.out.println(stringBuilder.toString());
    }
}
