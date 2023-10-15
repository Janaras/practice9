package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        1.Напишите код, который преобразовывает и объединяет все элементы массива в
//        одно строковое значение. Элементы массива будут разделены запятой.

//        String[] myArray = {"2", "3", "4", "5"};
//        String result = "";
//
//        for (int i = 0; i < myArray.length; i++) {
//            result += myArray[i];
//
//            if (i < myArray.length - 1) {
//                result += ",";
//            }
//        }
//        System.out.println(result);

//        2. Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
//        Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы и массив.

//        for (int i = 2; i <= 100; i++) {
//            boolean isPrime = true;
//
//            for (int j = 2; j <= Math.sqrt(j); j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if (isPrime) {
//                System.out.print(i + " ");
//            }
//        }
        //task3
        Scanner sc = new Scanner(System.in);
        String[] cities = new String[10];
        int cityCount = 0;
        while (cityCount < 10) {
            System.out.println("Хотите добавить город? (y/n): ");
            String yesorno = sc.nextLine();
            if (yesorno.equals("y")) {
                System.out.println("Название города:");
                String city = sc.next();
                cities[cityCount] = city;
                cityCount++;
                System.out.println("Город " + city + " успешно добавлен в список.");
            } else if (yesorno.equals("n")) {
                System.out.println("Останавливаем цикл заполнения городов.");
                break;
            } else {
                System.out.println("Некорректный ввод. Введите 'y' для добавления города или 'n' для завершения.");
            }
        }

        System.out.println("Добавленные города:");
        for (int i = 0; i < cityCount; i++) {
            System.out.println(cities[i]);

        }
        boolean continueRemoving = true;
        while (continueRemoving) {
            System.out.print("Хотите удалить город из списка? (y/n): ");
            String choice = sc.next();

            if (choice.equals("y")) {
                System.out.print("Введите название города для удаления: ");
                String cityToDelete = sc.next();

                boolean cityFound = false;
                for (int i = 0; i < cityCount; i++) {
                    if (cities[i] != null && cities[i].equalsIgnoreCase(cityToDelete)) {
                        System.out.println("Город " + cities[i] + " удален!");
                        cities[i] = null;
                        cityFound = true;
                        break;
                    }
                }

                if (!cityFound) {
                    System.out.println("Такого города нет!");
                }
            } else if (choice.equals("n")) {
                System.out.println("Останавливаем цикл удаления городов.");
                continueRemoving = false;
            } else {
                System.out.println("Некорректный ввод. Введите 'y' для удаления города или 'n' для завершения.");
            }
        }

        System.out.println("Список городов после удаления:");
        for (String city : cities) {
            if (city != null) {
                System.out.println(city);
            }
        }
    }
}










