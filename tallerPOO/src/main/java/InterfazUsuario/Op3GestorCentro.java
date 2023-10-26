/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazUsuario;


import static com.mycompany.tallerpoo.RegistroMedico.calcularMasConsPorFecha;
import static com.mycompany.tallerpoo.Triage.cantTriagePorFecha;


import com.mycompany.tallerpoo.RegistroMedico;
import com.mycompany.tallerpoo.ListaPVarias;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.*;
import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static com.mycompany.tallerpoo.RegistroMedico.calcularMasConsPorFecha;

/**
 *
 * @author 54345
 */
public class Op3GestorCentro extends javax.swing.JFrame {

    /**
     * Creates new form Op3GestorCentro
     */
    public static String pacienteUpdate;
    DefaultTableModel tabla = new DefaultTableModel();
   
    public Op3GestorCentro() {
        initComponents();
        jTableListaPacientes.setModel(tabla);
        jTableListaPacientes.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int fila = jTableListaPacientes.rowAtPoint(e.getPoint());
                int columna = 2; 
                if (fila > -1){
                    pacienteUpdate = (String) jTableListaPacientes.getValueAt(fila,columna);
                    ListaPacientes registroMedico = new ListaPacientes();
                    registroMedico.setVisible(true);
                }
            }
        }
        );
      
    }

    /*
    String barra = File.separator;
    ListaPVarias listavarias=new ListaPVarias();
    listavarias.leer("Archivos"+barra+"PacientesVariasConsultas");
    ArrayList<String> personasConMasConsultas = calcularMasConsPorFecha(
    fecha1, fecha2);
    for (String dni : personasConMasConsultas) {
        System.out.println("DNI: " + dni);
    }
    */
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFecha1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFecha2 = new javax.swing.JTextField();
        jButton1Anterior = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaPacientes = new javax.swing.JTable();
        jButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese la primer fecha");

        txtFecha1.setText("dd/mm/aaaa");

        jLabel2.setText("Ingrese la segunda fecha");

        txtFecha2.setText("dd/mm/aaaa");

        jButton1Anterior.setText("<< Atrás");
        jButton1Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AnteriorActionPerformed(evt);
            }
        });

        jTableListaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Pacientes con más consultas entre las fechas dadas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableListaPacientes);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFecha1))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jButtonBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1Anterior)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1Anterior)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AnteriorActionPerformed
        MenuGestorCentro atras = new MenuGestorCentro();
        atras.setVisible(true);
        atras.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton1AnteriorActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String fecha1 = txtFecha1.getText();
        String fecha2 = txtFecha2.getText();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaUno = LocalDate.parse(fecha1, formatter1);
        LocalDate fechaDos = LocalDate.parse(fecha2, formatter1);
        Op3GestorCentro busqueda = new Op3GestorCentro();
        busqueda.buscar(fechaUno, fechaDos);
        }
    
        private void buscar(LocalDate fechaUno, LocalDate fechaDos){
            String barra = File.separator;
            ListaPVarias listavarias = new ListaPVarias();
        try {
            listavarias.leer(ubicacion);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
            ArrayList<String> personasConMasConsultas = calcularMasConsPorFecha(
            fechaUno, fechaDos);
            for (String dni : personasConMasConsultas) {
                //System.out.println("DNI: " + dni);
                tabla.addRow(new Object[]{dni});
            } 
    }//GEN-LAST:event_jButtonBuscarActionPerformed
    String barra = File.separator;
    String ubicacion = System.getProperty("user.dir") + barra + "Archivos"+barra+"PacientesVariasConsultas.txt";

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Anterior;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaPacientes;
    private javax.swing.JTextField txtFecha1;
    private javax.swing.JTextField txtFecha2;
    // End of variables declaration//GEN-END:variables
}
