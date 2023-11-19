package test.t2;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class Demo2_5 {
    public static int _4MB = 4 * 1024 * 1024;
    public static void main(String[] args) {
        //使用弱引用对象 list和SoftReference是强引用，而SoftReference和byte数组则是弱引用
        List<WeakReference<byte[]>> list=new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            WeakReference<byte[]> ref=new WeakReference<>(new byte[_4MB]);
            list.add(ref);
            for (WeakReference<byte[]> w : list) {
                System.out.print(w.get()+" ");
            }
            System.out.println();
        }
        System.out.println("循环结束："+list.size());
    }

}
