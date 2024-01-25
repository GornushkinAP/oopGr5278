package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetController;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

// Класс, реализующий представление на английском языке
public class ViewClassEng implements iGetView {

    // Ссылка на контроллер
    private iGetController contr;

    // Метод для установки контроллера
    public void setContr(iGetController contr) {
        this.contr = contr;
    }

    // Метод для вывода списка студентов на экран на английском
    public void printAllStudents(List<Student> students) {
        System.out.println("-------------List of Students------------");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("-----------------------------------------");
    }

    // Метод для запроса ввода пользователя на английском
    // Принимает сообщение в качестве параметра
    // Возвращает введенную пользователем строку
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }

    // Метод для запуска основного цикла представления, вызывает метод run контроллера
    public void ViewRun() {
        contr.run();
    }
}
