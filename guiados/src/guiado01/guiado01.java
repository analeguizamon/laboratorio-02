package guiado01;
public class guiado01 extends javax.swing.JFrame {
    public guiado01() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAceptar = new javax.swing.JButton();
        etiResultado = new javax.swing.JLabel();
        chkPerro = new javax.swing.JCheckBox();
        chkGato = new javax.swing.JCheckBox();
        chkRaton = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        etiResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        chkPerro.setText("Perro");

        chkGato.setText("Gato");

        chkRaton.setText("Raton");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPerro)
                    .addComponent(chkGato)
                    .addComponent(btnAceptar)
                    .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkRaton))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(chkPerro)
                .addGap(18, 18, 18)
                .addComponent(chkGato)
                .addGap(18, 18, 18)
                .addComponent(chkRaton)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar)
                .addGap(18, 18, 18)
                .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String mensaje = "Animales elegidos: ";
            if (chkPerro.isSelected()) mensaje += "Perro ";
            if (chkGato.isSelected()) mensaje += "Gato ";
            if (chkRaton.isSelected()) mensaje += "Raton ";
        etiResultado.setText(mensaje);
    }//GEN-LAST:event_btnAceptarActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiado01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JCheckBox chkGato;
    private javax.swing.JCheckBox chkPerro;
    private javax.swing.JCheckBox chkRaton;
    private javax.swing.JLabel etiResultado;
    // End of variables declaration//GEN-END:variables
}