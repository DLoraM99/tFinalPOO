package FramesDoctor;

import clases.Paciente;
import clases.Registrador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListadoDoc extends javax.swing.JInternalFrame {

    public ListadoDoc() {
        initComponents();
        MostrarDatos();
    }
    
    private void MostrarDatos() {
        Registrador reg = new Registrador();        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();  
        model.setRowCount(0);
        for (Paciente p : reg.ListarPacientes()) {
            model.addRow(new Object[] { p.getCodigo(), p.getNombre(), p.getDni(), p.getEdad(),
                                        p.getSexo(), p.getTelefono(), p.getCorreo(), p.getPeso(),
                                        p.getTalla(), p.getCondicion()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setTitle("Listado de Pacientes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "DNI", "Edad", "Sexo", "Telefono", "Correo", "Peso", "Talla", "Condicion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Borrar seleccionado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Llamar paciente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //LLAMAR PACIENTE
        Integer fila = jTable1.getSelectedRow();
        
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona a un paciente para llamarlo.");         
        }
        else {
            String nombre = (String)jTable1.getValueAt(fila, 1);
            JOptionPane.showMessageDialog(this, "El paciente " + nombre + " ha sido llamado.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //BORRAR SELECCIONADO
        Integer fila = jTable1.getSelectedRow();
        
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona a un paciente para borrarlo.");         
        }
        else {
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.removeRow(fila);
            
            //CONFIRMACION
            String nombre = (String)jTable1.getValueAt(fila, 1);
            JOptionPane.showMessageDialog(this, "El registro del paciente " + nombre + " ha sido eliminado satisfactoriamente.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
