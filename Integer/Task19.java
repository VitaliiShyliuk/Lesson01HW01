package ua.univer.base.lesson01.HW01.Integer;
/* Integer19. С начала суток прошло N секунд (N — целое). Найти количество
полных минут, прошедших с начала суток. */

public class Task19 {
    public static void main(String[] args) {
        Task19 t = new Task19();
        t.countMinutes(86400);
    }
    void countMinutes(int a) {
        if (a>0 | a <86401) {
            a = (a - (a % 60)) / 60;
            System.out.println("Количество полных минут, прошедших с начала суток:");
            System.out.println(a);
        } else System.out.println("Error");
    }
}
