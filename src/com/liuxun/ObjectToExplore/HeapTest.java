package com.liuxun.ObjectToExplore;

/**
 * 堆内存溢出的最直接测试方式，不停的创建对象
 */
public class HeapTest {

    public static void main(String[] args) {
        while (true){
            Test test = new Test();
        }
    }
}
