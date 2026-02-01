package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS_DOSW.util;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestReportFuncionality {

    @Test
    public void testFullPDFWithAll() {
        Report report = new ReportBuilder().withFormat("pdf").addSummary().addTable().addGraph().build();
        assertEquals("Reporte: Formato en PDF, resúmenes con indicadores, tablas con calificaciones, gráficos estadísticos de desempeño", report.getReportInfo());
    }

    @Test
    public void testFullExcelWithSummaryOnly() {
        Report report = new ReportBuilder().withFormat("excel").addSummary().build();
        assertEquals("Reporte: Formato en Excel, resúmenes con indicadores", report.getReportInfo());
    }

    @Test
    public void testFullHTMLWithTableAndGraph() {
        Report report = new ReportBuilder().withFormat("html").addTable().addGraph().build();
        assertEquals("Reporte: Formato en HTML, tablas con calificaciones, gráficos estadísticos de desempeño", report.getReportInfo());
    }

}