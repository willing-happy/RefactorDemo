package remove_switch;

public class Employee {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    private EmployeeType type;
    private int monthlySalary;
    private int commission;
    private int bonus;

    public Employee(int type) {
        setType(type);
    }

    int payAmount() {
        switch (getType()) {
            case ENGINEER:
                return monthlySalary;
            case SALESMAN:
                return monthlySalary + commission;
            case MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Incorrect employee");

        }
    }

    public int getType() {
        return type.getTypeCode();
    }

    public void setType(int type) {
        switch (type) {
            case ENGINEER:
                this.type = new Engineer();
                break;
            case SALESMAN:
                this.type = new Salesman();
                break;
            case MANAGER:
                this.type = new Manager();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Employee Code");

        }
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
