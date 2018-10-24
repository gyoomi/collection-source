/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.tree;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/24 10:50
 */
public class BST<E extends Comparable<E>> {

    private Node root;
    private int size;

    class Node {
        public E e;
        public Node left, right;
        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    public BST() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
