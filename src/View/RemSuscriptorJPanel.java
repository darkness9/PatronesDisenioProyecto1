package View;

import Controller.CreadorEliminadorDeSuscriptores;
import Controller.NoticiasData;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */

/**
 * Clase  que hereda de JPanel y es la vista que le permite al administrador remover suscriptores
 */
public class RemSuscriptorJPanel extends javax.swing.JPanel{

    JLabel leyenda_remObs = new JLabel("ELIGE QUE SUSCRIPTOR REMOVER");
    JComboBox cbox_observadoresRem;
    JButton btn_remover = new JButton("Remover");
    NoticiasData noticiasdataremobs;
    CreadorEliminadorDeSuscriptores creadorelimidarodesuscriptores;
    
    
    public RemSuscriptorJPanel(NoticiasData noticiasdata) {
        setBackground(new java.awt.Color(0, 0, 0,50));
        setPreferredSize(new Dimension(430,250));
        SpringLayout layoutpanelremobs = new SpringLayout();
        this.setLayout(layoutpanelremobs);
        this.noticiasdataremobs=noticiasdata;
        creadorelimidarodesuscriptores = new CreadorEliminadorDeSuscriptores(this.noticiasdataremobs);
        cbox_observadoresRem = new JComboBox(creadorelimidarodesuscriptores.getNombreSuscriptor());
        
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
        btn_remover.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(cbox_observadoresRem.getSelectedItem().equals("Suscriptores")){
                    JOptionPane.showMessageDialog(null, "No hay suscriptores por remover", "Hey!", JOptionPane.WARNING_MESSAGE);
                }else{ 
                    creadorelimidarodesuscriptores.peticionEliminarSuscriptorPorNombre(String.valueOf(cbox_observadoresRem.getSelectedItem()));
                    cbox_observadoresRem.setSelectedIndex(0);
                }
                
            }
        });
        layoutpanelremobs.putConstraint(SpringLayout.WEST,btn_remover,140, SpringLayout.WEST,this);
        layoutpanelremobs.putConstraint(SpringLayout.NORTH,btn_remover,180, SpringLayout.NORTH,this);
        
        
        this.add(leyenda_remObs);
        this.add(cbox_observadoresRem);
        this.add(btn_remover);
    }
        
    
}
