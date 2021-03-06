package my.numbercalc;

/**
 * @author Randy Gingeleski
 */
public class NumberCalcUI extends javax.swing.JFrame {

    private Calculator calc = new Calculator();
    private float num1, num2, result;
    
    /**
     * Creates new form NumberAdditionUI
     */
    public NumberCalcUI() {
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

        numberAdditionPanel = new javax.swing.JPanel();
        firstNumberLabel = new javax.swing.JLabel();
        secondNumberLabel = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        firstNumberTextField = new javax.swing.JTextField();
        secondNumberTextField = new javax.swing.JTextField();
        resultTextField = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        subtractButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numberAdditionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Number Addition"));

        firstNumberLabel.setText("First Number");

        secondNumberLabel.setText("Second Number");

        resultLabel.setText("Result");

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        subtractButton.setText("Subtract");
        subtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractButtonActionPerformed(evt);
            }
        });

        divideButton.setText("Divide");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        multiplyButton.setText("Multiply");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout numberAdditionPanelLayout = new javax.swing.GroupLayout(numberAdditionPanel);
        numberAdditionPanel.setLayout(numberAdditionPanelLayout);
        numberAdditionPanelLayout.setHorizontalGroup(
            numberAdditionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numberAdditionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(numberAdditionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(numberAdditionPanelLayout.createSequentialGroup()
                        .addComponent(firstNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(numberAdditionPanelLayout.createSequentialGroup()
                        .addComponent(secondNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(secondNumberTextField))
                    .addGroup(numberAdditionPanelLayout.createSequentialGroup()
                        .addComponent(resultLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(numberAdditionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(multiplyButton)
                            .addComponent(divideButton)
                            .addComponent(subtractButton)
                            .addGroup(numberAdditionPanelLayout.createSequentialGroup()
                                .addComponent(addButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clearButton))
                            .addComponent(resultTextField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        numberAdditionPanelLayout.setVerticalGroup(
            numberAdditionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numberAdditionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(numberAdditionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNumberLabel)
                    .addComponent(firstNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(numberAdditionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondNumberLabel)
                    .addComponent(secondNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(numberAdditionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultLabel)
                    .addComponent(resultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(numberAdditionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(clearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtractButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(divideButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(multiplyButton))
        );

        exitButton.setLabel("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numberAdditionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numberAdditionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        firstNumberTextField.setText("");
        secondNumberTextField.setText("");
        resultTextField.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        num1 = Float.parseFloat(firstNumberTextField.getText());
        num2 = Float.parseFloat(secondNumberTextField.getText());
        
        resultTextField.setText(String.valueOf( calc.add(num1, num2) ));
    }//GEN-LAST:event_addButtonActionPerformed

    private void subtractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractButtonActionPerformed
        num1 = Float.parseFloat(firstNumberTextField.getText());
        num2 = Float.parseFloat(secondNumberTextField.getText());
        
        resultTextField.setText(String.valueOf( calc.subtract(num1, num2) ));
    }//GEN-LAST:event_subtractButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        num1 = Float.parseFloat(firstNumberTextField.getText());
        num2 = Float.parseFloat(secondNumberTextField.getText());
        
        resultTextField.setText(String.valueOf( calc.divide(num1, num2) ));
    }//GEN-LAST:event_divideButtonActionPerformed

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        num1 = Float.parseFloat(firstNumberTextField.getText());
        num2 = Float.parseFloat(secondNumberTextField.getText());
        
        resultTextField.setText(String.valueOf( calc.multiply(num1, num2) ));
    }//GEN-LAST:event_multiplyButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NumberCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumberCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumberCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumberCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumberCalcUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel firstNumberLabel;
    private javax.swing.JTextField firstNumberTextField;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JPanel numberAdditionPanel;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JTextField resultTextField;
    private javax.swing.JLabel secondNumberLabel;
    private javax.swing.JTextField secondNumberTextField;
    private javax.swing.JButton subtractButton;
    // End of variables declaration//GEN-END:variables
}
