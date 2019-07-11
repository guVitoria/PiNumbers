import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.*;

/** Класс, который выводит столько знаков после запятой в числе Pi, скользо запросил пользователь */
public class PiNumbers {

    /** Метод, который возвращает нам число Pi с нужной точностью
     * @param number параметр, который говорит нам запрошенную точность
     * @return возвращает число пи с нужной точностью
     * @author Victoria_GI*/
    public BigDecimal GetRes (int number) {
        BigDecimal a = new BigDecimal(Math.PI);
        BigDecimal roundOff = a.setScale(number, BigDecimal.ROUND_HALF_EVEN);
        return roundOff;
    }

    public static void main(String[] args) throws IOException {
        PiNumbers newPiNumber = new PiNumbers();
        System.out.println("Введите число до которого надо вывести число пи: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        System.out.println(newPiNumber.GetRes(number));
    }
}
