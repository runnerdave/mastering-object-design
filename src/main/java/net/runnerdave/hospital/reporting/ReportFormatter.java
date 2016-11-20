package net.runnerdave.hospital.reporting;

/**
 * Created by davidajimenez on 19/11/2016.
 */
public class ReportFormatter {
    private String formattedOutput;

    private String convertObjectToXML(Object object) {
        return "XML:<" + object.toString() + ">";
    }

    public ReportFormatter(Object obj, FormatType formatType) {
        switch(formatType) {
            case XML:
                formattedOutput = convertObjectToXML(obj);
                break;
            case CSV:
                formattedOutput = convertObjectToCSV(obj);
                break;
        }
    }

    private String convertObjectToCSV(Object object) {
        return "CSV:," + object.toString() + ",";
    }

    public String getFormattedOutput() {
        return formattedOutput;
    }
}
