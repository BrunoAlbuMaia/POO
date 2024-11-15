import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Produto> produtos;

    public Estoque() {
        this.produtos = new HashMap<>();
    }

    public void cadastrarProduto(Produto produto) {
        produtos.put(produto.getNome(), produto);
        System.out.println("Produto cadastrado: " + produto.getNome());
    }

    public void adicionarProduto(String nome, int quantidade) {
        Produto produto = produtos.get(nome);
        if (produto != null) {
            produto.setQuantidade(produto.getQuantidade() + quantidade);
            System.out.println("Quantidade adicionada ao produto: " + nome);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void venderProduto(String nome, int quantidade) {
        Produto produto = produtos.get(nome);
        if (produto != null) {
            if (produto.getQuantidade() >= quantidade) {
                produto.setQuantidade(produto.getQuantidade() - quantidade);
                System.out.println("Produto vendido: " + nome);
            } else {
                System.out.println("Quantidade insuficiente em estoque.");
            }
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void consultarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("\nNenhum produto cadastrado.");
        } else {
            System.out.println("Produtos no estoque:\n");
            for (Produto produto : produtos.values()) {
                System.out.println(produto.descricao()+"\n");
            }
        }
    }
}
