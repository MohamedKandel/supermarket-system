/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import entity.Category;
import java.awt.event.KeyEvent;
import supermarket.Tools;

/**
 *
 * @author Mohamed
 */
public class category extends javax.swing.JFrame {

    /**
     * Creates new form category
     */
    public category() {
        initComponents();
        cmx.addItem("Active");
        cmx.addItem("InActive");
    }

    String name;

    public category(String user) {
        initComponents();
        cmx.addItem("Active");
        cmx.addItem("InActive");

        this.name = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_group = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmx = new control.JMyCompo();
        txt_category = new control.JTextBox(20);
        txt_ID = new control.JTextBox(20);
        btn_add = new control.JMyButton();
        btn_up = new control.JMyButton();
        btn_del = new control.JMyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        btn_back = new control.JMyButton();
        jLabel5 = new javax.swing.JLabel();
        rad_ID = new javax.swing.JRadioButton();
        rad_cat = new javax.swing.JRadioButton();
        rad_stat = new javax.swing.JRadioButton();
        txt_search = new control.JTextBox(20);
        btn_search = new control.JMyButton();
        log = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Category");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Category ID :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Category :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Status :");

        cmx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmxActionPerformed(evt);
            }
        });

        txt_category.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_category.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_categoryKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_categoryKeyTyped(evt);
            }
        });

        txt_ID.setEditable(false);
        txt_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btn_add.setText("ADD");
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_up.setText("Update");
        btn_up.setFocusable(false);
        btn_up.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_upActionPerformed(evt);
            }
        });

        btn_del.setText("Delete");
        btn_del.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmx, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn_del, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_del, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Category", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        tbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        btn_back.setText("Back");
        btn_back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Search by :");

        rad_ID.setBackground(new java.awt.Color(255, 255, 255));
        rad_ID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rad_ID.setText("ID");

        rad_cat.setBackground(new java.awt.Color(255, 255, 255));
        rad_cat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rad_cat.setText("Category");

        rad_stat.setBackground(new java.awt.Color(255, 255, 255));
        rad_stat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rad_stat.setText("Status");

        txt_search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btn_search.setText("Search");
        btn_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        log.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        log.setText("Logged as :");

        lbl_user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_user.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(log)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_user)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rad_ID)
                                .addGap(10, 10, 10)
                                .addComponent(rad_cat)
                                .addGap(10, 10, 10)
                                .addComponent(rad_stat))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(jLabel1)))
                        .addGap(0, 109, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(log)
                        .addComponent(lbl_user)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rad_ID)
                        .addComponent(rad_cat)
                        .addComponent(rad_stat)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmxActionPerformed

    Category c = new Category();

    private void clear() {
        Tools.clear(this);
        txt_category.requestFocus();
        btn_add.setEnabled(true);
        btn_up.setEnabled(false);
        btn_del.setEnabled(false);

        txt_ID.setText(c.getAutoNumber());
    }

    private void set() {
        c.setID(Integer.parseInt(txt_ID.getText()));
        c.setName(txt_category.getText());
        c.setStatus(cmx.getSelectedItem().toString());
    }

    private void add() {
        char str[] = txt_category.getText().toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '0' ||str[i] == '1' || str[i] == '2' || str[i] == '3' || str[i] == '4' || str[i] == '5' || str[i] == '6' || str[i] == '7' || str[i] == '8' || str[i] == '9') {
                Tools.msg("Can't save number in this field");
                txt_category.setText("");
                txt_category.requestFocus();
                break;
            }
        }
        if ("".equals(txt_category.getText())) {
        } else {
            set();
            c.add();
            clear();
            c.selectAll(tbl);
        }
    }

    private void update() {
        char str[] = txt_category.getText().toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '0' ||str[i] == '1' || str[i] == '2' || str[i] == '3' || str[i] == '4' || str[i] == '5' || str[i] == '6' || str[i] == '7' || str[i] == '8' || str[i] == '9') {
                Tools.msg("Can't save number in this field");
                txt_category.setText("");
                txt_category.requestFocus();
                break;
            }
        }
        if ("".equals(txt_category.getText())) {
        } else {
            set();
            c.update();
            clear();
            c.selectAll(tbl);
        }
    }

    private void delete() {
        if (Tools.ConfirmMsg("Are You Sure You Want To Delete this Category permanently?")) {
            set();
            c.delete();
            clear();
            c.selectAll(tbl);
        }
    }

    private void search() {
        String txtSer;
        String query = "SELECT * FROM `category` WHERE ";
        if (rad_ID.isSelected()) {
            txtSer = Tools.getnum(txt_search.getText());
            //Tools.msg(txtSer);
            query += "ID ";

        } else if (rad_cat.isSelected()) {
            txtSer = Tools.removenum(txt_search.getText());
            query += "Category ";
        } else {
            txtSer = Tools.removenum(txt_search.getText());
            query += "Statuss ";
        }
        query += "like '%" + txtSer + "%'";
        c.getCustom(query, tbl);
    }

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        main m = new main(name);
        m.setTitle("Main Menu");
        this.dispose();
        Tools.open(m);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        add();
    }//GEN-LAST:event_btn_addActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        btn_group.add(rad_ID);
        btn_group.add(rad_cat);
        btn_group.add(rad_stat);
        clear();
        c.selectAll(tbl);
        tbl.getTableHeader().setReorderingAllowed(false);
        txt_category.requestFocus();

        lbl_user.setText(name);

    }//GEN-LAST:event_formWindowOpened

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
        try {
            int row = tbl.getSelectedRow();
            String ID = tbl.getValueAt(row, 0).toString();
            String name = tbl.getValueAt(row, 1).toString();
            String status = tbl.getValueAt(row, 2).toString();

            txt_ID.setText(ID);
            txt_category.setText(name);
            cmx.setSelectedItem(status);

            btn_add.setEnabled(false);
            btn_up.setEnabled(true);
            btn_del.setEnabled(true);
        } catch (Exception ex) {
            Tools.msg(ex.getMessage());
        }
    }//GEN-LAST:event_tblMouseClicked

    private void btn_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_upActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btn_upActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btn_delActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_btn_searchActionPerformed

    private void txt_categoryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_categoryKeyPressed
        // TODO add your handling code here:
        if (btn_add.isEnabled()) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                add();
            }
        } else if (!btn_add.isEnabled()) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                update();
            }
        }
    }//GEN-LAST:event_txt_categoryKeyPressed

    private void tblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblKeyPressed
        // TODO add your handling code here:
        if (!btn_add.isEnabled()) {
            if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
                delete();
            }
        }
    }//GEN-LAST:event_tblKeyPressed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        txt_category.setText(null);
        btn_add.setEnabled(true);
        btn_up.setEnabled(false);
        btn_del.setEnabled(false);
        txt_category.setText("");
        txt_ID.setText(c.getAutoNumber());
        cmx.setSelectedIndex(0);
        txt_search.setText("");
        txt_category.requestFocus();
    }//GEN-LAST:event_formMouseClicked

    private void txt_categoryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_categoryKeyTyped
        // TODO add your handling code here:
        /*char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c))) {
            //evt.consume();
            Tools.msg("Can't Save number in this field");
            txt_category.setText("");
            txt_category.requestFocus();
        }*/

    }//GEN-LAST:event_txt_categoryKeyTyped

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        btn_add.setEnabled(true);
        btn_up.setEnabled(false);
        btn_del.setEnabled(false);
        txt_category.setText("");
        txt_ID.setText(c.getAutoNumber());
        cmx.setSelectedIndex(0);
        txt_search.setText("");
        txt_category.requestFocus();
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private control.JMyButton btn_add;
    private control.JMyButton btn_back;
    private control.JMyButton btn_del;
    private javax.swing.ButtonGroup btn_group;
    private control.JMyButton btn_search;
    private control.JMyButton btn_up;
    private control.JMyCompo cmx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JLabel log;
    private javax.swing.JRadioButton rad_ID;
    private javax.swing.JRadioButton rad_cat;
    private javax.swing.JRadioButton rad_stat;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_category;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
