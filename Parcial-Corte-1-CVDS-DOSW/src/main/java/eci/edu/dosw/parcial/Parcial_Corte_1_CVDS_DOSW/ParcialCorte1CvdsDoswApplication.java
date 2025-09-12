package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS_DOSW;

import eci.edu.dosw.parcial.Parcial_Corte_1_CVDS_DOSW.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParcialCorte1CvdsDoswApplication {

	public static void main(String[] args) {

		SpringApplication.run(ParcialCorte1CvdsDoswApplication.class, args);
		excelReportGenerator();
	}
	public static void  excelReportGenerator(){
		Report excelReport = new ExcelReport();
		excelReport = new Graph(excelReport);
		System.out.println(excelReport.getReportInfo());
	}
}
