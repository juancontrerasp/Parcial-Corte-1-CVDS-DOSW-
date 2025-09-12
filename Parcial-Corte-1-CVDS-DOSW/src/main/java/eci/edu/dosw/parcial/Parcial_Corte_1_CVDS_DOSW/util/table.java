package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS_DOSW.util;

public class table extends ReportDecorator {
    public table(Report report) {
        super(report);
    }

    @Override
    public String getReportInfo() {
        return report.getReportInfo() + "Tablas con calificaciones";
    }

}
