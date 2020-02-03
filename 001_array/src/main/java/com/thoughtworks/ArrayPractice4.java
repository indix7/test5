package com.thoughtworks;

public class ArrayPractice4 {

    /**
     * 完成本方法实现功能: 将一个数字插入到给定的已经排好序的数组中，要求插入以后数组依然是有序的
     */
    public static int[] insert(int number) {
        int[] array = new int[]{1, 20, 50, 100};
        int[] result = new int[array.length+1];
        boolean once = true;
        for (int i=0, index=0; i < array.length; i++, index++){
            if (number <= array[i] && once){
                result[index] = number;
                index += 1;
                result[index] = array[i];
                once = false;
            }else{
                result[index] = array[i];
            }
        }
        if (number > array[array.length-1] && once){
            result[array.length] = number;
        }

        return result;
    }
}
