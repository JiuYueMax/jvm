package test;

public class Demo1_17 {
    public static void main(String[] args) {

    }
    //下面各个方法会不会造成线程安全问题？

    //不会
    public static void m1() {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(2);
        sb.append(3);
        System.out.println(sb.toString());
    }

    //会，可能会有其他线程使用这个对象
    public static void m2(StringBuilder sb) {
        sb.append(1);
        sb.append(2);
        sb.append(3);
        System.out.println(sb.toString());
    }

    //会，其他线程可能会拿到这个线程的引用
    public static StringBuilder m3() {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(2);
        sb.append(3);
        return sb;
    }
}
