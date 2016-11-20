package net.runnerdave.hospital.reporting;

import net.runnerdave.hospital.domain.Employee;

/**
 * Created by davidajimenez on 19/11/2016.
 */
public class EmployeeReportFormatter extends ReportFormatter {

    public EmployeeReportFormatter(Employee anEmployee, FormatType formatType) {
        super(anEmployee, formatType);
    }


}
