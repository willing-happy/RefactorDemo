package remove_switch;

public class Manager extends EmployeeType {
    int getTypeCode() {
        return 2;
    }

    int payAmount(Employee employee) {
        return employee.getMonthlySalary() + employee.getBonus();
    }
}
