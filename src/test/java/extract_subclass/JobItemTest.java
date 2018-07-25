package extract_subclass;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JobItemTest {
    @Test
    public void total_price_is_500_when_getTotalPrice_given_kent_work_for_5() throws Exception {
        Employee kent = new Employee(100);
        JobItem jobItem = new JobItem(0, 5, kent, true);
        assertEquals(500, jobItem.getTotalPrice());
    }

    @Test
    public void total_price_is_500_when_getTotalPrice_given_unitPrice_is_10_and_quantity_is_5() throws Exception {
        JobItem jobItem = new JobItem(10, 5, null, false);
        assertEquals(50, jobItem.getTotalPrice());
    }
}
