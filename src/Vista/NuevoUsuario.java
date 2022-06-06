/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author fidea
 */
public class NuevoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form NuevoUsuario
     */
    public NuevoUsuario() {
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

        panelAgregarU = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        txfUsuario = new javax.swing.JTextField();
        txfContra = new javax.swing.JTextField();
        agregarUser = new javax.swing.JButton();
        labNomUsuario = new javax.swing.JLabel();
        labContra = new javax.swing.JLabel();
        Regresar2 = new javax.swing.JButton();

        panelAgregarU.setBackground(new java.awt.Color(0, 204, 204));
        panelAgregarU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        titulo1.setFont(new java.awt.Font("Brand New Retro", 0, 60)); // NOI18N
        titulo1.setText("El ARTE ");

        titulo2.setFont(new java.awt.Font("KG Starting Over", 1, 36)); // NOI18N
        titulo2.setText("de leer");

        agregarUser.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        agregarUser.setText("Agregar");

        labNomUsuario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labNomUsuario.setText("Nombre de Usuario");

        labContra.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labContra.setText("Contraseña");

        Regresar2.setBackground(new java.awt.Color(0, 204, 204));
        Regresar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_BibliotecaListo2.png"))); // NOI18N
        Regresar2.setToolTipText("Regresar al inicio");

        javax.swing.GroupLayout panelAgregarULayout = new javax.swing.GroupLayout(panelAgregarU);
        panelAgregarU.setLayout(panelAgregarULayout);
        panelAgregarULayout.setHorizontalGroup(
            panelAgregarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarULayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo2)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarULayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labNomUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelAgregarULayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelAgregarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfUsuario)
                    .addComponent(txfContra, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelAgregarULayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(agregarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Regresar2)
                .addContainerGap())
            .addGroup(panelAgregarULayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(labContra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAgregarULayout.setVerticalGroup(
            panelAgregarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarULayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAgregarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo2))
                .addGroup(panelAgregarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarULayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labNomUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(txfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labContra)
                        .addGap(22, 22, 22)
                        .addComponent(txfContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(agregarUser)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarULayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Regresar2)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAgregarU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAgregarU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Regresar2;
    public javax.swing.JButton agregarUser;
    public javax.swing.JLabel labContra;
    public javax.swing.JLabel labNomUsuario;
    public javax.swing.JPanel panelAgregarU;
    public javax.swing.JLabel titulo1;
    public javax.swing.JLabel titulo2;
    public javax.swing.JTextField txfContra;
    public javax.swing.JTextField txfUsuario;
    // End of variables declaration//GEN-END:variables


}
