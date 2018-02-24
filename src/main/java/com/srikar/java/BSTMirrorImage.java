package com.srikar.java;

import java.util.Arrays;
import java.util.List;

/**
 * Created by vedantas on 2/24/2018.
 */
public class BSTMirrorImage {
    /*
        Algorithm
        =========

        1. Perform preorder traversal and swap left and right children.
        2. Before mirror image, inorder traversal yields ascending order of nodes.
        3. After mirror image, inorder traversal yields descending order of nodes.

     */

    private TreeNode root;

    public BSTMirrorImage(List<Integer> items) {
        constructBST(items);
    }

    public static void main(String[] args) {
        List<Integer> items = Arrays.asList(45, 2, 89, 32, 1, 99, 17, 76);
        BSTMirrorImage bmi = new BSTMirrorImage(items);
        System.out.print("Before mirror image: ");
        bmi.inorder();
        System.out.println();
        bmi.mirrorImage();

        System.out.print("After mirror image: ");
        bmi.inorder();
        System.out.println();
    }

    public void mirrorImage() {
        doMirrorImage(root);
    }

    private void doMirrorImage(TreeNode r) {
        if (r != null) {
            TreeNode temp = r.left;
            r.left = r.right;
            r.right = temp;

            if (r.left != null)
                doMirrorImage(r.left);
            if (r.right != null)
                doMirrorImage(r.right);
        }
    }

    private void constructBST(List<Integer> items) {
        if (items.size() >= 1) {
            root = new TreeNode(items.get(0));
            for (int i = 1; i < items.size(); ++i) {
                insertIntoBST(root, items.get(i));
            }
        }
    }

    private void insertIntoBST(TreeNode root, int i) {
        if (i < root.item) {
            if (root.left != null) {
                insertIntoBST(root.left, i);
            } else {
                root.left = new TreeNode(i);
            }
        } else {
            if (root.right != null) {
                insertIntoBST(root.right, i);
            } else {
                root.right = new TreeNode(i);
            }
        }
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(TreeNode root) {
        if (root != null) {
            if (root.left != null)
                inorder(root.left);
            System.out.print(root.item + " ");
            if (root.right != null)
                inorder(root.right);
        }
    }

    private class TreeNode {
        int item;
        TreeNode left;
        TreeNode right;

        TreeNode(int i) {
            item = i;
        }
    }
}
