package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Здравствуй! Сколько множителей будем проверять? Введи число от 1 до 9:");
        Scanner scan = new Scanner(System.in);
        int numOfMnozg = scan.nextInt();
        System.out.println("Введи те множители которые хочешь проверить. Множители от 1 до 9:");
        int[] arrMnoz = new int[numOfMnozg];
        for (int i = 0; i < numOfMnozg; i++) {
            arrMnoz[i] = scan.nextInt();
        }
        int[] arrMnozSec = new int[] {2,3,4,5,6,7,8,9};
        System.out.println("Чтобы закончить набери 99");

        body(arrMnoz, arrMnozSec, numOfMnozg);
    }

    public static void body(int[] a ,int[] b, int c) {
        final Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int fst = 0;
        int sec = 0;
        int answUser = 0;
        for (;;){
            fst = a[random.nextInt(c)];
            sec = b[random.nextInt(8)];
            System.out.println("Введи ответ для " + fst + " * " + sec + " =");
            answUser = scan.nextInt();
            if (answUser != 99) {
                if (answUser == fst * sec) {
                    System.out.println("Молодец!");
                } else {
                    System.out.println("Проверь ответ, в следующий раз не ошибись.");
                }
            } else break;
        }
    }
}
