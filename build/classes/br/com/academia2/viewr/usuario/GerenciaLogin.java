/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academia2.viewr.usuario;

import academia2.HibernateUtil;
import br.com.academia2.model.Modelotriceps;
import br.com.academia2.viewr.treinos.Biceps;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Antonio Rony
 */
public class GerenciaLogin extends javax.swing.JDialog {

    private DefaultTableModel tmResultSet = new DefaultTableModel(null, new String[]{"ID", "NOME", "USUARIO", "SENHA"});
    ;
  java.util.List<br.com.academia2.model.Login> resultado;
    private ListSelectionModel lsmResult;
    private DefaultTableModel tabela;
    private int idDescricaoControle;

    //---------------------
//excercicios----------
    /**
     * Creates new form GerenciaLogin
     */
    public GerenciaLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTSenha = new javax.swing.JTextField();
        jBAdicionar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);          lsmResult = jTable1.getSelectionModel();          lsmResult.addListSelectionListener(new ListSelectionListener() {               public void valueChanged(ListSelectionEvent e) {                                        if (! e.getValueIsAdjusting()){                           jTTabelaLinhaSelecionada(jTable1);                       }                                    }          });
        jBExcluir = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOME:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SENHA:");

        jBAdicionar.setBackground(new Color(0,0,0,1));
        jBAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/academia2/icone/add_icon.png"))); // NOI18N
        jBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarActionPerformed(evt);
            }
        });

        jButton4.setBackground(new Color(0,0,0,1));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/academia2/icone/pesquisa.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(tmResultSet);
        jScrollPane1.setViewportView(jTable1);

        jBExcluir.setBackground(new Color(0,0,0,1));
        jBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/academia2/icone/remove.png"))); // NOI18N
        jBExcluir.setPreferredSize(new java.awt.Dimension(65, 36));
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBEditar.setBackground(new Color(0,0,0,1));
        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/academia2/icone/EDITAR.png"))); // NOI18N
        jBEditar.setPreferredSize(new java.awt.Dimension(65, 35));
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(jBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(532, 416));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarActionPerformed
        salvar();       // TODO add your handling code here:
    }//GEN-LAST:event_jBAdicionarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        buscar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Realmente Deseja Excluir?");
        if (confirm == 0) {
            excluir();
        } else {

        }         // TODO add your handling code here:
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Realmente Deseja Alterar?");
        if (confirm == 0) {
            editar();
        } else {

        }         // TODO add your handling code here:
    }//GEN-LAST:event_jBEditarActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GerenciaLogin dialog = new GerenciaLogin(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBAdicionar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTSenha;
    private javax.swing.JTextField jTUsuario;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

    private void salvar() {
        //cadencia e divt são Strings.
        br.com.academia2.model.Login login = new br.com.academia2.model.Login();
        login.setNome(jTNome.getText());
        login.setUsuario(jTUsuario.getText());
        login.setSenha(jTSenha.getText());

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(login);
        session.getTransaction().commit();
        JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso.");
        jTNome.setText("");
        buscar();
        limparCampos();
        session.clear();

    }

    private void buscar() {
        tabela = (DefaultTableModel) jTable1.getModel();
        tabela.setNumRows(0);
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        //PESQUISA COM SQLQUERY E JOIN MAIS TRANSFORMACAO EM LISTA DO HIBERNATE.
        SQLQuery query = sesion.createSQLQuery("select*from login");
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        java.util.List results = query.list();
        for (Object object : results) {

            Map row = (Map) object;
            tmResultSet.addRow(new Object[]{
                row.get("id"),
                row.get("nome"),
                row.get("usuario"),
                row.get("senha")
            });
        }
        jBAdicionar.setEnabled(true);

    }

    private void jTTabelaLinhaSelecionada(JTable tabela) {
        if (jTable1.getSelectedRow() != -1) {
            String cod = (jTable1.getValueAt(jTable1.getSelectedRow(), 0)).toString();
            this.idDescricaoControle = Integer.parseInt(cod);
            jTNome.setText((jTable1.getValueAt(jTable1.getSelectedRow(), 1)).toString());
            jTUsuario.setText((jTable1.getValueAt(jTable1.getSelectedRow(), 2)).toString());
            jTSenha.setText((jTable1.getValueAt(jTable1.getSelectedRow(), 3)).toString());
            // jTMarca.setText(nomeMarca);
            habilidatos();
            jBAdicionar.setEnabled(false);
        }

    }

    public void desabilitados() {
        jBEditar.setEnabled(false);
        jBExcluir.setEnabled(false);
    }

    public void habilidatos() {
        jBEditar.setEnabled(true);
        jBExcluir.setEnabled(true);
    }

    private void editar() {
        br.com.academia2.model.Login login = new br.com.academia2.model.Login();
        login.setNome(jTNome.getText());
        login.setUsuario(jTUsuario.getText());
        login.setSenha(jTSenha.getText());
        login.setId(this.idDescricaoControle);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(login);
        session.getTransaction().commit();
        JOptionPane.showMessageDialog(rootPane, "Editado com sucesso.");
        jTNome.setText("");
        buscar();
        limparCampos();
        session.clear();
        jBAdicionar.setEnabled(true);

    }

    private void excluir() {
        br.com.academia2.model.Login login = new br.com.academia2.model.Login();
        login.setNome(jTNome.getText());
        login.setUsuario(jTUsuario.getText());
        login.setSenha(jTSenha.getText());
        login.setId(this.idDescricaoControle);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(login);
        session.getTransaction().commit();
        JOptionPane.showMessageDialog(rootPane, "Excluido com sucesso.");
        jTNome.setText("");
        buscar();
        limparCampos();
        session.clear();
        jBAdicionar.setEnabled(true);

    }
//limpar campos

    public void limparCampos() {
        jTNome.setText("");
        jTUsuario.setText("");
        jTSenha.setText("");

        jTextField8.setText("");
    }
}