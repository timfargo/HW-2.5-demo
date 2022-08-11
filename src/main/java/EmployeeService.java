import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class EmployeeService {

    private final Employee[] employees = new Employee[4];

    public Employee addEmployee(String name, String surname) {
        Employee employee = new Employee(name, surname);
        int index = -1;
        for (int i = 0; i < employees.length; i++) {
            if (Objects.equals(employees[i], employee)) {
                throw new EmployeeAlredyAddedException();
            }
            if (Objects.isNull(employees[i])) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            return employees[index] = employee;
        }
        throw new EmployeeStoragelsFullException();

    }

    public Employee findEmployee(String name, String surname) {
        Employee employee = new Employee(name, surname);
        for (Employee employee1 : employees) {
            if (Objects.equals(employee1, employee)) {
                return employee;
            }
        }
        throw new EmployeeNotFoundException();

    }

    public Employee removeEmployee(String name, String surname) {
        Employee employee = new Employee(name, surname);
        for (int i = 0; i < employees.length; i++) {
            if (Objects.equals(employees[i], employee)) {
                employees[i] = null;
                return employee;
            }
        }
        throw new EmployeeNotFoundException();
    }
}








