import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;



public class Empleados extends JFrame implements ActionListener{
	private JLabel label1, label2, label3, label4,label5;
	private JButton boton1;
	private JTextField textfield1, textfield2, textfield3, textfield4, textfield5, textfield6;
	private String paterno = null, materno = null, nombre = null, correo = null, sexo = null;

	public Empleados() {
		setLayout(null);
		
		label1=new JLabel("Paterno:");
		label1.setBounds(10,20,100,20);
		add(label1);
		
		
		label2=new JLabel("Materno:");
		label2.setBounds(10,40,100,40);
		add(label2);
		
		label3=new JLabel("Nombre(s):");
		label3.setBounds(10,80,200,20);
		add(label3);
		
		
		label4=new JLabel("Correo:");
		label4.setBounds(10,95,200,50);
		add(label4);
		
		label4=new JLabel("Sexo:");
		label4.setBounds(10,120,200,70);
		add(label4);
		
		//----------------------
		
		textfield1=new JTextField();
		textfield1.setBounds(90,20,150,20);
		add(textfield1);
		
		textfield2=new JTextField();
		textfield2.setBounds(90,50,150,20);
		add(textfield2);
		
		textfield3=new JTextField();
		textfield3.setBounds(90,80,150,20);
		add(textfield3);
		
		textfield4=new JTextField();
		textfield4.setBounds(90,115,150,20);
		add(textfield4);
		
		textfield5=new JTextField();
		textfield5.setBounds(90,150,150,20);
		add(textfield5);
		
		textfield6=new JTextField();
		textfield6.setBounds(90,180,500,20);
		add(textfield6);
		
		//-----------
		boton1=new JButton("Guardar");
		boton1.setBounds(50,220,100,30);
		add(boton1);
		boton1.addActionListener(this);
			
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			
		
	
			paterno = textfield1.getText();
			materno = textfield2.getText();
			nombre = textfield3.getText();
			correo = textfield4.getText();
			sexo = textfield5.getText();
			
			textfield6.setText(("Tus datos son: ")+paterno+(" ")+materno+(" ")+nombre+(" ")+correo+(" ")+sexo);
		
		}
	}
	
	
	public static void main(String[] args) {
		Empleados formulario=new Empleados();
		formulario.setBounds(20,20,300,300);
		formulario.setVisible(true);

	}
}