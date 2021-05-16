package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        int firstDigit;
        int secondDigit;
        int check;

        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");

        firstDigit = input.nextInt();

        if(firstDigit>100){
            System.out.println("Введите число от 1 до 100");
            return;
        }


        System.out.print("Введите второе число: ");
        secondDigit = input.nextInt();

        if (secondDigit>100){
            System.out.println("Введите число от 1 до 100");
            return;

        }

        System.out.print("Введите результат для проверки: ");
        check = input.nextInt();

        if (check>1000000){
            System.out.println("Введите число от 1 до 1000000");
            return;

        }


        int result = firstDigit * secondDigit;

        if (result==check){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
