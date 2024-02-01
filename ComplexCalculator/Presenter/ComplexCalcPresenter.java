package Presenter;
import Model.ComplexCalcModel;
import Model.Logger;
import View.ComplexCalcView;

// Класс ComplexCalcPresenter реализует интерфейс iComplexCalcPresenter и обрабатывает действия пользователя
public class ComplexCalcPresenter implements iComplexCalcPresenter {
    private ComplexCalcModel model; // Модель для выполнения вычислений
    private ComplexCalcView view; // Представление для отображения результата
    private Logger logger; // Логгер для записи логов

    // Конструктор класса, принимает модель и представление в качестве параметров
    public ComplexCalcPresenter(ComplexCalcModel model, ComplexCalcView view) {
        this.model = model;
        this.view = view;
        this.logger = new Logger(); // Инициализация логгера
    }

    // Обработчик события нажатия на кнопку сложения
    @Override
    public void onSumClicked(ComplexNumber num1, ComplexNumber num2) {
        // Выполнение сложения с помощью модели
        ComplexNumber result = model.sum(num1, num2);
        // Отображение результата в представлении
        view.showResult(result.toString());
        // Запись операции сложения в лог
        logger.log("Сложение: " + num1 + " + " + num2 + "i = " + result.toString());
    }

    // Обработчик события нажатия на кнопку умножения
    @Override
    public void onMultiplyClicked(ComplexNumber num1, ComplexNumber num2) {
        // Выполнение умножения с помощью модели
        ComplexNumber result = model.multiply(num1, num2);
        // Запись операции умножения в лог
        logger.log("Умножение: " + num1 + " * " + num2 + "i = " + result.toString());
        // Отображение результата в представлении
        view.showResult(result.toString());
    }

    // Обработчик события нажатия на кнопку деления
    @Override
    public void onDivideClicked(ComplexNumber num1, ComplexNumber num2) {
        // Выполнение деления с помощью модели
        ComplexNumber result = model.divide(num1, num2);
        // Запись операции деления в лог
        logger.log("Деление: " + num1 + " / " + num2 + "i = " + result.toString());
        // Отображение результата в представлении
        view.showResult(result.toString());
    }
}
