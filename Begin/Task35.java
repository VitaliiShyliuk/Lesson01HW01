package ua.univer.base.lesson01.HW01.Begin;
/* Begin35. Скорость лодки в стоячей воде V км/ч, скорость течения реки U км/ч
(U < V). Время движения лодки по озеру T1 ч, а по реке (против течения) —
T2 ч. Определить путь S, пройденный лодкой (путь = время · скорость).
Учесть, что при движении против течения скорость лодки уменьшается на
величину скорости течения. */

public class Task35 {
    public static void main(String[] args) {
        // Set 1)The boat speed; 2)Time of moving the boat; 3)Speed of the river;
        Task35 t = new Task35();
        t.movingByStream(80, 2);
        t.movingAgainstStream(80,2,20);
        t.movingAgainstStream(50, 3, 60);
    }
    void movingByStream(int bspeed, int time) {
        int distance = bspeed * time;
        System.out.println("Путь пройденный лодкой " + distance + " км.");
    }
    void movingAgainstStream(int bspeed, int time, int rspeed) {
        if (bspeed>rspeed) {
            int distance = (bspeed - rspeed) * time;
            System.out.println("Путь пройденный лодкой " + distance + " км.");
        } else System.out.println("Wrong");
    }
}
