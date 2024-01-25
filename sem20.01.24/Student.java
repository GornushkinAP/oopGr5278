
// Класс, представляющий студента и реализующий интерфейс Comparable
public class Student<T extends Comparable<T>,V> extends Person<T,V> implements Comparable<Student<T,V>> {

    // Уникальный идентификатор студента
    private V id;

    // Статическая переменная для общего идентификатора, используемого для присвоения id студентам
    // static int generalId;

    // Конструктор для создания объекта Student с указанием имени и возраста
    public Student(T name, V age) {
        super(name, age); // Вызов конструктора базового класса Person с передачей имени и возраста
        // this.id = generalId; // Присвоение уникального идентификатора
        // generalId++; // Увеличение общего идентификатора для следующего студента
    }

    // Геттер для получения идентификатора студента
    public V getId() {
        return id;
    }

    // Сеттер для установки идентификатора студента (может быть не нужен, так как id присваивается при создании)
    public void setId(V id) {
        this.id = id;
    }

    // Переопределенный метод toString для представления объекта в виде строки
    @Override
    public String toString() {
        return "Student { " + " id = " + id + " } " + super.toString();
    }

    // Переопределенный метод compareTo для сравнения студентов по возрасту и идентификатору
  @Override
  public int compareTo(Student<T,V> o){
    return super.getName().compareTo(o.getName());
  }
}
