package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS_DOSW.util;
public class ReportBuilder extends ReportDecorator {
    private String info;
    public ReportBuilder(Report report, String format) {
        super(report);
    }
    @Override
    public String getReportInfo() {
        return report.getReportInfo() + info;
    }

}
