package guiado07;

public class guiado07 extends javax.swing.JFrame {
    public guiado07() {
        initComponents();
        tbtnInstalacion.setSelected(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiNombre = new javax.swing.JLabel();
        txtPrecioBase = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        etiTotal = new javax.swing.JLabel();
        tbtnInstalacion = new javax.swing.JToggleButton();
        tbtnFormacion = new javax.swing.JToggleButton();
        tbtnAlimentacionBD = new javax.swing.JToggleButton();
        etiPrecioInstalacion = new javax.swing.JLabel();
        etiPrecioFormacion = new javax.swing.JLabel();
        etiPrecioAlimentacionBD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiNombre.setText("Precio Base");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        etiTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbtnInstalacion.setText("Instalacion");

        tbtnFormacion.setText("Formacion");

        tbtnAlimentacionBD.setText("Alimentacion BD");

        etiPrecioInstalacion.setText("40");

        etiPrecioFormacion.setText("200");

        etiPrecioAlimentacionBD.setText("200");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbtnAlimentacionBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbtnFormacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbtnInstalacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrecioBase)
                    .addComponent(etiNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiPrecioInstalacion)
                    .addComponent(etiPrecioFormacion)
                    .addComponent(etiPrecioAlimentacionBD))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(etiNombre)
                .addGap(18, 18, 18)
                .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtnInstalacion)
                    .addComponent(etiPrecioInstalacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtnFormacion)
                    .addComponent(etiPrecioFormacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtnAlimentacionBD)
                    .addComponent(etiPrecioAlimentacionBD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addComponent(etiTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double precio_base;
double precio_instal; //precio instalación
double precio_for; //precio formacion
double precio_ali; //precio alimentacion

//Recojo datos desde la ventana:

precio_base = Double.parseDouble(txtPrecioBase.getText());
precio_instal = Double.parseDouble(etiPrecioInstalacion.getText());
precio_for = Double.parseDouble(etiPrecioFormacion.getText());
precio_ali = Double.parseDouble(etiPrecioAlimentacionBD.getText());

//Ahora que tengo los datos, puedo hacer cálculos.

//Al precio base se le van añadiendo precio de extras
//según estén o no activados los JToggleButtons

double precio_total;

precio_total = precio_base;

if (tbtnInstalacion.isSelected()) { //Si se seleccionó instalación
 precio_total = precio_total+precio_instal;
}

if (tbtnFormacion.isSelected()) { //Si se seleccionó formación
 precio_total = precio_total+precio_for;
}

if (tbtnAlimentacionBD.isSelected()) { //Si se seleccionó Alimentación BD
 precio_total = precio_total+precio_ali;
}


//Finalmente pongo el resultado en la etiqueta
etiTotal.setText(precio_total+" €");

    }//GEN-LAST:event_btnCalcularActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(guiado07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiado07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiado07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiado07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiado07().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel etiNombre;
    private javax.swing.JLabel etiPrecioAlimentacionBD;
    private javax.swing.JLabel etiPrecioFormacion;
    private javax.swing.JLabel etiPrecioInstalacion;
    private javax.swing.JLabel etiTotal;
    private javax.swing.JToggleButton tbtnAlimentacionBD;
    private javax.swing.JToggleButton tbtnFormacion;
    private javax.swing.JToggleButton tbtnInstalacion;
    private javax.swing.JTextField txtPrecioBase;
    // End of variables declaration//GEN-END:variables
}
