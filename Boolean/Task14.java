package ua.univer.base.lesson01.HW01.Boolean;
/* Boolean14. Даны три целых числа: A, B, C. Проверить истинность высказыва-
ния: «Ровно одно из чисел A, B, C положительное». */

public class Task14 {
    public static void main(String[] args) {
        Task14 t = new Task14();
        System.out.println(t.oneOfInputsPositive(1,0,-1));
        System.out.println(t.oneOfInputsPositive(-10,1,-1));
        System.out.println(t.oneOfInputsPositive(1,1,-1));
    }
    boolean oneOfInputsPositive(int a, int b, int c) {
        if (a > 0 & b <= 0 & c <=0) {
            return true;
        } else if (a <= 0 & b > 0 & c <=0) {
            return true;
        } else if (a <= 0 & b <= 0 & c > 0) {
            return true;
        } else return false;
    }
}
