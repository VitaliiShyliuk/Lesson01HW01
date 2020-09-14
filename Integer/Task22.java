package ua.univer.base.lesson01.HW01.Integer;
/* Integer22. С начала суток прошло N секунд (N — целое). Найти количество се-
кунд, прошедших с начала последнего часа. */

public class Task22 {
    public static void main(String[] args){
        Task22 t = new Task22();
        t.outPrint(3601);
    }
    void outPrint(int a) {
        System.out.println(a%3600);
    }
}
