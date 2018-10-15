/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.source;

import java.util.HashMap;
import java.util.Map;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/12 22:33
 */
public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("123", "这123是值");
        map.put("243", "4234");
        map.put("23434", "2regetg");
        Map<String, String> map2 = new HashMap<>(map);
    }
}
