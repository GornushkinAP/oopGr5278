package Presenter;

// Класс ComplexNumber представляет комплексное число с действительной и мнимой частями
public class ComplexNumber {
    private double real; // Действительная часть комплексного числа
    private double imaginary; // Мнимая часть комплексного числа

    // Конструктор класса, принимает действительную и мнимую части в качестве параметров
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Метод для получения действительной части комплексного числа
    public double getReal() {
        return real;
    }

    // Метод для получения мнимой части комплексного числа
    public double getImaginary() {
        return imaginary;
    }

    // Переопределение метода toString для представления комплексного числа в виде строки
    @Override
    public String toString() {
        // Возвращает строковое представление комплексного числа в формате a + bi или a - bi в зависимости от знака мнимой части
        return real + (imaginary >= 0 ? " + " : " - ") + Math.abs(imaginary) + "i";
    }
}
