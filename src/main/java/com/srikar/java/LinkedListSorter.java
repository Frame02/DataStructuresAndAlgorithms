package com.srikar.java;

import java.util.Scanner;

/**
 * Created by vedantas on 1/30/2018.
 */
public class LinkedListSorter {
    /*
        Algorithm
        =========

        1. Sort the linked list at the time of creation itself.
        2. Apply insertion sort.
        3. Maintain/keep track of 'prev' node.

     */

    private Node start;
    private Scanner scanner;

    public LinkedListSorter() {
        start = null;
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        LinkedListSorter lls = new LinkedListSorter();
        lls.buildList();
        System.out.println("Sorted list: " + lls);
    }

    private int getInput() {
        System.out.print("Enter item (enter '-1' to terminate input): ");
        return scanner.nextInt();
    }

    public void buildList() {
        while (true) {
            int i = getInput();
            if (i == -1) {
                break;
            }

            if (start == null) {
                start = new Node(i);
            } else {
                Node a = start, prev = null;
                do {
                    if (i < a.item) {
                        Node temp = new Node(i);
                        if (prev != null) {
                            temp.next = prev.next;
                            prev.next = temp;
                        } else {
                            temp.next = start;
                            start = temp;
                        }
                        break;
                    }
                    prev = a;
                    a = a.next;
                } while (a != null);
                if (a == null){
                    prev.next = new Node(i);
                }
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[ ");
        for(Node i = start; i != null; i = i.next){
            sb.append(i.item);
            sb.append(" ");
        }
        sb.append("]");
        return sb.toString();
    }

    private class Node {
        int item;
        Node next;

        Node(int i) {
            item = i;
        }

        @Override
        public String toString() {
            return Integer.toString(item);
        }
    }
}
