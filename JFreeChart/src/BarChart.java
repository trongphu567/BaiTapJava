import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChart extends JFrame {

	private JPanel contentPane;

	public static JFreeChart createChart() {
		JFreeChart barChart=ChartFactory.createBarChart("BIỂU ĐỒ DÂN SỐ VIỆT NAM", "Năm","Số người",createDataset(),PlotOrientation.VERTICAL, false, false, false);
		return barChart;
	}
	private static CategoryDataset createDataset() {
		final DefaultCategoryDataset dataset=new DefaultCategoryDataset();
		dataset.setValue(68000000, "Số người", "1990");
		dataset.setValue(80000000, "Số người", "2000");
		dataset.setValue(88000000, "Số người", "2010");
		dataset.setValue(95000000, "Số người", "2020");
		return dataset;
	}
	public static void main(String[] args) {
		ChartPanel chartPanel=new ChartPanel(createChart());
		chartPanel.setPreferredSize(new java.awt.Dimension(560,367));
		JFrame jFrame=new JFrame();
		jFrame.add(chartPanel);
		jFrame.setTitle("Biểu đồ");
		jFrame.setSize(600,600);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);
	}

}
