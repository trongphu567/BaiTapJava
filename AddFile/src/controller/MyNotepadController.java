package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;

import view.MyNotepadView;

public class MyNotepadController implements ActionListener {
	private MyNotepadView myNotepadView;
	
	
	public MyNotepadController(MyNotepadView myNotepadView) {
		this.myNotepadView = myNotepadView;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		JFileChooser jFileChooser=new JFileChooser();
		
		if (command.equals("Open")) {
			int returnVal=jFileChooser.showOpenDialog(this.myNotepadView);
			if (returnVal==JFileChooser.APPROVE_OPTION) {
				File file=jFileChooser.getSelectedFile();
				String fileName=file.getName();
				this.myNotepadView.model.setFileName(file.getAbsolutePath());
				this.myNotepadView.lblNewLabel.setText(this.myNotepadView.model.getContent());
				if (fileName.endsWith(".txt")) {
					try {
						String result="";
						List<String> allText=Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
						for (String line:allText) {
							result+=line;
							result+="\n";
						}
						this.myNotepadView.model.setContent(result);
						this.myNotepadView.textArea.setText(this.myNotepadView.model.getContent());
							
					}
					catch (Exception e2) {
						e2.printStackTrace();
					}
				}
				this.myNotepadView.lblNewLabel.setText(file.getAbsolutePath());
			}
		}
		else if (command.equals("Save")) {
			if (this.myNotepadView.model.getFileName().length()>0) {
				try {
					PrintWriter pw=new PrintWriter(this.myNotepadView.model.getFileName(),"UTF-8");
					String data=this.myNotepadView.textArea.getText();
					pw.print(data);
					pw.flush();
					pw.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else {
				int returnVal=jFileChooser.showSaveDialog(this.myNotepadView);
				if (returnVal==JFileChooser.APPROVE_OPTION) {
					File file=jFileChooser.getSelectedFile();
					save(file.getAbsolutePath());
					
				}
			}
			
	}
		

	}
	public void save(String fileName) {
		try {
			PrintWriter pw=new PrintWriter(fileName,"UTF-8");
			String data=this.myNotepadView.textArea.getText();
			pw.print(data);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
	}
}
