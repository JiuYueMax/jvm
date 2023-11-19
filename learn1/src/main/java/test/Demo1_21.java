package test;

public class Demo1_21 {
    public static void main(String[] args) {
        String s1="a"; //常量在串池 a
        String s2="b";//常量在串池 b
        String s3="a"+"b";//常量在串池 ab
        String s4=s1+s2;//new String("ab")
        String s5="ab";//常量在串池 ab
        String s6=s4.intern();//常量在串池 ab
        System.out.println(s3==s4 + "---" +s3.hashCode()+ "---" +s4.hashCode());//false
        System.out.println(s3==s5);//true
        System.out.println(s3==s6);//true

        String x2=new String("c")+new String("d");// c 在串池、d 在串池， cd 在堆内存中
        String x1="cd";//cd 在串池中
        x2.intern();// 这个时候cd 放入串池中发现串池已经有了cd 则返回串池中的cd，但是x2 依旧是在堆内存中
        System.out.println(x1==x2);// false


        String x4=new String("e")+new String("f");//e f 放入串池, ef 在堆内存中
        x4.intern();// ef 放入串池中，并返回串池里的ef
        String x3="ef";//ef 发现在串池中，返回串池里面的ef
        System.out.println(x3==x4); //true 这时候x4 和 x3 都是在串池里面
    }
}
