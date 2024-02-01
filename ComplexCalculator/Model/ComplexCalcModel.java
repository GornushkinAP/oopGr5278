package Model;

import Presenter.ComplexNumber;

// Реализация интерфейса iComplexCalcModel
public class ComplexCalcModel implements iComplexCalcModel {

    // Метод для сложения комплексных чисел
    @Override
    public ComplexNumber sum(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(num1.getReal() + num2.getReal(), num1.getImaginary() + num2.getImaginary());
    }

    // Метод для умножения комплексных чисел
    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imagPart = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(realPart, imagPart);
    }

    // Метод для деления комплексных чисел
    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        // Вычисление знаменателя
        double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        // Вычисление действительной части
        double realPart = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        // Вычисление мнимой части
        double imagPart = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / denominator;
        return new ComplexNumber(realPart, imagPart);
    }
}
