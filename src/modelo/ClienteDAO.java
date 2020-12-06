package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ClienteDAO extends DataBaseConnection{

    public void inserir(Cliente c) throws Exception{
        conectar();
        
        String sql = "INSERT INTO cliente (nome, telefone, endereco, cpf, pendencias) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, c.getNome());
        pstm.setString(2, c.getTelefone());
        pstm.setString(3, c.getEndereco());
        pstm.setString(4, c.getCpf());
        pstm.setInt(5, c.getPendencias());
        pstm.execute();
        
        ImageIcon imagem = new ImageIcon("src/imagens/correto.png");
        JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE, imagem);
        
        desconectar();
    }
    
    public Cliente buscaPorNome(String nome) throws Exception{
        conectar();
        
        Cliente c = new Cliente();
        String sql = "SELECT * FROM cliente WHERE nome=?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, nome);
        ResultSet rs = pstm.executeQuery();
        if(rs.next()){
            c.setIdCliente(rs.getInt("idCliente"));
            c.setNome(rs.getString("nome"));
            c.setTelefone(rs.getString("telefone"));
            c.setEndereco(rs.getString("endereco"));
            c.setCpf(rs.getString("cpf"));
            c.setPendencias(rs.getInt("pendencias"));
        }
        desconectar();
        return c;
    }
    
    public Cliente buscaPorCpf(String cpf) throws Exception{
        conectar();
        
        Cliente c = new Cliente();
        String sql = "SELECT * FROM cliente WHERE cpf=?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, cpf);
        ResultSet rs = pstm.executeQuery();
        if(rs.next()){
            c.setIdCliente(rs.getInt("idCliente"));
            c.setNome(rs.getString("nome"));
            c.setTelefone(rs.getString("telefone"));
            c.setEndereco(rs.getString("endereco"));
            c.setCpf(rs.getString("cpf"));
            c.setPendencias(rs.getInt("pendencias"));
        }
        desconectar();
        return c;
    }
    
    public int quantidadeDeNomes(String nome) throws Exception{
        conectar();
        
        String sql = "SELECT COUNT(*) FROM cliente WHERE nome=?";
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
    
    public boolean cpfExiste(String cpf) throws Exception{
        conectar();
        
        String sql = "SELECT COUNT(*) FROM cliente WHERE cpf=?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, cpf);
        ResultSet rs = pstm.executeQuery();
        int cont = 0;
        if(rs.next()){
            cont = rs.getInt(1);
        }
        
        desconectar();
        if (cont>=1) {
            return true;
        }else{
            return false;
        }
    }
    
}
