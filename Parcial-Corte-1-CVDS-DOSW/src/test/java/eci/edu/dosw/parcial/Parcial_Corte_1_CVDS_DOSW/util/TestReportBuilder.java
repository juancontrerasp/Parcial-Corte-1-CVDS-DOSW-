package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS_DOSW.util;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TestReportBuilder {

    @Test
    public void testPDFDefault() {
        Report report = new ReportBuilder().build();
        assertEquals("Reporte: Formato en PDF", report.getReportInfo());
    }

    @Test
    public void testExcelFormat() {
        Report report = new ReportBuilder().withFormat("excel").build();
        assertEquals("Reporte: Formato en Excel", report.getReportInfo());
    }

    @Test
    public void testHTMLFormat() {
        Report report = new ReportBuilder().withFormat("html").build();
        assertEquals("Reporte: Formato en HTML", report.getReportInfo());
    }

    @Test
    public void testInvalidFormat() {
        assertThrows(IllegalArgumentException.class, () -> new ReportBuilder().withFormat("txt").build());
    }

    @Test
    public void testAddSummary() {
        Report report = new ReportBuilder().withFormat("pdf").addSummary().build();
        assertEquals("Reporte: Formato en PDF, resúmenes con indicadores", report.getReportInfo());
    }

    @Test
    public void testAddTable() {
        Report report = new ReportBuilder().withFormat("excel").addTable().build();
        assertEquals("Reporte: Formato en Excel, tablas con calificaciones", report.getReportInfo());
    }

    @Test
    public void testAddGraph() {
        Report report = new ReportBuilder().withFormat("html").addGraph().build();
        assertEquals("Reporte: Formato en HTML, gráficos estadísticos de desempeño", report.getReportInfo());
    }

    @Test
    public void testMultipleDecorators() {
        Report report = new ReportBuilder().withFormat("pdf").addSummary().addTable().addGraph().build();
        assertEquals("Reporte: Formato en PDF, resúmenes con indicadores, tablas con calificaciones, gráficos estadísticos de desempeño", report.getReportInfo());
    }
}