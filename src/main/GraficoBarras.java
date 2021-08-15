package main;

import java.awt.Color;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class GraficoBarras extends JFrame {

	public GraficoBarras() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Grafico de Barras");
		setSize(950, 700);
		setLocationRelativeTo(null);
		criarGrafico();
		setVisible(true);

	}
	
	public void criarGrafico() {
	DefaultCategoryDataset barra = new DefaultCategoryDataset();
		barra.setValue(1400,"China","");
		barra.setValue(1200,"Índia","");
		barra.setValue(320,"EUA","");
		barra.setValue(210,"Brasil","");
		barra.setValue(115,"Japão","");
		barra.setValue(30,"Australia","");
		barra.setValue(18,"Portugal","");
		
		JFreeChart grafico = ChartFactory.createBarChart("População Mundial","Países","Milhões",barra,PlotOrientation.VERTICAL,true,true,false);
		
		CategoryPlot barraItem = grafico.getCategoryPlot();
		barraItem.getRenderer().setSeriesPaint(0,Color.BLACK);
		barraItem.getRenderer().setSeriesPaint(1,Color.RED);
		
		ChartPanel painel = new ChartPanel(grafico);
		add(painel);
	}

	public static void main(String[] args) {

		new GraficoBarras();

	}

}
