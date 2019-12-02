/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academia2.viewr.modelo;

import academia2.HibernateUtil;
import br.com.academia2.model.Modelopeitorais;
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
 * @author anton
 */
public class ModeloTriceps extends javax.swing.JDialog {

    private DefaultTableModel tmResultSet = new DefaultTableModel(null, new String[]{"ID", "COD TREINO", "DESCRIÇÃO", "DIVT", "SERIE", "REPT", "INT. PONTO", "CADENCIA", "CARGA"});
    ;
  java.util.List<br.com.academia2.model.Modelotriceps> resultado;
    private ListSelectionModel lsmResult;
    private DefaultTableModel tabela;
    private int idDescricaoControle;
    //---------------------
//excercicios----------
    private int cod;
    private int descricao;
//---------------------

    /**
     * Creates new form ModeloTriceps
     */
    public ModeloTriceps(java.awt.Frame parent, boolean modal) {
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

        jPopExercicios = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jBAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);          lsmResult = jTable1.getSelectionModel();          lsmResult.addListSelectionListener(new ListSelectionListener() {               public void valueChanged(ListSelectionEvent e) {                                        if (! e.getValueIsAdjusting()){                           jTTabelaLinhaSelecionada(jTable1);                       }                                    }          });
        jBExcluir = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        divt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        serie = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rept = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        carga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        intponto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cadencia = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EXCERCICIO: ");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jBAdicionar.setBackground(new Color(0,0,0,1));
        jBAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/academia2/icone/add_icon.png"))); // NOI18N
        jBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DIV.T");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REPT:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SERIE:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CARGA:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("INT. PONTO: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CADENCIA:");

