import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class JFreeChart extends JFrame {
	public JFreeChart() {
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	private static org.jfree.chart.JFreeChart createChart(PieDataset dataset) {
		org.jfree.chart.JFreeChart chart=ChartFactory.createPieChart("CƠ CẤU DÂN SỐ THEO NHÓM TUỔI NĂM 2010", dataset, true, true, true);
		return chart;
	}
	private static PieDataset createDataset() {
		DefaultPieDataset dataset=new DefaultPieDataset();
		dataset.setValue("Nhóm 0-14", new Double(50.0));
		dataset.setValue("Nhóm 15-59", new Double(37.0));
		dataset.setValue("Nhóm trên 60", new Double(13.0));
		return dataset;
	}
	public static void main(String []args) {
		org.jfree.chart.JFreeChart pieChart =createChart(createDataset());
		ChartPanel chartPanel =new ChartPanel(pieChart);
		JFrame jFrame=new JFrame();
		jFrame.getContentPane().add(chartPanel);
		jFrame.setTitle("Biểu đồ");
		jFrame.setSize(600, 400);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

	
	}

}
