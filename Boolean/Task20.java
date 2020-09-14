package ua.univer.base.lesson01.HW01.Boolean;
/* Boolean20. Дано трехзначное число. Проверить истинность высказывания:
«Все цифры данного числа различны». */

public class Task20 {
    public static void main(String[] args) {
        Task20 t = new Task20();
        System.out.println(t.allNumbersDifferent(112));
        System.out.println(t.allNumbersDifferent(132));
    }
    boolean allNumbersDifferent(int a) {
        int firstNumber = a/100;
        int secondNumber = (a%100)/10;
        int thirdNumber = a%10;
        if (firstNumber != secondNumber & secondNumber != thirdNumber & firstNumber != thirdNumber) {
            return true;
        } else return false;
    }
}
