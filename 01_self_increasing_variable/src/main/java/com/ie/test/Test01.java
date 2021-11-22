package com.ie.test;

import org.junit.Test;

/**
 * @author ddk
 * @date 2021/11/22 9:52 上午
 */

public class Test01 {

    @Test
    public void test(){
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);

    }
}
