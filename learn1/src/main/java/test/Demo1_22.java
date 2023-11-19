package test;

public class Demo1_22 {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;//new StringBuilder().append("a").append("2").toString()  new String("ab")
        String s5 = "a" + "b";//javac 在编译期间的优化，结果已经在编译期间确定为ab，因为这个ab
        //小技巧：上卖弄这个s5因为是里面的ab是常量，所以确定了不会变，所以他会在原来的串池当中去寻找，s4，是引用的变量，他在编译的时候认为他可能会发生变化，所以就去new了一个新的出来
        System.out.println(s4 == s5);//true
    }
}
