import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        HashSet<Automobil> automobils = new HashSet<>();
        automobils.add(new Automobil("BMW", 2009));
        automobils.add(new Automobil("Mercedes", 2000));
        automobils.add(new Automobil("Toyota", 2017));
        automobils.add(new Automobil("Lada", 2010));
        automobils.add(new Automobil("Dacia", 2005));

        automobils.stream()
                .sorted()
                .forEach((s)-> System.out.println(s));

        System.out.println("-----------------------------");


       TreeSet<Automobil> automobils1 = new TreeSet<>();
        automobils1.add(new Automobil("BMW", 2009));
        automobils1.add(new Automobil("Mercedes", 2000));
        automobils1.add(new Automobil("Toyota", 2017));
        automobils1.add(new Automobil("Lada", 2010));
        automobils1.add(new Automobil("Dacia", 2005));


        automobils1.stream()
                .sorted((a1,a2)->a1.getAnProducere() - a2.getAnProducere()) //Comparator.comparingInt(Automobil::getAnProducere)
                .forEach((s)-> System.out.println(s));

        System.out.println("--------------");

        automobils1.stream()
                .sorted((a1,a2)-> a1.getDenumire().compareTo(a2.getDenumire())) //Comparator.comparing(Automobil::getDenumire)
                .forEach((s)-> System.out.println(s));

        System.out.println("---------------------------------------");
Set<Employee> employees = new HashSet<>();
        employees.add(new Employee("Vasile","Java",20000));
        employees.add(new Employee("Ion","Python",17000));
        employees.add(new Employee("Gheorghe","C++",17500));
        employees.add(new Employee("Maxim","Ruby",15000));


        employees.stream()
                .sorted()
                .forEach((s)-> System.out.println(s));

        System.out.println("---------------------------");

        employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach((s)-> System.out.println(s));

        }

    }
