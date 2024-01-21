package domain.classes;

// Класс рабочего, который наследуется от класса Person
public class Worker extends Person {

    // Конструктор для создания объекта Worker с указанием имени и возраста
    public Worker(String name, int age) {
        super(name, age); // Вызов конструктора базового класса Person с передачей имени и возраста
    }

    // Переопределенный геттер для получения возраста
    @Override
    public int getAge() {
        return super.getAge(); // Вызов геттера базового класса Person
    }

    // Переопределенный сеттер для установки возраста
    @Override
    public void setAge(int age) {
        super.setAge(age); // Вызов сеттера базового класса Person
    }
}
