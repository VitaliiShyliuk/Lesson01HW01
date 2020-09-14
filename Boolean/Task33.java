package ua.univer.base.lesson01.HW01.Boolean;
/* Boolean33. Даны целые числа a, b, c. Проверить истинность высказывания:
«Существует треугольник со сторонами a, b, c». */
public class Task33 {
    public static void main(String[] args) {
        Task33 t = new Task33();
        System.out.println(t.trueTriagle(3,10,3));
        System.out.println(t.trueTriagle(3,3,3));

    }
    boolean trueTriagle(int a, int b, int c) {
        if (a+b>c & a+c>b & b+c>a) {
            return true;
        } else return false;
    }
}
