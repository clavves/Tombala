/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sevvalcucuktombalaproject;

/**
 *
 * @author 90554
 */
public class SevvalCucukMLinkedList<T> {

    SevvalCucukNode<T> head;

    public SevvalCucukMLinkedList() {
        this.head = null;
    }

    public SevvalCucukMLinkedList(T[][] array) {
        this.head = null;
        insertArray(array);
        display();
    }

    public void insertArray(T[][] kart) {
        SevvalCucukNode<T> currentHead = null;
        SevvalCucukNode<T> prevHead = null;
        for (int i = 0; i < kart.length; i++) {
            SevvalCucukNode<T> current = null;
            for (int j = 0; j < kart[i].length; j++) {
                if (!kart[i][j].equals(-1)) {
                    SevvalCucukNode<T> newNode = new SevvalCucukNode<>(kart[i][j]);
                    if (current == null) {
                        current = newNode;
                        if (i == 0) {
                            head = newNode;
                        } else {
                            prevHead.down = newNode;
                            prevHead = prevHead.next;
                        }

                        if (currentHead == null) {
                            currentHead = current;
                        }
                    } else {
                        current.next = newNode;
                        current = current.next;
                    }
                }
            }
            prevHead = currentHead;
            currentHead = null;
        }
    }

    public boolean callOutNumber(int number) {
        boolean found = false;
        SevvalCucukNode<T> current = head;
        while (current != null) {
            SevvalCucukNode<T> currentNode = current;
            while (currentNode != null) {
                if (currentNode.data.equals((T) Integer.valueOf(number)) && !currentNode.getIsCalledOut()) {
                    currentNode.setIsCalledOut(true);
                    System.out.println(currentNode.data + "exist in this array.");
                    found = true;
                    return true;
                }
                currentNode = currentNode.next;
            }
            current = current.down;
        }
        if (!found) {
            System.out.println("This Number doesn't exist");
        }
        return false;
    }

    public int checkCinko() {
        int cinkoCount = 0;
        SevvalCucukNode<T> current = head;
        while (current != null) {
            boolean cinko = true;
            SevvalCucukNode<T> temp = current;
            while (temp != null) {
                if (!temp.getIsCalledOut()) {
                    cinko = false;
                    break;
                }
                temp = temp.next;
            }
            if (cinko) {
                cinkoCount++;
            }
            current = current.down;
        }
        if (cinkoCount > 0) {
            if (cinkoCount == 3) {
                System.out.println("Tombala!");
            } else {
                System.out.println(cinkoCount + ". Çinko!");
            }
        }
        return cinkoCount;
    }

    public void display() {
        SevvalCucukNode<T> currentRow = head;
        while (currentRow != null) {
            SevvalCucukNode<T> current = currentRow;
            while (current != null) {
                System.out.print("[" + current.data + "] ");
                if (current.next != null) {
                    System.out.print("-> ");
                }
                current = current.next;
            }
            System.out.println();
            if (currentRow.down != null) {
                SevvalCucukNode<T> nextRow = currentRow.down;
                SevvalCucukNode<T> nextNode = nextRow;
                while (nextNode != null) {
                    System.out.print("|     ");
                    if (nextNode.next != null) {
                        System.out.print("  ");
                    }
                    nextNode = nextNode.next;
                }
                System.out.println();
            }
            currentRow = currentRow.down;
        }
    }
}
