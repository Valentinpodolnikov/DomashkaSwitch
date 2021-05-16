package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        int petyaCrane;
        int sergeyCrane;
        int katyaCrane;
        int total;
        int allChildren = 3;


        Scanner input = new Scanner(System.in);
        System.out.print("Введите число сделанных журавликов: ");
        total = input.nextInt();


        if (total%2==0 && total>3) {

            petyaCrane = (total / allChildren) / 2; //так как Петя и Сережа сделали одинаковое количество
            sergeyCrane = petyaCrane;
            katyaCrane = (sergeyCrane + petyaCrane) * 2; //Катя сделала вдвое больше чем ребята вместе взятые



            System.out.println("Катя сделала: " +katyaCrane+ ", Петя сделал: " +petyaCrane+ ", Сергей сделал: " +sergeyCrane);
        }
        else{
            System.out.println("По условию нельзя было сделать нечетное число журавликов, попробуйте снова!");
        }

    }
}