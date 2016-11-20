package net.runnerdave.account_manager;

/**
 * Created by davidajimenez on 20/11/2016.
 */
public class AccountsReceivable {
    private Accounting transactionObject;

    public AccountsReceivable(CustomerTransaction transactionObject) {
        this.transactionObject = transactionObject;
    }

    public void postPayment() {
        transactionObject.chargeCustomer();
    }

    public void sendInvoice(){
        transactionObject.prepareInvoice();
    }
}
