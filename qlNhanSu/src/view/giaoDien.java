package view;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.TableRowSorter;

import dao.daoNhanVien;
import model.NhanVien;
import java.awt.event.MouseAdapter;

public class giaoDien extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JPanel contentPane;
	JTextField idtf;
	JTextField tentf;
	JTextField nsinhtf;
	JTable tb;
	DefaultTableModel model;
	JTextField dchitf;
	JTextField dttf;
	JTextField searchtf;
	JButton addbt = new JButton(" Thêm");
	JButton resbt = new JButton(" Reset");
	JButton delbt = new JButton(" Xoá");
	JButton editbt = new JButton(" Sửa");
	JButton searchbt = new JButton("");
	JRadioButton femrd = new JRadioButton("Nữ");
	JRadioButton malerd = new JRadioButton("Nam");
	TableRowSorter<DefaultTableModel> sort;
	ArrayList<NhanVien> list;
	ButtonGroup g1=new ButtonGroup();
	JComboBox cvu;
	String col[]= {"ID","Họ tên","Giới tính","Ngày sinh","Địa chỉ","Sđt","Chức vụ"};
	int selectrow;
	String pid;
	Object[][] data;
	
	public giaoDien() {
		setTitle("Nhân viên");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 826, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		JLabel title = new JLabel("QUẢN LÝ NHÂN SỰ");
		title.setForeground(SystemColor.activeCaption);
		title.setBackground(SystemColor.activeCaption);
		title.setFont(new Font("UTM Aptima", Font.BOLD, 25));
		title.setBounds(277, 11, 304, 47);
		contentPane.add(title);
		
		//TABLE
		//import from database
		
//		list=daoNhanVien.getInstance().importDTB();
//		data=new Object[list.size()][col.length];
//		for(int i=0;i<list.size();i++) {
//			data[i][0]=(list.get(i).getID()).trim();
//			data[i][1]=(list.get(i).getHoten()).trim();
//			data[i][2]=(list.get(i).getGioitinh()).trim();
//			data[i][3]=(list.get(i).getNgaysinh()).trim();
//			data[i][4]=(list.get(i).getDiachi()).trim();
//			data[i][5]=(list.get(i).getSdt()).trim();
//			data[i][6]=(list.get(i).getChucvu()).trim();
//		}
		model = new DefaultTableModel(data,col);
		tb= new JTable(model);
		sort=new TableRowSorter<DefaultTableModel>(model);
		tb.setRowSorter(sort);
		
		
		//throw table on text field
//		
//		tb.addMouseListener(new MouseAdapter() {	
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				selectrow=tb.getSelectedRow();
//				System.out.println("At row:" + selectrow);
//				pid=(String)tb.getValueAt(selectrow,0);
//				idtf.setText(tb.getValueAt(selectrow, 0).toString());
//				tentf.setText(tb.getValueAt(selectrow, 1).toString());
//				if((tb.getValueAt(selectrow, 2).toString().contains("Nam"))==true)
//					malerd.setSelected(true);
//				else femrd.setSelected(true);
//				nsinhtf.setText(tb.getValueAt(selectrow, 3).toString());
//				dchitf.setText(tb.getValueAt(selectrow, 4).toString());
//				dttf.setText(tb.getValueAt(selectrow, 5).toString());
//				String chuc=tb.getValueAt(selectrow, 6).toString();
//				if(chuc.contains("Hướng dẫn viên")==true)	
//					cvu.setSelectedItem("Hướng dẫn viên");
//				else if(chuc.contains("Kế toán")==true)
//					cvu.setSelectedItem("Kế toán"); 
//				else cvu.setSelectedItem("Quản trị viên");		
//				}
//		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 351, 753, 154);
		contentPane.add(scrollPane);
		tb.setBackground(SystemColor.inactiveCaption);
		scrollPane.setViewportView(tb);
		
		JPanel info = new JPanel();
		info.setBounds(28, 69, 524, 249);
		contentPane.add(info);
		info.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Th\u00F4ng tin nh\u00E2n vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.activeCaption));
		info.setLayout(null);
		
		JLabel idlb = new JLabel("Mã ID");
		idlb.setBounds(25, 62, 70, 30);
		info.add(idlb);
		idlb.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		idtf = new JTextField();
		idtf.setBounds(120, 62, 118, 30);
		info.add(idtf);
		idtf.setColumns(10);
		
		JLabel htenlb = new JLabel("Họ tên");
		htenlb.setBackground(SystemColor.inactiveCaption);
		htenlb.setBounds(25, 25, 70, 30);
		info.add(htenlb);
		htenlb.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel nsinhlb = new JLabel("Ngày sinh");
		nsinhlb.setBounds(25, 100, 85, 30);
		info.add(nsinhlb);
		nsinhlb.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
	
		nsinhtf = new JTextField();
		nsinhtf.setBounds(120, 103, 118, 30);
		info.add(nsinhtf);
		nsinhtf.setColumns(10);
		
		//TENTF
		tentf = new JTextField();
		tentf.setBounds(120, 25, 358, 30);
		info.add(tentf);
		tentf.setColumns(10);
		tentf.addActionListener(this);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Giới tính");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(248, 100, 85, 30);
		info.add(lblNewLabel_1_2_1);
		
		//RADIO BTN GENDER
		femrd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		femrd.setBounds(339, 105, 59, 23);
		info.add(femrd);
		malerd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		malerd.setBounds(419, 105, 59, 23);
		info.add(malerd);
		g1.add(malerd); g1.add(femrd);
		
		JLabel dchilb = new JLabel("Địa chỉ");
		dchilb.setFont(new Font("Tahoma", Font.PLAIN, 18));
		dchilb.setBounds(25, 141, 108, 30);
		info.add(dchilb);
		
		//DCHI TF
		dchitf = new JTextField();
		dchitf.setColumns(10);
		dchitf.setBounds(120, 144, 358, 30);
		info.add(dchitf);
		
		JLabel cvulb = new JLabel("Chức vụ");
		cvulb.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cvulb.setBounds(25, 182, 108, 30);
		info.add(cvulb);
		
		//COMBOBOX CHUCVU
		String chuc[]= {"Hướng dẫn viên","Kế toán","Quản trị viên"};
		cvu = new JComboBox(chuc);
		cvu.setBounds(120, 185, 358, 31);
		info.add(cvu);
		
		JLabel lblNewLabel_1_2_1_1_2 = new JLabel("Sđt");
		lblNewLabel_1_2_1_1_2.setBounds(248, 62, 45, 30);
		info.add(lblNewLabel_1_2_1_1_2);
		lblNewLabel_1_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		//SDT TF
		dttf = new JTextField();
		dttf.setColumns(10);
		dttf.setBounds(284, 62, 194, 30);
		info.add(dttf);
		
		JPanel func = new JPanel();
		func.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.activeCaption));
		func.setBounds(582, 69, 199, 249);
		contentPane.add(func);
		func.setLayout(null);
		
		//RESET BUTTON
		resbt.setBackground(SystemColor.inactiveCaption);
		resbt.setHorizontalAlignment(SwingConstants.LEFT);
		resbt.setIcon(new ImageIcon(giaoDien.class.getResource("/icons/reset_nv.png")));
		resbt.setBounds(10, 189, 179, 49);
		func.add(resbt);
		resbt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		resbt.addActionListener(this);
		
		//DEL BUTTON
		delbt.setBackground(SystemColor.inactiveCaption);
		delbt.setHorizontalAlignment(SwingConstants.LEFT);
		delbt.setIcon(new ImageIcon(giaoDien.class.getResource("/icons/del_nv.png")));
		delbt.setBounds(10, 134, 179, 49);
		func.add(delbt);
		delbt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		delbt.addActionListener(this);
		
		//EDIT BUTTON
		editbt.setBackground(SystemColor.inactiveCaption);
		editbt.setHorizontalAlignment(SwingConstants.LEFT);
		editbt.setIcon(new ImageIcon(giaoDien.class.getResource("/icons/edit_nv.png")));
		editbt.setBounds(10, 79, 179, 49);
		func.add(editbt);
		editbt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		editbt.addActionListener(this);
		
		//ADD BUTTON
		addbt.setBackground(SystemColor.inactiveCaption);
		addbt.setHorizontalAlignment(SwingConstants.LEFT);
		addbt.setIcon(new ImageIcon(giaoDien.class.getResource("/icons/add_nv.png")));
		addbt.setBounds(10, 25, 179, 49);
		func.add(addbt);
		addbt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		addbt.addActionListener(this);
		
		//SEARCH TF
		searchtf = new JTextField();
		searchtf.setColumns(10);
		searchtf.setBounds(548, 326, 233, 23);
		contentPane.add(searchtf);
		
		//SEARCH BUTTON
		searchbt.setIcon(new ImageIcon(giaoDien.class.getResource("/icons/search_nv.png")));
		searchbt.setBounds(520, 326, 22, 23);
		contentPane.add(searchbt);
		searchbt.addActionListener(this);
	}
	
	//check conditions
	public int checkField() {
		int flag=1;
		if(tentf.getText().isEmpty()|| dchitf.getText().isEmpty()||
				idtf.getText().isEmpty()||dttf.getText().isEmpty() ||
				nsinhtf.getText().isEmpty() &&
				(!malerd.isSelected() || !femrd.isSelected()) ) {
			JOptionPane.showMessageDialog(null,"Trường không được rỗng!");
			flag=0;
		}
		if(nsinhtf.getText().matches("^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$")==false) {
			JOptionPane.showMessageDialog(null,"Ngày sinh phải ở định dạng yyyy-mm-dd");
			flag=0;
		}
		return flag;
	}
	public int checkDupAdd() {
		int flag=1;
		for(int i=0;i<list.size();i++) {
			if(idtf.getText().equals(list.get(i).getID().trim())) {
				JOptionPane.showMessageDialog(null,"ID không thể trùng!");
				flag=0;}
		}
		return flag;
	}
	public int checkDupEdit() {
		int flag=1;
		String id_now=list.get(selectrow).getID().trim();
		if(idtf.getText().equals(id_now)==false) 
			for(int i=0;i<list.size();i++) {
				if(idtf.getText().equals(list.get(i).getID().trim())) {
					JOptionPane.showMessageDialog(null,"ID không thể trùng!");
					flag=0;
				}
			}	
		return flag;
	}
	String gender, chucvu;
	public void actionPerformed(ActionEvent e) {
		//ADD EVENT
		if(e.getSource()==addbt) {
			if(checkField()==1 && checkDupAdd()==1){
				if (malerd.isSelected())
					gender=malerd.getText();
				else gender=femrd.getText();
				chucvu=cvu.getSelectedItem().toString();
				NhanVien nv=new NhanVien(idtf.getText(),tentf.getText(),
						gender,nsinhtf.getText(),dchitf.getText(),dttf.getText(),chucvu);
				daoNhanVien.getInstance().insert(nv);
				list=daoNhanVien.getInstance().importDTB();
				Object[] nrow= {idtf.getText(),tentf.getText(),gender,nsinhtf.getText(),dchitf.getText(),dttf.getText(),chucvu};
				model.addRow(nrow);
				for(int i=0;i<list.size();i++)
					list.get(i).show();
			}
		}
		//EDIT EVENT
		if(e.getSource()==editbt) {
			if(checkField()==1 && checkDupEdit()==1) {
				if (malerd.isSelected())
					gender=malerd.getText();
				else gender=femrd.getText();
				chucvu=cvu.getSelectedItem().toString();
				NhanVien nv=new NhanVien(idtf.getText(),tentf.getText(),
						gender,nsinhtf.getText(),dchitf.getText(),dttf.getText(),chucvu);
				list.set(selectrow, nv);
				daoNhanVien.getInstance().update(pid,nv);
				model.setValueAt(idtf.getText(),selectrow,0);
				model.setValueAt(tentf.getText(),selectrow,1);
				model.setValueAt(gender,selectrow,2);
				model.setValueAt(nsinhtf.getText(),selectrow,3);
				model.setValueAt(dchitf.getText(),selectrow,4);
				model.setValueAt(dttf.getText(),selectrow,5);
				model.setValueAt(chucvu,selectrow,6);
					}
				}
		//DELETE EVENT
		if(e.getSource()==delbt) {
			//--CHECK CONDITION HERE--
			if (malerd.isSelected())
				gender=malerd.getText();
			else gender=femrd.getText();
			String id_now=idtf.getText().trim();
			chucvu=cvu.getSelectedItem().toString();
			NhanVien nv=new NhanVien(id_now,tentf.getText(),
					gender,nsinhtf.getText(),dchitf.getText(),dttf.getText(),chucvu);
			int index=0;
			for(int i=0;i<list.size();i++) 
				if(list.get(i).getID().trim().equals(id_now)==true)
					index=i;
			list.remove(index);
			for(int i=0;i<list.size();i++)
				list.get(i).show();
			daoNhanVien.getInstance().delete(nv);
			model.removeRow(selectrow);
			}
		//RESET EVENT
		if(e.getSource()==resbt) {
			idtf.setText("");
			tentf.setText("");
			dttf.setText("");
			dchitf.setText("");
			nsinhtf.setText("");
			femrd.setSelected(true);
			cvu.setSelectedItem("Hướng dẫn viên");
		}
		//SEARCH EVENT
		if(e.getSource()==searchbt) {
			String find=searchtf.getText();
			sort.setRowFilter(RowFilter.regexFilter(find));
			}
		}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					giaoDien frame = new giaoDien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
