package Lession2_Open_Close_Principle.Example3.ProblematicCode;

public class ReportGenerator {

    public String generateReport(String reportType) {
        if (reportType.equals("PDF")) {
            return "Generating PDF report.";
        } else if (reportType.equals("Word")) {
            return "Generating Word report.";
        }
        return "Report type not supported.";
    }
}
