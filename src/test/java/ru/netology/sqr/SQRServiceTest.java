package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    public void testInLimitsSQRService(int minValue, int maxValue) {

        SQRService service = new SQRService();
//        int minValue = 200;
//        int maxValue = 300;
        int counter = service.calculateSQR(minValue, maxValue);
        System.out.println("Количество квадратов в диапазоне от " + minValue + " до " + maxValue + " " + counter);
    }
}
