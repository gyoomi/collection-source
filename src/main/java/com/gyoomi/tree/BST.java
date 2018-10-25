/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
        root = add(root, e);
    }

    /**
     * 向以node为根的二叉树中添加元素
     * 返回添加元素的二叉树的根
     *
     * @param node
     * @param e
     * @return
     */
    private Node add(Node node, E e) {
        // The entrance of recursion
        if (node == null) {
            size++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }
        return node;
    }

    /**
     * 判断二分搜索树中是否包含元素e
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        return contains(root, e);
    }

    private boolean contains(Node node, E e) {
        if (node == null) {
            return false;
        }
        if (e.compareTo(node.e) == 0) {
            return true;
        } else if (e.compareTo(node.e) < 0) {
            return contains(node.left, e);
        } else {
            return contains(node.right ,e);
        }
    }

    /**
     * 二分搜索树前序遍历
     *
     */
    public void preOrder() {
        preOrder(root);
    }

    /**
     * 前序遍历以node为根节点的二分搜索树：递归算法
     *
     * @param node
     */
    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 二分搜索树的前序遍历的非递归实现
     *
     */
    public void preOrderNR() {
        preOrderNR(root);
    }

    /**
     * 非递归的方式实现以node为根节点的而二分搜索树的前序遍历
     *
     * @param node
     */
    private void preOrderNR(Node node) {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            System.out.println(curr.e);
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
    }

    /**
     * 二分搜索树的层级遍历（广度优先遍历）
     *
     */
    public void levelOrder() {
        Queue<Node> list = new LinkedList<>();
        list.add(root);
        while (!list.isEmpty()) {
            Node curr = list.remove();
            System.out.println(curr.e);
            if (curr.left != null) {
                list.add(curr.left);
            }
            if (curr.right != null) {
                list.add(curr.right);
            }
        }
    }

    /**
     * 二分搜索树的中序遍历
     *
     */
    public void inOrder() {
        inOrder(root);
    }

    /**
     * 中序遍历以node为根节点的二分搜索数：recursion
     *
     * @param node
     */
    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }

    /**
     * 二分搜索树后序遍历
     *
     */
    public void postOrder() {
        postOrder(root);
    }

    /**
     * 后序遍历以node为节点的二分搜索树：recursion
     * 典型应用：如C++的二分搜索树需要手动进行内存管理，所以在释放元素时，必须保证其子元素先释放
     *
     * @param node
     */
    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
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
