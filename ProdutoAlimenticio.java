public class ProdutoAlimenticio extends Produto {
    private String dataValidade;

    public ProdutoAlimenticio(String nome, int quantidade, double preco, String dataValidade) {
        super(nome, quantidade, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    @Override
    public String descricao() {
        return super.descricao() + ", Validade: " + dataValidade;
    }
}
