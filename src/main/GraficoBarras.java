package main;

import javax.swing.JFrame;

import demo.orsoncharts.swing.ExitOnClose;

public class GraficoBarras extends JFrame {

	public GraficoBarras() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Grafico de Barras");
		setSize(950, 700);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {

		new GraficoBarras();

	}

}
