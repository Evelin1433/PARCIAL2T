
package tortrix;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class licencia_tor extends JFrame implements ActionListener,ChangeListener{
    
      private JLabel label1, label2;
      private JCheckBox check1;
      private JButton boton1, boton2;
      private JScrollPane scrollpane1;
      private JTextArea textarea1;
      String nombre = "";
      
      public licencia_tor(){
          setLayout(null);
          setTitle("Licencia de uso");
          setIconImage(new ImageIcon(getClass().getResource("img/prin.JPG")).getImage());
          //llamar a una variable
          bienvenida ventanaBienvenida =new bienvenida();
          nombre = ventanaBienvenida.texto;
          
          label1 = new JLabel("TÉRMINOS Y CONDICIONES");
          label1.setBounds(215,5,200,30);
          label1.setFont(new Font("Andele Mono",1,14));
          label1.setForeground(new Color(5,4,3));
          add(label1);
          
          textarea1 = new JTextArea();
          textarea1.setEditable(false);
          textarea1.setFont(new Font("Andele Mono",0,9));
          textarea1.setText("\n\n          Terminos y Condiciones"+
                  "\n"+
          "\n BASES DE LA PROMOCIÓN: "       
          + "\n\n  FÁBRICA DE PRODUCTOS ALIMENTICIOS RENE Y COMPAÑÍA,"
          + "  \n   SOCIEDAD EN COMANDITA POR ACCIONES que será denominado EL ORGANIZADOR "
          + "pone a disposición del público en general "
          + "\n  las siguientes Bases de la Promoción “LLEGA EL PISTO CON TORTRIX” "
          + "(que en lo sucesivo será denominada LA PROMOCIÓN):"
          + "\n     Promoción es válida en la República de Guatemala.\n "
          + "\n       I. OBJETO DE LA PROMOCIÓN"
          +  "\n"    
          + "\n LA PROMOCIÓN “LLEGA EL PISTO CON TORTRIX” se crea con el fin de promocionar y crear fidelidad de la"
          + "\n marca Tortrix ninvitar a los consumidores a participar y hacerse acreedores de premios monetarios "
          + "\ninstantáneos, premios monetarios"
          + " semanales y premios instantáneos de Pollo Campero.");
          scrollpane1 = new JScrollPane(textarea1);
          scrollpane1.setBounds(10,40,575,200);
          add(scrollpane1);
          
          check1 = new JCheckBox("Yo " + nombre + " Acepto" );
          check1.setBounds(10,250,300,30);
          check1.addChangeListener(this);
          add(check1);
          
         boton1 = new JButton("Continuar");
         boton1.setBounds(10,290,100,30);
         boton1.addActionListener(this);
         boton1.setEnabled(false);
         add(boton1);
         
         boton2 = new JButton("No Acepto");
         boton2.setBounds(100,290,100,30);
         boton2.addActionListener(this);
         boton2.setEnabled(false);
         add(boton2);
         
         ImageIcon imagen = new ImageIcon("img/logo.JPG");
         label2 = new JLabel(imagen);
         label2.setBounds(35,135,30,30);
         add(label2);
          //ventanalicencia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }

    
    public void stateChanged(ChangeEvent ae) {
         if(check1.isSelected() ==true){
             boton1.setEnabled(true);
             boton2.setEnabled(false);
         }else{
             boton1.setEnabled(false);
             boton2.setEnabled(true);
         }
    }
    public void actionPerformed(ActionEvent ae) {
     if(ae.getSource() == boton1){
         Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0,0,640,535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
         
     } else if(ae.getSource() == boton2){
      bienvenida formulario = new bienvenida();
        formulario.setBounds(150,20,500,500);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
        this.setVisible(false);
     }
    }
    
    public static void main(String[] args) {
        licencia_tor ventanalicencia = new licencia_tor();
        ventanalicencia.setBounds(0,0,600,360);
        ventanalicencia.setVisible(true);
        ventanalicencia.setResizable(false);
        ventanalicencia.setLocationRelativeTo(null);
       
    }
}
