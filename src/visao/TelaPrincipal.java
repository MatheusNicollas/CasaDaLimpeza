package visao;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        realziarVenda = new javax.swing.JButton();
        labelRealizarVenda = new javax.swing.JLabel();
        labelPrincipaisOp = new javax.swing.JLabel();
        cadastrarProsuto = new javax.swing.JButton();
        labelCadastrarProduto = new javax.swing.JLabel();
        listarProdutos = new javax.swing.JButton();
        labelListarProdutos = new javax.swing.JLabel();
        extratos = new javax.swing.JButton();
        labelExtratos = new javax.swing.JLabel();
        visualizaClientes = new javax.swing.JButton();
        labelExtratos1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelRodaPe = new javax.swing.JLabel();
        cadaDaLimpezaLogo = new javax.swing.JLabel();
        labelBemVindo = new javax.swing.JLabel();
        nomeFunc = new javax.swing.JLabel();
        cargo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        inicio = new javax.swing.JMenu();
        menuVendas = new javax.swing.JMenu();
        menuRealizarVenda = new javax.swing.JMenuItem();
        menuVendasEfetuadas = new javax.swing.JMenuItem();
        menuExtrato = new javax.swing.JMenuItem();
        menuFuncionarios = new javax.swing.JMenu();
        menuConfigMinhaConta = new javax.swing.JMenuItem();
        menuCadastrarFuncionario = new javax.swing.JMenuItem();
        menuVizualizarFuncCadastrados = new javax.swing.JMenuItem();
        menuProdutos = new javax.swing.JMenu();
        menuCadastrarProdutos = new javax.swing.JMenuItem();
        menuVisualizarEstoque = new javax.swing.JMenuItem();
        menuFornecedores = new javax.swing.JMenu();
        menuCadastrarFonecedor = new javax.swing.JMenuItem();
        menuVisualizarFornecedores = new javax.swing.JMenuItem();
        menuCadastrarClientes = new javax.swing.JMenu();
        menuCadastrarCliente1 = new javax.swing.JMenuItem();
        menuVisualizarClientesCadastrados = new javax.swing.JMenuItem();
        sobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Casa da Limpeza");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));

        realziarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carrinho.png"))); // NOI18N
        realziarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realziarVendaActionPerformed(evt);
            }
        });

        labelRealizarVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelRealizarVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRealizarVenda.setText("Realizar Venda");

        labelPrincipaisOp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPrincipaisOp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPrincipaisOp.setText("Principais Operações");

        cadastrarProsuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addProduto.png"))); // NOI18N
        cadastrarProsuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProsutoActionPerformed(evt);
            }
        });

        labelCadastrarProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCadastrarProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCadastrarProduto.setText("Cadastrar Produto");

        listarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lista.png"))); // NOI18N
        listarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarProdutosActionPerformed(evt);
            }
        });

        labelListarProdutos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelListarProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelListarProdutos.setText("Visualizar Produtos");

        extratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calc.png"))); // NOI18N
        extratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extratosActionPerformed(evt);
            }
        });

        labelExtratos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelExtratos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelExtratos.setText("Extratos");

        visualizaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clientes.png"))); // NOI18N
        visualizaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizaClientesActionPerformed(evt);
            }
        });

        labelExtratos1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelExtratos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelExtratos1.setText("Visualizar Clientes");

        jPanel2.setBackground(new java.awt.Color(187, 222, 251));

        labelRodaPe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelRodaPe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRodaPe.setText("Elizeu, Hellyson, Matheus Nícollas e Wendell ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelRodaPe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelRodaPe, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        cadaDaLimpezaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        labelBemVindo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBemVindo.setText("Bem Vindo(a):");

        nomeFunc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nomeFunc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeFunc.setText("Nome: Administrador");

        cargo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cargo.setText("Cargo: admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPrincipaisOp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cadaDaLimpezaLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelBemVindo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomeFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(realziarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cadastrarProsuto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(listarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(extratos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(visualizaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelRealizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelListarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelExtratos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelExtratos1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelPrincipaisOp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(realziarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(listarProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(extratos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(visualizaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cadastrarProsuto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRealizarVenda)
                    .addComponent(labelCadastrarProduto)
                    .addComponent(labelListarProdutos)
                    .addComponent(labelExtratos)
                    .addComponent(labelExtratos1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadaDaLimpezaLogo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelBemVindo)
                        .addGap(18, 18, 18)
                        .addComponent(nomeFunc)
                        .addGap(11, 11, 11)
                        .addComponent(cargo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/home.png"))); // NOI18N
        inicio.setText("Início");
        inicio.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
                inicioMenuCanceled(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                inicioMenuSelected(evt);
            }
        });
        inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioMouseClicked(evt);
            }
        });
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        jMenuBar1.add(inicio);

        menuVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/moedas.png"))); // NOI18N
        menuVendas.setText("Vendas");

        menuRealizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carrinhoMini.png"))); // NOI18N
        menuRealizarVenda.setText("Realizar Venda");
        menuVendas.add(menuRealizarVenda);

        menuVendasEfetuadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/deinheiroMini.png"))); // NOI18N
        menuVendasEfetuadas.setText("Vendas Efetuadas");
        menuVendas.add(menuVendasEfetuadas);

        menuExtrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calcMini.png"))); // NOI18N
        menuExtrato.setText("Extratos");
        menuVendas.add(menuExtrato);

        jMenuBar1.add(menuVendas);

        menuFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.png"))); // NOI18N
        menuFuncionarios.setText("Funcionários");

        menuConfigMinhaConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/config.png"))); // NOI18N
        menuConfigMinhaConta.setText("Configurar meu Perfil");
        menuFuncionarios.add(menuConfigMinhaConta);

        menuCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addFuncionario.png"))); // NOI18N
        menuCadastrarFuncionario.setText("Cadastrar Funcionário");
        menuCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarFuncionarioActionPerformed(evt);
            }
        });
        menuFuncionarios.add(menuCadastrarFuncionario);

        menuVizualizarFuncCadastrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listaMini.png"))); // NOI18N
        menuVizualizarFuncCadastrados.setText("Vizualizar Funcionários Cadastrados");
        menuVizualizarFuncCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVizualizarFuncCadastradosActionPerformed(evt);
            }
        });
        menuFuncionarios.add(menuVizualizarFuncCadastrados);

        jMenuBar1.add(menuFuncionarios);

        menuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos.png"))); // NOI18N
        menuProdutos.setText("Produtos");

        menuCadastrarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addProdutoMini.png"))); // NOI18N
        menuCadastrarProdutos.setText("Cadastrar Produtos");
        menuCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarProdutosActionPerformed(evt);
            }
        });
        menuProdutos.add(menuCadastrarProdutos);

        menuVisualizarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listaMini.png"))); // NOI18N
        menuVisualizarEstoque.setText("Visualizar Estoque de Produtos");
        menuVisualizarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVisualizarEstoqueActionPerformed(evt);
            }
        });
        menuProdutos.add(menuVisualizarEstoque);

        jMenuBar1.add(menuProdutos);

        menuFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedores.png"))); // NOI18N
        menuFornecedores.setText("Fornecedores");

        menuCadastrarFonecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addTicketMini.png"))); // NOI18N
        menuCadastrarFonecedor.setText("Cadastrar Fornecedor");
        menuCadastrarFonecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarFonecedorActionPerformed(evt);
            }
        });
        menuFornecedores.add(menuCadastrarFonecedor);

        menuVisualizarFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listaMini.png"))); // NOI18N
        menuVisualizarFornecedores.setText("Visualizar Fornocedores Cadastrados");
        menuFornecedores.add(menuVisualizarFornecedores);

        jMenuBar1.add(menuFornecedores);

        menuCadastrarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clientesMini.png"))); // NOI18N
        menuCadastrarClientes.setText("Clientes");

        menuCadastrarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addTeamMini.png"))); // NOI18N
        menuCadastrarCliente1.setText("Cadastrar Cliente");
        menuCadastrarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarCliente1ActionPerformed(evt);
            }
        });
        menuCadastrarClientes.add(menuCadastrarCliente1);

        menuVisualizarClientesCadastrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listaMini.png"))); // NOI18N
        menuVisualizarClientesCadastrados.setText("Visualisar Clientes Cadastrados");
        menuCadastrarClientes.add(menuVisualizarClientesCadastrados);

        jMenuBar1.add(menuCadastrarClientes);

        sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sobre.png"))); // NOI18N
        sobre.setText("Sobre");
        jMenuBar1.add(sobre);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void realziarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realziarVendaActionPerformed

    }//GEN-LAST:event_realziarVendaActionPerformed

    private void cadastrarProsutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProsutoActionPerformed
        
        new CadastrarProduto().setVisible(true);
        
    }//GEN-LAST:event_cadastrarProsutoActionPerformed

    private void listarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarProdutosActionPerformed
        new ListarProduto().setVisible(true);
        dispose();
    }//GEN-LAST:event_listarProdutosActionPerformed

    private void extratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extratosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_extratosActionPerformed

    private void visualizaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizaClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visualizaClientesActionPerformed

    private void menuCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarFuncionarioActionPerformed
        
        new CadastrarFuncionario().setVisible(true);
    }//GEN-LAST:event_menuCadastrarFuncionarioActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        new TelaPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_inicioActionPerformed

    private void menuCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarProdutosActionPerformed
        new CadastrarProduto().setVisible(true);
    }//GEN-LAST:event_menuCadastrarProdutosActionPerformed

    private void menuCadastrarFonecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarFonecedorActionPerformed
        
        new CadastrarFornecedor().setVisible(true);
        
    }//GEN-LAST:event_menuCadastrarFonecedorActionPerformed

    private void menuCadastrarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarCliente1ActionPerformed
       
        new CadastrarCliente().setVisible(true);
        
    }//GEN-LAST:event_menuCadastrarCliente1ActionPerformed

    private void menuVizualizarFuncCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVizualizarFuncCadastradosActionPerformed

        
    }//GEN-LAST:event_menuVizualizarFuncCadastradosActionPerformed

    private void menuVisualizarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVisualizarEstoqueActionPerformed
        ListarProduto lp = new ListarProduto();
        lp.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuVisualizarEstoqueActionPerformed

    private void inicioMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_inicioMenuSelected
  
    }//GEN-LAST:event_inicioMenuSelected

    private void inicioMenuCanceled(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_inicioMenuCanceled
        // TODO add your handling code here:
    }//GEN-LAST:event_inicioMenuCanceled

    private void inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseClicked
        new TelaPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_inicioMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
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
    private javax.swing.JLabel cadaDaLimpezaLogo;
    private javax.swing.JButton cadastrarProsuto;
    private javax.swing.JLabel cargo;
    private javax.swing.JButton extratos;
    private javax.swing.JMenu inicio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelBemVindo;
    private javax.swing.JLabel labelCadastrarProduto;
    private javax.swing.JLabel labelExtratos;
    private javax.swing.JLabel labelExtratos1;
    private javax.swing.JLabel labelListarProdutos;
    private javax.swing.JLabel labelPrincipaisOp;
    private javax.swing.JLabel labelRealizarVenda;
    private javax.swing.JLabel labelRodaPe;
    private javax.swing.JButton listarProdutos;
    private javax.swing.JMenuItem menuCadastrarCliente1;
    private javax.swing.JMenu menuCadastrarClientes;
    private javax.swing.JMenuItem menuCadastrarFonecedor;
    private javax.swing.JMenuItem menuCadastrarFuncionario;
    private javax.swing.JMenuItem menuCadastrarProdutos;
    private javax.swing.JMenuItem menuConfigMinhaConta;
    private javax.swing.JMenuItem menuExtrato;
    private javax.swing.JMenu menuFornecedores;
    private javax.swing.JMenu menuFuncionarios;
    private javax.swing.JMenu menuProdutos;
    private javax.swing.JMenuItem menuRealizarVenda;
    private javax.swing.JMenu menuVendas;
    private javax.swing.JMenuItem menuVendasEfetuadas;
    private javax.swing.JMenuItem menuVisualizarClientesCadastrados;
    private javax.swing.JMenuItem menuVisualizarEstoque;
    private javax.swing.JMenuItem menuVisualizarFornecedores;
    private javax.swing.JMenuItem menuVizualizarFuncCadastrados;
    private javax.swing.JLabel nomeFunc;
    private javax.swing.JButton realziarVenda;
    private javax.swing.JMenu sobre;
    private javax.swing.JButton visualizaClientes;
    // End of variables declaration//GEN-END:variables
}
