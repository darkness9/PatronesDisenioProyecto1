package View;

import Controller.NoticiasData;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

/**
 *
 * @author darkness
 */
public class RemSuscriptorJPanel extends javax.swing.JPanel{

    JLabel leyenda_remObs = new JLabel("ELIGE QUE SUSCRIPTOR REMOVER");
    String[] lista_observers = new String[]{"Azcapotzalco","Iztapalapa","Lerma"};
    JComboBox cbox_observadoresRem = new JComboBox(lista_observers);
    JButton btn_remover = new JButton("Remover");
    NoticiasData noticiasdataremobs = new NoticiasData();
    
    public RemSuscriptorJPanel(NoticiasData noticiasdata) {
        setBackground(new java.awt.Color(0, 0, 0,50));
        setPreferredSize(new Dimension(430,250));
        //setVisible(false);
        SpringLayout layoutpanelremobs = new SpringLayout();
        this.setLayout(layoutpanelremobs);
        noticiasdataremobs=noticiasdata;
        
        //Configuramos leyenda_remObs y deginimos las coordenadas x,y en que estará fija.
        leyenda_remObs.setFont(new java.awt.Font("MV Boli", 1, 15));
        leyenda_remObs.setForeground(new java.awt.Color(241, 242, 235));
        layoutpanelremobs.putConstraint(SpringLayout.WEST,leyenda_remObs,60, SpringLayout.WEST,this);
        layoutpanelremobs.putConstraint(SpringLayout.NORTH,leyenda_remObs,15, SpringLayout.NORTH,this);
        
        //Configuramos cbox_observadoresRem y deginimos las coordenadas x,y en que estará fija.
        cbox_observadoresRem.setPreferredSize(new Dimension(150,35));
        layoutpanelremobs.putConstraint(SpringLayout.WEST,cbox_observadoresRem,135, SpringLayout.WEST,this);
        layoutpanelremobs.putConstraint(SpringLayout.NORTH,cbox_observadoresRem,90, SpringLayout.NORTH,this);
        
        //Configuramos btn_remover y deginimos las coordenadas x,y en que estará fija.
        btn_remover.setPreferredSize(new Dimension(140, 30));
        layoutpanelremobs.putConstraint(SpringLayout.WEST,btn_remover,140, SpringLayout.WEST,this);
        layoutpanelremobs.putConstraint(SpringLayout.NORTH,btn_remover,180, SpringLayout.NORTH,this);
        
        
        this.add(leyenda_remObs);
        this.add(cbox_observadoresRem);
        this.add(btn_remover);
    }
        
    
}