        jButton4.setBackground(new Color(0,0,0,1));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/academia2/icone/pesquisa.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(divt, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(intponto))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cadencia, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(serie))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rept, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(carga))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(divt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(rept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(intponto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cadencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(carga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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

        setSize(new java.awt.Dimension(542, 435));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        buscar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarActionPerformed
        salvar();        // TODO add your handling code here:
    }//GEN-LAST:event_jBAdicionarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Realmente Deseja Alterar?");
        if (confirm == 0) {
            editar();
        } else {

        }         // TODO add your handling code here:
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Realmente Deseja Excluir?");
        if (confirm == 0) {
            excluir();
        } else {

        }         // TODO add your handling code here:
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        try {
            buscaExercicio(evt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "VOCÊ AINDA NÃO CADASTROU \n NENHUM TREINO.");
            JOptionPane.showMessageDialog(this, e);

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyPressed

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
            java.util.logging.Logger.getLogger(ModeloTriceps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModeloTriceps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModeloTriceps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModeloTriceps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModeloTriceps dialog = new ModeloTriceps(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField cadencia;
    private javax.swing.JTextField carga;
    private javax.swing.JTextField divt;
    private javax.swing.JTextField intponto;
    private javax.swing.JButton jBAdicionar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopExercicios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField rept;
    private javax.swing.JTextField serie;
    // End of variables declaration//GEN-END:variables
private void pesquisaSelecionada(String text) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        int i = 1;

        Criteria crit = sesion.createCriteria(br.com.academia2.model.Triceps.class
        );
        crit.add(Restrictions.like("descricao", text + "%"));
        java.util.List results = crit.list();
        for (Iterator iterator = results.iterator(); iterator.hasNext();) {
            br.com.academia2.model.Triceps Sal = (br.com.academia2.model.Triceps) iterator.next();

            this.cod = Sal.getId();
            String codigo = String.valueOf(Sal.getId());
            JMenuItem item = new JMenuItem(codigo + "," + Sal.getDescricao());
            item.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    String mods = item.getText();
                    String campos[] = mods.split(",");
                    cod = Integer.parseInt(campos[0]);
                    jTextField1.setText(campos[1]);
                    System.out.println(cod);
                }
            });
            jPopExercicios.add(item);

        }

    }

    private void buscaExercicio(java.awt.event.KeyEvent evento) {
        if (evento.getKeyCode() == evento.VK_SPACE) {
            jPopExercicios.removeAll();
            pesquisaSelecionada(jTextField1.getText());
            jTextField1.add(jPopExercicios);
            jTextField1.setComponentPopupMenu(jPopExercicios);
            try {
                int dotPosition = jTextField1.getCaretPosition();
                Rectangle popupLocation = jTextField1.modelToView(dotPosition);
                jPopExercicios.show(jTextField1, popupLocation.x, popupLocation.y + 30);
                jTextField1.setFocusable(true);
            } catch (BadLocationException badLocationException) {
                System.out.println("Oops");
            }
        } else if (evento.getKeyCode() == evento.VK_F1) {
            new Biceps(null, true).setVisible(true);
        }
    }

    private void salvar() {
        //cadencia e divt são Strings.
        Modelotriceps modelo = new Modelotriceps();
        modelo.setCadencia(cadencia.getText());
        modelo.setCarga(Integer.parseInt(intponto.getText()));
        modelo.setDivt(divt.getText());
        modelo.setIdtriceps(cod);
        modelo.setIntponto(Integer.parseInt(intponto.getText()));
        modelo.setRept(Integer.parseInt(rept.getText()));
        modelo.setSerie(Integer.parseInt(serie.getText()));

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(modelo);
        session.getTransaction().commit();
        JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso.");
        jTextField1.setText("");
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
        SQLQuery query = sesion.createSQLQuery("select modelotriceps.id, modelotriceps.idtriceps, modelotriceps.divt, modelotriceps.serie, modelotriceps.rept, modelotriceps.carga,"
                + " modelotriceps.intponto, modelotriceps.cadencia, triceps.descricao from modelotriceps inner join triceps on modelotriceps.idtriceps = triceps.id");
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        java.util.List results = query.list();
        for (Object object : results) {

            Map row = (Map) object;
            tmResultSet.addRow(new Object[]{
                row.get("id"),
                row.get("idtriceps"),
                row.get("descricao"),
                row.get("divt"),
                row.get("serie"),
                row.get("rept"),
                row.get("intponto"),
                row.get("cadencia"),
                row.get("carga")
            });
        }
        jBAdicionar.setEnabled(true);

    }

    private void jTTabelaLinhaSelecionada(JTable tabela) {
        if (jTable1.getSelectedRow() != -1) {
            String cod = (jTable1.getValueAt(jTable1.getSelectedRow(), 0)).toString();
            this.idDescricaoControle = Integer.parseInt(cod);
            String codTreino = (jTable1.getValueAt(jTable1.getSelectedRow(), 1)).toString();
            this.cod = Integer.parseInt(codTreino);
            jTextField1.setText((jTable1.getValueAt(jTable1.getSelectedRow(), 2)).toString());
            divt.setText((jTable1.getValueAt(jTable1.getSelectedRow(), 3)).toString());
            serie.setText((jTable1.getValueAt(jTable1.getSelectedRow(), 4)).toString());
            rept.setText((jTable1.getValueAt(jTable1.getSelectedRow(), 5)).toString());
            intponto.setText((jTable1.getValueAt(jTable1.getSelectedRow(), 6)).toString());
            cadencia.setText((jTable1.getValueAt(jTable1.getSelectedRow(), 7)).toString());
            carga.setText((jTable1.getValueAt(jTable1.getSelectedRow(), 8)).toString());

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
        Modelotriceps modelo = new Modelotriceps();
        modelo.setCadencia(cadencia.getText());
        modelo.setCarga(Integer.parseInt(intponto.getText()));
        modelo.setDivt(divt.getText());
        modelo.setIdtriceps(cod);
        modelo.setIntponto(Integer.parseInt(intponto.getText()));
        modelo.setRept(Integer.parseInt(rept.getText()));
        modelo.setSerie(Integer.parseInt(serie.getText()));
        modelo.setId(idDescricaoControle);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(modelo);
        session.getTransaction().commit();
        JOptionPane.showMessageDialog(rootPane, "Editado com sucesso.");
        jTextField1.setText("");
        buscar();
        limparCampos();
        session.clear();
        jBAdicionar.setEnabled(true);

    }

    private void excluir() {
        Modelotriceps modelo = new Modelotriceps();
        modelo.setCadencia(cadencia.getText());
        modelo.setCarga(Integer.parseInt(intponto.getText()));
        modelo.setDivt(divt.getText());
        modelo.setIdtriceps(cod);
        modelo.setIntponto(Integer.parseInt(intponto.getText()));
        modelo.setRept(Integer.parseInt(rept.getText()));
        modelo.setSerie(Integer.parseInt(serie.getText()));
        modelo.setId(idDescricaoControle);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(modelo);
        session.getTransaction().commit();
        JOptionPane.showMessageDialog(rootPane, "Excluido com sucesso.");
        jTextField1.setText("");
        buscar();
        limparCampos();
        session.clear();
        jBAdicionar.setEnabled(true);

    }
//limpar campos

    public void limparCampos() {
        jTextField1.setText("");
        divt.setText("");
        serie.setText("");
        rept.setText("");
        intponto.setText("");
        intponto.setText("");
        cadencia.setText("");
        carga.setText("");
        jTextField8.setText("");
    }
}
