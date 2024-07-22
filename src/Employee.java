public class Employee {
    private String name;
    private int staj;
    private int ojidZp;
    private int year;
    public Employee(){

    }
    public Employee(String name, int staj, int ojidZp, int year) {
        this.name = name;
        this.staj = staj;
        this.ojidZp = ojidZp;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStaj() {
        return staj;
    }

    public void setStaj(int staj) {
        this.staj = staj;
    }

    public int getOjidZp() {
        return ojidZp;
    }

    public void setOjidZp(int ojidZp) {
        this.ojidZp = ojidZp;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(Employee employee) {
        return "Employee{" +
                "name='" + employee.name + '\'' +
                ", staj=" + employee.staj +
                ", ojidZp=" + employee.ojidZp +
                ", year=" + employee.year +
                '}';
    }
}
