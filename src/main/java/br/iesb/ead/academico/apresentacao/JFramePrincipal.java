/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.iesb.ead.academico.apresentacao;

import org.jdesktop.layout.GroupLayout;
/**
 *
 * @author lucas
 */
public class JFramePrincipal extends javax.swing.JFrame {

    /** Creates new form JFramePrincipal */
    public JFramePrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemAlunos = new javax.swing.JMenuItem();
        jMenuItemProfessores = new javax.swing.JMenuItem();
        jMenuItemDiciplinas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle Acadêmico");

        jMenu1.setMnemonic('C');
        jMenu1.setText("Cadastros");

        jMenuItemAlunos.setMnemonic('A');
        jMenuItemAlunos.setText("Alunos");
        jMenuItemAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlunosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAlunos);

        jMenuItemProfessores.setMnemonic('P');
        jMenuItemProfessores.setText("Professores");
        jMenuItemProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProfessoresActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemProfessores);

        jMenuItemDiciplinas.setMnemonic('D');
        jMenuItemDiciplinas.setText("Diciplinas");
        jMenuItemDiciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDiciplinasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemDiciplinas);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('j');
        jMenu2.setText("Ajuda");

        jMenuItem2.setMnemonic('S');
        jMenuItem2.setText("Sobre");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlunosActionPerformed
        JDialogCadastroAluno dialog = new JDialogCadastroAluno(this,true);
        dialog.setVisible(true); 
        
    }//GEN-LAST:event_jMenuItemAlunosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JDialogSobre dialog = new JDialogSobre(this,true);
        dialog.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItemProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProfessoresActionPerformed
        JDialogCadastroProfessor dialog = new JDialogCadastroProfessor(this,true);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemProfessoresActionPerformed

    private void jMenuItemDiciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDiciplinasActionPerformed
        JDialogCadastroDiciplina dialog = new JDialogCadastroDiciplina(this,true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItemDiciplinasActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAlunos;
    private javax.swing.JMenuItem jMenuItemDiciplinas;
    private javax.swing.JMenuItem jMenuItemProfessores;
    // End of variables declaration//GEN-END:variables

}