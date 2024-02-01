import Model.*;
import View.*;
import Presenter.*;

// Главный класс приложения
public class App {
    public static void main(String[] args) {
        // Создание экземпляра модели для работы с комплексными числами
        ComplexCalcModel model = new ComplexCalcModel();
        // Создание экземпляра представления для взаимодействия с пользователем
        // и передача ему экземпляра презентера, который в свою очередь получает экземпляр модели
        ComplexCalcView view = new ComplexCalcView(new ComplexCalcPresenter(model, new ComplexCalcView(new ComplexCalcPresenter(model, null))));
        // Запуск пользовательского интерфейса
        view.start();
    }
}
