package view;

import dao.FilmeDAO;
import javax.swing.JOptionPane;
import model.Filme;
import table.FilmeTableModel;

/**
 *
 * @author Fernando Xavier
 */
public class FilmeView extends javax.swing.JFrame {
    
    Filme flm = new Filme();
    FilmeDAO flmd = new FilmeDAO();

    public FilmeView() {
        initComponents();
        setLocationRelativeTo(null);
        tbFilme.setModel(new FilmeTableModel(new FilmeDAO().listarTodos()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        tabFilme = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        tfTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfGenero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfProdutora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfDiretor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfAno = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFilme = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        tfPesquisarDescricao = new javax.swing.JTextField();
        tabPropriedades = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lbLinhas = new javax.swing.JLabel();
        btEsvaziarTabela = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabFilme.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabFilmeAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel1.setText("Id:");

        jLabel2.setText("Título:");

        jLabel3.setText("Genero:");

        jLabel4.setText("Produtora:");

        jLabel5.setText("Diretor:");

        jLabel6.setText("Ano:");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfDiretor, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(tfProdutora)
                                .addComponent(tfTitulo)
                                .addComponent(tfGenero)
                                .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btInserir)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfProdutora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btExcluir)
                    .addComponent(btInserir)
                    .addComponent(btAtualizar))
                .addContainerGap())
        );

        tbFilme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFilmeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbFilme);

        jLabel7.setText("Persquisar (Descrição, Id)");

        tfPesquisarDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisarDescricaoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout tabFilmeLayout = new javax.swing.GroupLayout(tabFilme);
        tabFilme.setLayout(tabFilmeLayout);
        tabFilmeLayout.setHorizontalGroup(
            tabFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabFilmeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tabFilmeLayout.createSequentialGroup()
                        .addGroup(tabFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(tfPesquisarDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabFilmeLayout.setVerticalGroup(
            tabFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabFilmeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPesquisarDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tabs.addTab("Filme", tabFilme);

        tabPropriedades.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabPropriedadesAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Propriedades"));

        jLabel8.setText("Quantidade de Registros");

        lbLinhas.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbLinhas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btEsvaziarTabela.setText("Esvaziar Tabela");
        btEsvaziarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEsvaziarTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabPropriedadesLayout = new javax.swing.GroupLayout(tabPropriedades);
        tabPropriedades.setLayout(tabPropriedadesLayout);
        tabPropriedadesLayout.setHorizontalGroup(
            tabPropriedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPropriedadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPropriedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEsvaziarTabela))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        tabPropriedadesLayout.setVerticalGroup(
            tabPropriedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPropriedadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEsvaziarTabela)
                .addContainerGap(341, Short.MAX_VALUE))
        );

        tabs.addTab("Propriedades", tabPropriedades);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu1.setText("Menu");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tbFilme.setModel(new FilmeTableModel(new FilmeDAO().listarTodos()));
        tfId.setText("");
        tfTitulo.setText("");
        tfGenero.setText("");
        tfProdutora.setText("");
        tfDiretor.setText("");
        tfAno.setText("");
        tfPesquisarDescricao.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        
        if (tfTitulo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de Título!");
        } else { 
            flm.setId(Integer.parseInt(tfId.getText()));
            flm.setTitulo(tfTitulo.getText());
            flm.setGenero(tfGenero.getText());
            flm.setProdutora(tfProdutora.getText());
            flm.setDiretor(tfDiretor.getText());
            flm.setAno(tfAno.getText());
            flmd.inserir(flm);
        }
        
        tbFilme.setModel(new FilmeTableModel(new FilmeDAO().listarTodos()));
        tfId.setText("");
        tfTitulo.setText("");
        tfGenero.setText("");
        tfProdutora.setText("");
        tfDiretor.setText("");
        tfAno.setText("");
        tfPesquisarDescricao.setText("");
    }//GEN-LAST:event_btInserirActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        if (tfTitulo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de Título!");
        } else { 
            flm.setTitulo(tfTitulo.getText());
            flm.setGenero(tfGenero.getText());
            flm.setProdutora(tfProdutora.getText());
            flm.setDiretor(tfDiretor.getText());
            flm.setAno(tfAno.getText());
            flm.setId(Integer.parseInt(tfId.getText()));
            flmd.alterar(flm);
            JOptionPane.showMessageDialog(null, "Filme atualizado com sucesso!");
        }
        
        tbFilme.setModel(new FilmeTableModel(new FilmeDAO().listarTodos()));
        tfId.setText("");
        tfTitulo.setText("");
        tfGenero.setText("");
        tfProdutora.setText("");
        tfDiretor.setText("");
        tfAno.setText("");
        tfPesquisarDescricao.setText("");
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void tbFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFilmeMouseClicked
        tfId.setText(tbFilme.getValueAt(tbFilme.getSelectedRow(), FilmeTableModel.COL_ID).toString());   
        tfTitulo.setText(tbFilme.getValueAt(tbFilme.getSelectedRow(), FilmeTableModel.COL_TITULO).toString());   
        tfGenero.setText(tbFilme.getValueAt(tbFilme.getSelectedRow(), FilmeTableModel.COL_GENERO).toString());
        tfProdutora.setText(tbFilme.getValueAt(tbFilme.getSelectedRow(), FilmeTableModel.COL_PRODUTORA).toString());
        tfDiretor.setText(tbFilme.getValueAt(tbFilme.getSelectedRow(), FilmeTableModel.COL_DIRETOR).toString());
        tfAno.setText(tbFilme.getValueAt(tbFilme.getSelectedRow(), FilmeTableModel.COL_ANO).toString());
    }//GEN-LAST:event_tbFilmeMouseClicked

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int id = Integer.parseInt(tfId.getText());
        flmd.excluir(id);
        tbFilme.setModel(new FilmeTableModel(new FilmeDAO().listarTodos()));
        tfId.setText("");
        tfTitulo.setText("");
        tfGenero.setText("");
        tfProdutora.setText("");
        tfDiretor.setText("");
        tfAno.setText("");
        tfPesquisarDescricao.setText("");
    }//GEN-LAST:event_btExcluirActionPerformed

    private void tfPesquisarDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarDescricaoKeyReleased
        String pesquisa = tfPesquisarDescricao.getText();
        tbFilme.setModel(new FilmeTableModel(new FilmeDAO().listarTodosDescricao(pesquisa)));
    }//GEN-LAST:event_tfPesquisarDescricaoKeyReleased

    private void btEsvaziarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEsvaziarTabelaActionPerformed
        flmd.esvaziarTabela();
        int textNumRegistros = 0;
        textNumRegistros = flmd.getNumRegistros();
        System.out.print(textNumRegistros);
        lbLinhas.setText(Integer.toString(textNumRegistros));
    }//GEN-LAST:event_btEsvaziarTabelaActionPerformed

    private void tabPropriedadesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabPropriedadesAncestorAdded
        int textNumRegistros = 0;
        textNumRegistros = flmd.getNumRegistros();
        System.out.print(textNumRegistros);
        lbLinhas.setText(Integer.toString(textNumRegistros));
    }//GEN-LAST:event_tabPropriedadesAncestorAdded

    private void tabFilmeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabFilmeAncestorAdded
        tbFilme.setModel(new FilmeTableModel(new FilmeDAO().listarTodos()));
    }//GEN-LAST:event_tabFilmeAncestorAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btEsvaziarTabela;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLinhas;
    private javax.swing.JPanel tabFilme;
    private javax.swing.JPanel tabPropriedades;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbFilme;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfDiretor;
    private javax.swing.JTextField tfGenero;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfPesquisarDescricao;
    private javax.swing.JTextField tfProdutora;
    private javax.swing.JTextField tfTitulo;
    // End of variables declaration//GEN-END:variables
}
