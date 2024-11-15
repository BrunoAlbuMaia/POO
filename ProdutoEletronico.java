public class ProdutoEletronico extends Produto {
    private int garantiaMeses;

    public ProdutoEletronico(String nome, int quantidade, double preco, int garantiaMeses) {
        super(nome, quantidade, preco);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    @Override
    public String descricao() {
        return super.descricao() + ", Garantia: " + garantiaMeses + " meses";
    }
}
