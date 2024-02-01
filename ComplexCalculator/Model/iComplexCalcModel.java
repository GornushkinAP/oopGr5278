package Model;
import Presenter.ComplexNumber;

// Интерфейс iComplexCalcModel определяет методы для работы с комплексными числами
public interface iComplexCalcModel {
    // Метод для сложения комплексных чисел
    ComplexNumber sum(ComplexNumber num1, ComplexNumber num2);
    
    // Метод для умножения комплексных чисел
    ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2);
    
    // Метод для деления комплексных чисел
    ComplexNumber divide(ComplexNumber num1, ComplexNumber num2);
} 
