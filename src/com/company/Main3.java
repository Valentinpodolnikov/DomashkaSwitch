package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //2 гостя - 1 разрез
        //3 гостя - 3 разреза
        //4 гостя - 2 разреза
        //5 гостей - 5 разрезов
        //6 гостей - 3 разреза

        int guests;
        int incisions;

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число гостей: ");

        guests = input.nextInt();

        if(guests>1000){
            System.out.println("Число гостей не должно превышать 1000");
            return;
        }
        if(guests%2==0){
           incisions = guests / 2; //для получения равных частей при четном количестве гостей

        }
        else {
            incisions = guests;
        }

        System.out.println("Необходимо сделать разрезов: "+incisions);

    }
}
