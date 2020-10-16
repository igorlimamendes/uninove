import java.io.IOException;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        DecimalFormat df = new DecimalFormat("0.0");

        for (double i = 0; i <= 2; i += 0.2) {
            for (double j = 1; j <= 3; j++) {
                if (df.format(i).endsWith("0")) {
                    System.out.printf("I=%.0f J=%.0f\n", i, i+j);
                } else {
                    System.out.printf("I=%.1f J=%.1f\n", i, i+j);
                }
            }
        }
    }
}
