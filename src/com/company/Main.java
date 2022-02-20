package com.company;


import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int age1 = generateRandomAge();
        System.out.println(res(age1, 12));

        int age2 = generateRandomAge();
        System.out.println(res(age2, -8));

        int age3 = generateRandomAge();
        System.out.println(res(age3, -7));

        int age4 = generateRandomAge();
        System.out.println(res(age4, 50));

        int age5 = generateRandomAge();
        System.out.println(res(age5, 12));
    }

    public static String res(int age, int temp) {
        if (age >= 20 && age < 45 && temp > -20 && temp < 30) {
            return "Возраст " + age + " Можно идти гулять. ";
        } else if (age < 20 && temp > 0 && temp < 28) {
            return "Возраст " + age + " Нужно идти гулять. ";
        } else if (age > 45 && temp > -10 && temp < 25) {
            return"Возраст " + age + " Подумайте, прежде чем выйти на улицу. ";
        } else {
            return"Возраст " + age + " Оставайтесь дома. ";
        }
    }

    public static int generateRandomAge(){
        Random random = new Random();
        int age = random.nextInt(100);
        return age;
    }

}





