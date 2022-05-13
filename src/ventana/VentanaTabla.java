package ventana;

public class VentanaTabla extends javax.swing.JFrame {

    private VentanaPrincipal ventana;
    
    public VentanaTabla(VentanaPrincipal v) {
        initComponents();
        this.setLocationRelativeTo(null); 
        setVisible(true);
        ventana=v;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonModificar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonNuevo = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        panelTabla = new javax.swing.JScrollPane();
        tablaContent = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabla");
        setResizable(false);

        BotonModificar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        BotonEliminar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonNuevo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BotonNuevo.setText("Nuevo");
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
            }
        });

        BotonVolver.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        tablaContent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", ""
            }
        ));
        panelTabla.setViewportView(tablaContent);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonVolver))
                    .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed

    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed

    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed

    }//GEN-LAST:event_BotonNuevoActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed

        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_BotonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane panelTabla;
    private javax.swing.JTable tablaContent;
    // End of variables declaration//GEN-END:variables
}
