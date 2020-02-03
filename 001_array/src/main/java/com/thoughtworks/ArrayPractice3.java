package com.thoughtworks;

public class ArrayPractice3 {

    /**
     * 完成本方法实现功能: 将一个整型数组array中值0的元素去掉，并把剩下的元素组成新的数组
     */
    public static int[] filterZero(int[] array) {
        int[] li = new int[array.length];
        int index = 0;
        for (int i=0; i<array.length;i++){
            if (array[i] != 0){
                li[index] = array[i];
                index += 1;
            }
        }
        int[] result = new int[index];
        for (int i=0; i<index; i++){
            result[i] = li[i];
        }
        return result;
    }
}
