/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Vista.Vista;
import java.awt.Dimension;
import java.awt.Toolkit;



/**
 *
 * @author uno
 */
public class VideoClub extends javax.swing.JFrame {

    /**
     * Creates new form VideoClub
     */
    public VideoClub() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        this.setSize(screenSize);

        this.setLocation(0, 0);

        this.setDefaultCloseOperation(VideoClub.EXIT_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopVideoClub = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        JmenuADMIN = new javax.swing.JMenu();
        JmenuItemPeli = new javax.swing.JMenuItem();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemCategoria = new javax.swing.JMenuItem();
        jMenuItemPrestamo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopVideoClubLayout = new javax.swing.GroupLayout(jDesktopVideoClub);
        jDesktopVideoClub.setLayout(jDesktopVideoClubLayout);
        jDesktopVideoClubLayout.setHorizontalGroup(
            jDesktopVideoClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );
        jDesktopVideoClubLayout.setVerticalGroup(
            jDesktopVideoClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        JmenuADMIN.setText("Administrar");
        JmenuADMIN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        JmenuItemPeli.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JmenuItemPeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/media_optical (2).png"))); // NOI18N
        JmenuItemPeli.setText("Peliculas");
        JmenuADMIN.add(JmenuItemPeli);

        jMenuItemCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/she_users (2).png"))); // NOI18N
        jMenuItemCliente.setText("Clientes");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        JmenuADMIN.add(jMenuItemCliente);

        jMenuItemCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItemCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/stock_text_center.png"))); // NOI18N
        jMenuItemCategoria.setText("Categorias");
        JmenuADMIN.add(jMenuItemCategoria);

        jMenuItemPrestamo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItemPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/stock_open.png"))); // NOI18N
        jMenuItemPrestamo.setText("Prestamos");
        JmenuADMIN.add(jMenuItemPrestamo);

        jMenuBar1.add(JmenuADMIN);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopVideoClub)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopVideoClub)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
     FrmClientes frm = new FrmClientes();
       Vista.showInternal(jDesktopVideoClub, frm);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

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
            java.util.logging.Logger.getLogger(VideoClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VideoClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VideoClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VideoClub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VideoClub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JmenuADMIN;
    private javax.swing.JMenuItem JmenuItemPeli;
    private javax.swing.JDesktopPane jDesktopVideoClub;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCategoria;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemPrestamo;
    // End of variables declaration//GEN-END:variables
}