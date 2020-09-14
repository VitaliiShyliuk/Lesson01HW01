package ua.univer.base.lesson01.HW01.Integer;
/* Integer24. Дни недели пронумерованы следующим образом: 0 — воскресенье,
1 — понедельник, 2 — вторник, 3, 4, 5, 6 — суббота. Дано целое число K, ле-
жащее в диапазоне 1–365. Определить номер дня недели для K-го дня года,
если известно, что в этом году 1 января было понедельником. */

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Task24 {
    public static void main(String[] args){
        Task24 t = new Task24();
        t.outPrint24(7);
    }
    void outPrint24(int a) {
        if (a>0 | a<=365) {
            String[] week = {"воскресенье", "понедельник", "вторник", "среда", "четверг", "пятница", "суббота"};
            a = a % 7;
            System.out.println("Номер дня недели - " + a + ". (" + week[a] + ")");
        } else System.out.println("Error");
    }
}
