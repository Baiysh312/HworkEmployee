public class Company extends CompanyRoditel{
    @Override
    public void workCompany() {
        System.out.println("The company provides good internet to the city");
    }
    private Employee employeeC;

    public Employee getEmployee() {
        return employeeC;
    }

    public void setEmployee(Employee employee) {
        this.employeeC = employee;
    }

    private String nameCompany;

    public Company(int predlogZp, int ojidYear, int ojidStaj,String nameCompany) {
        super(predlogZp, ojidYear, ojidStaj);
        this.nameCompany=nameCompany;
    }

    @Override
    public void PiemWork(Employee employee) {
        if (employee.getOjidZp()<=getPredlogZp()&&employee.getStaj()>=getOjidStaj()&&employee.getYear()>=getOjidYear()){
            employeeC=employee;
            System.out.println(employee.toString(employeeC)+" Sotrudnik podhodit");
        }
        else System.out.println("sotrudnik ne podhodit");
    }
    public String toString() {
        return "CompanyRoditel{" +
                "name company="+nameCompany+
                ", predlogZp=" + getPredlogZp() +
                ", ojidYear=" + getOjidYear() +
                ", ojidStaj=" + getOjidStaj() +
                '}';
    }

}
