package remove_switch;

public class Salesman extends EmployeeType {

    int payAmount(Employee employee) {
        return employee.getMonthlySalary() + employee.getCommission();
    }
}
