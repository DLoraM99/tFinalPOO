package FramesEnfermero;

import clases.Paciente;
import clases.Registrador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistrarPaciente extends javax.swing.JInternalFrame {

    public RegistrarPaciente() {
        initComponents();
        
        MostrarDatos();
    }
    
    private void MostrarDatos() {
        Registrador reg = new Registrador();        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();  
        model.setRowCount(0);
        for (Paciente p : reg.ListarPacientes()) {
            model.addRow(new Object[] { p.getCodigo(), p.getNombre(), p.getDni(), p.getEdad(),
                                        p.getSexo(), p.getPeso(), p.getTalla(), p.getCondicion()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Registro de Pacientes");
        setVisible(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "DNI", "Edad", "Sexo", "Peso", "Talla", "Condicion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Añadir informacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Integer fila = jTable1.getSelectedRow();
        
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona a un Paciente.");         
        }
        else {
            Integer codigo = (int)jTable1.getValueAt(fila, 0);
            String nomb = (String)jTable1.getValueAt(fila, 1);
            int edad = (int)jTable1.getValueAt(fila, 3);
            String sex = (String)jTable1.getValueAt(fila, 4);
            
            Añadir frame = new Añadir(codigo, nomb, edad, sex);

            this.getDesktopPane().add(frame);
            frame.moveToFront();  
        
    }//GEN-LAST:event_jButton1ActionPerformed

}        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
