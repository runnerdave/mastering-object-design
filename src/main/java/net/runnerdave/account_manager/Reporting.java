package net.runnerdave.account_manager;

import java.time.LocalDate;

/**
 * Created by davidajimenez on 20/11/2016.
 */
public interface Reporting {
    //methods for reporting
    String getName();

    LocalDate getDate();

    String productBreakdown();
}
