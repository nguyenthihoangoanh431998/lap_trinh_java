/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_2;

/**
 *
 * @author neroooo
 */
public class DemoCalculator extends javax.swing.JFrame {

    /**
     * Creates new form DemoCalculator
     */
    public DemoCalculator() {
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

        pnlMain = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        txtKq = new javax.swing.JTextField();
        pnlBottom = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnSo3 = new javax.swing.JButton();
        btnChia = new javax.swing.JButton();
        btnCanBac2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnNhan = new javax.swing.JButton();
        btnPhanTram = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnTru = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnCT = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnCong = new javax.swing.JButton();
        btnBang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMain.setLayout(new java.awt.BorderLayout());

        txtKq.setEditable(false);
        txtKq.setBackground(new java.awt.Color(255, 255, 255));
        txtKq.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtKq.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtKq.setText("0");
        txtKq.setActionCommand("<Not Set>");
        txtKq.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtKq)
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtKq, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMain.add(pnlTop, java.awt.BorderLayout.PAGE_START);

        pnlBottom.setLayout(new java.awt.GridLayout(4, 5, 2, 2));

        btn1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        pnlBottom.add(btn1);

        btn2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        pnlBottom.add(btn2);

        btnSo3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnSo3.setText("3");
        btnSo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo3ActionPerformed(evt);
            }
        });
        pnlBottom.add(btnSo3);

        btnChia.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnChia.setText("/");
        btnChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaActionPerformed(evt);
            }
        });
        pnlBottom.add(btnChia);

        btnCanBac2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnCanBac2.setText("sqrt");
        pnlBottom.add(btnCanBac2);

        btn4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        pnlBottom.add(btn4);

        btn5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btn5.setText("5");
        btn5.setToolTipText("");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        pnlBottom.add(btn5);

        btn6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        pnlBottom.add(btn6);

        btnNhan.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnNhan.setLabel("x");
        btnNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanActionPerformed(evt);
            }
        });
        pnlBottom.add(btnNhan);

        btnPhanTram.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPhanTram.setText("%");
        pnlBottom.add(btnPhanTram);

        btn7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        pnlBottom.add(btn7);

        btn8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        pnlBottom.add(btn8);

        btn9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        pnlBottom.add(btn9);

        btnTru.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnTru.setText("-");
        btnTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruActionPerformed(evt);
            }
        });
        pnlBottom.add(btnTru);

        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton15.setText("1/x");
        pnlBottom.add(jButton15);

        btn0.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        pnlBottom.add(btn0);

        btnCT.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnCT.setText("+/-");
        pnlBottom.add(btnCT);

        btnC.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        pnlBottom.add(btnC);

        btnCong.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnCong.setText("+");
        btnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongActionPerformed(evt);
            }
        });
        pnlBottom.add(btnCong);

        btnBang.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnBang.setText("=");
        btnBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangActionPerformed(evt);
            }
        });
        pnlBottom.add(btnBang);

        pnlMain.add(pnlBottom, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        String gt = this.txtKq.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt ="";
            long so = Long.parseLong(gt+btn1.getText());
            this.txtKq.setText(String.valueOf(so));     
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        String gt = this.txtKq.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt ="";
            long so = Long.parseLong(gt+btn2.getText());
            this.txtKq.setText(String.valueOf(so));     
    }//GEN-LAST:event_btn2ActionPerformed
    }
    private void btnSo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo3ActionPerformed
        // TODO add your handling code here:
        String gt = this.txtKq.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt ="";
            long so = Long.parseLong(gt+btnSo3.getText());
            this.txtKq.setText(String.valueOf(so)); 
    }//GEN-LAST:event_btnSo3ActionPerformed
    }
    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        String gt = this.txtKq.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt ="";
            long so = Long.parseLong(gt+btn4.getText());
            this.txtKq.setText(String.valueOf(so)); 
    }//GEN-LAST:event_btn4ActionPerformed
    }
    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        String gt = this.txtKq.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt ="";
            long so = Long.parseLong(gt+btn5.getText());
            this.txtKq.setText(String.valueOf(so)); 
    }//GEN-LAST:event_btn5ActionPerformed
    }
    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        String gt = this.txtKq.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt ="";
            long so = Long.parseLong(gt+btn6.getText());
            this.txtKq.setText(String.valueOf(so)); 
    }//GEN-LAST:event_btn6ActionPerformed
    }
    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        String gt = this.txtKq.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt ="";
            long so = Long.parseLong(gt+btn7.getText());
            this.txtKq.setText(String.valueOf(so)); 
    }//GEN-LAST:event_btn7ActionPerformed
    }
    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        String gt = this.txtKq.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt ="";
            long so = Long.parseLong(gt+btn8.getText());
            this.txtKq.setText(String.valueOf(so)); 
    }//GEN-LAST:event_btn8ActionPerformed
    }
    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        String gt = this.txtKq.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt ="";
            long so = Long.parseLong(gt+btn9.getText());
            this.txtKq.setText(String.valueOf(so)); 
    }//GEN-LAST:event_btn9ActionPerformed
    }
    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        String gt = this.txtKq.getText();
        if(gt.length()<12){
            if(gt.equals("0"))
                gt ="";
            long so = Long.parseLong(gt+btn0.getText());
            this.a = txtKq.getText(String.valueOf(so)); 
        }
    }//GEN-LAST:event_btn0ActionPerformed
    private long a = 0;
    private String phepToan = "";
    private void btnChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiaActionPerformed
        // TODO add your handling code here:
        this.a = Long.parseLong(this.txtKq.getText());
        if(this.a!=0){
            this.phepToan = "/";
            this.txtKq.setText("0");
        }
    }//GEN-LAST:event_btnChiaActionPerformed

    private void btnNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanActionPerformed
        // TODO add your handling code here:
                this.a = Long.parseLong(this.txtKq.getText());
        if(this.a!=0){
            this.phepToan = "*";
            this.txtKq.setText("0");
        }
    }//GEN-LAST:event_btnNhanActionPerformed

    private void btnTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruActionPerformed
        // TODO add your handling code here:
                this.a = Long.parseLong(this.txtKq.getText());
        if(this.a!=0){
            this.phepToan = "-";
            this.txtKq.setText("0");
        }
    }//GEN-LAST:event_btnTruActionPerformed

    private void btnCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongActionPerformed
        // TODO add your handling code here:
                this.a = Long.parseLong(this.txtKq.getText());
        if(this.a!=0){
            this.phepToan = "+";
            this.txtKq.setText("0");
        }
    }//GEN-LAST:event_btnCongActionPerformed

    private void btnBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangActionPerformed
        // TODO add your handling code here:
        if(this.phepToan.length()>0){
            long b = Long.parseLong(txtKq.getText());
            if(this.phepToan.equals("+")){
                this.txtKq.setText(String.valueOf(a+b));
            }
            else if(this.phepToan.equals("-")){
                this.txtKq.setText(String.valueOf(a-b));
            }
            else if(this.phepToan.equals("*")){
                this.txtKq.setText(String.valueOf(a*b));
            }
            else if(this.phepToan.equals("/")){
                this.txtKq.setText(String.valueOf(a/b));
            }
            a=0;b=0;phepToan = "";
        }
    }//GEN-LAST:event_btnBangActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
        a=0;
        phepToan = "";
        txtKq.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    
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
            java.util.logging.Logger.getLogger(DemoCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemoCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemoCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemoCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemoCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBang;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCT;
    private javax.swing.JButton btnCanBac2;
    private javax.swing.JButton btnChia;
    private javax.swing.JButton btnCong;
    private javax.swing.JButton btnNhan;
    private javax.swing.JButton btnPhanTram;
    private javax.swing.JButton btnSo3;
    private javax.swing.JButton btnTru;
    private javax.swing.JButton jButton15;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTextField txtKq;
    // End of variables declaration//GEN-END:variables
}
