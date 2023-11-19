package test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * 演示直接内存溢出
 */
public class Demo24_DirectMemoryOverflow {
    static int _100MB = 1024 * 1024 * 100;

    public static void main(String[] args) throws IOException {
        List<ByteBuffer> list = new ArrayList<>();
        int i = 0;
        try {
            while (true) {
                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(_100MB);
                list.add(byteBuffer);
                i++;
            }
        } finally {
            System.out.println(i);
        }

    }
}
