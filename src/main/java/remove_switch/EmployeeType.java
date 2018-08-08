package remove_switch;

public abstract class EmployeeType {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static EmployeeType newType(int code){
        switch (code) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect Employee Code");
        }
    }

    int payAmount(Employee employee) {
        switch (getTypeCode()) {
            case ENGINEER:
                return employee.getMonthlySalary();
            case SALESMAN:
                return employee.getMonthlySalary() + employee.getCommission();
            case MANAGER:
                return employee.getMonthlySalary() + employee.getBonus();
            default:
                throw new RuntimeException("Incorrect employee");

        }
    }
    abstract int getTypeCode();
}
