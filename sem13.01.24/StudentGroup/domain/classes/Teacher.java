package domain.classes;

// Класс учителя, который наследуется от класса Person
public class Teacher extends Person {

    // Дополнительное поле для хранения ученой степени
    private String academicDegree;

    // Конструктор для создания объекта Teacher с указанием имени, возраста и ученой степени
    public Teacher(String name, int age, String academicDegree) {
        super(name, age); // Вызов конструктора базового класса Person с передачей имени и возраста
        this.academicDegree = academicDegree; // Инициализация поля ученой степени
    }

}
