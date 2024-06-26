package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.SearchListener;
import model.SearchModel;

public class SearchView extends JFrame{
	private SearchModel searchModel;
	private JTextArea jTextArea_text;
	private JTextField jTextField_keyword;
	private JLabel jLabel_result;

	public SearchView() {
		this.searchModel = new SearchModel();
		this.init();
	}
	public void init() {
		this.setTitle("Search Text");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font font=new Font("Arial",Font.BOLD,32);
		
		JLabel jLabel_text=new JLabel("Text");
		jLabel_text.setFont(font);
		jTextArea_text=new JTextArea(100,100);
		jTextArea_text.setFont(font);
		JScrollPane jScrollPane=new JScrollPane(jTextArea_text,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		SearchListener searchListener=new SearchListener(this);
		JLabel jLabel_keyword=new JLabel("Keyword");
		jLabel_keyword.setFont(font);
		jTextField_keyword=new JTextField();
		jTextField_keyword.setFont(font);
		
		JButton jButton_thongke=new JButton("Thong ke");
		jButton_thongke.setFont(font);
		jButton_thongke.setBackground(Color.YELLOW);
		jButton_thongke.addActionListener(searchListener);
		
		jLabel_result=new JLabel();
		jLabel_result.setFont(font);
		
		JPanel jPanel_footer=new JPanel();
		jPanel_footer.setLayout(new GridLayout(2,2,10,10));
		jPanel_footer.add(jLabel_keyword);
		jPanel_footer.add(jTextField_keyword);
		jPanel_footer.add(jButton_thongke);
		jPanel_footer.add(jLabel_result);
		
		
		this.setLayout(new BorderLayout());
		this.add(jLabel_text,BorderLayout.NORTH);
		this.add(jScrollPane,BorderLayout.CENTER);
		this.add(jPanel_footer,BorderLayout.SOUTH);
		this.setVisible(true);
	}
	public void search() {
		this.searchModel.setText(jTextArea_text.getText());
		this.searchModel.setKeyword(jTextField_keyword.getText());
		this.searchModel.search();
		this.jLabel_result.setText(this.searchModel.getResult());
		
	}
	
	
}
