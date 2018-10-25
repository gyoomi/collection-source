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
 * @version 2018/10/25 10:03
 */
public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] nums = {5, 3, 6, 8, 4, 2, 23, 8, 98, 7, -8};
        for (int num : nums) {
            bst.add(num);
        }
        /////////////////
        //      5      //
        //    /   \    //
        //   3    6    //
        //  / \    \   //
        // 2  4     8  //
        /////////////////
//        bst.preOrder();
//        System.out.println();
//        bst.preOrderNR();
//        System.out.println();
//        bst.postOrder();
//        System.out.println();
//        bst.levelOrder();
//        System.out.println();
//        System.out.println(bst.minimum());
//        System.out.println(bst.maximum());
//        bst.removeMin();
//        bst.inOrder();
        bst.removeMax();
        bst.inOrder();
    }
}
