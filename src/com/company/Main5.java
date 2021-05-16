package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        int mashaBerries;
        int mishaBerries;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите сколько ягод собрала Маша: ");
        mashaBerries = input.nextInt();

        System.out.print("Введите сколько ягод собрал Миша: ");
        mishaBerries = input.nextInt();

        System.out.print("Введите сколько ягод было съедено: ");
        int ate = input.nextInt();

        if (mashaBerries>1000 || mishaBerries>1000 || ate>1000){
            System.out.println("Введите число ягод не превышающее 1000!");
            return;
        }

        int result = mashaBerries + mishaBerries - ate;

        if (result<=0){
            System.out.println("Impissible");
            return;
        }

        System.out.println("В результате было собрано: "+result+" ягод");

    }
}