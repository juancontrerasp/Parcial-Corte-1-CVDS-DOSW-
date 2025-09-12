package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS_DOSW.util;

public class Summary extends ReportDecorator {
    public Summary(Report report) {
        super(report);
    }

    @Override
    public String getReportInfo() {
        return report.getReportInfo() + " Resúmenes con indicadores";
    }

}
