/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vector6;

import javax.swing.JOptionPane;

/**
 *
 * @author liborio
 */
public class Ejercicio6 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio6
     */
    double v[];

    public Ejercicio6() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtLongitud2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenarM = new javax.swing.JButton();
        cmdLlenarA = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel3.setText("Simetrico");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 14))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLongitud2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitud2KeyTyped(evt);
            }
        });
        jPanel7.add(txtLongitud2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 90, 30));

        jLabel8.setText("Longitud");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, 60));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 12))); // NOI18N

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 180, 140));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 12))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel9.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, -1));

        cmdLlenarM.setText("Llenado Manual");
        cmdLlenarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarMActionPerformed(evt);
            }
        });
        jPanel9.add(cmdLlenarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, -1));

        cmdLlenarA.setText("Llenado Automatico");
        cmdLlenarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarAActionPerformed(evt);
            }
        });
        jPanel9.add(cmdLlenarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, -1));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel9.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel9.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, -1));

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 170, 220));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLongitud2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitud2KeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtLongitud2KeyTyped

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed

        int L;
        if (txtLongitud.getText().trim().isEmpty()) if (txtLongitud.getText().trim().equals("0")) {
            JOptionPane.showMessageDialog(this, "Digite Un Valor Mayor Que 0", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
            txtLongitud.selectAll();
        } else if (Integer.parseInt(txtLongitud.getText().trim()) == 0) {
            JOptionPane.showMessageDialog(this, "La Longitud No Puedes 0, Por Favor Cambie Su Valor", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
            txtLongitud.selectAll();
        } else {
            L = Integer.parseInt(txtLongitud.getText());
            v = new double[L];
            JOptionPane.showMessageDialog(this, "Su Vector Ha Sido Creado Satisfactoriamente", "Notificar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Digite Valor En La Longitud", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
        }
        cmdCrear.setEnabled(false);
        cmdLlenarM.setEnabled(true);
        cmdLlenarA.setEnabled(true);
        cmdMostrar.setEnabled(false);
        cmdBorrar.setEnabled(true);
        txtLongitud.setEditable(false);
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarMActionPerformed

        double N;
        for (int i = 0; i < v.length; i++) {
            N = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite El Valor De La Posicion " + (i + 1)));
            v[i] = N;
        }
        cmdCrear.setEnabled(false);
        cmdLlenarM.setEnabled(false);
        cmdLlenarA.setEnabled(false);
        cmdMostrar.setEnabled(true);
        cmdBorrar.setEnabled(true);
        txtLongitud.setEditable(false);
    }//GEN-LAST:event_cmdLlenarMActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed

        String R = null;
        for (int i = 0; i < v.length; i++) {
            if (v[i] != v[v.length - (i + 1)]) {
                R = "El Vector NO es Simetrico";
            } else {
                R = "El Vector SI Es Simetrico";
            }
        }
        txtResultado.setText(R);

        cmdCrear.setEnabled(false);
        cmdLlenarM.setEnabled(false);
        cmdLlenarA.setEnabled(false);
        cmdMostrar.setEnabled(true);
        cmdBorrar.setEnabled(true);
        txtLongitud.setEditable(false);
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed

        txtLongitud.setText("");
        txtResultado.setText("");
        txtLongitud.requestFocusInWindow();
        v = null;

        cmdCrear.setEnabled(true);
        cmdLlenarM.setEnabled(false);
        cmdLlenarA.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdBorrar.setEnabled(true);
        txtLongitud.setEditable(true);
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdLlenarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarAActionPerformed

        double N;
        for (int i = 0; i < v.length; i++) {
            N = (int) (Math.random() * 50 + 1);
            v[i] = N;
        }
        JOptionPane.showMessageDialog(this, "Vector llenado correctamente");
        cmdCrear.setEnabled(false);
        cmdLlenarM.setEnabled(false);
        cmdLlenarA.setEnabled(false);
        cmdMostrar.setEnabled(true);
        cmdBorrar.setEnabled(true);
        txtLongitud.setEditable(false);
    }//GEN-LAST:event_cmdLlenarAActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLlenarA;
    private javax.swing.JButton cmdLlenarM;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextField txtLongitud1;
    private javax.swing.JTextField txtLongitud2;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
