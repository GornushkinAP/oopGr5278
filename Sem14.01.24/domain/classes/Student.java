package domain.classes;

// Класс, представляющий студента и реализующий интерфейс Comparable
public class Student extends Person implements Comparable<Student> {

    // Уникальный идентификатор студента
    private int id;

    // Статическая переменная для общего идентификатора, используемого для присвоения id студентам
    static int generalId;

    // Конструктор для создания объекта Student с указанием имени и возраста
    public Student(String name, int age) {
        super(name, age); // Вызов конструктора базового класса Person с передачей имени и возраста
        this.id = generalId; // Присвоение уникального идентификатора
        generalId++; // Увеличение общего идентификатора для следующего студента
    }

    // Геттер для получения идентификатора студента
    public int getId() {
        return id;
    }

    // Сеттер для установки идентификатора студента (может быть не нужен, так как id присваивается при создании)
    public void setId(int id) {
        this.id = id;
    }

    // Переопределенный метод toString для представления объекта в виде строки
    @Override
    public String toString() {
        return "Student { " + " id = " + id + " } " + super.toString();
    }

    // Переопределенный метод compareTo для сравнения студентов по возрасту и идентификатору
    @Override
    public int compareTo(Student o) {

        System.out.println(super.getName() + " - " + o.getName());

        // Сравнение по возрасту (по убыванию)
        if (o.getAge() > super.getAge()) {
            return -1;
        }

        if (o.getAge() < super.getAge()) {
            return 1;
        }

        // Если возрасты равны, сравниваем по идентификатору (по убыванию)
        if (o.getId() > id) {
            return -1;
        }

        if (o.getId() < id) {
            return 1;
        }

        // Возвращаем 0, если студенты равны
        return 0;
    }
}
