/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.source;

import java.util.ArrayList;
import java.util.List;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/8/30 23:25
 */
public class ArrarListDemo {

    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(1);
        list1.add("haha");
        List list = new ArrayList(list1);
        System.out.println(list);
    }
}
