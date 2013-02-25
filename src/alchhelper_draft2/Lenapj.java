/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alchhelper_draft2;

import javax.swing.ButtonGroup;

/**
 *
 * @author jaska
 */
public class Lenapj extends javax.swing.JPanel {

    /**
     * Creates new form Lenapj
     */
    public Lenapj() {
        initComponents();
        ButtonGroup categorygroup = new ButtonGroup();
        categorygroup.add(ArmorButton);
        categorygroup.add(WeaponButton);
        categorygroup.add(DhideButton);
        categorygroup.add(OtherButton);
        ButtonGroup natgroup = new ButtonGroup();
        natgroup.add(BuyNatButton);
        natgroup.add(BuyEssButton);
        natgroup.add(DontCareButton);
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
        ArmorButton = new javax.swing.JRadioButton();
        OtherButton = new javax.swing.JRadioButton();
        WeaponButton = new javax.swing.JRadioButton();
        DhideButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        BuyNatButton = new javax.swing.JRadioButton();
        BuyEssButton = new javax.swing.JRadioButton();
        DontCareButton = new javax.swing.JRadioButton();
        ListPane = new javax.swing.JScrollPane();
        List = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        AlchValue = new javax.swing.JTextField();
        GEPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Profit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NatPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        EssPrice = new javax.swing.JTextField();
        RatingBar = new javax.swing.JSlider();
        RatingLabel = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        AlchAmount = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Results = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        SortSelect = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        BuyLimit = new javax.swing.JTextField();
        CalcTotalButton = new javax.swing.JButton();
        AboutButton = new javax.swing.JButton();

        jLabel1.setText("Category:");

        ArmorButton.setText("Armour");
        ArmorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArmorButtonActionPerformed(evt);
            }
        });

        OtherButton.setText("Other");
        OtherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherButtonActionPerformed(evt);
            }
        });

        WeaponButton.setText("Weapons");
        WeaponButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeaponButtonActionPerformed(evt);
            }
        });

        DhideButton.setText("Dragonhide");
        DhideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DhideButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("I am...");

        BuyNatButton.setText("Buying Nature Runes");
        BuyNatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyNatButtonActionPerformed(evt);
            }
        });

        BuyEssButton.setText("Buying Pure Essence and making my own ");
        BuyEssButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyEssButtonActionPerformed(evt);
            }
        });

        DontCareButton.setText("Completely ambivalent and don't care either way");
        DontCareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DontCareButtonActionPerformed(evt);
            }
        });

        List.setBorder(javax.swing.BorderFactory.createTitledBorder("Items"));
        List.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ListPane.setViewportView(List);

        jLabel3.setText("High Alchemy Value:");

        AlchValue.setEditable(false);

        GEPrice.setEditable(false);

        jLabel4.setText("Current GE Price:");

        Profit.setEditable(false);

        jLabel5.setText("Profit:");

        jLabel6.setText("Nature Rune Price:");

        NatPrice.setEditable(false);

        jLabel7.setText("Pure Essence Price:");

        EssPrice.setEditable(false);

        RatingBar.setMinorTickSpacing(10);
        RatingBar.setPaintTicks(true);
        RatingBar.setSnapToTicks(true);
        RatingBar.setToolTipText("Profit Rating");

        RatingLabel.setForeground(new java.awt.Color(0, 153, 51));
        RatingLabel.setText("Breaking Even!");

        UpdateButton.setText("Update Prices");

        jLabel8.setText("(per alch)");

        jLabel9.setText("I want to alch this many:");

        Results.setEditable(false);
        Results.setColumns(20);
        Results.setRows(5);
        jScrollPane2.setViewportView(Results);

        jLabel10.setText("Sort Items by:");

        SortSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "High Alch Value", "GE Price" }));

        jLabel11.setText("Buy Limit (per 4 hours):");

        BuyLimit.setEditable(false);

        CalcTotalButton.setText("Go!");

        AboutButton.setText("About");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(42, 42, 42)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(OtherButton)
                            .add(ArmorButton)
                            .add(WeaponButton)
                            .add(DhideButton))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(61, 61, 61)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel2)
                                    .add(BuyNatButton)
                                    .add(BuyEssButton))
                                .add(61, 61, 61))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(DontCareButton)
                                .add(18, 18, 18)))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(NatPrice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(EssPrice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(ListPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 336, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(layout.createSequentialGroup()
                                    .add(jLabel10)
                                    .add(18, 18, 18)
                                    .add(SortSelect, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .add(layout.createSequentialGroup()
                                .add(UpdateButton)
                                .add(1, 1, 1)
                                .add(AboutButton)))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(AlchValue)
                                        .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(GEPrice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(Profit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jLabel8))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(RatingBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                        .add(56, 56, 56)
                                        .add(RatingLabel)
                                        .add(49, 49, 49))
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(jLabel11, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(BuyLimit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 313, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(jLabel9)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(AlchAmount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(CalcTotalButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(46, 46, 46)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(ArmorButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(WeaponButton)
                        .add(3, 3, 3)
                        .add(DhideButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(OtherButton)
                        .add(24, 24, 24))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(jLabel6)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(NatPrice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel7)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(EssPrice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(jLabel2)
                                .add(9, 9, 9)
                                .add(BuyNatButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(BuyEssButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(DontCareButton)
                                .add(12, 12, 12)))
                        .add(47, 47, 47)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(ListPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 211, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel10)
                            .add(SortSelect, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(UpdateButton)
                            .add(AboutButton)))
                    .add(layout.createSequentialGroup()
                        .add(jLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(AlchValue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jLabel4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(GEPrice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(jLabel11)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(BuyLimit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(RatingBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(RatingLabel))
                            .add(layout.createSequentialGroup()
                                .add(Profit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel8)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel9)
                            .add(AlchAmount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(CalcTotalButton))
                        .add(18, 18, 18)
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ArmorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArmorButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArmorButtonActionPerformed

    private void OtherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OtherButtonActionPerformed

    private void WeaponButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WeaponButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WeaponButtonActionPerformed

    private void DhideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DhideButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DhideButtonActionPerformed

    private void BuyNatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyNatButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyNatButtonActionPerformed

    private void BuyEssButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyEssButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyEssButtonActionPerformed

    private void DontCareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DontCareButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DontCareButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutButton;
    private javax.swing.JTextField AlchAmount;
    private javax.swing.JTextField AlchValue;
    private javax.swing.JRadioButton ArmorButton;
    private javax.swing.JRadioButton BuyEssButton;
    private javax.swing.JTextField BuyLimit;
    private javax.swing.JRadioButton BuyNatButton;
    private javax.swing.JButton CalcTotalButton;
    private javax.swing.JRadioButton DhideButton;
    private javax.swing.JRadioButton DontCareButton;
    private javax.swing.JTextField EssPrice;
    private javax.swing.JTextField GEPrice;
    private javax.swing.JList List;
    private javax.swing.JScrollPane ListPane;
    private javax.swing.JTextField NatPrice;
    private javax.swing.JRadioButton OtherButton;
    private javax.swing.JTextField Profit;
    private javax.swing.JSlider RatingBar;
    private javax.swing.JLabel RatingLabel;
    private javax.swing.JTextArea Results;
    private javax.swing.JComboBox SortSelect;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JRadioButton WeaponButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
