package rentalstore;


import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer customer) {
        Enumeration rentals = customer.getRentals();
        String result = "Rental Record for " + customer.getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }

        //add footer lines
        result += "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }
}
