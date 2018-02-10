import java.util.Scanner;

/**
 * Калькулятор
 *
 * @author Tatyana Boyko
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("В калькуляторе доступны следующие операции:");
        System.out.println("для сложения введите - '+',");
        System.out.println("для вычитания введите - '-',");
        System.out.println("для умножения введите - '*',");
        System.out.println("для деления введите - '/'.");

        User user = new User();

        try {
            do {
                user.selectOperation(scan);
                user.getCurrentOperation().setFirstOperand(scan);
                user.getCurrentOperation().setSecondOperand(scan);
                user.getCurrentOperation().calculate();

            } while(user.selectNextOperation(scan));
        } finally {
            scan.close();
        }
    }
}