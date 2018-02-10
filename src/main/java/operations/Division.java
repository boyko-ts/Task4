package operations;

import java.util.Scanner;

/**
 * Деление
 *
 * @author Tatyana Boyko
 */
public class Division extends Operation implements Calculable {

    public Division() {
        super();
    }

    @Override
    public void setSecondOperand(Scanner scan) {
        super.setSecondOperand(scan);
        while (super.getSecondOperand() == 0.0) {
            System.out.println("Второе число для операции деления не может быть нулем. Значение не установлено.");
            super.setSecondOperand(scan);
        }
    }

    /**
     * Вычисляет операцию деления
     *
     * @return Результат вычисления операции деления
     */
    public float calculate() {
        System.out.println("Выполняется операция деления.");
        float result = super.getFirstOperand() / super.getSecondOperand();
        System.out.printf("Результат: %.4f\n", result);
        return result;
    }
}