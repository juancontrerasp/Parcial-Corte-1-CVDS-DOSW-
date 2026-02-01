package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS_DOSW.util;

import java.util.*;

public class ReportBuilder {
    private Report baseReport;
    private List<ReportDecorator> decorators = new ArrayList<>();

    public ReportBuilder withFormat(String format) {
        switch (format.toLowerCase()) {
            case "pdf" -> baseReport = new PDFReport();
            case "excel" -> baseReport = new ExcelReport();
            case "html" -> baseReport = new HTMLReport();
            default -> throw new IllegalArgumentException("Formato no soportado: " + format);
        }
        return this;
    }

    public ReportBuilder addSummary() {
        decorators.add(new Summary(baseReport));
        baseReport = decorators.get(decorators.size() - 1);
        return this;
    }

    public ReportBuilder addTable() {
        decorators.add(new Table(baseReport));
        baseReport = decorators.get(decorators.size() - 1);
        return this;
    }

    public ReportBuilder addGraph() {
        decorators.add(new Graph(baseReport));
        baseReport = decorators.get(decorators.size() - 1);
        return this;
    }

    public Report build() {
        return baseReport != null ? baseReport : new PDFReport(); // Default
    }
}