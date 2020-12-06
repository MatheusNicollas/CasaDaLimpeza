package visao;

import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Fornecedor;
import modelo.FornecedorDAO;
import modelo.Produto;
import modelo.ProdutoDAO;
import modelo.SomenteNumeros;
import modelo.SomenteNumerosComPonto;

public class ListarFornecedor extends javax.swing.JFrame {

    public ListarFornecedor() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        listar();
    }
    
    public void listar(){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        ArrayList<Fornecedor> lista = new ArrayList<Fornecedor>();
        Fornecedor p = new Fornecedor();
        FornecedorDAO fDAO = new FornecedorDAO();

        try {
            lista = fDAO.listar();
        } catch (Exception ex) {
            Logger.getLogger(ListarProduto.class.getName()).log(Level.SEVERE, null, "erro ao listar " + ex);
        }

        modelo.setNumRows(0);

        for (Fornecedor f : lista) {

            
            modelo.addRow(new Object[]{
                f.getIdFornecedor(),
                f.getNome(),                
                f.getTelefone(),
                f.getEndereco(),
                f.getEmail()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        labelNome = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        limpar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        labelBuscar = new javax.swing.JLabel();
        busca = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        desabilitar = new javax.swing.JButton();
        telefone = new javax.swing.JFormattedTextField();
        labelEndereco = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
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

        tabela.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone", "Endereço", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        labelNome.setText("Nome:");

        nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        labelTelefone.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        labelTelefone.setText("Telefone:");

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedores.png"))); // NOI18N
        labelTitulo.setText("Fornecedores");

        limpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/limpar.png"))); // NOI18N
        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        alterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        alterar.setText("Habilitar Alteração");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        cadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedores.png"))); // NOI18N
        cadastrar.setText("Cadastrar Novo Fornecedor");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        excluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lixeira.png"))); // NOI18N
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        labelBuscar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelBuscar.setText("Buscar:");

        busca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaActionPerformed(evt);
            }
        });

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        atualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/refresh.png"))); // NOI18N
        atualizar.setText("Atualizar");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        salvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        desabilitar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        desabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        desabilitar.setText("Desabilitar Alteração");
        desabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desabilitarActionPerformed(evt);
            }
        });

        try {
            telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneActionPerformed(evt);
            }
        });

        labelEndereco.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        labelEndereco.setText("Endereço:");

        endereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoActionPerformed(evt);
            }
        });

        labelEmail.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        labelEmail.setText("E-mail: (Opcional)");

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/home.png"))); // NOI18N
        inicio.setText("Início");
        inicio.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desabilitar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alterar)
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endereco))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 1071, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelBuscar)
                    .addComponent(busca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNome)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(telefone)
                        .addComponent(labelTelefone)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelTitulo)
                    .addContainerGap(455, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarFuncionarioActionPerformed

        new CadastrarFuncionario().setVisible(true);
    }//GEN-LAST:event_menuCadastrarFuncionarioActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        dispose();
        new TelaPrincipal().setVisible(true);
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

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        nome.setText("");
        telefone.setText("");
        endereco.setText("");
        email.setText("");
    }//GEN-LAST:event_limparActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed

    }//GEN-LAST:event_alterarActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed

    }//GEN-LAST:event_cadastrarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed

    }//GEN-LAST:event_excluirActionPerformed

    private void buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed

    }//GEN-LAST:event_atualizarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked

    }//GEN-LAST:event_tabelaMouseClicked

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed

       
    }//GEN-LAST:event_salvarActionPerformed

    private void desabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desabilitarActionPerformed
        


    }//GEN-LAST:event_desabilitarActionPerformed

    private void inicioMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_inicioMenuSelected
              
    }//GEN-LAST:event_inicioMenuSelected

    private void inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseClicked
        new TelaPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_inicioMouseClicked

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        
    }//GEN-LAST:event_buscarActionPerformed

    private void telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneActionPerformed

    private void enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

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
            java.util.logging.Logger.getLogger(ListarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarFornecedor().setVisible(true);
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
    private javax.swing.JButton alterar;
    private javax.swing.JButton atualizar;
    private javax.swing.JTextField busca;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton desabilitar;
    private javax.swing.JTextField email;
    private javax.swing.JTextField endereco;
    private javax.swing.JButton excluir;
    private javax.swing.JMenu inicio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JButton limpar;
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
    private javax.swing.JTextField nome;
    private javax.swing.JButton salvar;
    private javax.swing.JMenu sobre;
    private javax.swing.JTable tabela;
    private javax.swing.JFormattedTextField telefone;
    // End of variables declaration//GEN-END:variables
}
