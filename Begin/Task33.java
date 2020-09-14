package ua.univer.base.lesson01.HW01.Begin;
/* Begin33. Известно, что X кг конфет стоит A рублей. Определить, сколько стоит
1 кг и Y кг этих же конфет. */

public class Task33 {
    public static void main(String[] args) {
        int weight = 3;
        int price = 50;
        int summ1FirstCandy = weight * price;
        weight = 1;
        int summ2FirstCandy = weight * price;
        weight = 20;
        int summ3FirstCandy = weight * price;
        System.out.println("Цена 3х кг - " + summ1FirstCandy + "грн. Цена 1го кг - "
                + summ2FirstCandy + "грн. Цена 20 кг - " + summ3FirstCandy + "грн.");
    }
}
