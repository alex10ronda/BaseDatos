/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author andresbailen93
 */
public class VistaActivarTest extends javax.swing.JFrame {

    /**
     * Creates new form VistaActivarTest
     */
    public VistaActivarTest() {
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

        jLabel1 = new javax.swing.JLabel();
        btnFinaliza = new javax.swing.JButton();
        btnActiva = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbTesDesct = new javax.swing.JComboBox<>();
        btnDesactiva = new javax.swing.JButton();
        cbActivaTest = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Activar Test");

        jLabel1.setText("Selecciona Test:");

        btnFinaliza.setText("Volver");

        btnActiva.setText("Activa Test");

        jLabel2.setText("Selecciona Test:");

        cbTesDesct.setModel(new javax.swing.DefaultComboBoxModel<>());
        cbTesDesct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTesDesctActionPerformed(evt);
            }
        });

        btnDesactiva.setText("Desactiva Test");

        cbActivaTest.setModel(new javax.swing.DefaultComboBoxModel<>());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnActiva, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbActivaTest, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDesactiva, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbTesDesct, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(btnFinaliza, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbActivaTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActiva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbTesDesct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDesactiva)
                .addGap(18, 18, 18)
                .addComponent(btnFinaliza)
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTesDesctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTesDesctActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTesDesctActionPerformed

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
            java.util.logging.Logger.getLogger(VistaActivarTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaActivarTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaActivarTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaActivarTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaActivarTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActiva;
    public javax.swing.JButton btnDesactiva;
    public javax.swing.JButton btnFinaliza;
    public javax.swing.JComboBox<String> cbActivaTest;
    public javax.swing.JComboBox<String> cbTesDesct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
