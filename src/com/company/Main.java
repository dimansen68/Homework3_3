package com.company;

public class Main {

    public static void main(String[] args) {
	// Написать программу для вывода на экран таблицы умножения.
        System.out.println("Таблица умножения от 0 до 10 \n");
        for (int i=1; i<=10; i++){
            for (int j=1; j<=10; j++){
                System.out.print(i*j + " ");
            };
            System.out.println("\n");
        }
    }
}
