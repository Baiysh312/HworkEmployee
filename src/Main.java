public class Main {
    public static void main(String[]args){
        Employee employeE= new Employee();
        Employee employee= new Employee("Alex",3,2500,27);
        Employee employee1= new Employee("Alesh",5,2700,25);
        Employee employee2= new Employee("Max",2,2900,31);

        Company company= new Company(2800,25,4,"Security");
        company.workCompany();
        company.PiemWork(employee1);
        System.out.println(company.toString());

    }
}
