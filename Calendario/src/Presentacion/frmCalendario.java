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
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.AbstractCellEditor;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHorario = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asignaturas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 102, 204)));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        ArchivoCls insArchivo = new ArchivoCls();
        insArchivo.cargar();
        CalendarioCls insCalendario = new CalendarioCls();
        ArrayList<Asignatura> calendario = insCalendario.crear(DepartamentoCls.getDepartamento(), UsuarioCls.getUsuario(), AulaCls.getAula());
        
        String horaInicial = "";
        String horaFinal = "";
        String dia = "";
        String[] columns = {"Curso","Aula","Horario","Profesor"};
        ArrayList<Vector> data = new ArrayList<>();
        
        TableCellRenderer defaultRenderer = tblHorario.getDefaultRenderer(JButton.class);
        tblHorario.setDefaultRenderer(JButton.class, new TableButtonRenderer(defaultRenderer));
        tblHorario.addMouseListener(new TableButtonMouseListener(tblHorario));
        
        jButton1.setText(String.valueOf(calendario.size()));
        for(int i=0; i < calendario.size(); i++) {
            tblHorario.setPreferredSize(new Dimension(500, tblHorario.getPreferredSize().height+16));
            Vector vector = new Vector();
            vector.add(new JButton(calendario.get(i).getCodigo()));
            String aula = calendario.get(i).getAula().get(0).getNombre();
            vector.add(new JButton(aula));
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
            vector.add(new JButton(dia));
            vector.add("Oscar");
            data.add(vector);
            //vector.add( horaInicial+" - "+horaFinal);
        }
        
        tblHorario.setModel(new TableButtonModel(data,columns));
        
        tblHorario.setFillsViewportHeight(true);        
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHorario;
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

        if(row >= table.getRowCount() || row < 0 || column >= table.getColumnCount() || column < 0)
            return;

        value = table.getValueAt(row, column);

        if(!(value instanceof JButton))
            return;

        button = (JButton)value;
        buttonEvent = (MouseEvent)SwingUtilities.convertMouseEvent(table, e, button);
        button.dispatchEvent(buttonEvent);
        // This is necessary so that when a button is pressed and released
        // it gets rendered properly.  Otherwise, the button may still appear
        // pressed down when it has been released.
        table.repaint();
    }

    public TableButtonMouseListener(JTable table) {
        this.table = table;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        window.setPreferredSize(new Dimension(100, 100));
        window.repaint();
        window.show();
        
        EventToButton(e);
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
        
        EventToButton(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        EventToButton(e);
    }
}