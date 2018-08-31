/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.source;

import java.util.stream.Stream;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/8/30 23:25
 */
public class ArrarListDemo {

    public static void main(String[] args) {
        /*List list1 = new ArrayList();
        list1.add(1);
        list1.add("haha");
        List list = new ArrayList(list1);
        System.out.println(list);*/
        int i = 2;
        String[] arr = new String[10];
        arr[i++] = "haha";
        Stream.of(arr).forEach(System.out::println);
        System.out.println(i);
    }
}
