package remove_switch;

public class Manager extends EmployeeType {

    int payAmount(Employee employee) {
        return employee.getMonthlySalary() + employee.getBonus();
    }
}
