package ua.univer.base.lesson01.HW01.Boolean;
/* Boolean12. Даны три целых числа: A, B, C. Проверить истинность высказыва-
ния: «Каждое из чисел A, B, C положительное».*/

public class Task12 {
    public static void main(String[] args) {
        Task12 t = new Task12();
        System.out.println(t.allInputsPositive(1, 2, -1));
        System.out.println(t.allInputsPositive(1, 2, 1));
        System.out.println(t.allInputsPositive(1, 2, 0));
    }
    boolean allInputsPositive(int a, int b, int c){
        if (a > 0 & b > 0 & c > 0) {
            return true;
        } else return false;
    }
}
