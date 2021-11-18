package org.apache.commons.math3.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyMathArraysTest {

    private static MyMathArrays obj = new MyMathArrays();
    final double[] arr1 = {1, 2, 3}, arr2 = {10, 20, 30};

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @Test
    public void scale() {
        double val = 10;
        assertArrayEquals(arr2, obj.scale(val, arr1), 0);
    }

    @Test
    public void ebeAdd() {
        final double[] arr = {11, 22, 33};
        assertArrayEquals(arr, obj.ebeAdd(arr1, arr2), 0);
    }

    @Test
    public void distance() {
        double val = obj.distance(arr2, arr1);
        assertEquals(Math.sqrt(1134), val, 0.001);
    }

    @Test
    public void checkEqualLength() {
        assertEquals(true, obj.checkEqualLength(arr1, arr2, true));
    }
}