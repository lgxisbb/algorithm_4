package com.gxl.algorithm4.chapter;

import edu.princeton.cs.algs4.StdOut;

import java.util.Optional;

/**
 * @Author Lucky Dragon
 * @CreateTime 2018/7/4 21:35
 * @Description
 */
public class SortBasic {


    /**
     * c1 < c2 return true
     * c1 >= c2 return false
     *
     * @param c1
     * @param c2
     * @return
     */
    public static Boolean less(Comparable c1, Comparable c2) {
        return c1.compareTo(c2) < 0;
    }

    /**
     * The exchange of two elements in the array
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void exch(Comparable[] arr, Integer i, Integer j) {
        if (i > -1 && arr.length > j) {
            Comparable c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
        }
    }

    /**
     * make element do print to stdout in the array
     *
     * @param arr
     */
    public static void show(Comparable[] arr) {
        for (Comparable comparable : arr) {
            StdOut.print(comparable + " ");
        }
        StdOut.println();
    }

    /**
     * judge the arr is sort
     *
     * @return
     */
    public static Boolean sort(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (less(arr[i], arr[i - 1]))
                return false;

        }
        return true;
    }

}
