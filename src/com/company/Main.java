package com.company;


public class Main {

    public static void main(String[] args) {



        System.out.println(res(18, 12));
        System.out.println(res(32, -8));
        System.out.println(res(46, -7));
        System.out.println(res(50, 50));
        System.out.println(res(20, 12));
    }
    public static String res(int age, int temp) {
        if (age >= 20 && age < 45 && temp > -20 && temp < 30) {
            return "Можно идти гулять. ";
        } else if (age < 20 && temp > 0 && temp < 28) {
            return "Нужно идти гулять. ";
        } else if (age > 45 && temp > -10 && temp < 25) {
            return "Подумайте, прежде чем выйти на улицу. ";
        } else {
            return "Оставайтесь дома. ";
        }
    }
}





