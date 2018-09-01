/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.source;

import java.util.LinkedList;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/9/1 19:45
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("hello");
        list.add(0, "fi");
        System.out.println(list);
    }
}
