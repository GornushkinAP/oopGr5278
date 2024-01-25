package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetController;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.Domain.Student;
import View.ViewClass;

// Класс, реализующий контроллер приложения
public class ControllerClass implements iGetController {

    // Ссылки на модель и представление
    private iGetModel model;
    private iGetView view;

    // Буфер для хранения студентов
    private List<Student> studBuffer = new ArrayList<>();

    // Хэш-карта для хранения представлений
    private HashMap<String, iGetView> hashView;

    // Конструктор класса
    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    // Метод для проверки наличия данных в списке студентов
    private boolean testData(List<Student> stud) {
        return stud.size() > 0;
    }

    // Метод для обновления данных и вывода списка студентов
    public void update(String request) {
        studBuffer = model.getStudents();
        if (testData(studBuffer)) {
            view.printAllStudents(studBuffer);
        } else {
            System.out.println("Список студентов пуст!");
        }
    }

     // Новый метод для удаления студента
     private void deleteStudent() {
        String studentIdStr = view.prompt("Введите номер студента для удаления: ");
        try {
            Integer studentId = Integer.parseInt(studentIdStr);
            if (model.deleteStudent(studentId)) {
                System.out.println("Студент успешно удален.");
            } else {
                System.out.println("Студент с указанным номером не найден.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Некорректный номер студента.");
        }
    }

    // Метод запускающий основной цикл приложения
    public void run() {
        Command com = Command.NONE;
        boolean getNewIter = true;
        while (getNewIter) {

            String command = view.prompt("Введите команду: ");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    //действия для команды EXIT
                    getNewIter = false;
                    System.out.println("Выход из программы.");
                    break;
                case LIST:
                    //действия для команды LIST
                    view.printAllStudents(model.getStudents());
                    break;
                case NONE:
                    //действия для команды NONE
                    break;
                case CREATE:
                    //действия для команды CREATE
                    break;
                case UPDATE:
                    //действия для команды UPDATE
                    break;
                case READ:
                    //действия для команды READ
                    break;
                case DELETE:
                    //действия для команды DELETE
                    deleteStudent();
                    break;
            }
        }
    }
}
