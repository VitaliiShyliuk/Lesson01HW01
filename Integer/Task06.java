package ua.univer.base.lesson01.HW01.Integer;

/* Integer6. Дано двузначное число. Вывести вначале его левую цифру (десятки),
а затем — его правую цифру (единицы). Для нахождения десятков исполь-
зовать операцию деления нацело, для нахождения единиц — операцию
взятия остатка от деления. */

public class Task06 {
    public static void main(String[] args) {
        Task06 t = new Task06();
        t.swapNumbers(100);
        t.swapNumbers(9);
        t.swapNumbers(45);
    }
    void swapNumbers(int a) {
        if (a<10 | a>99) {
            System.out.println("Try input -- number");
        }
        else {
            int firstNumber = a / 10;
            int secondNumber = a % 10;
            System.out.println("First number is - " + firstNumber + ", Second - " + secondNumber + ".");
        }
    }
}

