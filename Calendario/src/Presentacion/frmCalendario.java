/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.Asignatura.Asignatura;
import Negocio.ArchivoCls;
import Negocio.AulaCls;
import Negocio.CalendarioCls;
import Negocio.DepartamentoCls;
import Negocio.UsuarioCls;
import java.awt.Component;
import java.awt.Dimension;
<<<<<<< HEAD
=======
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
>>>>>>> 51c29a13f3d4f885568e19cc56817dbbc5e0a18f
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;
<<<<<<< HEAD
import javax.swing.JButton;
=======
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.DefaultDesktopManager;
import javax.swing.DesktopManager;
import javax.swing.JButton;
import javax.swing.JComponent;
>>>>>>> 51c29a13f3d4f885568e19cc56817dbbc5e0a18f
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
<<<<<<< HEAD
=======
import javax.swing.border.Border;
>>>>>>> 51c29a13f3d4f885568e19cc56817dbbc5e0a18f
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;



/**
 *
 * @author GeOrge
 */

public class frmCalendario extends javax.swing.JFrame {
    

    /**
     * Creates new form frmCalendario
     */
    public frmCalendario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        cmbSemestre = new javax.swing.JComboBox();
        V_Interna = new javax.swing.JInternalFrame();
        pnlDesktop = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHorario = new javax.swing.JTable();
<<<<<<< HEAD
=======
        frmInterno = new javax.swing.JInternalFrame();
>>>>>>> 51c29a13f3d4f885568e19cc56817dbbc5e0a18f

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cmbSemestre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primer", "Segundo" }));

        V_Interna.setVisible(false);

