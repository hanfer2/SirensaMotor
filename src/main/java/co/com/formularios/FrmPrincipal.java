/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.formularios;

/**
 *
 * @author hangutco
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public FrmPrincipal() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        dpnDestopk = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMIUsuario = new javax.swing.JMenuItem();
        jMenuRoles = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMICliente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem11.setText("jMenuItem11");

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema SirensaMotor");

        dpnDestopk.setBackground(new java.awt.Color(0, 102, 204));
        dpnDestopk.setMinimumSize(new java.awt.Dimension(700, 700));

        javax.swing.GroupLayout dpnDestopkLayout = new javax.swing.GroupLayout(dpnDestopk);
        dpnDestopk.setLayout(dpnDestopkLayout);
        dpnDestopkLayout.setHorizontalGroup(
            dpnDestopkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        dpnDestopkLayout.setVerticalGroup(
            dpnDestopkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_icon-17_95307.png"))); // NOI18N
        jMenu6.setText("Archivo");

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_exit_3226.png"))); // NOI18N
        jMenuItem8.setText("Salir");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuBar1.add(jMenu6);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_setting_tools_64639.png"))); // NOI18N
        jMenu1.setText("Configuración");

        jMIUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_People_132775.png"))); // NOI18N
        jMIUsuario.setText("Usuarios");
        jMIUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMIUsuario);

        jMenuRoles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_role_64585.png"))); // NOI18N
        jMenuRoles.setInheritsPopupMenu(true);
        jMenuRoles.setLabel("Roles");
        jMenuRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRolesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuRoles);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_client_account_template_64002.png"))); // NOI18N
        jMenu2.setText("Clientes");

        jMICliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_people_2639885.png"))); // NOI18N
        jMICliente.setText("Administrar Cliente");
        jMICliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMICliente);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_gnome-compressed_48058.png"))); // NOI18N
        jMenu3.setText("Productos");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_book_edit_35733.png"))); // NOI18N
        jMenuItem9.setText("Inventario");
        jMenu3.add(jMenuItem9);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_motorcycle_1055021.png"))); // NOI18N
        jMenuItem10.setText("Administracion Producto");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_invoice_49524.png"))); // NOI18N
        jMenu4.setText("Pedidos");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_Client_Female_Light_80822.png"))); // NOI18N
        jMenuItem2.setText("Pedido cliente");
        jMenu4.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_provider_45019.png"))); // NOI18N
        jMenuItem3.setText("Pedido proveedor");
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_invoice_54223.png"))); // NOI18N
        jMenu5.setText("Facturas");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_Client_Female_Light_80822.png"))); // NOI18N
        jMenuItem5.setText("Factura cliente");
        jMenu5.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_provider_45069.png"))); // NOI18N
        jMenuItem6.setText("Factura proveedor");
        jMenu5.add(jMenuItem6);

        jMenuBar1.add(jMenu5);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_help_7734.png"))); // NOI18N
        jMenu8.setText("Ayuda");

        jMenuItem12.setText("Acerca de");
        jMenu8.add(jMenuItem12);

        jMenuItem13.setText("Ayuda");
        jMenu8.add(jMenuItem13);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDestopk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDestopk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMIUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIUsuarioActionPerformed
        FrmUsuario usuario = new FrmUsuario();
        dpnDestopk.add(usuario);
        usuario.show();
    }//GEN-LAST:event_jMIUsuarioActionPerformed

    private void jMenuRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRolesActionPerformed
       FrmRol rol = new FrmRol();
        dpnDestopk.add(rol);
        rol.show();
    }//GEN-LAST:event_jMenuRolesActionPerformed

    private void jMIClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIClienteActionPerformed
         FrmCliente cliente = new FrmCliente();
        dpnDestopk.add(cliente);
        cliente.show();
    }//GEN-LAST:event_jMIClienteActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
       FrmProducto producto = new FrmProducto();
        dpnDestopk.add(producto);
        producto.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnDestopk;
    private javax.swing.JMenuItem jMICliente;
    private javax.swing.JMenuItem jMIUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuRoles;
    // End of variables declaration//GEN-END:variables
}
