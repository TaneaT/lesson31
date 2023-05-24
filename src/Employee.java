import java.util.Objects;

public class Employee implements Comparable<Employee>{

String name;
String language;
int salary;

public Employee(String name, String language,int salary){
    this.name = name;
    this.language = language;
    this.salary = salary;
}

    @Override
    public int compareTo(Employee o) {
        if (this.equals(o)){
            return 0;
        }
        if (salary < o.salary){
            return -1;
        }

        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(language, employee.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary);
    }

    @Override
    public String toString() {
        return "name: " + name + "\n" +
                "language: " + language + "\n" +
                "salary: " + salary + "\n";
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }
}
