package ru.netology.sqr;

public class SQRService {

    public int calculateSQR(int minValue, int maxValue) {
        int x = 10;
        int counter = 0;
        for (int i = x; i <= 99; i++) {
            if (minValue <= (i * i)) {
                if (maxValue >= (i * i)) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
