package com.gxl.algorithm4;

import com.gxl.algorithm4.chapter.SortBasic;
import edu.princeton.cs.algs4.StdOut;

import java.util.Optional;
import java.util.Random;

/**
 * @Author Lucky Dragon
 * @CreateTime 2018/7/5 14:35
 * @Description
 */
public class Test {

    /**
     * 测试100个元素
     *
     * @param sort
     */
    public static void test100(Sort sort) {
        test(sort, 100);
    }

    /**
     * 测试1000个元素
     *
     * @param sort
     */
    public static void test1000(Sort sort) {
        test(sort, 1000);
    }

    /**
     * 测试1000个元素
     *
     * @param sort
     */
    public static void test10000(Sort sort) {
        test(sort, 10000);
    }

    /**
     * 测试1000个元素
     *
     * @param sort
     */
    public static void test100000(Sort sort) {
        test(sort, 100000);
    }
    /**
     * 测试排序
     *
     * @param sort
     */
    public static void test(Sort sort, Integer toplimit) {
        Random random = new Random();
        Comparable[] arr = new Comparable[toplimit];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(toplimit * 10);
        }
        sort(sort, arr);
    }

    /**
     * 对元素进行排序
     *
     * @param sort
     * @param arr
     */
    public static void sort(Sort sort, Comparable[] arr) {
        SortBasic.show(arr);
        long begin = System.currentTimeMillis();
        Comparable[] sortArr = sort.sort(arr);
        System.out.println("排序用时: " + (System.currentTimeMillis() - begin) + " ms");
        SortBasic.show(sortArr);
    }
}
