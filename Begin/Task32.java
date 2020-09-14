package ua.univer.base.lesson01.HW01.Begin;
/*Begin32. Дано значение температуры T в градусах Цельсия. Определить значе-
ние этой же температуры в градусах Фаренгейта. Температура по Цельсию
TC и температура по Фаренгейту TF связаны следующим соотношением:
TC = (TF – 32)·5/9.*/

public class Task32 {
    public static void main(String[] args) {
        Task32 t = new Task32();
        System.out.println("Дано значение температуры в градусах Цельсия." +
                " Значение этой же температуры в градусах Фаренгейта:");
        System.out.println(t.temperatureCelsiusToFahrenheit(18));
    }
    double temperatureCelsiusToFahrenheit(double a) {
        //Fahrenheit = Celsius х 1,8 + 32
        return a=a*1.8+32;
    }
}
