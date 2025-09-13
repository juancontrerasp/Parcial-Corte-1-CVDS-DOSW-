package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS_DOSW;

import eci.edu.dosw.parcial.Parcial_Corte_1_CVDS_DOSW.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParcialCorte1CvdsDoswApplication {

	public static void main(String[] args) {

		excelReportGenerator();
		pdfReportGenerator();
		htmlReportGenerator();
	}
	public static void excelReportGenerator() {
		Report excelReport = new ExcelReport();
		excelReport = new Graph(excelReport);
		excelReport = new Table(excelReport);
		excelReport = new Summary(excelReport);
		System.out.println(excelReport.getReportInfo());
	}

	public static void pdfReportGenerator() {
		Report pdfReport = new PDFReport();
		pdfReport = new Graph(pdfReport);
		pdfReport = new Table(pdfReport);
		pdfReport = new Summary(pdfReport);
		System.out.println(pdfReport.getReportInfo());
	}

	public static void htmlReportGenerator() {
		Report htmlReport = new HTMLReport();
		htmlReport = new Graph(htmlReport);
		htmlReport = new Table(htmlReport);
		htmlReport = new Summary(htmlReport);
		System.out.println(htmlReport.getReportInfo());
	}

}
