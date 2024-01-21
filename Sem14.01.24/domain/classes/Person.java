package domain.classes;

// Абстрактный класс, представляющий общие характеристики для объектов типа Person
public abstract class Person {

    // Имя персоны
    private String name;

    // Возраст персоны
    private int age;

    // Конструктор для создания объекта Person с указанием имени и возраста
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттер для получения имени
    public String getName() {
        return name;
    }

    // Сеттер для установки имени
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для получения возраста
    public int getAge() {
        return age;
    }

    // Сеттер для установки возраста
    public void setAge(int age) {
        this.age = age;
    }

    // Переопределенный метод toString для представления объекта в виде строки
    @Override
    public String toString() {
        return "Person { " + " name = " + name + " age = " + age;
    }
    
}
