package com.company;

import java.util.*;

public class exce3 {
    public static void main(String s[]) {
        Set<MyObject> objects = new LinkedHashSet<MyObject>();
        objects.add(new MyObject());
        objects.add(new MyObject());
        objects.add(new MyObject());
        System.out.println(objects.size());
        while (true) {
            objects.add(new MyObject());
            System.out.println(objects.size());

        }
//        System.gc();
    }
}

class MyObject {
    //设置默认数组长度为99999更快的发生OutOfMemoryError
    List<String> list = new ArrayList<>(99999);
}
