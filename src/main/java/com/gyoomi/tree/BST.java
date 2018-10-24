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

    /**
     * 向二分搜索树中添加元素
     *
     * @param e
     */
    public void add(E e) {
        if (root == null) {
            root = new Node(e);
        } else {
            add(root, e);
        }
    }

    private void add(Node node, E e) {
        if (node.e.equals(e)) {
            return;
        } else if (e.compareTo(node.e) > 0 && node.right == null) {
            node.right = new Node(e);
            size++;
            return;
        } else if (e.compareTo(node.e) < 0 && node.left == null) {
            node.left = new Node(e);
            size++;
            return;
        }
        if (e.compareTo(node.e) > 0) {
            add(node.right, e);
        } else {
            add(node.left, e);
        }
    }

    class Node {
        public E e;
        public Node left, right;
        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

}
