package test;

import java.util.ArrayList;

/**
 * 演示堆内存溢出 java.lang.OutOfMemoryError: Java heap space
 * -Xmx8m ，最大堆空间的jvm虚拟机参数，默认是4g
 */
public class Demo1_5 {

    public static void main(String[] args) {
        int i = 0;
        try {
            ArrayList<String> list = new ArrayList<>();// new 一个list 存入堆中
            String a = "hello";
            while (true) {
                list.add(a);// 不断地向list 中添加 a
                a = a + a;
                i++;
            }
        } catch (Throwable e) {// list 使用结束，被jc 垃圾回收
            e.printStackTrace();
            System.out.println(i);
        }
    }
}
