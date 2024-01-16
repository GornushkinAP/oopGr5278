package servises;

import java.util.ArrayList;
import java.util.List;
import domain.classes.Employee;
import domain.classes.PersonComparator;

public class EmployeeService implements iPersonService<Employee> {

    private int count;
    private List<Employee> employees;

    public EmployeeService() {
        employees = new ArrayList<>()
@Override
public List<Employee> getAll() {
    return employees;    
}

@Override
public void create(String name, int age) {
    Employee emp = new Employee(("technics"), age, name);
    count++;
    employees.add(emp);
}
    

public void sortByFIO(){

    PersonComparator<Employee> emComp = new PersonComparator<>();
    employees.sort(emComp);
}
    
}
