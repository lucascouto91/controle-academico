/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.iesb.ead.academico.apresentacao;

import br.iesb.ead.academico.negocio.NegocioException;
import br.iesb.ead.academico.dados.Professor;
import br.iesb.ead.academico.negocio.ProfessorBO;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class JDialogCadastroProfessor extends javax.swing.JDialog {
    
    private void popularFormulario(Professor entidade){
        jTextFieldCpf.setText(entidade.getValidaCpf());
        jTextFieldNome.setText(entidade.getValidaNome());
        jTextFieldSalario.setText(Double.toString(entidade.getValidaSalario()));
        jTextFieldTitulacao.setText(entidade.getValidaTitulacao());
        jTextFieldPesquisa.setText(entidade.getValidaPesquisa());
    }
    private void limparFormulario(){
        jTextFieldCpf.setText("");
        jTextFieldNome.setText("");
        jTextFieldSalario.setText("");
        jTextFieldTitulacao.setText("");
        jTextFieldPesquisa.setText("");
    }
    
    private Professor criarEntidade(){
        Professor entidade = new Professor();
        if(!"".equals(jTextFieldSalario.getText())){
            entidade.setCpf(jTextFieldCpf.getText());
            entidade.setNome(jTextFieldNome.getText());
            entidade.setSalario(Double.valueOf(jTextFieldSalario.getText()));
            entidade.setTitulacao(jTextFieldTitulacao.getText());
            entidade.setPesquisa(jTextFieldPesquisa.getText());
            
        }else{
            Double salario = 0.0;
            entidade.setSalario(salario);
            
            entidade.setCpf(jTextFieldCpf.getText());
            entidade.setNome(jTextFieldNome.getText());
            entidade.setTitulacao(jTextFieldTitulacao.getText());
            entidade.setPesquisa(jTextFieldPesquisa.getText());
            
        }
        return entidade;
    }
    

    /** Creates new form JDialogCadastroProfessor */
    public JDialogCadastroProfessor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        jTextFieldCpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSalario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTitulacao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonLimpar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonIncluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Professor");

        jLabel1.setText("CPF");

        jTextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCpfActionPerformed(evt);
            }
        });
        jTextFieldCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCpfKeyTyped(evt);
            }
        });

        jLabel2.setText("Nome");

        jTextFieldNome.setMaximumSize(new java.awt.Dimension(27, 15));
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyTyped(evt);
            }
        });

        jLabel3.setText("Salario");

        jTextFieldSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalarioActionPerformed(evt);
            }
        });
        jTextFieldSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSalarioKeyTyped(evt);
            }
        });

        jLabel4.setText("Titulação");

        jTextFieldTitulacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitulacaoActionPerformed(evt);
            }
        });
        jTextFieldTitulacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTitulacaoKeyTyped(evt);
            }
        });

        jLabel5.setText("Area de Pesquisa");

        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });
        jTextFieldPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisaKeyTyped(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonIncluir.setText("Incluir");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextFieldNome, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel1)
                            .add(jLabel2)
                            .add(jLabel3)
                            .add(jLabel4)
                            .add(jLabel5)
                            .add(jTextFieldPesquisa)
                            .add(jTextFieldTitulacao)
                            .add(jTextFieldSalario, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .add(jTextFieldCpf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 127, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(jButtonLimpar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 31, Short.MAX_VALUE)
                        .add(jButtonConsultar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButtonIncluir)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButtonAlterar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButtonExcluir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextFieldCpf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextFieldNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextFieldSalario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextFieldTitulacao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextFieldPesquisa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 45, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonLimpar)
                    .add(jButtonConsultar)
                    .add(jButtonIncluir)
                    .add(jButtonAlterar)
                    .add(jButtonExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCpfActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalarioActionPerformed

    private void jTextFieldTitulacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitulacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTitulacaoActionPerformed

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

////////////////////////////////////////////////////////////////////////////////////////////////
    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limparFormulario();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        ProfessorBO bo = new ProfessorBO();
        try {
            Professor entidade = criarEntidade();
            bo.consultar(entidade);
            popularFormulario(entidade);
            
        }catch (NegocioException e){
            if(e.getCause()==null){
                JOptionPane.showMessageDialog(this,e.getMessage(),"Mensagem",
                    JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this,e.getMessage(),"Mensagem",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        ProfessorBO bo = new ProfessorBO();
        try {
            Professor entidade  = criarEntidade();
            bo.inserir(entidade);
            JOptionPane.showMessageDialog(this, "Professor cadastrado com sucesso!",
                    "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            limparFormulario();
        } catch (NegocioException e){
            if(e.getCause()==null){
                JOptionPane.showMessageDialog(this,e.getMessage(),"Mensagem",
                        JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this,e.getMessage(),"Mensagem",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        ProfessorBO bo = new ProfessorBO();
        try {
            Professor entidade = criarEntidade();
            bo.alterar(entidade);
            JOptionPane.showMessageDialog(this, "Cadastro alterado com sucesso!",
                    "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            limparFormulario();
        } catch (NegocioException e){
            if(e.getCause()==null){
                JOptionPane.showMessageDialog(this,e.getMessage(),"Mensagem",
                        JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this,e.getMessage(),"Mensagem",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        ProfessorBO bo = new ProfessorBO();
        try {
            Professor entidade = criarEntidade();
            bo.excluir(entidade);
            JOptionPane.showMessageDialog(this, "Professor excluido com sucesso!",
                    "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            limparFormulario();
        } catch (NegocioException e){
            if(e.getCause()==null){
                JOptionPane.showMessageDialog(this,e.getMessage(),"Mensagem",
                        JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this,e.getMessage(),"Mensagem",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed
////////////////////////////////////////////////////////////////////////////////////////////////
    private void jTextFieldCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCpfKeyTyped
        char TestChar=evt.getKeyChar();
        if(!(Character.isDigit(TestChar)))
            evt.consume();
    }//GEN-LAST:event_jTextFieldCpfKeyTyped

    private void jTextFieldNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyTyped
        char TestChar=evt.getKeyChar();
        if(!(Character.isAlphabetic(TestChar)||Character.isSpaceChar(TestChar)))
            evt.consume();
    }//GEN-LAST:event_jTextFieldNomeKeyTyped

    private void jTextFieldSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSalarioKeyTyped
        
    }//GEN-LAST:event_jTextFieldSalarioKeyTyped

    private void jTextFieldTitulacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTitulacaoKeyTyped
        char TestChar=evt.getKeyChar();
        if(!(Character.isAlphabetic(TestChar)||Character.isSpaceChar(TestChar)))
            evt.consume();
    }//GEN-LAST:event_jTextFieldTitulacaoKeyTyped

    private void jTextFieldPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaKeyTyped
        char TestChar=evt.getKeyChar();
        if(!(Character.isAlphabetic(TestChar)||Character.isSpaceChar(TestChar)))
            evt.consume();
    }//GEN-LAST:event_jTextFieldPesquisaKeyTyped

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
            java.util.logging.Logger.getLogger(JDialogCadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogCadastroProfessor dialog = new JDialogCadastroProfessor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldSalario;
    private javax.swing.JTextField jTextFieldTitulacao;
    // End of variables declaration//GEN-END:variables

}
