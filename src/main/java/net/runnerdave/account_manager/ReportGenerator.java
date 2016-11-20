package net.runnerdave.account_manager;

/**
 * Created by davidajimenez on 20/11/2016.
 */
public class ReportGenerator {

    private Reporting transactionObject;

    public void generateReport() {
        System.out.println(transactionObject.getName() + " "
                            + transactionObject.productBreakdown() + " "
                            + transactionObject.getDate());
    }
}
