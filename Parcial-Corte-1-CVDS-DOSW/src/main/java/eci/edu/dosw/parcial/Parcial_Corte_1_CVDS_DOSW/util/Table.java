package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS_DOSW.util;

public class Table extends ReportDecorator {
    public Table(Report report) {
        super(report);
    }

    @Override
    public String getReportInfo() {
        return report.getReportInfo() + ", tablas con calificaciones";
    }

}
