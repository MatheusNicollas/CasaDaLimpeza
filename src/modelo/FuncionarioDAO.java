package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FuncionarioDAO extends DataBaseConnection{

    public void inserir(Funcionario f) throws Exception{
        this.conectar(); 
        
        String sql = "INSERT INTO funcionarios (nome, endereco, cpf, dataDeNascimento, senha, email, telefone, cargo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"; 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, f.getNome());
        pstm.setString(2, f.getEndereco());
        pstm.setString(3, f.getCpf());
        pstm.setString(4, f.getDataDeNascimento());
        pstm.setString(5, f.getSenha());
        pstm.setString(6, f.getEmail());
        pstm.setString(7, f.getTelefone());
        pstm.setString(8, f.getCargo());
        pstm.execute();
        
        ImageIcon imagem = new ImageIcon("src/imagens/correto.png");
        JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com Sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE, imagem);
        
        this.desconectar();
    }
    
    public Funcionario buscaCpf(String cpf) throws Exception{
        conectar();
        
        Funcionario f = new Funcionario();
        String sql = "SELECT * FROM funcionarios WHERE cpf=?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, cpf);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            f.setIdFuncionario(rs.getInt("idFuncionario"));
            f.setNome(rs.getString("nome"));
            f.setEndereco(rs.getString("endereco"));
            f.setCpf(rs.getString("cpf"));
            f.setDataDeNascimento("dataDeNascimento");
            f.setSenha(rs.getString("senha"));
            f.setEmail(rs.getString("email"));
            f.setTelefone(rs.getString("telefone"));
            f.setCargo(rs.getString("cargo"));
        }
        
        desconectar();
        return f;
    }
    
    public boolean cpfExiste(String cpf) throws Exception{
        conectar();
        
        String sql = "SELECT COUNT(*) FROM funcionarios WHERE cpf=?";
        PreparedStatement pstm = conn.prepareCall(sql);
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
