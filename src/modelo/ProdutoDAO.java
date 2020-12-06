package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ProdutoDAO extends DataBaseConnection{

    public void inserir(Produto p) throws Exception{
        conectar();
        
        String sql = "INSERT INTO produto (nome, descricao, quantidade, preco_de_compra, preco_de_venda, fornecedores_idFornecedores) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = conn.prepareCall(sql);
        pstm.setString(1, p.getNome());
        pstm.setString(2, p.getDescricao());
        pstm.setInt(3, p.getQuantidade());
        pstm.setDouble(4, p.getPreco_de_compra());
        pstm.setDouble(5, p.getPreco_de_venda());
        pstm.setInt(6, p.getFornecedor().getIdFornecedor());
        pstm.execute();
        
        ImageIcon imagem = new ImageIcon("src/imagens/correto.png");
        JOptionPane.showMessageDialog(null, "Produto Cadastrado com Sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE, imagem);
        
        desconectar();
    }
    
    public void update(Produto p) throws Exception{
        conectar();
        
        String sql = "UPDATE produto SET nome=?, descricao=?, quantidade=?, preco_de_compra=?, preco_de_venda=?, fornecedores_idFornecedores=? WHERE idProduto=?";
        PreparedStatement pstm = conn.prepareCall(sql);
        pstm.setString(1, p.getNome());
        pstm.setString(2, p.getDescricao());
        pstm.setInt(3, p.getQuantidade());
        pstm.setDouble(4, p.getPreco_de_compra());
        pstm.setDouble(5, p.getPreco_de_venda());
        pstm.setInt(6, p.getFornecedor().getIdFornecedor());
        pstm.setInt(7, p.getIdProduto());
        pstm.execute();
        
        ImageIcon imagem = new ImageIcon("src/imagens/correto.png");
        JOptionPane.showMessageDialog(null, "Produto Alterado com Sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE, imagem);
        
        desconectar();
    }
    
    public void deletar(int id) throws Exception{
        conectar();
        
        String sql = "DELETE FROM produto WHERE idProduto=?";
        PreparedStatement pstm = conn.prepareCall(sql);
        pstm.setInt(1, id);
        pstm.execute();
        
        ImageIcon imagem = new ImageIcon("src/imagens/correto.png");
        JOptionPane.showMessageDialog(null, "Produto Excluído com Sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE, imagem);
        
        desconectar();
    }

    public Produto buscaPorNome(String nome) throws Exception{
        conectar();
        
        Produto p = new Produto();
        String sql = "SELECT * FROM produto WHERE nome=?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, nome);
        ResultSet rs = pstm.executeQuery();
        if(rs.next()){
            p.setIdProduto(rs.getInt("idProduto"));
            p.setNome(rs.getString("nome"));
            p.setDescricao(rs.getString("descricao"));
            p.setQuantidade(rs.getInt("quantidade"));
            p.setPreco_de_compra(rs.getDouble("preco_de_compra"));
            p.setPreco_de_venda(rs.getDouble("Preco_de_venda"));
            FornecedorDAO fDAO = new FornecedorDAO();
            p.setFornecedor(fDAO.buscaPorId(rs.getInt("fornecedores_idFornecedores")));
        }
        
        desconectar();
        return p;
    }
    
    public ArrayList<Produto> pesquisar(String pesquisa) throws Exception{
        ArrayList<Produto> lista = new ArrayList<Produto>();
        conectar();
      
        Fornecedor f;
        FornecedorDAO fDAO = new FornecedorDAO();
        f = fDAO.buscaPorNome(pesquisa);
        String sql = "SELECT * FROM produto WHERE (nome LIKE ?) or (idProduto=?) or (fornecedores_idFornecedores=?)";
        PreparedStatement pstm = conn.prepareCall(sql);
        
        try{
            pstm.setString(1, null);
            pstm.setInt(2, Integer.parseInt(pesquisa));  
            pstm.setInt(3, f.getIdFornecedor());
        }catch(Exception ex){
            pstm.setString(1, "%"+pesquisa+"%");           
            pstm.setInt(2, 0); 
            pstm.setInt(3, f.getIdFornecedor());
        }
        
        ResultSet rs = pstm.executeQuery();
        
        while(rs.next()){
            Produto p = new Produto();
            p.setIdProduto(rs.getInt("idProduto"));
            p.setNome(rs.getString("nome"));
            p.setDescricao(rs.getString("descricao"));
            p.setQuantidade(rs.getInt("quantidade"));
            p.setPreco_de_compra(rs.getDouble("preco_de_compra"));
            p.setPreco_de_venda(rs.getDouble("preco_de_venda"));
            f = fDAO.buscaPorId(rs.getInt("fornecedores_idFornecedores"));
            p.setFornecedor(f);
            
            lista.add(p);
        }
        
        desconectar();
        return lista;
        
    }
    
    public int quantidadeDeNomes(String nome) throws Exception{
        conectar();

        String sql = "SELECT COUNT(*) FROM produto WHERE nome=?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, nome);
        ResultSet rs = pstm.executeQuery();
        int cont = 0;
        while(rs.next()){
            cont = rs.getInt(1);
        }
        
        desconectar();
        return cont;
    }
    
    public ArrayList<Produto> listarProduto() throws Exception {
        ArrayList<Produto> lista = new ArrayList<Produto>();
        this.conectar();
        String sql = "SELECT * FROM produto";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            Produto p = new Produto();
            p.setIdProduto(rs.getInt("idProduto"));
            p.setNome(rs.getString("nome"));
            p.setDescricao(rs.getString("descricao"));
            p.setQuantidade(rs.getInt("quantidade"));
            p.setPreco_de_compra(rs.getDouble("preco_de_compra"));
            p.setPreco_de_venda(rs.getDouble("preco_de_venda"));
            
            Fornecedor f = new Fornecedor();
            f.setIdFornecedor(rs.getInt("fornecedores_idFornecedores"));
            p.setFornecedor(f);
            
            lista.add(p);
        }
        this.desconectar();
        return lista;

    }
}
