package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FornecedorDAO extends DataBaseConnection{

    public void inserir(Fornecedor f) throws Exception{
        this.conectar();
        
        String sql = "INSERT INTO fornecedores (nome, telefone, endereco, email) VALUES (?, ?, ?, ?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, f.getNome());
        pstm.setString(2, f.getTelefone());
        pstm.setString(3, f.getEndereco());
        pstm.setString(4, f.getEmail());
        pstm.execute();
        
        ImageIcon imagem = new ImageIcon("src/imagens/correto.png");
        JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado com Sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE, imagem);
        
        this.desconectar();        
    }
    
    public ArrayList<Fornecedor> listar() throws Exception{
        ArrayList<Fornecedor> lista = new ArrayList<Fornecedor>();
        conectar();
        
        String sql = "SELECT * FROM fornecedores";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
            Fornecedor f = new Fornecedor();
            f.setIdFornecedor(rs.getInt("idFornecedores"));
            f.setNome(rs.getString("nome"));
            f.setTelefone(rs.getString("telefone"));
            f.setEndereco(rs.getString("endereco"));
            f.setEmail(rs.getString("email"));
            lista.add(f);
        }
        
        desconectar();
        return lista;
    }
    
    public Fornecedor buscaPorNome(String nome) throws Exception{
        conectar();
        
        Fornecedor f = new Fornecedor();
        String sql = "SELECT * FROM fornecedores WHERE nome=?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, nome);
        ResultSet rs = pstm.executeQuery();
        if(rs.next()){
            f.setIdFornecedor(rs.getInt("idFornecedores"));
            f.setNome(rs.getString("nome"));
            f.setTelefone(rs.getString("telefone"));
            f.setEndereco(rs.getString("endereco"));
            f.setEmail(rs.getString("email"));
        }
        desconectar();
        return f;
    }
    
    public int quantidadeDeNomes(String nome) throws Exception{
        conectar();

        String sql = "SELECT COUNT(*) FROM fornecedores WHERE nome=?";
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
    
    public Fornecedor buscaPorId(int id) throws Exception{
        conectar();
        
        Fornecedor f = new Fornecedor();
        String sql = "SELECT * FROM fornecedores WHERE idFornecedores=?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        ResultSet rs = pstm.executeQuery();
        if(rs.next()){
            f.setIdFornecedor(rs.getInt("idFornecedores"));
            f.setNome(rs.getString("nome"));
            f.setTelefone(rs.getString("telefone"));
            f.setEndereco(rs.getString("endereco"));
            f.setEmail(rs.getString("email"));
        }
        
        desconectar();
        return f;
    }
    
}
