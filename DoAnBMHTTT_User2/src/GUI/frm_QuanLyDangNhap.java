/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class frm_QuanLyDangNhap extends javax.swing.JFrame {

    /**
     * Creates new form frm_QuanLyChung
     */
    public frm_QuanLyDangNhap() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Account Management");
    }
    int width=215;
    int hieght=800;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        side = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_trangChu = new javax.swing.JLabel();
        txt_dangNhap = new javax.swing.JLabel();
        txt_dangKy = new javax.swing.JLabel();
        txt_dangXuat = new javax.swing.JLabel();
        txt_hoTro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_menu = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnMain.setBackground(new java.awt.Color(255, 255, 255));
        pnMain.setPreferredSize(new java.awt.Dimension(800, 500));

        side.setBackground(new java.awt.Color(255, 255, 255));
        side.setPreferredSize(new java.awt.Dimension(200, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        txt_trangChu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_trangChu.setText("Trang chủ");
        txt_trangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_trangChuMouseClicked(evt);
            }
        });

        txt_dangNhap.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_dangNhap.setText("Đăng nhập");
        txt_dangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_dangNhapMouseClicked(evt);
            }
        });

        txt_dangKy.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_dangKy.setText("Đăng ký");
        txt_dangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_dangKyMouseClicked(evt);
            }
        });

        txt_dangXuat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_dangXuat.setText("Đăng xuất");
        txt_dangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_dangXuatMouseClicked(evt);
            }
        });

        txt_hoTro.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_hoTro.setText("Hỗ trợ");
        txt_hoTro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_hoTroMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sideLayout = new javax.swing.GroupLayout(side);
        side.setLayout(sideLayout);
        sideLayout.setHorizontalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideLayout.createSequentialGroup()
                .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sideLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(sideLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_trangChu)
                            .addComponent(txt_dangNhap)
                            .addComponent(txt_dangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dangXuat)
                            .addComponent(txt_hoTro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        sideLayout.setVerticalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(txt_trangChu)
                .addGap(18, 18, 18)
                .addComponent(txt_dangNhap)
                .addGap(18, 18, 18)
                .addComponent(txt_dangKy)
                .addGap(18, 18, 18)
                .addComponent(txt_dangXuat)
                .addGap(18, 18, 18)
                .addComponent(txt_hoTro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        lbl_menu.setToolTipText("");
        lbl_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_menuMouseClicked(evt);
            }
        });

        jPanel1.setLayout(new java.awt.CardLayout());

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        jLabel2.setText("WELCOME TO RESTAURANT");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel2)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        jPanel1.add(Home, "card2");

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addComponent(side, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMainLayout.createSequentialGroup()
                        .addComponent(lbl_menu)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addComponent(lbl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_menuMouseClicked
        // TODO add your handling code here:
        openMenubar();
    }//GEN-LAST:event_lbl_menuMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        closeMenubar();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void txt_dangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_dangXuatMouseClicked
        // TODO add your handling code here:
        frm_Login log = new frm_Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_txt_dangXuatMouseClicked

    private void txt_dangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_dangNhapMouseClicked
        // TODO add your handling code here:
        frm_LoginAccount logA = new frm_LoginAccount();
        logA.setVisible(true);
        dispose();
    }//GEN-LAST:event_txt_dangNhapMouseClicked

    private void txt_dangKyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_dangKyMouseClicked
        // TODO add your handling code here:
        frm_RegisterAccount regA = new frm_RegisterAccount();
        regA.setVisible(true);
        dispose();
    }//GEN-LAST:event_txt_dangKyMouseClicked

    private void txt_trangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_trangChuMouseClicked
        // TODO add your handling code here:
        closeMenubar();
    }//GEN-LAST:event_txt_trangChuMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        closeMenubar();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txt_hoTroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_hoTroMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Thông tin hỗ trợ sẽ được cập nhật sau");
    }//GEN-LAST:event_txt_hoTroMouseClicked
    
    void closeMenubar(){
        new Thread(new Runnable(){
            @Override
            public void run()
            {
                for(int i=width; i>0;i--)
                {
                    side.setSize(i,hieght);
                       try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(frm_QuanLyDangNhap.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            }).start();
    }
    void openMenubar(){
        new Thread(new Runnable(){
            @Override
            public void run()
            {
                for(int i=0; i<width;i++)
                {
                    side.setSize(i,hieght);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(frm_QuanLyDangNhap.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            }).start();
    }
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
            java.util.logging.Logger.getLogger(frm_QuanLyDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_QuanLyDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_QuanLyDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_QuanLyDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_QuanLyDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_menu;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel side;
    private javax.swing.JLabel txt_dangKy;
    private javax.swing.JLabel txt_dangNhap;
    private javax.swing.JLabel txt_dangXuat;
    private javax.swing.JLabel txt_hoTro;
    private javax.swing.JLabel txt_trangChu;
    // End of variables declaration//GEN-END:variables
}
