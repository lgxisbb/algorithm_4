package com.gxl.algorithm4.chapter1.sort;

import com.gxl.algorithm4.Sort;
import com.gxl.algorithm4.Test;
import com.gxl.algorithm4.chapter.SortBasic;

/**
 * @Author Lucky Dragon
 * @CreateTime 2018/7/5 16:25
 * @Description 希尔排序
 */
public class ShellSort implements Sort {

    /**
     * 希尔排序根据负载参数把数据分成了很多个段
     *
     * @param arr
     * @return
     */
    @Override
    public Comparable[] sort(Comparable[] arr) {
        int n = arr.length;
        int h = 1;

        // 计算负载因子
        while (h < n / 3)
            h = 3 * h + 1;

        // 计算分次
        while (h >= 1) {
            //
            for (int i = h; i < n; i++) {
                //
                for (int j = i; j >= h && SortBasic.less(arr[j], arr[j - h]); j -= h) {
                    SortBasic.exch(arr, j, j - h);
                }
            }
            h = h / 3;
        }
        return arr;
    }


    public static void main(String[] args) {
        Test.test10000(new ShellSort());
        Test.test10000(new InsertionSort());
    }
}
