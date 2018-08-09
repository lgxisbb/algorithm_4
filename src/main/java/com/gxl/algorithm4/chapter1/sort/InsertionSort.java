package com.gxl.algorithm4.chapter1.sort;

import com.gxl.algorithm4.Sort;
import com.gxl.algorithm4.Test;
import com.gxl.algorithm4.chapter.SortBasic;

/**
 * @Author Lucky Dragon
 * @CreateTime 2018/7/5 14:00
 * @Description 插入排序
 */
public class InsertionSort implements Sort {
    /**
     * 插入排序根据索引的位置,维护一个已排序的空间
     * 索引每次向非排序的空间移动一个位置
     * 就向已排序的空间中依次比较,
     * 若果小于排序空间的值，那么交换他们的顺序
     *
     * @param arr
     */
    public Comparable[] sort(Comparable[] arr) {
        int N = arr.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && SortBasic.less(arr[j], arr[j - 1]); j--) {
                SortBasic.exch(arr, j, j - 1);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Test.test10000(new InsertionSort());
        System.out.println("0------");
        Test.test10000(new SelectionSort());
    }
}
