package domain.classes;

// Класс учителя, который наследуется от класса Worker
public class Teacher extends Worker {

    // Дополнительное поле для хранения ученой степени
    private String academicDegree;

    // Конструктор для создания объекта Teacher с указанием имени, возраста и ученой степени
    public Teacher(String name, int age, String academicDegree) {
        super(name, age); // Вызов конструктора базового класса Worker с передачей имени и возраста
        this.academicDegree = academicDegree; // Инициализация поля ученой степени
    }

    // Геттер для получения ученой степени
    public String getAcademicDegree() {
        return academicDegree;
    }

    // Сеттер для установки ученой степени
    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    // Переопределенный метод toString для представления объекта в виде строки
    @Override
    public String toString() {
        return "Teacher { " + super.toString() + " academic degree: " + academicDegree + " }" + "\n";
    }
}