        javax.swing.GroupLayout V_InternaLayout = new javax.swing.GroupLayout(V_Interna.getContentPane());
        V_Interna.getContentPane().setLayout(V_InternaLayout);
        V_InternaLayout.setHorizontalGroup(
            V_InternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        V_InternaLayout.setVerticalGroup(
            V_InternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tblHorario.setAutoCreateRowSorter(true);
        tblHorario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Curso", "Aula", "Horario", "Profesor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHorario.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblHorario.setFocusTraversalPolicyProvider(true);
        tblHorario.setFocusable(false);
        tblHorario.setMinimumSize(new java.awt.Dimension(2147483647, 64));
        tblHorario.setPreferredSize(new java.awt.Dimension(500, 20));
        tblHorario.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblHorario.setShowHorizontalLines(false);
        tblHorario.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblHorario);

        jScrollPane1.setBounds(10, 10, 587, 430);
        pnlDesktop.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
<<<<<<< HEAD
=======

        frmInterno.setVisible(true);

        javax.swing.GroupLayout frmInternoLayout = new javax.swing.GroupLayout(frmInterno.getContentPane());
        frmInterno.getContentPane().setLayout(frmInternoLayout);
        frmInternoLayout.setHorizontalGroup(
            frmInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        frmInternoLayout.setVerticalGroup(
            frmInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        frmInterno.setBounds(330, 440, 22, 37);
        pnlDesktop.add(frmInterno, javax.swing.JLayeredPane.DEFAULT_LAYER);
>>>>>>> 51c29a13f3d4f885568e19cc56817dbbc5e0a18f

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(V_Interna, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(cmbSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
            .addComponent(pnlDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(V_Interna, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(cmbSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        frmInterno.setVisible(false);
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        V_Interna.setVisible(true);
        V_Interna.setPreferredSize(new Dimension(300, 300));
        V_Interna.setLocation(0, 0);
        ArchivoCls insArchivo = new ArchivoCls();
        insArchivo.cargar();
        CalendarioCls insCalendario = new CalendarioCls();            
        insCalendario.reset();
        ArrayList<Asignatura> calendario = insCalendario.crear(DepartamentoCls.getDepartamento(), UsuarioCls.getUsuario(), AulaCls.getAula(), cmbSemestre.getSelectedIndex());
        
        String horaInicial = "";
        String horaFinal = "";
        String dia = "";
        String[] columns = {"Curso","Aula","Horario","Profesor"};
        ArrayList<Vector> data = new ArrayList<>();
        
        tblHorario.setPreferredSize(new Dimension(500, 20));
        TableCellRenderer defaultRenderer = tblHorario.getDefaultRenderer(JButton.class);
        tblHorario.setDefaultRenderer(JButton.class, new TableButtonRenderer(defaultRenderer));
        tblHorario.addMouseListener(new TableButtonMouseListener(tblHorario));
        
        jButton1.setText(String.valueOf(calendario.size()));
        for(int i=0; i < calendario.size(); i++) {
            tblHorario.setPreferredSize(new Dimension(500, tblHorario.getPreferredSize().height+16));
            Vector vector = new Vector();
            
            JButton b1 = new JButton(calendario.get(i).getCodigo());
            b1.setBorderPainted(false);
            vector.add(b1);
            JButton b2 = new JButton(calendario.get(i).getAula().get(0).getNombre());
            b2.setBorderPainted(false);
            vector.add(b2);
            boolean bandera = false;
            for(int j=0; j < calendario.get(i).getHorario().size(); j++) {
                dia = calendario.get(i).getHorario().get(j).getDia();
                for(int k=0; k < calendario.get(i).getHorario().get(j).getHorario().size(); k++) {
                    if(!calendario.get(i).getHorario().get(j).getHorario().get(k).isEstado()) {
                        horaInicial = calendario.get(i).getHorario().get(j).getHorario().get(k).getHoraInicio();
                        horaFinal = calendario.get(i).getHorario().get(j).getHorario().get(k).getHoraFinal();
                        bandera = true;
                        break;
                    }
                }
                if(bandera)
                    break;
            }
            vector.add(new JButton(dia+" - "+horaInicial+" - "+horaFinal));
            vector.add("Oscar");
            data.add(vector);
        }
        
        tblHorario.setModel(new TableButtonModel(data,columns));
        
        //tblHorario.setFillsViewportHeight(true);        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCalendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalendario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame V_Interna;
    private javax.swing.JComboBox cmbSemestre;
    public static javax.swing.JInternalFrame frmInterno;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JDesktopPane pnlDesktop;
<<<<<<< HEAD
    private javax.swing.JTable tblHorario;
=======
    public static javax.swing.JTable tblHorario;
>>>>>>> 51c29a13f3d4f885568e19cc56817dbbc5e0a18f
    // End of variables declaration//GEN-END:variables
}
/*
 *
 * 
 * 
 * 
 * 
 * 
 */

class TableButtonRenderer extends JButton implements TableCellRenderer {
    
    private TableCellRenderer defaultRenderer;

    public TableButtonRenderer(TableCellRenderer renderer) {
        defaultRenderer = renderer;
    }

    public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column)
    {
        if(value instanceof Component)
            return (Component)value;
        return defaultRenderer.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);
    }
    
    
}

class TableButtonModel extends AbstractTableModel {
    
    private ArrayList<Vector> rows;
    private String[] columns;

    public TableButtonModel(ArrayList<Vector> data, String[] column) {
        rows = data;
        columns = column;
    }
   
    @Override
    public String getColumnName(int column) { 
        return columns[column];
    }

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int row, int column) { 
        for(int i=0; i < rows.size(); i++) {
            for(int j=0; j < rows.get(i).size(); j++) {
                if(i==row & j==column)
                    return rows.get(i).get(j);
            }
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public Class getColumnClass(int column) {
        return getValueAt(0, column).getClass();
    }
}

class TableButtonMouseListener implements MouseListener {
    private JTable table;
    JButton button;
    JInternalFrame window = new JInternalFrame("ventana");
    
    private void EventToButton(MouseEvent e) {
        TableColumnModel columnModel = table.getColumnModel();
        int column = columnModel.getColumnIndexAtX(e.getX());
        int row    = e.getY() / table.getRowHeight();
        Object value;
        MouseEvent buttonEvent;
        DesktopManager manager = new DefaultDesktopManager() {
            @Override
            public void setBoundsForFrame(JComponent f, int newX, int newY, int newWidth, int newHeight) {
                boolean didResize = (f.getWidth() != newWidth || f.getHeight() != newHeight);
                if (!inBounds((JInternalFrame) f, newX, newY, newWidth, newHeight)) return;
                f.setBounds(newX, newY, newWidth, newHeight);
                if(didResize) {
                    f.validate();
                } 
            }

            protected boolean inBounds(JInternalFrame f, int newX, int newY, int newWidth, int newHeight) {
                if (newX < 0 || newY < 0) return false;
                if (newX + newWidth > f.getDesktopPane().getWidth()) return false;
                if (newY + newHeight > f.getDesktopPane().getHeight()) return false;
                return true;
            }
        };
        
        if(row >= table.getRowCount() || row < 0 || column >= table.getColumnCount() || column < 0)
            return;

        value = table.getValueAt(row, column);

        if(!(value instanceof JButton))
            return;

        button = (JButton)value;
        frmCalendario.pnlDesktop.setDesktopManager(manager);
        frmCalendario.frmInterno.setLocation(200, 100);
        frmCalendario.frmInterno.setSize(new Dimension(200, 150));
        //Internal.setBackground(Color.white);
        frmCalendario.frmInterno.moveToFront();
        frmCalendario.frmInterno.setVisible(true);
        
        
        
        
        
        
        
        
        
        
        
        table.repaint();
    }

//    static MouseListener evento = new MouseAdapter() {
//        public void mouseClicked(MouseEvent e) {
//            
//            
//
//            
////            Object lista = e.getSource();
////            if (e.getClickCount() == 1) {
////                
////            }
//        };
//    };
    
    public TableButtonMouseListener(JTable table) {
        this.table = table;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
<<<<<<< HEAD
        
        
        
=======
        EventToButton(e);
>>>>>>> 51c29a13f3d4f885568e19cc56817dbbc5e0a18f
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        EventToButton(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        EventToButton(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //EventToButton(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //EventToButton(e);
    }
}