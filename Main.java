import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\nSistema de Controle de Estoque");
            System.out.println("1. Cadastrar Produto Eletrônico");
            System.out.println("2. Cadastrar Produto Alimentício");
            System.out.println("3. Entrada de Estoque");
            System.out.println("4. Consultar Produtos");
            System.out.println("5. Vender Produto");
            System.out.println("6. Sair\n");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consome a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto eletrônico: ");
                    String nomeEletronico = scanner.nextLine();
                    System.out.print("Quantidade inicial: ");
                    int quantidadeEletronico = scanner.nextInt();
                    System.out.print("Preço: ");
                    double precoEletronico = scanner.nextDouble();
                    System.out.print("Garantia em meses: ");
                    int garantia = scanner.nextInt();
                    ProdutoEletronico produtoEletronico = new ProdutoEletronico(nomeEletronico, quantidadeEletronico, precoEletronico, garantia);
                    estoque.cadastrarProduto(produtoEletronico);
                    break;
                case 2:
                    System.out.print("Nome do produto alimentício: ");
                    String nomeAlimenticio = scanner.nextLine();
                    System.out.print("Quantidade inicial: ");
                    int quantidadeAlimenticio = scanner.nextInt();
                    System.out.print("Preço: ");
                    double precoAlimenticio = scanner.nextDouble();
                    scanner.nextLine();  // Consome a nova linha
                    System.out.print("Data de validade (DD/MM/AAAA): ");
                    String validade = scanner.nextLine();
                    ProdutoAlimenticio produtoAlimenticio = new ProdutoAlimenticio(nomeAlimenticio, quantidadeAlimenticio, precoAlimenticio, validade);
                    estoque.cadastrarProduto(produtoAlimenticio);
                    break;
                case 3:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade a adicionar: ");
                    int quantidade = scanner.nextInt();
                    estoque.adicionarProduto(nome, quantidade);
                    break;
                case 4:
                    estoque.consultarProdutos();
                    break;
                case 5:
                    System.out.print("Nome do produto: ");
                    nome = scanner.nextLine();
                    System.out.print("Quantidade a vender: ");
                    quantidade = scanner.nextInt();
                    estoque.venderProduto(nome, quantidade);
                    break;
                case 6:
                    executando = false;
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
