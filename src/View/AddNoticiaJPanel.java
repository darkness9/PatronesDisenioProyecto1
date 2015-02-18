package View;

import Controller.AlmacenistaDeNoticias;
import Controller.NoticiasData;
import Model.Area;
import Model.Persona;
import Model.Unidad;
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
public class AddNoticiaJPanel extends javax.swing.JPanel{

    JLabel leyenda_addNoticia    = new JLabel("LLENA LOS CAMPOS DE LA NOTICIA");
    JLabel leyenda_tituloNoticia = new JLabel("Titulo Noticia");
    JLabel leyenda_autorNoticia  = new JLabel("Autor Noticia");
    JLabel leyenda_unidadNoticia = new JLabel("Unidad Noticia");
    JLabel leyenda_areaNoticia   = new JLabel("Area Noticia");
    JLabel leyenda_tipoNoticia   = new JLabel("Tipo Noticia");
    JLabel leyenda_textoNoticia  = new JLabel("Texto Noticia");
    JLabel leyenda_fechaNoticia  = new JLabel("Fecha Noticia");
    JTextField eltitulo = new JTextField(17);
    JTextField elautor = new JTextField(17);
    String[] unidad_noticia = new String[]{"Azcapotzalco","Iztapalapa","Xochimilco","Cuajimalpa","Lerma"};
    JComboBox launidad = new JComboBox(unidad_noticia);
    String[] area_noticia = new String[]{"Ingeniería","Ciencias de la salud","Ciencias Básicas","Diseño","Ciencias Sociales"};
    JComboBox elarea = new JComboBox(area_noticia);
    String[] tipo_noticia = new String[]{"Investigación","Desarrollo Tecnológico"};
    JComboBox eltipo = new JComboBox(tipo_noticia);
    JTextField eltexto = new JTextField(17);
    String[] dia_noticia = new String[]{"Dia","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    JComboBox eldia = new JComboBox(dia_noticia);
    String[] mes_noticia = new String[]{"Mes","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    JComboBox elmes = new JComboBox(mes_noticia);
    String[] anio_noticia = new String[]{"Año","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015"};
    JComboBox elanio = new JComboBox(anio_noticia);
    JButton btn_ingresar = new JButton("Ingresar Noticia");
    
    //Creamos la referencia a los controladores usando un par de objetos
    AlmacenistaDeNoticias almacenistaaddnot= new AlmacenistaDeNoticias();
    NoticiasData noticiasdataaddnot = new NoticiasData();
    
    public AddNoticiaJPanel(NoticiasData noticiasdata, AlmacenistaDeNoticias almacenista) {
        setBackground(new java.awt.Color(0, 0, 0,50));
        setPreferredSize(new Dimension(430,440));
        //setVisible(false);
        SpringLayout layoutpaneladdnot = new SpringLayout();
        this.setLayout(layoutpaneladdnot);
        noticiasdataaddnot = noticiasdata;
        almacenistaaddnot  = almacenista;
        
        //Configuramos leyenda_addNoticia y deginimos las coordenadas x,y en que estará fija. 
        leyenda_addNoticia.setFont(new java.awt.Font("MV Boli", 1, 15));
        leyenda_addNoticia.setForeground(new java.awt.Color(241, 242, 235));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,leyenda_addNoticia,60, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,leyenda_addNoticia,15, SpringLayout.NORTH,this);
        
        //Configuramos leyenda_tituloNoticia y deginimos las coordenadas x,y en que estará fija. 
        leyenda_tituloNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_tituloNoticia.setForeground(new java.awt.Color(241, 242, 235));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,leyenda_tituloNoticia,25, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,leyenda_tituloNoticia,55, SpringLayout.NORTH,this);
        
        //Configuramos leyenda_autorNoticia y deginimos las coordenadas x,y en que estará fija.        
        leyenda_autorNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_autorNoticia.setForeground(new java.awt.Color(241, 242, 235));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,leyenda_autorNoticia,25, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,leyenda_autorNoticia,95, SpringLayout.NORTH,this);
        
