package ventana;

import exception.TartaException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Pedido;

public class VentanaPedido extends javax.swing.JFrame {

    //Se guarda la ventana
    private VentanaPrincipal ventana;

    public VentanaPedido(VentanaPrincipal v) {
        initComponents();
        this.setLocationRelativeTo(null);
        setVisible(true);
        ventana = v;

        //Pone el fichero
        try {
            BufferedReader br = new BufferedReader(new FileReader("tartas.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                tartaCmbBox.addItem(linea);
            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(VentanaPedido.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tartaLbl = new javax.swing.JLabel();
        tartaCmbBox = new javax.swing.JComboBox<>();
        racionesLbl = new javax.swing.JLabel();
        fianzaLbl = new javax.swing.JLabel();
        fianzaInpt = new javax.swing.JTextField();
        precioLbl = new javax.swing.JLabel();
        precioInpt = new javax.swing.JTextField();
        registrarBtn = new javax.swing.JButton();
        volverBtn = new javax.swing.JButton();
        racionesSpinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedidos");
        setResizable(false);

        tartaLbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tartaLbl.setText("Tarta:");

        tartaCmbBox.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        tartaCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tartaCmbBoxActionPerformed(evt);
            }
        });

        racionesLbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        racionesLbl.setText("Raciones:");

        fianzaLbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fianzaLbl.setText("Fianza:");

        fianzaInpt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fianzaInpt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        precioLbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        precioLbl.setText("Precio:");

        precioInpt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        precioInpt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        registrarBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        registrarBtn.setText("Registrar");
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });

        volverBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        volverBtn.setText("Volver");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        racionesSpinner.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        racionesSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(precioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(precioInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(racionesLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(racionesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tartaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tartaCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(fianzaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fianzaInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(registrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(volverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tartaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tartaCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(racionesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(racionesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fianzaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fianzaInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registrarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(volverBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    //Terminara esta ventana
    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        this.dispose();

        ventana.setVisible(true);


    }//GEN-LAST:event_volverBtnActionPerformed
    /*
    //Registrara el pedido en la base de datos
    private void BotonRegistrarActiontartaLbljava.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed

    }//GEN-LAST:event_BotonRegistrarActionPerformed
*/
    private void tartaCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tartaCmbBoxActionPerformed

    }//GEN-LAST:event_tartaCmbBoxActionPerformed

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed

        String tipo = (String) tartaCmbBox.getSelectedItem();
        String raciones = ((Integer) racionesSpinner.getValue()).toString();
        String fianza = fianzaInpt.getText();
        String precio = precioInpt.getText();

        try {
            Pedido pedido = new Pedido(tipo, raciones, fianza, precio);
            JOptionPane.showMessageDialog(this, "Se ha agregado correctamete.");
            System.out.println(pedido);
            limpiarInputs();
            //meter bbdd
            
        } catch (TartaException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }//GEN-LAST:event_registrarBtnActionPerformed

    private void limpiarInputs() {
        fianzaInpt.setText("");
        precioInpt.setText("");
        tartaCmbBox.setSelectedIndex(0);
        racionesSpinner.setValue(1);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fianzaInpt;
    private javax.swing.JLabel fianzaLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField precioInpt;
    private javax.swing.JLabel precioLbl;
    private javax.swing.JLabel racionesLbl;
    private javax.swing.JSpinner racionesSpinner;
    private javax.swing.JButton registrarBtn;
    private javax.swing.JComboBox<String> tartaCmbBox;
    private javax.swing.JLabel tartaLbl;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables

}
