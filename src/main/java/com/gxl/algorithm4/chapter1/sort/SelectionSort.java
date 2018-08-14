package com.gxl.algorithm4.chapter1.sort;

import com.gxl.algorithm4.Sort;
import com.gxl.algorithm4.Test;
import com.gxl.algorithm4.chapter.SortBasic;

/**
 * @Author Lucky Dragon
 * @CreateTime 2018/7/4 21:34
 * @Description 选择排序
 * <p>
 * 选择排序的时间复杂度总是很固定的
 * 就算是一个顺序完全混乱的结构,和一个完全已经排好序的结构.
 * 它们时间复杂度总是一致的遍历总是 O(N²)
 */
public class SelectionSort implements Sort {

    /**
     * 每次遍历的时候
     * 找出当前轮次最小的元素的索引位置
     * 如果索引位置和当前遍历次数不一致,
     * 则代表适合当前位置的数值已经被找到,交换顺序
     *
     * @param arr
     */
    public Comparable[] sort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {

            // min number index
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {

                // In the arr if index j lt  i , change min index is j
                if (SortBasic.less(arr[j], arr[min])) {
                    min = j;
                }
            }

            // if occur change
            if (min != i) {
                SortBasic.exch(arr, i, min);
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        Test.test100(new SelectionSort());
    }
}
