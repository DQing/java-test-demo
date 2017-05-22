package com.company;

/*
* 如果长生命周期的对象持有短生命周期的引用，就很可能会出现内存泄露
* 作用域尽量小
* 不管GC何时会开始清理，我们都应及时的将无用的对象标记为可被清理的对象。
* */
public class exce2 {
    Object object;

    public void method1() {

        System.out.println("hello this is method1");
        object = new Object();
//        object = null; 改进方法
    }

    public static void main(String[] args) {
        exce2 e2 = new exce2();
        e2.method1();
        System.out.println(e2.object);

    }
}
