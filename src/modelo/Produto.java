package modelo;

public class Produto {

    private int idProduto;
    private String nome;
    private String descricao;
    private int quantidade;
    private double preco_de_compra;
    private double preco_de_venda;
    private Fornecedor fornecedor;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco_de_compra() {
        return preco_de_compra;
    }

    public void setPreco_de_compra(double preco_de_compra) {
        this.preco_de_compra = preco_de_compra;
    }

    public double getPreco_de_venda() {
        return preco_de_venda;
    }

    public void setPreco_de_venda(double preco_de_venda) {
        this.preco_de_venda = preco_de_venda;
    }
    
}
