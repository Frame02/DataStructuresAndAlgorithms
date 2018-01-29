package com.srikar.java;

import java.util.Scanner;

/**
 * Created by vedantas on 1/29/2018.
 */
public class TwoStacksInAnArray {
    /*
        Algorithm
        =========
        1. Consider two indices one that starts with '-1' and the other that starts with 'a.length'.
        2. Manipulate the indices so that the two stacks of the array can grow dynamically.
     */
    private int[] a;
    private int top1, top2;
    private Scanner scanner;

    public TwoStacksInAnArray(int size) {
        if (size > 0)
            a = new int[size];
        scanner = new Scanner(System.in);
        top1 = -1;
        top2 = size;
    }

    public void play() {
        while (true) {
            System.out.println("Choices available are:");
            System.out.println("1. Push Stack 1 2. Push Stack 2 3. Display stacks 4. Pop Stack 1 5. Pop Stack 2 6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    pushIntoStack1();
                    break;
                case 2:
                    pushIntoStack2();
                    break;
                case 3:
                    displayStacks();
                    break;
                case 4:
                    popFromStack1();
                    break;
                case 5:
                    popFromStack2();
                    break;
                case 6:
                    System.exit(0);

            }
        }
    }

    private void pushIntoStack1() {
        if (top1 + 1 < top2) {
            System.out.println("Enter the element to be pushed into Stack 1: ");
            int element = scanner.nextInt();
            a[++top1] = element;
        } else {
            System.out.println("Out of memory!");
        }
    }

    private void pushIntoStack2() {
        if (top2 - 1 > top1) {
            System.out.println("Enter the element to be pushed into Stack 2: ");
            int element = scanner.nextInt();
            a[--top2] = element;
        } else {
            System.out.println("Out of memory!");
        }
    }

    private void displayStacks() {
        if (top1 == -1) {
            System.out.println("Stack 1 is empty!");
        } else {
            System.out.println("Stack 1 elements:");
            int i = top1;
            while (i >= 0) {
                System.out.println(a[i--]);
            }
        }
        if (top2 == a.length) {
            System.out.println("Stack 2 is empty!");
        } else {
            System.out.println("Stack 2 elements:");
            int i = top2;
            while (i < a.length) {
                System.out.println(a[i++]);
            }
        }
    }

    private void popFromStack1() {
        if (top1 == -1) {
            System.out.println("Element cannot be popped as Stack 1 is empty!");
        } else
            System.out.println("Element popped from Stack 1: " + a[top1--]);
    }

    private void popFromStack2() {
        if (top2 == a.length) {
            System.out.println("Element cannot be popped as Stack 2 is empty!");
        } else {
            System.out.println("Element popped from Stack 2: " + a[top2++]);
        }
    }

    public static void main(String[] args) {
        TwoStacksInAnArray tsia = new TwoStacksInAnArray(6);
        tsia.play();
    }
}
