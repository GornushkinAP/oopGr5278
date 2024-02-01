package Presenter;

// Интерфейс iComplexCalcPresenter определяет методы, которые должен реализовать презентер для обработки действий пользователя
public interface iComplexCalcPresenter {
    // Метод вызывается при нажатии на кнопку сложения
    void onSumClicked(ComplexNumber num1, ComplexNumber num2);
    
    // Метод вызывается при нажатии на кнопку умножения
    void onMultiplyClicked(ComplexNumber num1, ComplexNumber num2);
    
    // Метод вызывается при нажатии на кнопку деления
    void onDivideClicked(ComplexNumber num1, ComplexNumber num2);
}
