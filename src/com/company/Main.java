package com.company;



import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;



public class Main {


    public static void main(String[] args) {
                generateRandomArray();
                generateRandomYear();
                generateRandomDistance();
                generateRandomLoc();
    }
    int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000, 9999);
            generateYear(arr[i]);
        }
        return arr;
    }
    public static void generateYear (int year){
        if ((year % 4 == 0) && year % 100 != 0) {
            out.println(year + " — високосный год!");}
        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            out.println(year + " — високосный год!");}
        else {
            out.println(year + " — не високосный год!");}
    }
    int[] ser = generateRandomYear();
    public static int[] generateRandomYear () {
        Random random = new Random();
        int[] ser = new int[1];
        int[] rew = new int[1];
        int currentYear = LocalDate.now().getYear();
        for (int i = 0; i < ser.length; i++) {
            ser[i] = random.nextInt(1999, currentYear);
            for (int u = 0; u < rew.length; u++) {
                rew[u] = random.nextInt(0, 2);
                yearOfRelease(ser[i], rew[u]);
            }
        }
        return ser;
    }
    private static void yearOfRelease(int i, int i1) {
        int clientDeviceYearclien = 2015;
        if (i1 == 0 && i > clientDeviceYearclien) {
            out.println("«Установите версию приложения для iOS по ссылке» ");}
        else if (i1 == 0){
            out.println("«Установите облегченную версию приложения для iOS по ссылке»");}
        if (i1 == 1 && i > clientDeviceYearclien){
            out.println("«Установите версию приложения для Android по ссылке»");}
        else if (i1 == 1){
            out.println("«Установите облегченную версию приложения для Android по ссылке»");}
    }
    int[] lok = generateRandomDistance();
    public static int[] generateRandomDistance() {
        java.util.Random random = new java.util.Random();
        int[] lok = new int[1];
        for (int i = 0; i < lok.length; i++) {
            lok[i] = random.nextInt(0, 110);
            generateDistance(lok[i]);
        }
        return lok;
    }
    public static void generateDistance(int day){
        if ((day <= 20) && (day > 0)) out.println("Потребуется дней: " + 1);
        else if (day > 20 && day <= 60) out.println("Потребуется дней: " + 2);
        else if (day > 60 && day <= 100) out.println("Потребуется дней: " + 3);
        else out.println("Извените доставка в данный район не доступна!");
    }
    public static String generateRandomLoc() {
        StringBuilder text = new StringBuilder();
        String possible = ("abcdefghijklmnopqrstuvwxyz");
        int possibleLength = possible.length();
        for (int i = 0; i < 10; i ++){
            text.append(possible.charAt((int) Math.floor(Math.random() * possibleLength)));}
        char[] chars = text.toString().toCharArray();
        Arrays.sort(chars);
        String abc = new String(chars);
        checkDoubleCharslnString(abc);
        return abc;
    }
    public static char previousChar;

    public static void checkDoubleCharslnString(String s) {
        for (int i = 0; i < s.length(); i++) {
            Scanner sc = new Scanner(s);
            char currentChar = sc.next().charAt(i);
            if (i == 0 || previousChar != currentChar){
                previousChar = currentChar;}
            else {
                out.println("Найден дублекат: " + currentChar + "");
                break;
            }
            if (i == s.length() - 1){
                out.println("Дублекаты не найдены!");}
        }
    }
}

