package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS_DOSW.util;
public class graph extends ReportDecorator {
    public graph(Report report) {
        super(report);
    }

    @Override
    public String getReportInfo() {
        return report.getReportInfo() + "Gráficos estadísticos de desempeño";
    }

}
