package ru.netology.javaqa.javaqamvn.services;

public class VacationCalc {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int i = 0; i < 12; i++) {

            if (money >= threshold) {
                count++;
                money -= expenses;
                money /= 3;

            } else {
                money += income;
                money -= expenses;
            }


        }
        return count;

//        for (int i = 1; i <= 12; i++) {
//            System.out.println("Месяц " + i);
        // }


    }


}
