package com.srikar.java;

import java.util.Arrays;
import java.util.List;

/**
 * Created by vedantas on 1/28/2018.
 */
public class LinkedListSwapNodes {
    /*
        Algorithm
        =========
        1. Consider the cases of one, two, three, and four nodes in the list and design the swap algorithm.
        2. Swap the nodes in pairs
        3. If there are odd number of nodes in the list, the last node should not be swapped.
        4. Take care of potential null pointer exceptions.
     */

    private Node<Integer> start;

    public LinkedListSwapNodes() {
        start = null;
    }

    private void buildList(List<Integer> items) {
        start = null;
        Node<Integer> prev = null;
        for (Integer item : items) {
            Node<Integer> node = new Node<>(item);
            if (start == null) {
                start = node;
            } else {
                prev.next = node;
            }
            prev = node;
        }
    }

    public void traverse() {
        Node<Integer> node = start;
        while (node != null) {
            System.out.print(node.item + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public void swapNodes() {
        Node<Integer> node = start;
        // Track the first swap so that the list "start" cursor can be updated.
        boolean isFirst = true;
        while (node != null && node.next != null) {
            // Keep track of third node address
            Node<Integer> temp = node.next.next;
            // Update the second node's next to first node's address/reference
            node.next.next = node;
            // Check if this is the first swap and update the list "start" to second node reference
            if (isFirst) {
                start = node.next;
                isFirst = false;
            }
            if (temp != null && temp.next != null) {
                // Point the first node's next to the fourth node if it exists
                node.next = temp.next;
            } else
                // Otherwise, point it to the third node or null.
                node.next = temp;
            // Repeat the swap process from the third node.
            node = temp;
        }
    }

    // Generics for fun!
    class Node<T> {
        T item;
        Node<T> next;

        public Node(T item) {
            this.item = item;
            next = null;
        }

        public T getItem() {
            return item;
        }

        public Node<T> getNext() {
            return next;
        }
    }

    public static void main(String[] args) {
        LinkedListSwapNodes llsn = new LinkedListSwapNodes();
        llsn.buildList(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("Original List: ");
        llsn.traverse();
        llsn.swapNodes();
        System.out.println("Swappped List: ");
        llsn.traverse();
    }

}
