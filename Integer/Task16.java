package ua.univer.base.lesson01.HW01.Integer;

/* Integer16. Дано трехзначное число. Вывести число, полученное при переста-
новке цифр десятков и единиц исходного числа (например, 123 перейдет
в 132). */

public class Task16 {
    public static void main(String[] args) {
        Task16 t = new Task16();
        t.outPrint(123);
    }
    void outPrint(int a) {
        if (a < 100 | a > 999){
            System.out.println("Try input --- number");
        } else {
            int firstNumber = a / 100;
            int secondNumber = (a % 100) / 10;
            int thirdNumber = a % 10;
            System.out.println(""+ secondNumber+firstNumber+thirdNumber);
        }

    }
}
