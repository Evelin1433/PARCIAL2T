
package tortrix;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
    private JMenuBar mb;
    private JMenu menuOpciones,menuCalcular,menuAcercaDe,menuColorFondo;
    private JMenuItem miCalculo,miRojo,miNegro,miMorado,miElcreador,miSalir,miNuevo,mivacaciones;
    private JLabel lablLogo,lablBienvenido,lablTitle,lablNombre,lablApaterno,lablMaterno,
            lablDepartamento,lablAntiguedad,lablResultado,lablfooter;
    private JTextField txtNombreTrabajador,txtApaternoTrabajador,txtMaternoTrabajador;
    private JComboBox comboDep,comboAntiguedad;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    String nombreAd ="";
    
    public Principal() {
        setLayout(null);
        setTitle("Pantalla Principarl");
        getContentPane().setBackground(new Color(45,147,226));
        setIconImage(new ImageIcon(getClass().getResource("img/prin.JPG")).getImage());
        bienvenida venBienvenida = new bienvenida();
        nombreAd = venBienvenida.texto;
        
        mb  = new JMenuBar();
        mb.setBackground(new Color(200,0,0));
        setJMenuBar(mb);
        
        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(20,0,0));
        menuOpciones.setForeground(new Color(25,25,25));
        mb.add(menuOpciones);
        
         menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(25,0,0));
        menuCalcular.setForeground(new Color(25,25,25));
        mb.add(menuCalcular);
        
        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setForeground(new Color (25,0,0));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);
        
         menuAcercaDe = new JMenu("Acerca De");
        menuAcercaDe.setBackground(new Color(20,0,0));
        menuAcercaDe.setForeground(new Color(25,25,25));
        mb.add(menuAcercaDe);
        
        
        
         menuColorFondo = new JMenu("Color de fondo");
        menuColorFondo.setBackground(new Color(5,8,100));
        menuColorFondo.setForeground(new Color(2,8,5));
        menuOpciones.add(menuColorFondo);
        
        miRojo = new JMenuItem("celeste");
        miRojo.setForeground(new Color (25,0,0));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);
        
          miNegro = new JMenuItem("verde");
        miNegro.setForeground(new Color (25,0,0));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);
        
          miMorado = new JMenuItem("Morado");
        miMorado.setForeground(new Color (25,0,0));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);
        
        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setForeground(new Color (25,0,0));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);
        
          miElcreador = new JMenuItem("El Creador");
        miElcreador.setForeground(new Color (25,0,0));
        menuAcercaDe.add(miElcreador);
        miElcreador.addActionListener(this);
        
        miSalir = new JMenuItem("Salir");
        miSalir.setForeground(new Color (25,0,0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);
        
        ImageIcon imagen = new ImageIcon("img/otro.jpg");
        lablLogo = new JLabel(imagen);
        lablLogo.setBounds(5,55,150,100);
        add(lablLogo);
        
        lablBienvenido = new JLabel("Bienvenido " +nombreAd);
        lablBienvenido.setBounds(225,25,500,10);
        lablBienvenido.setForeground(new Color (20,25,25));
        add(lablBienvenido);
        
        lablTitle = new JLabel("Datos del trabajador para el cálculo de vacaciones");
        lablTitle.setBounds(100,33,400,100);
        lablTitle.setForeground(new Color (20,25,20));
        add(lablTitle);
        
        lablNombre = new JLabel("Nombre completo");
        lablNombre.setBounds(25,18,420,205);
        lablNombre.setForeground(new Color (25,25,25));
        add(lablNombre);
        
        txtNombreTrabajador = new JTextField();
                                     // derecha ariba    largo ancho
        txtNombreTrabajador.setBounds(25,130,150,25);
        txtNombreTrabajador.setForeground(new java.awt.Color(25,25,25));
        add(txtNombreTrabajador);
        
        lablApaterno = new JLabel("Apellido Paterno");
        lablApaterno.setBounds(25,155,185,25);
        lablApaterno.setForeground(new Color (25,25,25));
        add(lablApaterno);
        
        txtApaternoTrabajador = new JTextField();
        txtApaternoTrabajador.setBounds(25,180,150,25);
        txtApaternoTrabajador.setForeground(new java.awt.Color(25,25,25));
        add(txtApaternoTrabajador);
        
        lablMaterno = new JLabel("Apellido Materno");
        lablMaterno.setBounds(25,210,180,25);
        lablMaterno.setForeground(new Color (25,25,25));
        add(lablMaterno);
        
        txtMaternoTrabajador = new JTextField();
        txtMaternoTrabajador.setBounds(25,250,150,25);
        txtMaternoTrabajador.setForeground(new java.awt.Color(25,25,25));
        add(txtMaternoTrabajador);
        
         lablDepartamento = new JLabel("Selecciona el Departamento");
        lablDepartamento.setBounds(25,285,180,25);
        lablDepartamento.setForeground(new Color (25,25,25));
        add(lablDepartamento);
        
        comboDep = new JComboBox();
        comboDep.setBounds(25,315,220,25);
        comboDep.setForeground(new java.awt.Color(25,0,0));
        add(comboDep);
        comboDep.addItem("");
        comboDep.addItem("Atencion al cliente");
        comboDep.addItem("Departemento de logistica");
        comboDep.addItem("Departemento de Gerencia");
        
        lablAntiguedad = new JLabel("Seleccione la Antiguedad");
        lablAntiguedad.setBounds(25,350,180,25);
        lablAntiguedad.setForeground(new Color(25,25,25));
        add(lablAntiguedad);
        
        comboAntiguedad = new JComboBox();
        comboAntiguedad.setBounds(25,380,200,25);
        comboAntiguedad.setForeground(new java.awt.Color(25,0,0));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 año de servicio");
        comboAntiguedad.addItem("2 a 6 años de servicio");
        comboAntiguedad.addItem("7 años o más de servicio");
        
        
        lablResultado = new JLabel("Resultado del Calculo");
        lablResultado.setBounds(220,110,180,25);
        lablResultado.setForeground(new Color(25,25,25));
        add(lablResultado);
        
        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setBounds(200,100,20,25);
        textarea1.setForeground(new Color(25,0,0));
        textarea1.setText("\n Aqui aparece el resultado del calculo de las vacaciones.");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(220,150,385,90); 
        add(scrollpane1);
        
        
        lablfooter = new JLabel ("Evelin, salvajan Programacion, sección B");
        lablfooter.setBounds(135,445,500,30);
        lablfooter.setForeground(new java.awt.Color(25,25,25));
        add(lablfooter);
    }
    public void actionPerformed(ActionEvent ae){
      if (ae.getSource() == miCalculo){  
            String nombreTrabajador = txtNombreTrabajador.getText();
            String AP = txtApaternoTrabajador.getText();
            String AM = txtMaternoTrabajador.getText();
            String Dep = comboDep.getSelectedItem().toString();
            String Anti = comboAntiguedad.getSelectedItem().toString();
            
           
        }   
        if(ae.getSource() == miRojo){
            getContentPane().setBackground(new Color(22,194,234));
        }
          if (ae.getSource() == miNegro){  
              getContentPane().setBackground(new Color(29,227,76));
        }    
        if(ae.getSource() == miMorado){
            getContentPane().setBackground(new Color(51,0,51));
        }
          if (ae.getSource() == miNuevo){  
              txtNombreTrabajador.setText("");
              txtApaternoTrabajador.setText("");
              txtMaternoTrabajador.setText("");
              comboDep.setSelectedIndex(0);
              comboAntiguedad.setSelectedIndex(0);
              textarea1.setText("\n Aqui aparece el resultado del calculo de las vacaciones.");
              
        }    
        if(ae.getSource() == miSalir){
           bienvenida venBienvenida = new bienvenida();
           venBienvenida.setBounds(0,0,350,450);
           venBienvenida.setVisible(true);
           venBienvenida.setResizable(false);
           venBienvenida.setLocationRelativeTo(null);
           this.setVisible(false);  //podemos esconder la 
        }
        if(ae.getSource()== miElcreador){
          JOptionPane.showMessageDialog(null, "Desarrollado por evelin "
                  + " \n Ingenieria en sistemas "
                  + "\n cuarto semestre"
                  + "\n seccion B");
        }
    }
    public static void main(String args[]){
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0,0,640,535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}