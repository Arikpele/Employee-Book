import java.util.Arrays;

public class Main {

    public static final Employee[] employee =

            {

                    new Employee("Иванов Иван иванович ", 1, 10000),
                    new Employee("Петров Петр Петрович", 2, 20000),
                    new Employee("Сидоров Сидр Сидорович", 3, 30000),
                    new Employee("Констатинов Константин Константинович", 4, 40000),
                    new Employee("Алексеев Алексей Алексеевич", 4, 50000),
                    new Employee("Александров Александр Александрович", 5, 60000),
                    new Employee("Владиславов Владислав Владиславович", 1, 70000),
                    new Employee("Сергеев Сергей Сергеевич", 2, 80000),
                    new Employee("Анатольев Анатолий Анатольевич", 3, 90000),
                    new Employee("Семенов Семен Семенович", 4, 100000)
            };

    {

        employee[2].setDepartment(2);
        employee[2].setDepartment(21000);

    }

    public static void printEmployee() {
        Arrays.stream(employee).forEach(System.out::println);
    }

    public static double totalSalary() {
        double totalSalary = 0;
        for (Employee current : employee) {
            totalSalary = current.getSalary() + totalSalary;
        }


        return totalSalary;

    }

    public static void scape() {
        System.out.println("-------------------------------------");
    }

    public static String minSalary() {
        String name = null;
        int minSalary = employee[9].getSalary();
        for (Employee current : employee) {
            if (current.getSalary() <= minSalary) {
                minSalary = current.getSalary();
                name = current.getName();
            }
        }
        return name;
    }

    public static String maxSalary() {
        String name = null;
        int maxSalary = employee[9].getSalary();
        for (Employee current : employee) {
            if (current.getSalary() >= maxSalary) {
                maxSalary = current.getSalary();
                name = current.getName();
            }
        }
        return name;
    }

    public static double averageSalary() {

        return totalSalary()/employee.length;
    }

    public static void name() {
        for (Employee current : employee) {
            System.out.println(current.getName());
        }
    }


    public static void main(String[] args) {
        printEmployee();
        scape();
        System.out.println("Общая сумма зарплат работников " + totalSalary());
        scape();
        System.out.println("Сотрудник с самой минимальной зарплатой - " + minSalary());
        scape();
        System.out.println("Сотрудник с самой максимальной зарплатой - " + maxSalary());
        scape();
        System.out.println("Средняя зарплата сотрудников - "+averageSalary());
        scape();
        name();

    }
}


