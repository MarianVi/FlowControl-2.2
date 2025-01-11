
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TO DO:
        int n = scanner.nextInt();

// 2.2. 1
        int div7Numbers = 0;

// 2.2. 2
        int div5Numbers = 0;

// 2.2. 3
        int lastDigitN = 0;

// 2.2. 4
        int numarTotal = 0;

// 2.2. 5
        int firstDigit = 0;

        for (int i = 0; i < n; i++) {
            int crtNumber = scanner.nextInt();

            // 2.2. 1
            if (crtNumber % 7 == 0) {
                div7Numbers++;
            }

            // 2.2. 2
            int copyCrt = crtNumber;
            int sumDigitsCrtNumber = 0;
            while (copyCrt != 0) {
                int uC = copyCrt % 10;
                sumDigitsCrtNumber += uC;
                if (uC >= 0){
                    numarTotal++;
                }
                copyCrt /= 10;
            }
            if (sumDigitsCrtNumber % 5 == 0) {
                div5Numbers++;
            }

            // 2.2. 3
            if (crtNumber == 3 || crtNumber == 7 || crtNumber == 9) {
                lastDigitN++;
            } else if (crtNumber % 10 == 3 || crtNumber % 10 == 7 || crtNumber % 10 == 9) {
                lastDigitN++;
            }

            // 2.2. 4
            if (crtNumber == 0) {
                numarTotal++;
            }

            //2.2. 5
            int reverse = 0;
            while (crtNumber != 0) {
                reverse = (reverse * 10) + (crtNumber % 10);
                crtNumber /= 10;
            }
            if (reverse % 10 == 2) {
                firstDigit++;
            }
        }

// 2.2. 1
        System.out.println("Numere divizibile cu 7: " + div7Numbers);

// 2.2. 2
        System.out.println("Numere care au suma cifrelor divizibila cu 5: " + div5Numbers);

// 2.2. 3
        System.out.println("Numere care au ultima cifra 3, 7 sau 9: " + lastDigitN);

// 2.2. 4
        System.out.println("Numarul total de cifre ale numerelor: " + numarTotal);

// 2.2. 5
        System.out.println("Numere care au prima cifra 2: " + firstDigit);
    }
}
