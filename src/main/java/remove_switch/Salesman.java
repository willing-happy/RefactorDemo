package remove_switch;

public class Salesman extends EmployeeType {
    int getTypeCode() {
        return 1;
    }

    int payAmount(Employee employee) {
        return employee.getMonthlySalary() + employee.getCommission();
    }
}
