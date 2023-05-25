package guiado06;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class guiado06 extends javax.swing.JFrame {
    public guiado06() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboNumeros = new javax.swing.JComboBox<>();
        btnPares = new javax.swing.JButton();
        btnImpares = new javax.swing.JButton();
        etiResultado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboNumeros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N° 0", "N° 1", "N° 2", "N° 3", "N° 4", "N° 5", "N° 6", "N° 7", "N° 8", "N° 9", "N° 10", " " }));
        cboNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNumerosActionPerformed(evt);
            }
        });

        btnPares.setText("Pares");
        btnPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParesActionPerformed(evt);
            }
        });

        btnImpares.setText("Impares");
        btnImpares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImparesActionPerformed(evt);
            }
        });

        etiResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Vaciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(etiResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPares)
                        .addGap(18, 18, 18)
                        .addComponent(btnImpares)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPares)
                    .addComponent(btnImpares)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParesActionPerformed
        int i;
    DefaultComboBoxModel modelo = new DefaultComboBoxModel();
    for (i=0;i<10;i+=2) {
    modelo.addElement("Nº "+i);
}

cboNumeros.setModel(modelo);
    }//GEN-LAST:event_btnParesActionPerformed

    private void btnImparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImparesActionPerformed
        int i;
DefaultComboBoxModel modelo = new DefaultComboBoxModel();

for (i=1;i<10;i+=2) {
 modelo.addElement("Nº "+i);
}

cboNumeros.setModel(modelo);
    }//GEN-LAST:event_btnImparesActionPerformed

    private void cboNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNumerosActionPerformed
     etiResultado.setText(cboNumeros.getSelectedItem().toString());
    }//GEN-LAST:event_cboNumerosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     DefaultComboBoxModel modelo = new DefaultComboBoxModel();
     cboNumeros.setModel(modelo);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(guiado06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiado06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiado06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiado06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiado06().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImpares;
    private javax.swing.JButton btnPares;
    private javax.swing.JComboBox<String> cboNumeros;
    private javax.swing.JLabel etiResultado;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
