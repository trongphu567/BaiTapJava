package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

import view.RadioView;

public class RadioController implements ActionListener {
	private RadioView radioView;
	public RadioController(RadioView radioView) {
		this.radioView=radioView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (radioView.jRadioButton_red.isSelected()) 
//			JOptionPane.showMessageDialog(radioView, "Ban da chon: "+radioView.jRadioButton_red.getText());
			radioView.jLabel_header.setForeground(Color.RED);
		else if (radioView.jRadioButton_green.isSelected())
//			JOptionPane.showMessageDialog(radioView, "Ban da chon: "+radioView.jRadioButton_green.getText());
			radioView.jLabel_header.setForeground(Color.GREEN);
		else if (radioView.jRadioButton_blue.isSelected())
//			JOptionPane.showMessageDialog(radioView, "Ban da chon: "+radioView.jRadioButton_blue.getText());
			radioView.jLabel_header.setForeground(Color.BLUE);
	}
	
}

