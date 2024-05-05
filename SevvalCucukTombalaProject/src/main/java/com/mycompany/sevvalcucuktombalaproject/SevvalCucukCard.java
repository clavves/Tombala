/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sevvalcucuktombalaproject;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author 90554
 */
public class SevvalCucukCard {

    int[][] kart;
    SevvalCucukMLinkedList<Integer> kartList;

    public SevvalCucukCard() {
        kart = new int[3][9];
        generateNumbers();
        Integer[][] kartInteger = new Integer[kart.length][];
        for (int i = 0; i < kart.length; i++) {
            kartInteger[i] = new Integer[kart[i].length];
            for (int j = 0; j < kart[i].length; j++) {
                kartInteger[i][j] = kart[i][j];
            }
        }
        kartList = new SevvalCucukMLinkedList<>(kartInteger);
    }
    
    public SevvalCucukCard(int[][] array) {
        kart = new int[3][9];
        kart = array;
        Integer[][] kartInteger = new Integer[kart.length][];
        for (int i = 0; i < kart.length; i++) {
            kartInteger[i] = new Integer[kart[i].length];
            for (int j = 0; j < kart[i].length; j++) {
                kartInteger[i][j] = kart[i][j];
            }
        }
        kartList = new SevvalCucukMLinkedList<>(kartInteger);
    }

    public void generateNumbers() {
        Random randomCardNumber = new Random();
        boolean[] used = new boolean[91];
        for (int i = 0; i < 3; i++) {
            int[] numbers = new int[9];
            int maxNumber = 0;
            while (maxNumber < 5) {
                int number;
                if (maxNumber == 0) {
                    number = randomCardNumber.nextInt(9) + 1;
                } else {
                    number = randomCardNumber.nextInt(90) + 1;
                    while (number < 10) {
                        number = randomCardNumber.nextInt(90) + 1;
                    }
                }
                if (number != -1 && !used[number]) {
                    numbers[maxNumber] = number;
                    used[number] = true;
                    maxNumber++;
                }
            }

            for (int j = 5; j < 9; j++) {
                numbers[j] = -1;
            }

            mixNumbers(numbers);
            kart[i] = numbers;
        }
    }

    public static void mixNumbers(int[] array) {
        Random rndm = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int a = rndm.nextInt(i) + 1;
            int tmp = array[a];
            array[a] = array[i];
            array[i] = tmp;
        }
    }
}
