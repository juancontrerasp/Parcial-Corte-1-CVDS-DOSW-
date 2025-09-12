package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS_DOSW.util;
public class Graph extends ReportDecorator {
    public Graph(Report report) {
        super(report);
    }

    @Override
    public String getReportInfo() {
        return report.getReportInfo() + ", gráficos estadísticos de desempeño";
    }

}
