
package guiado05;

import javax.swing.DefaultListModel;

public class guiado05 extends javax.swing.JFrame {

    public guiado05() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiResultado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstNombres = new javax.swing.JList<>();
        btnCurso1 = new javax.swing.JButton();
        btnCurso2 = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lstNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstNombresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstNombres);

        btnCurso1.setText("Curso 1");
        btnCurso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurso1ActionPerformed(evt);
            }
        });

        btnCurso2.setText("Curso 2");
        btnCurso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurso2ActionPerformed(evt);
            }
        });

        btnVaciar.setText("Vaciar");
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnCurso1)
                        .addGap(18, 18, 18)
                        .addComponent(btnCurso2)
                        .addGap(18, 18, 18)
                        .addComponent(btnVaciar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(etiResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCurso1)
                    .addComponent(btnCurso2)
                    .addComponent(btnVaciar))
                .addGap(98, 98, 98))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCurso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurso2ActionPerformed
    DefaultListModel modelo = new DefaultListModel();
    modelo.addElement("Ana");
    modelo.addElement("Marta");
    modelo.addElement("Jose");
    lstNombres.setModel(modelo); 
    }//GEN-LAST:event_btnCurso2ActionPerformed

    private void btnCurso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurso1ActionPerformed
    DefaultListModel modelo = new DefaultListModel();
    modelo.addElement("Juan");
    modelo.addElement("María");
    modelo.addElement("Luis");
    lstNombres.setModel(modelo); 
    }//GEN-LAST:event_btnCurso1ActionPerformed

    private void lstNombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstNombresMouseClicked
    etiResultado.setText(lstNombres.getSelectedValue().toString());
    }//GEN-LAST:event_lstNombresMouseClicked

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
DefaultListModel modelo = new DefaultListModel();
lstNombres.setModel(modelo); 
    }//GEN-LAST:event_btnVaciarActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(guiado05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiado05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiado05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiado05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiado05().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCurso1;
    private javax.swing.JButton btnCurso2;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JLabel etiResultado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstNombres;
    // End of variables declaration//GEN-END:variables
}
