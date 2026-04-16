package com.baidu.dataStructure.queue;

/**
 * @author 冯纪元
 * @ClassName DoubleQueue
 * @description: 稀疏数组
 * @datetime 2026年 04月 15日 15:16
 * @version: 1.0
 */

public class DoubleQueue {
    public int front =0;
    public int end = 0;
    public int[] array;
    public int max;
    public DoubleQueue(int max){
        this.max = max+1;
        array = new int[max];
    }
    public boolean isEmpty(){
        return front==end;
    }
    public boolean isFull(){
        return (end+1)%max==front;
    }
    public void add(int i){
        if (isFull()){
            System.out.println("队列已满");
            return;
        }
        array[end] = i;
       end = (end+1)%max;
    }
    public void pop(int i){
        if (isEmpty()){
            System.out.println("队列为空");
            return;
        }
        array[front] = i;
        front = (front+1)%max;
    }

    public int aomount(){
        return (end+max-front)%max;
    }
}
