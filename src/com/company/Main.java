package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //на вход вводится кол-во ворон
        //ваша программа должна выбрат правильное склонение
        //1-ворона, 1001-ворона
        //4-вороны, 584-вороны
        //switch
        //1 ворона
        //2, 3, 4 вороны
        // 0, 5, 6, 7, 8, 9, 10 - ворон
        //11, 12, 13, 14, 15, 16, 17, 18, 19, 20 - ворон
        //21 ворона
        //22, 23, 24 - вороны
        //25, 26, 27, 28, 29, 30 - ворон
        //31 - ворона


        Scanner input = new Scanner(System.in);
        int countOfRaven;

        System.out.print("На поле прилетело: ");
        countOfRaven = input.nextInt();

        int lastDigit = countOfRaven % 10;
        int penultDigit = countOfRaven % 100 / 10;

        if (penultDigit == 1) {
            System.out.println("Ворон");
        }
        else {

            switch (lastDigit) {
                case 1:
                    System.out.print("Ворона");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.print("Вороны");
                    break;
                default:
                    System.out.print("Ворон");
                    break;
            }
        }
    }
}
