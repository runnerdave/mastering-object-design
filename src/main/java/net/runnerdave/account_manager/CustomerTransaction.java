package net.runnerdave.account_manager;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by davidajimenez on 20/11/2016.
 */
public class CustomerTransaction implements Accounting, Reporting {

    private List<Product> products;

    private Customer customer;

    public CustomerTransaction(List<Product> products, Customer customer) {
        this.products = products;
        this.customer = customer;
    }

    //methods for reporting
    @Override
    public String getName() {
        return customer.getName();
    }

    @Override
    public LocalDate getDate() {
        return LocalDate.now();
    }

    @Override
    public String productBreakdown() {
        String productListing = "";
        for (Product p : products
                ) {
            productListing += p.getId() + " : " + p.getName() + "\n";
        }

        return productListing;
    }

    //methods for accounting
    @Override
    public void prepareInvoice() {
        System.out.println("invoice prepared...");
    }

    @Override
    public void chargeCustomer() {
        System.out.println("charged the customer");
    }
}
