package domain.classes;

// Класс, представляющий сотрудника и наследующий от класса Person
public class Employee extends Worker {

    // Дополнительное поле для хранения специализации сотрудника
    private String special;

    // Конструктор для создания объекта Employee с указанием имени, возраста и специализации
    public Employee(String name, int age, String special) {
        super(name, age); // Вызов конструктора базового класса Person с передачей имени и возраста
        this.special = special; // Инициализация поля специализации
    }

    // Геттер для получения специализации сотрудника
    public String getSpecial() {
        return special;
    }

    // Сеттер для установки специализации сотрудника
    public void setSpecial(String special) {
        this.special = special;
    }
}
