package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @CsvFileSource(files ="src/test/resources/SQR.scv")
    @ParameterizedTest
    public void testInLimitsSQRService(int minValue, int maxValue, int expectedCounter) {

        SQRService service = new SQRService();
        int counter = service.calculateSQR(minValue, maxValue);
        System.out.println("Количество квадратов в диапазоне от " + minValue + " до " + maxValue + " = " + counter);
        Assertions.assertEquals(expectedCounter, counter);
    }
}
