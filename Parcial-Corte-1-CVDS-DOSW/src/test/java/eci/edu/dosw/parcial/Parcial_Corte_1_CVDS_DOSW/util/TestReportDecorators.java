package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS_DOSW.util;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestReportDecorators {

    @Test
    public void testSummaryDecorator() {
        Report base = new PDFReport();
        Report decorated = new Summary(base);
        assertEquals("Reporte: Formato en PDF, resúmenes con indicadores", decorated.getReportInfo());
    }

    @Test
    public void testTableDecorator() {
        Report base = new ExcelReport();
        Report decorated = new Table(base);
        assertEquals("Reporte: Formato en Excel, tablas con calificaciones", decorated.getReportInfo());
    }

    @Test
    public void testGraphDecorator() {
        Report base = new HTMLReport();
        Report decorated = new Graph(base);
        assertEquals("Reporte: Formato en HTML, gráficos estadísticos de desempeño", decorated.getReportInfo());
    }

    @Test
    public void testChainedDecorators() {
        Report base = new PDFReport();
        Report summary = new Summary(base);
        Report table = new Table(summary);
        Report graph = new Graph(table);
        assertEquals("Reporte: Formato en PDF, resúmenes con indicadores, tablas con calificaciones, gráficos estadísticos de desempeño", graph.getReportInfo());
    }
}