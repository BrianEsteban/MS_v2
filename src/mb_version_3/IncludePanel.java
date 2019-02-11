/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mb_version_3;

/**
 *
 * @author BRIAN
 */
public class IncludePanel extends javax.swing.JPanel {

    /**
     * Creates new form Include
     */
    
    public IncludePanel() {
        initComponents();
    }
    

    private IncludeCell cells = new IncludeCell();
    private IncludePlan plans = new IncludePlan();
    private PlanesPanel planInserted = new PlanesPanel();
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        SecondPanel = new javax.swing.JPanel();
        IncludePhone = new javax.swing.JButton();
        IncludeDataPlan = new javax.swing.JButton();
        EditPhone = new javax.swing.JButton();
        EditDataPlan = new javax.swing.JButton();
        Include = new javax.swing.JButton();

        ButtonBack.setText("Back");
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });

        SecondPanel.setLayout(new java.awt.BorderLayout());

        IncludePhone.setText("Include Phone");
        IncludePhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncludePhoneActionPerformed(evt);
            }
        });

        IncludeDataPlan.setText("Include Data Plan");
        IncludeDataPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncludeDataPlanActionPerformed(evt);
            }
        });

        EditPhone.setText("Edit Phone");
        EditPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPhoneActionPerformed(evt);
            }
        });

        EditDataPlan.setText("Edit Data Plan");
        EditDataPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDataPlanActionPerformed(evt);
            }
        });

        Include.setText("Pag Include");
        Include.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncludeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SecondPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Include, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IncludePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IncludeDataPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditDataPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Include)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SecondPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IncludeDataPlan, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(IncludePhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EditDataPlan, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(EditPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IncludeDataPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncludeDataPlanActionPerformed
       SecondPanel.setVisible(false);
       SecondPanel.removeAll();
       SecondPanel.add(plans);
       SecondPanel.setVisible(true);
    }//GEN-LAST:event_IncludeDataPlanActionPerformed

    private void EditDataPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDataPlanActionPerformed
       SecondPanel.setVisible(false);
       SecondPanel.removeAll();
       SecondPanel.add(planInserted);
       SecondPanel.setVisible(true);
    }//GEN-LAST:event_EditDataPlanActionPerformed

    private void EditPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditPhoneActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed

    }//GEN-LAST:event_ButtonBackActionPerformed

    private void IncludeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncludeActionPerformed
       SecondPanel.setVisible(false);
       SecondPanel.removeAll();
       SecondPanel.add(SecondPanel);
       SecondPanel.setVisible(true);
    }//GEN-LAST:event_IncludeActionPerformed

    private void IncludePhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncludePhoneActionPerformed
       SecondPanel.setVisible(false);
       SecondPanel.removeAll();
       SecondPanel.add(cells);
       SecondPanel.setVisible(true); 
    }//GEN-LAST:event_IncludePhoneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton EditDataPlan;
    private javax.swing.JButton EditPhone;
    private javax.swing.JButton Include;
    private javax.swing.JButton IncludeDataPlan;
    private javax.swing.JButton IncludePhone;
    private javax.swing.JPanel SecondPanel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
