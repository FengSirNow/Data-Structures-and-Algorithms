package com.baidu.algorithm.greedy;

import java.util.*;

/**
 * @author 冯纪元
 * @ClassName Greedy
 * @description: TODO
 * @datetime 2026年 05月 08日 10:54
 * @version: 1.0
 */
public class Greedy {
    public static void main(String[] args) {
        Map<String, Set<String>> map = new HashMap<>();
        Set<String> set1 = new HashSet<>();
        set1.add("北京");
        set1.add("上海");
        set1.add("天津");
        Set<String> set2 = new HashSet<>();
        set2.add("北京");
        set2.add("广州");
        set2.add("深圳");
        Set<String> set3 = new HashSet<>();
        set3.add("成都");
        set3.add("上海");
        set3.add("杭州");
        Set<String> set4 = new HashSet<>();
        set4.add("上海");
        set4.add("天津");
        Set<String> set5 = new HashSet<>();
        set5.add("杭州");
        set5.add("大连");
        map.put("K1",set1);
        map.put("K2",set2);
        map.put("K3",set3);
        map.put("K4",set4);
        map.put("K5",set5);
        
        // 合并所有集合并去重
        Set<String> allCities = new HashSet<>();
        allCities.addAll(set1);
        allCities.addAll(set2);
        allCities.addAll(set3);
        allCities.addAll(set4);
        allCities.addAll(set5);

        List<String> list = new ArrayList<>();

        while (allCities.size()!=0){
            String key = null;
            int amount  = 0;
            Map<String,Integer> integerMap = new HashMap<>();
            Set<String> set = map.keySet();
            for (String s : set) {
                Set<String> stringSet = new HashSet<>(allCities);
                stringSet.retainAll(map.get(s));
                if (stringSet.size()>amount){
                    amount = stringSet.size();
                    key = s;
                }
            }
            list.add(key);
            allCities.removeAll(map.get(key));
            map.remove(key);
        }
        System.out.println(list);
    }
}
