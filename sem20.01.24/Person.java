// Абстрактный класс, представляющий общие характеристики для объектов типа Person
public abstract class Person<T, V> {

    // Имя персоны
    private T name;

    // Возраст персоны
    private V age;

    // Конструктор для создания объекта Person с указанием имени и возраста
    public Person(T name, V age) {
        this.name = name;
        this.age = age;
    }

    // Геттер для получения имени
    public T getName() {
        return name;
    }

    // Сеттер для установки имени
    public void setName(T name) {
        this.name = name;
    }

    // Геттер для получения возраста
    public V getAge() {
        return age;
    }

    // Сеттер для установки возраста
    public void setAge(V age) {
        this.age = age;
    }

    // Переопределенный метод toString для представления объекта в виде строки
    @Override
    public String toString() {
        return "Person { " + " name = " + name + " age = " + age;
    }
    
}
