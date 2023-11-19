package test;

public class Demo1_1 {
    public static void main(String[] args) {
        System.out.println(method1());
    }

    private static int method1() {
        return method2(1,2);
    }

    private static int method2(int a, int b) {
        int c = a + b;
        return c;
    }
}
