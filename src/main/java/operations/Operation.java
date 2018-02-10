package operations;

import java.util.Scanner;

/**
 * Операция
 *
 * @author Tatyana Boyko
 */
public abstract class Operation implements Calculable {

    Operation() {
    }

    /**
     * Первое число операции калькулятора
     */
    private float firstOperand;

    /**
     * Второе  число операции калькулятора
     */
    private float secondOperand;

    /**
     * Получает первое число операции калькулятора
     *
     * @return Первое число операции калькулятора
     */
    float getFirstOperand() {
        return firstOperand;
    }

    /**
     * Устанавливает значение для первого числа операции калькулятора
     *
     * @param scan общий сканнер для консоли
     */
    public void setFirstOperand(Scanner scan) {
        System.out.println("Введите первое число: ");
        this.firstOperand = scan.nextFloat();
    }

    /**
     * Получает второе число операции калькулятора
     *
     * @return второе число операции калькулятора
     */
    float getSecondOperand() {
        return secondOperand;
    }

    /**
     * Устанавливает значение для второго числа операции калькулятора
     *
     * @param scan общий сканнер для консоли
     */
    public void setSecondOperand(Scanner scan) {
        System.out.println("Введите второе число: ");
        this.secondOperand = scan.nextFloat();
    }
}
