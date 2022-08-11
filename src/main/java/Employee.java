
import java.util.Objects;

import static java.util.Objects.hash;

public class Employee {
    private final String name;

    private final String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(name,employee,name) && Objects.equals(surname,employee,surname);

    }

    @Override
    public int hashCode() {
        return hash(name, surname);
    }

    public String toString() {
        return String.format("%s,%s", name, surname);
    }
}
