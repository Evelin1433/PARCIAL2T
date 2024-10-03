package tortrix;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.beans.value.ChangeListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;


public class bienvenida extends JFrame implements ActionListener /*ChangeListener*/{ 
    private JTextField textfield1;
    private JLabel label1,label2,label3,label4;
    private JButton boton1;
    public static String texto = "";
    
    public bienvenida(){
        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(251,116,8));
         setIconImage(new ImageIcon(getClass().getResource("img/otro.PNG")).getImage());
         
         ImageIcon images = new ImageIcon("img/centro.JPG");//no funciona
         label1 = new JLabel(images);
         label1.setBounds(222,15,300,150);
         add(label1);
         
         label2 = new JLabel("TORTIX DE GUATEMALA S.A.");
         label2.setBounds(35,135,300,30);
         label2.setFont(new Font("Andale Mono", 3, 25));//tipografia 
         label2.setForeground(new Color(14,13,17));
       //  setIconImage(new ImageIcon(getClass().getResource("img/img.jpg")).getImage())
         add(label2);
         //creamos las etiquetas
         label3 = new JLabel("Ingrese su nombre");
         label3.setBounds(45,212,200,30);
         label3.setFont(new Font("Andale Mono", 13, 14));//tipografia 
         label3.setForeground(new Color(14,13,17));
         add(label3);
         
         label4 = new JLabel("totrix,\n Evelin Salvajan \n Seccion B "
                 + "\n Materia: Ingeneria en sistemas");
         label4.setBounds(85,375,300,30);
         label4.setFont(new Font("Andale Mono", 1, 12));//tipografia 
         label4.setForeground(new Color(25,25,25));
         add(label4);
         
         textfield1 = new JTextField();
         textfield1.setBounds(45, 240, 255, 25);
         textfield1.setBackground(new Color(224,224,244));
         textfield1.setFont(new Font("Andale Mono", 1, 12));//tipografia 
         textfield1.setForeground(new Color(14,13,19));//COLOR DE LA LETRA QUE SE ESCRIBE
         add(textfield1);
         
         boton1 = new JButton("Ingresar");
         boton1.setBounds(125,280,100,30);
         boton1.setFont(new Font("Andele Mono", 1,14));
         boton1.setForeground(new Color(15,13,16));
         boton1.addActionListener(this);
         add(boton1);
         
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==boton1){
           texto = textfield1.getText().trim();
           if(texto.equals("")){
               JOptionPane.showMessageDialog(null, "Debe de ingresar su nombre");
             } else {
               licencia_tor ventanalicencia = new licencia_tor();
               ventanalicencia.setBounds(0,0,600,360);
               ventanalicencia.setVisible(true);
               ventanalicencia.setResizable(false);
               ventanalicencia.setLocationRelativeTo(null);
               this.setVisible(false);
           }
        }
    }
   public static void main(String[]args){
        bienvenida formulario = new bienvenida();
        formulario.setBounds(150,20,500,500);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
         formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cierre del formulario
    }

    
}
