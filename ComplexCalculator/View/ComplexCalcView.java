package View;

import java.util.Scanner;
import Presenter.*;

// Класс ComplexCalcView реализует интерфейс iComplexCalcView и представляет пользовательский интерфейс для работы с комплексными числами
public class ComplexCalcView implements iComplexCalcView {
    private ComplexCalcPresenter presenter; // Презентер для обработки действий пользователя

    // Конструктор класса, принимает презентер в качестве параметра
    public ComplexCalcView(ComplexCalcPresenter presenter) {
        this.presenter = presenter;
    }

    // Метод для запуска пользовательского интерфейса
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Сложение");
            System.out.println("2. Умножение");
            System.out.println("3. Деление");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }

            System.out.println("Введите первое комплексное число (через пробел):");
            double real1 = scanner.nextDouble();
            double imag1 = scanner.nextDouble();
            ComplexNumber num1 = new ComplexNumber(real1, imag1);

            System.out.println("Введите второе комплексное число (через пробел):");
            double real2 = scanner.nextDouble();
            double imag2 = scanner.nextDouble();
            ComplexNumber num2 = new ComplexNumber(real2, imag2);

            // Выбор операции в зависимости от выбора пользователя
            switch (choice) {
                case 1:
                    presenter.onSumClicked(num1, num2);
                    break;
                case 2:
                    presenter.onMultiplyClicked(num1, num2);
                    break;
                case 3:
                    presenter.onDivideClicked(num1, num2);
                    break;
                default:
                    System.out.println("Некорректный выбор.");
            }
        }
        scanner.close(); // Закрытие сканера после окончания работы
    }

    // Реализация метода для отображения результата операции
    @Override
    public void showResult(String result) {
        System.out.println("Результат: " + result);
    }
}
