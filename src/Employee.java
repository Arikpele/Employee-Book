public class Employee {

    private String name;
    private int department;
    private int salary;
    private int id;
    private static int counter = 1;


    public Employee( String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter;
        counter += 1;
    }



    public String getName() {
        return name;
    }


    public int getDepartment() {

        return department;
    }

    public int getSalary() {

        return salary;
    }

    public void setDepartment(int department) {

        this.department = department;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }

    public String toString() {
        return "ID: "+id+"| ФИО: "+name+ "| Департамент - " + department + "|" + "Зарплата - " + salary;
    }


}
