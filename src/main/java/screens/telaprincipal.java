/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.table.TableModel;
import screens.identities.Sector;

/**
 *
 * @author Pichau
 */
public final class telaprincipal extends javax.swing.JFrame {

    /**
     * Creates new form telaprincipal
     */
    public String screenmode;

    public telaprincipal() {
        initComponents();

        if (screenmode == null) {
            screenmode = "default";
        }

        telamode(this.screenmode);
        try {
            tabletop();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(telaprincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(telaprincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        trocadetela = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_sector = new javax.swing.JTable();
        new_btn = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        exclude_btn = new javax.swing.JButton();
        num_setorfield = new javax.swing.JTextField();
        sector_field = new javax.swing.JTextField();
        setornumlabel = new javax.swing.JLabel();
        ativ_setorfield = new javax.swing.JLabel();
        confirm_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        trocadetela.setForeground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        tabela_sector.setBackground(new java.awt.Color(255, 255, 255));
        tabela_sector.setForeground(new java.awt.Color(32, 32, 32));
        tabela_sector.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Setor", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabela_sector.setColumnSelectionAllowed(true);
        tabela_sector.setGridColor(new java.awt.Color(153, 153, 153));
        tabela_sector.setRowSelectionAllowed(false);
        tabela_sector.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tabela_sector.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabela_sector.getTableHeader().setReorderingAllowed(false);
        tabela_sector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_sectorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_sector);
        tabela_sector.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabela_sector.getColumnModel().getColumnCount() > 0) {
            tabela_sector.getColumnModel().getColumn(0).setMinWidth(90);
            tabela_sector.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        new_btn.setBackground(new java.awt.Color(255, 255, 255));
        new_btn.setForeground(new java.awt.Color(0, 0, 0));
        new_btn.setText("Novo");
        new_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_btnActionPerformed(evt);
            }
        });

        edit_btn.setBackground(new java.awt.Color(255, 255, 255));
        edit_btn.setForeground(new java.awt.Color(0, 0, 0));
        edit_btn.setText("Editar");

