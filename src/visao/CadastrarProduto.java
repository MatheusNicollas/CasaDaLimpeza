package visao;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Fornecedor;
import modelo.FornecedorDAO;
import modelo.Produto;
import modelo.ProdutoDAO;
import modelo.SomenteNumeros;
import modelo.SomenteNumerosComPonto;

public class CadastrarProduto extends javax.swing.JFrame {

    public CadastrarProduto() {
        initComponents();
        quantidade.setDocument(new SomenteNumeros());
        precoDeCompra.setDocument(new SomenteNumerosComPonto());
        precoDeVenda.setDocument(new SomenteNumerosComPonto());
        popularFornecedor();
        
    }
    
    public void popularFornecedor(){
        ArrayList<Fornecedor> lista = new ArrayList<Fornecedor>();
        FornecedorDAO fDAO = new FornecedorDAO();
        
        try {
            lista = fDAO.listar();
        } catch (Exception ex) {
            Logger.getLogger(CadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Fornecedor f : lista){
            fornecedor.addItem(f.getNome());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        labelPrecoDeCompra = new javax.swing.JLabel();
        precoDeCompra = new javax.swing.JTextField();
        reais = new javax.swing.JLabel();
        labelFornecedor = new javax.swing.JLabel();
        fornecedor = new javax.swing.JComboBox<>();
        labelQuantidade = new javax.swing.JLabel();
        quantidade = new javax.swing.JTextField();
        labelPrecoDeVenda = new javax.swing.JLabel();
        reais1 = new javax.swing.JLabel();
        precoDeVenda = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        cancelar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        cadastrar_fornecedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Casa da Limpeza");

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addProdutoMini.png"))); // NOI18N
        labelTitulo.setText("Cadastro de Produto");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Produto:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNome.setText("Nome:");

        labelPrecoDeCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPrecoDeCompra.setText("Preço de Compra:");

        reais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reais.setText("R$");

        labelFornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelFornecedor.setText("Fornecedor:");

        fornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Fornecedor" }));
        fornecedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fornecedorItemStateChanged(evt);
            }
        });

        labelQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelQuantidade.setText("Quantidade:");

        labelPrecoDeVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPrecoDeVenda.setText("Preço de Venda:");

        reais1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reais1.setText("R$");

        labelDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDescricao.setText("Descrição: (Opcional)");

        descricao.setColumns(20);
        descricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descricao.setRows(5);
        jScrollPane1.setViewportView(descricao);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome)
                    .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(quantidade)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(reais, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precoDeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reais1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precoDeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelPrecoDeCompra)
                        .addGap(65, 65, 65)
                        .addComponent(labelPrecoDeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fornecedor, 0, 238, Short.MAX_VALUE)
                    .addComponent(labelFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(labelDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(labelQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrecoDeCompra)
                    .addComponent(labelPrecoDeVenda)
                    .addComponent(labelFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precoDeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reais)
                    .addComponent(reais1)
                    .addComponent(precoDeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        limpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/limpar.png"))); // NOI18N
        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        cadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/correto.png"))); // NOI18N
        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        cadastrar_fornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastrar_fornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedores.png"))); // NOI18N
        cadastrar_fornecedor.setText("Cadastrar um Novo Fornecedor");
        cadastrar_fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_fornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastrar_fornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limpar)
                .addGap(4, 4, 4)
                .addComponent(cadastrar)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(843, 843, 843))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        nome.setText("");
        quantidade.setText("");
        precoDeCompra.setText("");
        precoDeVenda.setText("");
        descricao.setText("");
        fornecedor.setSelectedItem("Selecione um Fornecedor");
    }//GEN-LAST:event_limparActionPerformed

    private void cadastrar_fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_fornecedorActionPerformed
        CadastrarFornecedor fornecedor = new CadastrarFornecedor();
        fornecedor.setVisible(true);
    }//GEN-LAST:event_cadastrar_fornecedorActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        
        ProdutoDAO pDAO = new ProdutoDAO();
    
        int quantidadeNomes = 0;
        
        try {
            quantidadeNomes = pDAO.quantidadeDeNomes(nome.getText());
            
        } catch (Exception ex) {
            Logger.getLogger(CadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (nome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Nome é obrigatório!", "Erro ao cadastrar", JOptionPane.ERROR_MESSAGE);
        }else if(quantidade.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo Quantidade é obrigatório!", "Erro ao cadastrar", JOptionPane.ERROR_MESSAGE);
        }else if(precoDeCompra.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo Preço de Compra é obrigatório!", "Erro ao cadastrar", JOptionPane.ERROR_MESSAGE);
        }else if(precoDeVenda.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo Preço de Venda é obrigatório!", "Erro ao cadastrar", JOptionPane.ERROR_MESSAGE);
        }else if(fornecedor.getSelectedItem().equals("Selecione um Fornecedor")){
            JOptionPane.showMessageDialog(null, "O campo Fornecedor é obrigatório!", "Erro ao cadastrar", JOptionPane.ERROR_MESSAGE);
        }else if(quantidadeNomes>=1){
            JOptionPane.showMessageDialog(null, "Já existe um Produto cadastrado com esse nome, tente adicionar mais informaçõe ao campo nome", "Erro ao cadastrar", JOptionPane.ERROR_MESSAGE);
        }else{
            
            Produto p = new Produto();
            Fornecedor f = new Fornecedor();
            FornecedorDAO fDAO = new FornecedorDAO();
            
             try {
                f = fDAO.buscaPorNome((String) fornecedor.getSelectedItem());
            } catch (Exception ex) {
                Logger.getLogger(CadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            p.setNome(nome.getText());
            p.setDescricao(descricao.getText());
            p.setQuantidade(Integer.parseInt(quantidade.getText()));
            p.setPreco_de_compra(Double.parseDouble(precoDeCompra.getText()));
            p.setPreco_de_venda(Double.parseDouble(precoDeVenda.getText()));
            
            f.setIdFornecedor(f.getIdFornecedor());
            p.setFornecedor(f);
            
            try {
                pDAO.inserir(p);
            } catch (Exception ex) {
                Logger.getLogger(CadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar o Produto (contacte o Desenvolvedor)", "Erro no Banco de Dados", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void fornecedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fornecedorItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_fornecedorItemStateChanged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProduto().setVisible(true);
            }
        });
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton cadastrar_fornecedor;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextArea descricao;
    private javax.swing.JComboBox<String> fornecedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelFornecedor;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPrecoDeCompra;
    private javax.swing.JLabel labelPrecoDeVenda;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField precoDeCompra;
    private javax.swing.JTextField precoDeVenda;
    private javax.swing.JTextField quantidade;
    private javax.swing.JLabel reais;
    private javax.swing.JLabel reais1;
    // End of variables declaration//GEN-END:variables
}
