package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS_DOSW.util;
public abstract class ReportDecorator implements Report{
    protected Report report;

    public ReportDecorator(Report report) {
        this.report = report;
    }
    @Override
    public String getReportInfo() {
        return report.getReportInfo();
    }

}