        exclude_btn.setBackground(new java.awt.Color(255, 255, 255));
        exclude_btn.setForeground(new java.awt.Color(0, 0, 0));
        exclude_btn.setText("Excluir");
        exclude_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exclude_btnActionPerformed(evt);
            }
        });

        num_setorfield.setBackground(new java.awt.Color(255, 255, 255));
        num_setorfield.setForeground(new java.awt.Color(0, 0, 0));
        num_setorfield.setText("0");
        num_setorfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        num_setorfield.setEnabled(false);

        sector_field.setBackground(new java.awt.Color(255, 255, 255));
        sector_field.setForeground(new java.awt.Color(0, 0, 0));

        setornumlabel.setForeground(new java.awt.Color(0, 0, 0));
        setornumlabel.setText("Setor:");

        ativ_setorfield.setForeground(new java.awt.Color(0, 0, 0));
        ativ_setorfield.setText("Atividade do Setor:");

        confirm_btn.setBackground(new java.awt.Color(255, 255, 255));
        confirm_btn.setForeground(new java.awt.Color(0, 0, 0));
        confirm_btn.setText("Confirmar");
        confirm_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_btnActionPerformed(evt);
            }
        });

        cancel_btn.setBackground(new java.awt.Color(255, 255, 255));
        cancel_btn.setForeground(new java.awt.Color(0, 0, 0));
        cancel_btn.setText("Cancelar\n");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(num_setorfield, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ativ_setorfield)
                            .addComponent(setornumlabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sector_field)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(confirm_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(new_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(exclude_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cancel_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(121, 121, 121))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(setornumlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num_setorfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ativ_setorfield)
                .addGap(3, 3, 3)
                .addComponent(sector_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_btn)
                    .addComponent(exclude_btn)
                    .addComponent(edit_btn))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm_btn)
                    .addComponent(cancel_btn))
                .addGap(27, 27, 27))
        );

        trocadetela.addTab("Setores", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 949, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        trocadetela.addTab("Funcionários", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(trocadetela, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(trocadetela, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exclude_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exclude_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exclude_btnActionPerformed

    private void new_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_btnActionPerformed
        String setnum = num_setorfield.getText();
        Integer valorsetor;
        try {
            valorsetor = lastnum();
            num_setorfield.setText(String.valueOf(valorsetor));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(telaprincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR! VERIFIQUE A BASE");
        }
        telamode("new");


    }//GEN-LAST:event_new_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        
        int valorsetor = Integer.valueOf(num_setorfield.getText()) - 1;
        sector_field.setText(null);
        num_setorfield.setText(String.valueOf(valorsetor));
        telamode("default");
        

    }//GEN-LAST:event_cancel_btnActionPerformed

    private void confirm_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_btnActionPerformed

        DefaultTableModel tabela = (DefaultTableModel) tabela_sector.getModel();
        String numsector = num_setorfield.getText();
        String descSector = sector_field.getText();
        Sector x = new Sector();
        JOptionPane.showMessageDialog(this, x.addToSQL(numsector, descSector));
        telamode("default");
        try {
            tabletop();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(telaprincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(telaprincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_confirm_btnActionPerformed

    private void tabela_sectorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_sectorMouseClicked
        DefaultTableModel modela = (DefaultTableModel) tabela_sector.getModel();
        int model = tabela_sector.getSelectedRow();
        sector_field.setText(modela.getValueAt(model, 1).toString());
        num_setorfield.setText(modela.getValueAt(model, 0).toString());;
        
        


    }//GEN-LAST:event_tabela_sectorMouseClicked

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
            java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ativ_setorfield;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JButton confirm_btn;
    private javax.swing.JButton edit_btn;
    private javax.swing.JButton exclude_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton new_btn;
    private javax.swing.JTextField num_setorfield;
    private javax.swing.JTextField sector_field;
    private javax.swing.JLabel setornumlabel;
    private javax.swing.JTable tabela_sector;
    private javax.swing.JTabbedPane trocadetela;
    // End of variables declaration//GEN-END:variables

    private final void telamode(String mode) {
        this.screenmode = mode;
        if (this.screenmode == "default") {
            new_btn.setEnabled(true);
            edit_btn.setEnabled(false);
            confirm_btn.setEnabled(false);
            exclude_btn.setEnabled(false);
            cancel_btn.setEnabled(false);
            num_setorfield.setEnabled(false);
            sector_field.setEnabled(false);
            trocadetela.setEnabled(true);
        }
        if (this.screenmode == "new") {
            new_btn.setEnabled(false);
            edit_btn.setEnabled(false);
            confirm_btn.setEnabled(true);
            exclude_btn.setEnabled(false);
            cancel_btn.setEnabled(true);
            num_setorfield.setEnabled(false);
            sector_field.setEnabled(true);
            trocadetela.setEnabled(false);
        }
        if(this.screenmode == "selected"){
            new_btn.setEnabled(true);
            edit_btn.setEnabled(false);
            confirm_btn.setEnabled(false);
            exclude_btn.setEnabled(true);
            num_setorfield.setEditable(false);
            cancel_btn.setEnabled(true);
            sector_field.setEnabled(false);
            trocadetela.setEnabled(true);
            
        }

    }

    private void tabletop() throws ClassNotFoundException, SQLException {
        String query = "SELECT setor_num, setor_description FROM setores";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "password");
        PreparedStatement pprt = con.prepareStatement(query);
        ResultSet x = pprt.executeQuery();
        DefaultTableModel model = (DefaultTableModel) tabela_sector.getModel();
        model.setRowCount(0);

        while (x.next()) {
            model.addRow(new String[]{x.getString(1), x.getString(2)});

        }

    }

    private final Integer lastnum() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "password");
        DefaultTableModel model = (DefaultTableModel) tabela_sector.getModel();
        String sql = "SELECT id FROM setores ORDER BY id DESC LIMIT 1";
        Statement z = con.createStatement();
        ResultSet rsx = z.executeQuery(sql);
        ResultSetMetaData metadata = rsx.getMetaData();
        int lastnumber;
        if (rsx.next()) {
            lastnumber = rsx.getInt(1);
            return lastnumber;
        } else {
            return 1;
        }

    }

}