package remove_switch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void should_return_100_when_payAmount_given_employee_is_Engineer_and_monthly_salary_is_100() throws Exception {
        Employee engineer = new Employee(0);
        engineer.setMonthlySalary(100);

        int payAmount = engineer.payAmount();

        assertEquals(100, payAmount);
    }

    @Test
    public void should_return_220_when_payAmount_given_employee_is_Manager_and_monthly_salary_is_200_and_bonus_is_20() throws Exception {
        Employee manager = new Employee(2);
        manager.setMonthlySalary(200);
        manager.setBonus(20);

        int payAmount = manager.payAmount();

        assertEquals(220, payAmount);
    }

    @Test
    public void should_return_200_when_payAmount_given_employee_is_Salesman_and_monthly_salary_is_100_and_commission_is_100() throws Exception {
        Employee salesman = new Employee(1);
        salesman.setMonthlySalary(100);
        salesman.setCommission(100);

        int payAmount = salesman.payAmount();

        assertEquals(200, payAmount);
    }
}