package ua.univer.base.lesson01.HW01.Boolean;
/* Boolean32. Даны целые числа a, b, c, являющиеся сторонами некоторого тре-
угольника. Проверить истинность высказывания: «Треугольник со сторо-
нами a, b, c является прямоугольным». */

public class Task32 {
    public static void main(String[] args) {
        Task32 t = new Task32();
        System.out.println(t.rightTriangle(3, 5,6));

    }
    boolean rightTriangle(int a, int b, int c){
        if(a*a+b*b==c*c | a*a+c*c==b*b | b*b+c*c==a*a) {
            return true;
        } else return false;
    }
}
