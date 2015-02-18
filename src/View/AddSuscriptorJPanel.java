package View;

import Controller.CreadorDeSuscriptores;
import Controller.NoticiasData;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */
public class AddSuscriptorJPanel extends javax.swing.JPanel {
    JLabel leyenda_addObs = new JLabel("COMPLETA LOS DATOS DEL SUSCRIPTOR");
    JLabel leyenda_nombreSuscriptor    = new JLabel("Nombre Suscriptor: ");
    JLabel leyenda_filtroSuscriptor    = new JLabel("Filtro Suscriptor: ");
    String[] filtrosnoticia = new String[]{"Azcapotzalco","Iztapalapa","Xochimilco","Cuajimalpa",
        "Lerma","Ingeniería","Ciencias de la salud","Ciencias Básicas","Diseño","Ciencias Sociales",
        "Investigación","Desarrollo Tecnológico"};
    JComboBox filtronoticia = new JComboBox(filtrosnoticia);
    JTextField elnombre = new JTextField(17);
    JButton btn_suscribir = new JButton("Suscribir");
    
    CreadorDeSuscriptores elcreador = new CreadorDeSuscriptores();
    NoticiasData noticiasdataaddsus = new NoticiasData();
    
    public AddSuscriptorJPanel(NoticiasData noticiasdata) {
        setBackground(new java.awt.Color(0, 0, 0,50));
        setPreferredSize(new Dimension(430,250));
        //setVisible(false);
        SpringLayout layoutpaneladdobs = new SpringLayout();
        this.setLayout(layoutpaneladdobs);
        noticiasdataaddsus=noticiasdata;
        
        //Configuramos leyenda_addObs y deginimos las coordenadas x,y en que estará fija. 
        leyenda_addObs.setFont(new java.awt.Font("MV Boli", 1, 15));
        leyenda_addObs.setForeground(new java.awt.Color(241, 242, 235));
        layoutpaneladdobs.putConstraint(SpringLayout.WEST,leyenda_addObs,60, SpringLayout.WEST,this);
        layoutpaneladdobs.putConstraint(SpringLayout.NORTH,leyenda_addObs,15, SpringLayout.NORTH,this);
        

        //Configuramos leyenda_nombreSuscriptor y deginimos las coordenadas x,y en que estará fija. 
        leyenda_nombreSuscriptor.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_nombreSuscriptor.setForeground(new java.awt.Color(241, 242, 235));
        layoutpaneladdobs.putConstraint(SpringLayout.WEST,leyenda_nombreSuscriptor,30, SpringLayout.WEST,this);
        layoutpaneladdobs.putConstraint(SpringLayout.NORTH,leyenda_nombreSuscriptor,83, SpringLayout.NORTH,this);
        
        //Configuramos leyenda_filtroSuscriptor y deginimos las coordenadas x,y en que estará fija. 
        leyenda_filtroSuscriptor.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_filtroSuscriptor.setForeground(new java.awt.Color(241, 242, 235));
        layoutpaneladdobs.putConstraint(SpringLayout.WEST,leyenda_filtroSuscriptor,30, SpringLayout.WEST,this);
        layoutpaneladdobs.putConstraint(SpringLayout.NORTH,leyenda_filtroSuscriptor,125, SpringLayout.NORTH,this);
        
        //Configuramos elnombre y deginimos las coordenadas x,y en que estará fija.
        layoutpaneladdobs.putConstraint(SpringLayout.WEST,elnombre,195, SpringLayout.WEST,this);
        layoutpaneladdobs.putConstraint(SpringLayout.NORTH,elnombre,75, SpringLayout.NORTH,this);
        
        //Configuramos cbox_observersAdd y deginimos las coordenadas x,y en que estará fija. 
        filtronoticia.setPreferredSize(new Dimension(200,30));
        layoutpaneladdobs.putConstraint(SpringLayout.WEST,filtronoticia,195, SpringLayout.WEST,this);
        layoutpaneladdobs.putConstraint(SpringLayout.NORTH,filtronoticia,115, SpringLayout.NORTH,this);
                
        //Configuramos btn_suscribir y deginimos las coordenadas x,y en que estará fija. 
        btn_suscribir.setPreferredSize(new Dimension(140, 30));
        btn_suscribir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                elcreador.crearSuscriptor(elnombre.getText(), noticiasdataaddsus, String.valueOf(filtronoticia.getSelectedItem()));
            }
        });
        layoutpaneladdobs.putConstraint(SpringLayout.WEST,btn_suscribir,140, SpringLayout.WEST,this);
        layoutpaneladdobs.putConstraint(SpringLayout.NORTH,btn_suscribir,180, SpringLayout.NORTH,this);
        
        //Agregamos los elementos a la interfaz
        this.add(leyenda_addObs);
        this.add(leyenda_nombreSuscriptor);
        this.add(leyenda_filtroSuscriptor);
        this.add(elnombre);
        this.add(filtronoticia);
        this.add(btn_suscribir);
    }
}
