import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.servises.SQRService;

public class SQRServiceTest {
    @Test
    public void testInLimitsSQRService() {

        SQRService service = new SQRService();
        int minValue = 200;
        int maxValue = 300;
        int counter = service.calculateSQR(minValue, maxValue);

                System.out.println("Количество квадратов в диапазоне от " + minValue + " до " + maxValue + " " +counter);
    }
}
