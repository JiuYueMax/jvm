package test;

/**
 * 演示
 */
public class Demo23 {

    public static void main(String[] args) {
        // 此处创建字符串对象 "ab" ，因为串池中还没有 "ab" ，所以将其放入串池中
        String str3 = "ab";
        // "a" "b" 被放入串池中，str 则存在于堆内存之中
        String str = new String("a") + new String("b");
        // 此时因为在创建 str3 时，"ab" 已存在与串池中，所以放入失败，但是会返回串池中的 "ab"
        String str2 = str.intern();
        // false
        System.out.println(str == str2);
        // false
        System.out.println(str == str3);
        // true
        System.out.println(str2 == str3);
    }
}