        //Configuramos leyenda_unidadNoticia y deginimos las coordenadas x,y en que estará fija.        
        leyenda_unidadNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_unidadNoticia.setForeground(new java.awt.Color(241, 242, 235));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,leyenda_unidadNoticia,25, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,leyenda_unidadNoticia,135, SpringLayout.NORTH,this);
        
        //Configuramos leyenda_areaNoticia y deginimos las coordenadas x,y en que estará fija.        
        leyenda_areaNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_areaNoticia.setForeground(new java.awt.Color(241, 242, 235));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,leyenda_areaNoticia,25, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,leyenda_areaNoticia,175, SpringLayout.NORTH,this);
        
        //Configuramos leyenda_tipoNoticia y deginimos las coordenadas x,y en que estará fija.        
        leyenda_tipoNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_tipoNoticia.setForeground(new java.awt.Color(241, 242, 235));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,leyenda_tipoNoticia,25, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,leyenda_tipoNoticia,215, SpringLayout.NORTH,this);
        
        //Configuramos leyenda_textoNoticia y deginimos las coordenadas x,y en que estará fija.        
        leyenda_textoNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_textoNoticia.setForeground(new java.awt.Color(241, 242, 235));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,leyenda_textoNoticia,25, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,leyenda_textoNoticia,255, SpringLayout.NORTH,this);
        
        //Configuramos leyenda_fechaNoticia y deginimos las coordenadas x,y en que estará fija.        
        leyenda_fechaNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_fechaNoticia.setForeground(new java.awt.Color(241, 242, 235));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,leyenda_fechaNoticia,25, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,leyenda_fechaNoticia,295, SpringLayout.NORTH,this);
        
        //Configuramos eltitulo y deginimos las coordenadas x,y en que estará fija. 
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,eltitulo,150, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,eltitulo,45, SpringLayout.NORTH,this);
        
        //Configuramos elautor y deginimos las coordenadas x,y en que estará fija. 
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,elautor,150, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,elautor,85, SpringLayout.NORTH,this);
        
        //Configuramos launidad y deginimos las coordenadas x,y en que estará fija. 
        launidad.setPreferredSize(new Dimension(200,30));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,launidad,150, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,launidad,125, SpringLayout.NORTH,this);
        
        //Configuramos elarea y deginimos las coordenadas x,y en que estará fija. 
        elarea.setPreferredSize(new Dimension(200,30));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,elarea,150, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,elarea,165, SpringLayout.NORTH,this);
        
        //Configuramos eltipo y deginimos las coordenadas x,y en que estará fija. 
        eltipo.setPreferredSize(new Dimension(200,30));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,eltipo,150, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,eltipo,205, SpringLayout.NORTH,this);
        
        //Configuramos eltexto y deginimos las coordenadas x,y en que estará fija. 
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,eltexto,150, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,eltexto,245, SpringLayout.NORTH,this);
        
        //Configuramos lafecha y deginimos las coordenadas x,y en que estará fija. 
        eldia.setPreferredSize(new Dimension(55,30));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,eldia,150, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,eldia,285, SpringLayout.NORTH,this);
        
        //Configuramos elmes y deginimos las coordenadas x,y en que estará fija. 
        elmes.setPreferredSize(new Dimension(85,30));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,elmes,203, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,elmes,285, SpringLayout.NORTH,this);
        
        //Configuramos elanio y deginimos las coordenadas x,y en que estará fija. 
        elanio.setPreferredSize(new Dimension(65,30));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,elanio,285, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,elanio,285, SpringLayout.NORTH,this);
        
        //Configuramos btn_remover y deginimos las coordenadas x,y en que estará fija.
        btn_ingresar.setPreferredSize(new Dimension(140, 30));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,btn_ingresar,150, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,btn_ingresar,350, SpringLayout.NORTH,this);
        btn_ingresar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                noticiasdataaddnot.setAtributosNoticia(eltitulo.getText(),
                        new Persona(elautor.getText()),
                        new Unidad(String.valueOf(launidad.getSelectedItem())),
                        new Area(String.valueOf(elarea.getSelectedItem())),
                        String.valueOf(eltipo.getSelectedItem()),
                        eltexto.getText(),
                        String.valueOf(eldia.getSelectedItem()+"/"
                        +String.valueOf(elmes.getSelectedItem()))+"/"
                        +String.valueOf(elanio.getSelectedItem()));
                almacenistaaddnot.setAtributosNoticia(eltitulo.getText(),
                        new Persona(elautor.getText()),
                        new Unidad(String.valueOf(launidad.getSelectedItem())),
                        new Area(String.valueOf(elarea.getSelectedItem())),
                        String.valueOf(eltipo.getSelectedItem()),
                        eltexto.getText(),
                        String.valueOf(eldia.getSelectedItem()+"/"
                        +String.valueOf(elmes.getSelectedItem()))+"/"
                        +String.valueOf(elanio.getSelectedItem()));
                
            }
        });
        
        this.add(leyenda_addNoticia);
        this.add(leyenda_tituloNoticia);
        this.add(leyenda_autorNoticia);
        this.add(leyenda_unidadNoticia);
        this.add(leyenda_areaNoticia);
        this.add(leyenda_tipoNoticia);
        this.add(leyenda_textoNoticia);
        this.add(leyenda_fechaNoticia);
        this.add(eltitulo);
        this.add(elautor);
        this.add(launidad);
        this.add(elarea);
        this.add(eltipo);
        this.add(eltexto);
        this.add(eldia);
        this.add(elmes);
        this.add(elanio);
        this.add(btn_ingresar);
        
    }
    
    
    
}
