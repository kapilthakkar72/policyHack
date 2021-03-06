/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Kapil Thakkar
 */
public class Properties extends javax.swing.JFrame
{

    Product p;
    JFrame previousPage;

    /**
     * Creates new form Properties
     */
    public Properties()
    {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    public Properties(String Prop, JFrame previousPage, Product p)
    {

        this.p = p;
        initComponents();

        otherAttLabelNew.setText("Click the given button to see corresponding data here!");

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        //Setting up absolute layout of the last 2 buttons
        quantityD.setLayout(null);
        jButton8.setLayout(null);

        System.out.println("propval: " + propLabel);
        String defaultAttr = "";
        defaultAttr = "<html>Name: " + p.getName() + "<br>Company Name: " + p.getCompany() + " <br>Seeling Price:" + p.getSellingPrice() + "</html>";
        propLabel.setText(defaultAttr);

        // Display Logo of the product
        Dimension size = new Dimension(100, 100);
        ImageIcon icon1 = new ImageIcon("images/" + p.getLogo() + ".jpg");
        logoLabel.setIcon(icon1);
        logoLabel.setText("");
        logoLabel.setMinimumSize(size);
        logoLabel.setPreferredSize(size);
        logoLabel.setMaximumSize(size);

        this.previousPage = previousPage;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        back = new javax.swing.JButton();
        propLabel = new javax.swing.JLabel();
        otherAttLabel = new javax.swing.JLabel();
        agmarkB = new javax.swing.JButton();
        barcodeB = new javax.swing.JButton();
        validityD = new javax.swing.JButton();
        nutrientValueD = new javax.swing.JButton();
        manDateD = new javax.swing.JButton();
        priceMRPD = new javax.swing.JButton();
        quantityD = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        otherAttLabelNew = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 400));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backActionPerformed(evt);
            }
        });

        propLabel.setText("jLabel1");

        agmarkB.setText("Authentication");
        agmarkB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                agmarkBActionPerformed(evt);
            }
        });

        barcodeB.setText("barcode");
        barcodeB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                barcodeBActionPerformed(evt);
            }
        });

        validityD.setText("Validity");
        validityD.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                validityDActionPerformed(evt);
            }
        });

        nutrientValueD.setText("nutrient value");
        nutrientValueD.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nutrientValueDActionPerformed(evt);
            }
        });

        manDateD.setText("Mfg Date");
        manDateD.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                manDateDActionPerformed(evt);
            }
        });

        priceMRPD.setText("MRP");
        priceMRPD.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                priceMRPDActionPerformed(evt);
            }
        });

        quantityD.setText("quantity");
        quantityD.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                quantityDActionPerformed(evt);
            }
        });

        jButton8.setText("veg / non-veg");
        jButton8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton8ActionPerformed(evt);
            }
        });

        logoLabel.setText("jLabel1");

        otherAttLabelNew.setText("jLabel1");

        jLabel1.setText("Value:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(propLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(202, 202, 202)
                                        .addComponent(back))
                                    .addComponent(nutrientValueD)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(agmarkB)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(129, 129, 129)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(barcodeB)
                                                            .addGap(40, 40, 40)
                                                            .addComponent(manDateD))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(quantityD)
                                                            .addGap(124, 124, 124)))))
                                            .addGap(46, 46, 46)
                                            .addComponent(priceMRPD))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(239, 239, 239)
                                            .addComponent(jButton8)
                                            .addGap(18, 18, 18)
                                            .addComponent(validityD))))
                                .addGap(0, 170, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(otherAttLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(otherAttLabelNew)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(propLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(otherAttLabel)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otherAttLabelNew)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barcodeB)
                    .addComponent(agmarkB)
                    .addComponent(priceMRPD)
                    .addComponent(manDateD))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nutrientValueD)
                    .addComponent(jButton8)
                    .addComponent(validityD)
                    .addComponent(quantityD))
                .addGap(28, 28, 28)
                .addComponent(back)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backActionPerformed
    {//GEN-HEADEREND:event_backActionPerformed
        // TODO add your handling code here:
        previousPage.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void validityDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_validityDActionPerformed
    {//GEN-HEADEREND:event_validityDActionPerformed
        // TODO add your handling code here:
        String s = "No Expiry Date Present";
        if (p.getBestbefore() != -1)
        {
            s = Integer.toString(p.getBestbefore()) + " months";
        }
        otherAttLabelNew.setIcon(null);
        otherAttLabelNew.setText(s);
        p.checkedValidity = true;
    }//GEN-LAST:event_validityDActionPerformed

    private void manDateDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_manDateDActionPerformed
    {//GEN-HEADEREND:event_manDateDActionPerformed
        // TODO add your handling code here:
        String s = "No Mfg Present";
        if (p.getManDate() != null)
        {
            s = p.getManDate().toString();
        }
        otherAttLabelNew.setIcon(null);
        otherAttLabelNew.setText(s);
        p.checkedMfd = true;
    }//GEN-LAST:event_manDateDActionPerformed

    private void agmarkBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_agmarkBActionPerformed
    {//GEN-HEADEREND:event_agmarkBActionPerformed
        // TODO add your handling code here:
//        String s = "No Authentication";
//        if (p.isAgmark() == true)
//        {
//            s = "Certified by Government";
//        }
//        otherAttLabelNew.setText(s);
//        p.checkedAuth = true;
        if (p.isAgmark() == true)
        {
            ImageIcon icon1 = new ImageIcon("images/fssai.jpg");
            otherAttLabelNew.setIcon(icon1);
            otherAttLabelNew.setText("");
        }
        else
        {
            otherAttLabelNew.setText("No Authentication");
        }
    }//GEN-LAST:event_agmarkBActionPerformed

    private void barcodeBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_barcodeBActionPerformed
    {//GEN-HEADEREND:event_barcodeBActionPerformed
        // TODO add your handling code here:
        String s = "No barcode Present";
        if (p.getBarcode() != null)
        {
            s = "Bar code is present";
        }
        otherAttLabelNew.setIcon(null);
        otherAttLabelNew.setText(s);
        p.checkedBarcode = true;
    }//GEN-LAST:event_barcodeBActionPerformed

    private void nutrientValueDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nutrientValueDActionPerformed
    {//GEN-HEADEREND:event_nutrientValueDActionPerformed
        // TODO add your handling code here:
        String s = "No nutritional information present ";
        if (p.getNutrientValue() != null)
        {
            s = p.getNutrientValue();
        }
        otherAttLabelNew.setIcon(null);
        otherAttLabelNew.setText(s);
        p.checkedNut = true;
    }//GEN-LAST:event_nutrientValueDActionPerformed

    private void priceMRPDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_priceMRPDActionPerformed
    {//GEN-HEADEREND:event_priceMRPDActionPerformed
        // TODO add your handling code here:
        otherAttLabelNew.setIcon(null);
        otherAttLabelNew.setText(Double.toString(p.getPrice()));
        p.checkedMRP = true;
    }//GEN-LAST:event_priceMRPDActionPerformed

    private void quantityDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_quantityDActionPerformed
    {//GEN-HEADEREND:event_quantityDActionPerformed
        // TODO add your handling code here:
        otherAttLabelNew.setIcon(null);
        otherAttLabelNew.setText(p.getQuantity() + " " + p.getUnitofquantity());
        p.checkedQty = true;
    }//GEN-LAST:event_quantityDActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton8ActionPerformed
    {//GEN-HEADEREND:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if (p.isVeg() == true)
        {
            otherAttLabelNew.setIcon(null);
            otherAttLabelNew.setText("Veg Product");
        }
        else
        {
            otherAttLabelNew.setIcon(null);
            otherAttLabelNew.setText("Non-Veg Product");
        }
        p.checkedVeg = true;
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Properties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Properties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Properties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Properties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Properties().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agmarkB;
    private javax.swing.JButton back;
    private javax.swing.JButton barcodeB;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton manDateD;
    private javax.swing.JButton nutrientValueD;
    private javax.swing.JLabel otherAttLabel;
    private javax.swing.JLabel otherAttLabelNew;
    private javax.swing.JButton priceMRPD;
    private javax.swing.JLabel propLabel;
    private javax.swing.JButton quantityD;
    private javax.swing.JButton validityD;
    // End of variables declaration//GEN-END:variables
}
