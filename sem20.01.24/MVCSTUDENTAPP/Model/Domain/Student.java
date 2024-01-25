package Model.Domain;

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
        // Печать для отладки, чтобы видеть, какие студенты сравниваются
        System.out.println(super.getName() + " - " + o.getName());
    
        // Сравнение по возрасту
        if (super.getAge() == o.getAge()) {
            // Если возрасты равны, сравниваем по идентификатору (id)
            if (id == o.id) {
                return 0; // Студенты одинаковые
            } else if (id > o.id) {
                return 1; // Текущий студент "больше"
            } else {
                return -1; // Текущий студент "меньше"
            }
        }
    
        // Если возрасты не равны, сравниваем по возрасту
        if (super.getAge() > o.getAge()) {
            return 1; // Текущий студент "больше"
        } else {
            return -1; // Текущий студент "меньше"
        }
    }
    
}
