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
        List list = new ArrayList(10);
        list.add(1);
        list.add(2);
        list.add(null);
        list.add(3);
        list.add(null);
        list.add(null);
        list.add(2 ,"2.5");
        System.out.println(list.size());
        System.out.println(list);
    }
}
