public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee employee=new Employee("Kemal",2000,45,1985);
        employee.tax();
        employee.bonus();
        employee.raiseSalary();
        System.out.print(employee);
    }
}
